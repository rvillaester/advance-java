package com.lambda;

public class VoidInterfaces {

    public interface VoidWithNoParams{
        void print();
    }

    public interface VoidWithSingleParam{
        void print(String text);
    }

    public interface VoidWithMultipleParams{
        void print(String text1, char letter);
    }
}
