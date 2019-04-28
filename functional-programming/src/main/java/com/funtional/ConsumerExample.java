package com.funtional;

import java.util.function.Consumer;

/**
 * get an object and consumes it
 * it does not return any response
 */
public class ConsumerExample {

    public static void main(String args[]){
        consumerTest();
        executeConsumers();
    }

    static void consumerTest(){
        Consumer<Person> personConsumer = new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println(person);
            }
        };
        Consumer<Person> personLowercaseConsumer = new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                person.toLowerCase();
                System.out.println(person);
            }
        };
        Consumer<Person> personUppercaseConsumer = new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                person.toUpperCase();
                System.out.println(person);
            }
        };

        Person person = new Person("Rey", "Villaester");
        personConsumer.andThen(personLowercaseConsumer).andThen(personUppercaseConsumer).accept(person);
    }

    static void executeConsumers(){
        Person person = new Person("Jake", "Smith");
        executeConsumer(
                (Person per) -> {
                    per.toUpperCase();
                    System.out.println(per);
                },
                person
        );
        executeConsumer(
                (Person per) -> {
                    per.toLowerCase();
                    System.out.println(per);
                },
                person
        );
    }

    static void executeConsumer(Consumer<Person> consumer, Person person){
        consumer.accept(person);
    }
}
