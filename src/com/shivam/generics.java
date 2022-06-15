package com.shivam;

public class generics {

    public static void main(String[] args) {

        IntegerPrinter integerPrinter=new IntegerPrinter(90);
        integerPrinter.print();//90

        DoublePrinter doublePrinter=new DoublePrinter(90.7);
        doublePrinter.print();//90.7

        Printer<Integer> generalPrinter=new Printer<>(23);
        generalPrinter.print();//23

        Printer<String> generalPrinter2=new Printer<>("fghi");
        generalPrinter2.print();//One


    }

}

class IntegerPrinter{

    Integer number;

    public IntegerPrinter(int n){
        this.number=n;
    }

    public void print(){
        System.out.println(number);
    }
}
class DoublePrinter{

    Double number;

    public DoublePrinter(double n){
        this.number=n;
    }

    public void print(){
        System.out.println(number);
    }
}

class Printer<T>{

    T tName;

    public Printer(T t){
        this.tName=t;
    }

    public void print(){
        System.out.println(tName);
    }

}
