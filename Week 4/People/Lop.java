package People;

import People.Person;

import java.util.ArrayList;

public class Lop {

    private ArrayList<Person> listOfPeople = new ArrayList();

    public Lop(){
        this.listOfPeople = listOfPeople;
    }

    public ArrayList<Person> getLop(){
        return this.listOfPeople;
    }

    public void add(Person newPerson){
        this.listOfPeople.add(newPerson);
    }

    public void remove(Person newPerson){
        this.listOfPeople.remove(newPerson);
    }

    public String find(String search){
        for (Person nameMatch : listOfPeople){
            if(nameMatch.getName().equals(search)){
                return nameMatch.print();
            }
        }
        return null;
    }

    public void print(){
        for(Person printContents : listOfPeople){
            System.out.print(printContents.print() + "\n \n");
        }
    }

}