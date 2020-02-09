package Office;

import People.Date;
import People.Person;

// A Worker object must always have a Office.Boss
public class Worker extends Person {

    // Constructor
    private Boss workerBoss;

    // Get worker name, dob and current boss
    public Worker(String name, Date dob, Boss currentBoss) throws CloneNotSupportedException {
        super(name, dob.clone());
        this.workerBoss = currentBoss;
        this.workerBoss.add_worker(this);
    }

    // It has methods:

    // void new_boss ()
    public void new_boss(Boss newBoss){
        this.workerBoss = newBoss;
    }

    // Boss get_boss()
    public Boss get_boss(){
        return this.workerBoss;
    }

    public  Worker cloneWorker() throws CloneNotSupportedException {
        return (Worker)super.clone();
    }

    // void print(PrintStream)
    public String print(){
        String worker=super.print();
        return worker+String.format("\nBoss:\n%s", this.workerBoss.getName());
    }
}