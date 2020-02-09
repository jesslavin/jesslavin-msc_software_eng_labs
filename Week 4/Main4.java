import Office.Boss;
import Office.Worker;
import People.Date;
import People.Lop;

public class Main4 {

    public static void main(String[] args) throws CloneNotSupportedException {

        // Create all date objects to be assigned to Bosses and Workers
        Date jessDOB = new Date(11, 1, 1995);
        Date iainDOB = new Date(31, 5, 1987);
        Date callumDOB = new Date(9, 4, 1997);
        Date ceitidhDOB = new Date(13, 5, 1998);
        Date lyraDOB = new Date (30, 6, 1987);
        Date jordanDOB = new Date (29, 10, 1990);

        // Marketing department - create Office.Boss Jess with 1 worker Iain
        Boss jess = new Boss("Jess", jessDOB);
        Worker iain = new Worker("Iain", iainDOB, jess);
        // Finance department - create Office.Boss Lyra with 2 workers Callum and Ceitidh
        Boss lyra = new Boss("Lyra", lyraDOB);
        Worker callum = new Worker("Callum", callumDOB, lyra);
        Worker ceitidh = new Worker("Ceitidh", ceitidhDOB, lyra);
        // HR department - create Office.Boss Jordan with no workers
        Boss jordan = new Boss("Jordan", jordanDOB);

        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("** .add method test: **");
        System.out.println("adds all workers and bosses to the florist company 'Back to The Fuchsia'");
        System.out.println("--------------------------------------------------------------------------");
        Lop listOfPeople = new Lop();
        listOfPeople.add(jess);
        listOfPeople.add(iain);
        listOfPeople.add(lyra);
        listOfPeople.add(callum);
        listOfPeople.add(ceitidh);
        listOfPeople.add(jordan);

        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("** .print method test 1: **");
        System.out.println("Print list of all Back to The Fuchsia workers and bosses");
        System.out.println("--------------------------------------------------------------------------");
        listOfPeople.print();

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("** .find method test 1: **");
        System.out.println("Print list of all workers in the Finance department where the boss is Lyra");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(listOfPeople.find("Lyra"));

        System.out.println(" ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("** .remove method test: **");
        System.out.println("Callum has decided to leave Back to The Fuchsia");
        System.out.println("------------------------------------------------------------------------");
        listOfPeople.remove(callum);
        callum.get_boss().sub_worker(callum);

        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("** .find method test 2: **");
        System.out.println("Search for worker Callum");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(listOfPeople.find("Callum"));

        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("** .find method test 3: **");
        System.out.println("Print updated list all workers in the Finance department");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(listOfPeople.find("Lyra"));

        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("** .print method test 2: **");
        System.out.println("Print updated list of all Back to The Fuchsia workers and bosses");
        System.out.println("--------------------------------------------------------------------------");
        listOfPeople.print();
    }
}
