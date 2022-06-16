package com.shivam.day19;

import java.util.Comparator;

@FunctionalInterface
public interface Calculator {

    void calculation(int a,int b);

}

class Demo {
   public static void addCalculator(int x,int y){
       System.out.println("Result is "+(x+y));
   }

    public static void main(String[] args) {

        Calculator addOperation1=(a,b)-> System.out.println("Result is "+(a+b));

        Calculator addOperation2=Demo::addCalculator;

        addOperation1.calculation(4,9);
        addOperation2.calculation(4,9);

        Calculator addOperation3=new MethodReference()::addOperation;
        addOperation3.calculation(90,10);

        Calculator minusOperation=MethodReference::minusOperation;
        minusOperation.calculation(90,10);

        Calculator multiplyUsingConstructorReference=MethodReference::new;
        multiplyUsingConstructorReference.calculation(20,10);

    }


}

class MethodReference{

    public MethodReference(){}
    public MethodReference(int a,int b){
        System.out.println("Method reference using constructor");
        System.out.println("Multiplication is "+a*b);
    }
    public void addOperation(int x,int y){
        System.out.println("Addition is "+(x+y));
    }
    public static void minusOperation(int x,int y){
        System.out.println("Subtraction is "+(x-y));
    }
}
