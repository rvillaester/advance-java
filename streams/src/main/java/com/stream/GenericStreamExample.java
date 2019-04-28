package com.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenericStreamExample {

    public static void main(String args[]){
        sortAndFind();
        filterAndFind();
        filterAndReturnDefaultIfNotFound();
    }

    static void sortAndFind(){
        Collection<String> names = Stream.of("Rey", "Noel", "Jake", "Rick", "More").collect(Collectors.toList());
        System.out.println("Sorted names");
        names
                .stream()
                .sorted()
                .forEach(x -> {
                    System.out.print(x);
                    System.out.print(" ");
                });

        System.out.println("\nReverse sorted names");
        names
                .stream()
                .sorted(
                        (Object obj1, Object obj2) -> {
                            return ((String)obj2).compareTo((String)obj1);
                        }
                )
                .forEach(x -> {
                    System.out.print(x);
                    System.out.print(" ");
                });
    }

    static void filterAndFind(){
        String[] names = {"Noel", "Rey", "Jake", "Rick", "More", "rannel", "reniel"};
        String startsWith = "R";
        Arrays.stream(names)
                .filter(x -> x.startsWith(startsWith))
                .sorted()
                .findFirst()
                .ifPresent(x -> {
                    System.out.println(String.format("\nFirst name that starts with %s: %s", startsWith, x));
                });

        Arrays.stream(names)
                .map(x -> x.toUpperCase())
                .filter(x -> x.startsWith(startsWith))
                .sorted()
                .findFirst()
                .ifPresent(x -> {
                    System.out.println(String.format("Case insensitive. First name that starts with %s: %s", startsWith, x));
                });
    }

    static void filterAndReturnDefaultIfNotFound(){
        String[] names = {"Noel", "Rey", "Jake", "Rick", "More", "rannel", "reniel"};

        String match = Arrays.stream(names)
                .map(x -> x.toUpperCase())
                .filter(x -> x.startsWith("X"))
                .sorted()
                .findFirst()
                .orElse("No Match");
        System.out.println(String.format("Match is %s", match));
    }
}
