/* Write a Person class that stores relevant information (name and date of birth) about an individual Person.
It should have the following methods: */
public class Person{

    private String name;
    private Date dob;

    //  A constructor that takes the name and date of birth as a Date object.
    public Person(String name, Date dob){
        this.name = name;
        this.dob = dob;
    }

    // A print method with a PrintStream parameter. It should print out the person's name and date of birth.
    public String print(){
        return String.format("%s was born on %s. Their current age is %d.", this.name, this.dob.print(),
                getAge(new Date(27, 01, 2020)));
    }

    // A method called getName that returns the person's name.
    public String getName(){
        return this.name;
    }

    // A method called getAge which takes the current date as a parameter and returns the person's age as an integer.
    public int getAge(Date currentDate){
        return this.dob.diffInYears(currentDate);
    }

}