package com.funtional;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String args[]){
        executeFunctions();
    }

    static void executeFunctions(){
        Function<Person, Integer> personFunction =
                (person) -> {
                    return person.getAge();
                };

        executeFunction(personFunction, new Person("Rey", "Villaester", 25));
        executeFunction(
                    (person) ->
                    {
                        return person.toString().length();
                    }, new Person("Rey", "Villaester", 30)
                );
    }

    static void executeFunction(Function function, Person person){
        System.out.println(String.format("result is %s", function.apply(person)));
    }
}
