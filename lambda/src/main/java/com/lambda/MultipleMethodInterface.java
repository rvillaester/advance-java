package com.lambda;

public interface MultipleMethodInterface {

    void apply();

    default void generate(String text1, String text2){
        System.out.println(String.format("%s, %s", text1, text2));
    }

    static int add(int a, int b){
        return a + b;
    }
}
