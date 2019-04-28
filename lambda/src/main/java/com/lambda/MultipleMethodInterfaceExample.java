package com.lambda;

public class MultipleMethodInterfaceExample {

    public static void main(String args[]){
        test();
    }

    static void test(){
        MultipleMethodInterface multipleMethodInterface = () -> System.out.println("Apply method invoked");
        multipleMethodInterface.apply();
        multipleMethodInterface.generate("Hello", "World");
        System.out.println(MultipleMethodInterface.add(2, 4));
    }
}