package People;

import People.Date;

import java.io.PipedWriter;
import java.time.Period;

public class Person{

    private String name;
    private Date dob;

    public Person(String name, Date dob) throws CloneNotSupportedException {
        this.name = name;
        this.dob = dob.clone();
    }

    public String print(){
        return String.format("%s was born on %s. Their current age is %d.", this.name, this.dob.print(),
                getAge(new Date(27, 01, 2020)));
    }

    public String getName(){
        return this.name;
    }

    public int getAge(Date currentDate){
        return this.dob.diffInYears(currentDate);
    }

    public Person clone() throws CloneNotSupportedException {
        return(Person)super.clone();
    }

}