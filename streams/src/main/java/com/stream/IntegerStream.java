package com.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntegerStream {

    public static void main(String args[]){
        printStream();
        printStreamSkip();
        sumStream();
        transformAndAverage();
        totalByReduction();
        summaryStats();
    }

    static void printStream(){
        System.out.println("Print Stream");
        IntStream.range(1, 10).forEach(x -> System.out.print(x));
    }

    static void printStreamSkip(){
        System.out.println("\nPrint Stream with skip");
        IntStream
                .range(1, 10)
                .skip(4)
                .forEach(x -> System.out.print(x));
    }

    static void sumStream(){
        System.out.println("\nSum Stream");
        int sum = IntStream
                    .range(1, 10)
                    .skip(7)
                    .sum();
        System.out.println(sum);
    }

    static void transformAndAverage(){
        IntStream
                .range(2, 5)
                .map(x -> x * 2)
                .average()
                .ifPresent(x -> System.out.println(String.format("Average is %s", x)));
    }

    static void totalByReduction(){
        int total = IntStream
                .range(1,5)
                .reduce(0,
                        (int a, int b) -> a + b);
        System.out.println(String.format("Total is %s", total));
    }

    static void summaryStats(){
        IntSummaryStatistics summaryStatistics = IntStream.of(2,6,3,8,9,100,5).summaryStatistics();
        System.out.println("Summary Stats");
        System.out.println(summaryStatistics);
    }
}
