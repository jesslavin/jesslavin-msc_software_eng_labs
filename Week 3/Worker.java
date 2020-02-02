// A Worker object must always have a Boss
public class Worker extends Person{

    // **************** QUERY ****************
    // DOESN'T USE A PRINTSTREAM IN PRINT METHOD
    // **************** QUERY ****************

    // Constructor
    private Boss workerBoss;

    // Get worker name, dob and current boss
    public Worker(String name, Date dob, Boss currentBoss){
        super(name, dob);
        this.workerBoss = currentBoss;
        this.workerBoss.add_worker(this);
    }

    // It has methods:

    // void new_boss (Boss)
    public void new_boss(Boss newBoss){
        this.workerBoss = newBoss;
    }

    // Boss get_boss()
    public Boss get_boss(){
        return this.workerBoss;
    }

    // void print(PrintStream)
    public String print(){
        String worker=super.print();
        return worker+String.format("\nBoss:\n%s", this.workerBoss.getName());
    }
}