package com.funtional;

import lombok.Data;

@Data
public class Person {
    private String firstname;
    private String lastname;

    public Person(){}

    public Person(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void toLowerCase(){
        this.firstname = firstname.toLowerCase();
        this.lastname = lastname.toLowerCase();
    }

    public void toUpperCase(){
        this.firstname = firstname.toUpperCase();
        this.lastname = lastname.toUpperCase();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
