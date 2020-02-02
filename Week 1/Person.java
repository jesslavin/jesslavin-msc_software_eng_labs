import java.io.PrintStream;

public class Person {

    private String name;
    private int dob_d, dob_m, dob_y; // date of birth
    private int type; // 1 = Boss, 2 = Worker
    private Person boss;
    private Person[] worker;
    private int nworkers;

    Person(String name, int dob_d, int dob_m, int dob_y){
        this.name = name;
        this.dob_d = dob_d;
        this.dob_m = dob_m;
        this.dob_y = dob_y;
        this.boss = null;
        this.worker = null;
        this.nworkers = 0;
    }

    private String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getDob_d() {
        return dob_d;
    }

    public void setDob_d(int newDob_d) {
        this.dob_d = newDob_d;
    }

    public int getDob_m() {
        return dob_m;
    }

    public void setDob_m(int newDob_m) {
        this.dob_m = newDob_m;
    }

    public int getDob_y() {
        return dob_y;
    }

    public void setDob_y(int newDob_y) {
        this.dob_y = newDob_y;
    }

    public int getType() {
        return type;
    }

    public void setType(int newType) {
        this.type = newType;
    }

    public Person getBoss() {
        return boss;
    }

    public void setBoss(Person newBoss) {
        this.boss = newBoss;
    }

    public Person[] getWorker() {
        return worker;
    }

    public void setWorker(Person[] newWorker) {
        this.worker = newWorker;
    }

    public int getNworkers() {
        return nworkers;
    }

    public void setNworkers(int newNworkers) {
        this.nworkers = newNworkers;
    }

    public int iNworkers(){
        return this.nworkers++;
    }

    public void print(PrintStream ps){
        ps.print(String.format("%s: born on %02d/%02d/%4d", this.name, this.dob_d, this.dob_m, this.dob_y));
        if (this.type == 1){
            ps.print(" bosses: ");
            for (int i = 0; i < this.nworkers; i++){
                ps.print(this.worker[i].getName() + " ");
            }
        } else {
            ps.print(" is bossed by " + boss.getName());
        }
    }
}