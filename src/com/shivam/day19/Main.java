package com.shivam.day19;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String,Student> studentMap=new HashMap<>();

        studentMap.put("MH",new Student("n1",1,90));
        studentMap.put("AP",new Student("n2",2,70));
        studentMap.put("UP",new Student("n3",3,80));
        studentMap.put("HP",new Student("n4",4,290));
        studentMap.put("GJ",new Student("n5",5,190));
        studentMap.put("TN",new Student("n6",6,90));



        Set<String> keySet=studentMap.keySet();

       // List<String> list=new ArrayList<>(keySet);
        System.out.println(keySet);
        System.out.println();
        Set<Map.Entry<String,Student>> entrySet=studentMap.entrySet();

        List<Map.Entry<String,Student>> listOfStudent=new ArrayList<>(entrySet);


        Collections.sort(listOfStudent,(e1,e2)->e1.getValue().getMarks()>e2.getValue().getMarks() ? 1:-1);

        Collections.sort(listOfStudent,MethodReferenceForComparator::CompareStudentRoll);

        System.out.println(listOfStudent);
    }
}
