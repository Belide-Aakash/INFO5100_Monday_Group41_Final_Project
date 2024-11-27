/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;
import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public class PersonDirectory {
    // Initializing the person directory variable
    private ArrayList<Person> personList;
    
    // This initiates the empty directory
    public PersonDirectory() {
        this.personList = new ArrayList<Person>();
    }
    
    // Method to create a person
    //      It takes in the person name as input, then intializes new person, sets their
    //      name using the setter, adds it to the person directory list and return the person
    public Person createPerson(String personName) {
        Person person = new Person();
        
        person.setPersonName(personName);
        this.personList.add(person);
        
        return person;
    }
    
    // Getter to get the personList
    public ArrayList<Person> getPersonList() {
        return this.personList;
    }
}
