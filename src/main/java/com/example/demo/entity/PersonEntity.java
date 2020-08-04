package com.example.demo.entity;

import javax.persistence.*;

/**
 * 对应person表
 */
@Entity
@Table(name = "person")
public class PersonEntity {
    @Id
    @GeneratedValue
    private int personID;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;

    public PersonEntity(){
        super();
    }

    public PersonEntity(String firstName, String lastName){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
