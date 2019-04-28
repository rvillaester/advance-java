package com.funtional;

import java.util.function.Supplier;

/**
 * No Input but has output
 */
public class SupplierExample {

    public static void main(String args[]){
        supplierTest();
        executeSuppliers();
    }

    static void supplierTest(){
        Supplier<Person> personSupplier = new Supplier<Person>() {
            @Override
            public Person get() {
                Person person = new Person("Rey", "Villaester");
                return person;
            }
        };

        Person person = personSupplier.get();
        System.out.println(person.getFirstname());
    }

    static void executeSuppliers(){
        executeSupplier(
                () -> {
                    Person person = new Person("Rey", "Villaester");
                    return person;
                }
        );

        executeSupplier(
                () -> {
                    return new Person("Jake", "Smith");
                }
        );
    }

    static void executeSupplier(Supplier<Person> supplier){
        Person person = supplier.get();
        System.out.println(person);
    }

}
