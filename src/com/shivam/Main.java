package com.shivam;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice=input.nextInt();
        Comparator<Student> comp=new StudentMarksComp();
        if(choice==1){
            comp=new StudentRollComp();
        }
        else{
            comp=new StudentMarksComp();
        }

        Set<Student> studentSet=new TreeSet<>();

        studentSet.add(new Student(19,"n1",10));
        studentSet.add(new Student(19,"n2",90));
        studentSet.add(new Student(11,"n3",5));
        studentSet.add(new Student(3,"n4",9));
        studentSet.add(new Student(14,"n5",80));
        studentSet.add(new Student(6,"n6",70));

        System.out.println(studentSet);
    }
}
/*
class A implements X{}
class B implements X{}

class Main{
psvm{
    X a1=new A();
    a1=new B();

}

}

 */