package com.shivam.day19;

interface Printer<T>{

    void print(T t);

}

public class Main2 {

    public static void main(String[] args) {

        Printer studentPrinter=(s)-> System.out.println(s);
        studentPrinter.print(new Student("n1",1,90));

        Printer studentPrinter2=System.out::println;
        studentPrinter2.print(new Student("n2",2,190));
    }
}

