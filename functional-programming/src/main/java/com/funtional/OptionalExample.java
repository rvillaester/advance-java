package com.funtional;

import java.util.Optional;
import java.util.function.Function;

public class OptionalExample {

    public static void main(String args[]){
        Person rey = new Person("Rey James", "Villaester");
        executeOptional(rey);
        executeOptionalAndTransform(rey);
        rey.setFirstname("Rey");
        executeOptionalOneLine(rey);
        executeOptionalAndTransform(rey);
    }

    static void executeOptional(Person person){
        Optional<String> opt = Optional.ofNullable(getSecondWordInFirstname().apply(person));
        if(opt.isPresent()){
            opt.ifPresent(System.out::println);
        } else {
            String str = opt.orElse("No second word");
            System.out.println(str);
        }
    }

    static void executeOptionalOneLine(Person person){
        String secondWord = Optional.ofNullable(getSecondWordInFirstname().apply(person)).orElse("No second word");
        System.out.println(secondWord);
    }

    static void executeOptionalAndTransform(Person person){
        int size = Optional.ofNullable(getSecondWordInFirstname().apply(person)).map(getStringSize()).orElse(0);
        System.out.println(String.format("The size is %s", size));
    }

    static Function<Person, String> getSecondWordInFirstname(){
        return (person) -> {
            String firstname = person.getFirstname();
            String[] split = firstname.split(" ");
            return split.length > 1 ? split[1] : null;
        };
    }

    static Function<String, Integer> getStringSize(){
        return s -> s.length();
    }
}
