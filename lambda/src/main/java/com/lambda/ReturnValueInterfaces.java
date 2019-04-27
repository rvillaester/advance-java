package com.lambda;

public class ReturnValueInterfaces {

    public interface ReturnValueWithNoParams{
        String generate();
    }

    public interface ReturnValueWithSingleParam{
        String generate(String text);
    }

    public interface ReturnValueWithMultipleParams{
        String generate(String text1, int num);
    }
}
