// Class that test all three classes (Date, Person and Lop)

public class Main2 {

    public static void main(String[] args){

        // Creates 5 Date objects relating to the date of birth of 5 people
        Date jessDOB = new Date(11, 1, 1995);
        Date iainDOB = new Date(31, 5, 1987);
        Date callumDOB = new Date(9, 4, 1997);
        Date ceitidhDOB = new Date(13, 5, 1998);
        Date lyraDOB = new Date (30, 6, 2017);

        // Creates 5 Person objects and assigns each a date of birth from the date objects above
        Person jess = new Person("Jess", jessDOB);
        Person iain = new Person("Iain", iainDOB);
        Person callum = new Person("Callum", callumDOB);
        Person ceitidh = new Person("Ceitidh", ceitidhDOB);
        Person lyra = new Person("Lyra", lyraDOB);

        // Adds 4 of the above Person objects to the ArrayList
        Lop listOfPeople = new Lop();
        System.out.println(" ");
        System.out.println("** .add method test 1: **");
        System.out.println("add Jess, Iain, Callum and Ceitidh");
        listOfPeople.add(jess);
        listOfPeople.add(iain);
        listOfPeople.add(callum);
        listOfPeople.add(ceitidh);

        // Prints out the full ArrayList
        System.out.println(" ");
        System.out.println("** .print method test: **");
        listOfPeople.print();

        // Prints out the first Person in the ArrayList with the name "Ceitidh"
        System.out.println(" ");
        System.out.println("** .find method test 1: **");
        System.out.println(listOfPeople.find("Ceitidh"));

        // Prints out the first Person in the ArrayList with the name "Jess"
        System.out.println(" ");
        System.out.println("** .find method test 2: **");
        System.out.println(listOfPeople.find("Jess"));

        // Prints out the first Person in the ArrayList with the name "Lyra"
        System.out.println(" ");
        System.out.println("** .find method test 3: **");
        System.out.println(listOfPeople.find("Lyra"));
        // Returns "Null" as the Person object lyra has not yet been added to the ArrayList

        // Adds Lyra to the ArrayList
        System.out.println(" ");
        System.out.println("** .add method test 2: **");
        System.out.println("add Lyra");
        listOfPeople.add(lyra);

        // Prints out the first Person in the ArrayList with the name "Lyra"
        System.out.println(" ");
        System.out.println("** .find method test 4: **");
        System.out.println(listOfPeople.find("Lyra"));
        // Returns successfully this time as lyra has now been added to the ArrayList

        // Removes the Person objects callum and jess from the ArrayList
        System.out.println(" ");
        System.out.println("** .remove method test: **");
        System.out.println("remove Callum and Jess");
        listOfPeople.remove(callum);
        listOfPeople.remove(jess);

        // Prints out the full ArrayList
        System.out.println(" ");
        System.out.println("** .print method test after removal: **");
        listOfPeople.print();
        // Differs from the first print of the full ArrayList as lyra has now been added and callum and jess removed
    }
}