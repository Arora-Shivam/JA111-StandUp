package com.shivam;

import java.util.Comparator;

public class StudentMarksComp implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getMarks()>s2.getMarks() ? +1:-1;
    }
}

class StudentRollComp implements Comparator<Student>{


    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getRoll()-s2.getRoll()==0){
            return 0;
        }
        return s1.getRoll()>s2.getRoll() ? +1 :-1;
    }
}