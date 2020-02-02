// Improved version of Lop using an ArrayList rather than a fixed size array
import java.util.ArrayList;

/* Write a class called Lop that stores a list of people. Use a simple implementation, a fixed size array.
It should have the following methods: */
public class Lop {

    private ArrayList<Person> listOfPeople = new ArrayList();

    // add, which takes a Person as a parameter and adds it to the list.
    public void add(Person newPerson){
        this.listOfPeople.add(newPerson);
    }

    // remove, which takes a Person as a parameter and removes it from the list.
    public void remove(Person newPerson){
        this.listOfPeople.remove(newPerson);
    }

    /* find, which takes a String as a parameter and returns either the first Person in the list with that
    name or a null value. */
    public String find(String search){
        for (Person nameMatch : listOfPeople){
            if(nameMatch.getName().equals(search)){
                return nameMatch.print();
            }
        }
        return null;
    }

    // print, which prints out all the Person objects in the list, one per line.
    public void print(){
        for(Person printContents : listOfPeople){
            System.out.print(printContents.print() + "\n");
        }
    }

}