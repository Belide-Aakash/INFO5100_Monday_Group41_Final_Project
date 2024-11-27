/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

/**
 *
 * @author aakashbelide
 */
public class Person {
    // Initializing the person variables
    private String personName;
    private int personID;
    
    // Initialize count variable which will be used to auto-increment the personID
    private static int count = 0;
    
    // This initiates the personID with the count value
    public Person() {
        this.personID = count;
        count = count + 1;
    }
    
    // Getter to get the personName
    public String getPersonName() {
        return this.personName;
    }
    
    // Setter to set the personName
    public void setPersonName(String personName) {
        this.personName = personName;
    }
    
    // Getter to get the personID
    public int getPersonID() {
        return this.personID;
    }
    
    @Override
    public String toString() {
        return this.personName;
    }
}
