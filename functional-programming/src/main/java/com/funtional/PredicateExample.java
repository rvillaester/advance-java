package com.funtional;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String args[]){
        predicateTest();
    }

    static void predicateTest(){
        Predicate<Integer> evenPredicate = x -> x % 2 == 0;
        Predicate<Integer> oddPredicate = x -> x % 2 != 0;
        evaluate(1, evenPredicate);
        evaluate(2, evenPredicate);
        evaluate(1, oddPredicate);
        evaluate(2, oddPredicate);
        evaluate(15, x -> x > 10);
        evaluate(15, x -> x < 10);
    }

    static void evaluate(int num, Predicate<Integer> predicate){
        if(predicate.test(num)){
            System.out.println(String.format("%s pass", num));
        } else{
            System.out.println(String.format("%s fail", num));
        }
    }
}
