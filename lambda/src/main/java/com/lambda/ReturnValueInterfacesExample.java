package com.lambda;

public class ReturnValueInterfacesExample {

    public static void main(String args[]){
        testReturnValueWithNoParams();
        testReturnValueWithSingleParam();
        testReturnValueWithMultipleParams();
    }

    static void testReturnValueWithNoParams(){
        ReturnValueInterfaces.ReturnValueWithNoParams returnValueWithNoParams = () -> {return "Hello World";};
        System.out.println(returnValueWithNoParams.generate());
    }

    static void testReturnValueWithSingleParam(){
        ReturnValueInterfaces.ReturnValueWithSingleParam returnValueWithSingleParam = text -> { return text; };
        System.out.println(returnValueWithSingleParam.generate("Good Day"));
    }

    static void testReturnValueWithMultipleParams(){
        ReturnValueInterfaces.ReturnValueWithMultipleParams returnValueWithMultipleParams =
                (text1, num) -> {
                    StringBuilder builder = new StringBuilder();
                    builder.append(text1);
                    builder.append(" ");
                    builder.append(num);
                    return builder.toString();
                };
        System.out.println(returnValueWithMultipleParams.generate("Hi", 12));
    }
}
