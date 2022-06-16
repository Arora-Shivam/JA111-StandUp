package com.shivam.day19;

import java.util.Comparator;
import java.util.Map;

public class StudentMarksComp implements Comparator<Map.Entry<String,Student>> {
    @Override
    public int compare(Map.Entry<String, Student> e1, Map.Entry<String, Student> e2) {
       return 0;
    }
}
class StudentRollComp implements Comparator<Map.Entry<String,Student>> {


    @Override
    public int compare(Map.Entry<String, Student> e1, Map.Entry<String, Student> e2) {
        return e1.getValue().getRoll() >e2.getValue().getRoll() ? 1:-1;
    }
}
class MethodReferenceForComparator{

    public static int CompareStudentRoll(Map.Entry<String, Student> e1, Map.Entry<String, Student> e2){
        return e1.getValue().getRoll() >e2.getValue().getRoll() ? 1:-1;
    }
}