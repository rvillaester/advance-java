package com.lambda;

public class VoidInterfaceTest {

    public static void main(String args[]){
        testVoidWithNoParams();
        testVoidWithSingleParam();
        testVoidWithMultipleParams();
    }

    static void testVoidWithNoParams(){
        VoidInterfaces.VoidWithNoParams voidWithNoParams = () -> System.out.println("Void with no params");
        voidWithNoParams.print();
    }

    static void testVoidWithSingleParam(){
        VoidInterfaces.VoidWithSingleParam voidWithSingleParam = text -> System.out.println(String.format("Void with single param: %s", text));
        voidWithSingleParam.print("Hello");
    }

    static void testVoidWithMultipleParams(){
        VoidInterfaces.VoidWithMultipleParams voidWithMultipleParams = (text1, letter) -> System.out.println(String.format("Void with multiple params: %s, %s", text1, letter));
        voidWithMultipleParams.print("Hello", 'C');
    }
}
