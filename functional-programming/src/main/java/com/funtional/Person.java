package com.funtional;

import lombok.Data;

@Data
public class Person {
    private String firstname;
    private String lastname;
    private int age;

    public Person(){}

    public Person(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Person(String firstname, String lastname, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public void toLowerCase(){
        this.firstname = firstname.toLowerCase();
        this.lastname = lastname.toLowerCase();
    }

    public void toUpperCase(){
        this.firstname = firstname.toUpperCase();
        this.lastname = lastname.toUpperCase();
    }

    public String getFullName(){
        StringBuilder builder = new StringBuilder();
        builder.append(firstname);
        builder.append(" ");
        builder.append(lastname);
        return builder.toString();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
