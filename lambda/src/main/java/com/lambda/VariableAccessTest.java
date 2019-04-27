package com.lambda;

public class VariableAccessTest {

    private static String staticText = "Static 1";
    private int instanceVar = 1;

    public static void main(String args[]){
        VariableAccessTest instance = new VariableAccessTest();
        instance.doIt();
    }

    public void doIt(){
        // lambda expression only allows effectively final local variable
        final char letter = 'X';
        AccessInterface accessInterface =
                (text) -> {
                    StringBuilder  builder = new StringBuilder();
                    builder.append(letter);
                    builder.append(", ");
                    builder.append(text);
                    builder.append(", ");
                    builder.append(staticText);
                    builder.append(", ");
                    builder.append(instanceVar);
                    System.out.println(builder.toString());
                };
        accessInterface.apply("Hello");

        staticText = "Static 2";
        instanceVar = 2;
        accessInterface.apply("Hello");
    }

    public interface AccessInterface{
        void apply(String text);
    }
}
