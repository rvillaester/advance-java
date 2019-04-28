package com.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileStreamExample {

    public static void main(String args[]) throws Exception{
        findEntryInFile();
        printAllEntryInFile();
        countGoodEntry();
    }

    static void findEntryInFile() throws IOException {
        Stream<String> countries = Files.lines(Paths.get("country.txt"));
        countries
                .filter(x -> x.startsWith("U"))
                .findAny()
                .ifPresent(x -> System.out.println(String.format("Found %s", x)));
        countries.close();
    }

    static void printAllEntryInFile() throws IOException{
        List<String> countries = Files.lines(Paths.get("country.txt"))
                .map(x -> x.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Countries sorted in uppercase");
        countries.forEach(x -> System.out.println(x));
    }

    static void countGoodEntry() throws IOException{
        Stream<String> items = Files.lines(Paths.get("csv.txt"));
        Map<Integer, String> map = items
                .map(x -> x.split(","))
                .filter(x -> x.length == 4)
                .collect(
                        Collectors.toMap(
                                x -> Integer.parseInt(x[0]),
                                x -> String.format("%s%s%s", x[1], x[2], x[3])
                        )
                );
        System.out.println(String.format("%s rows has good entry", map.size()));
        map.forEach(
                (x, y) -> {
                    System.out.println(String.format("%s, %s", x, y));
                });
        items.close();
    }


}
