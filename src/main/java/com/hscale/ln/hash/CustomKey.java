package com.hscale.ln.hash;

import java.util.HashMap;
import java.util.Map;

public class CustomKey {

    public static void main(String[] args) {
        Student st1= new Student(101,"student-1");
        Student st2= new Student(101,"student-1");
        Student st3= new Student(101,"student-1");


        HashMap<Student, String> key = new HashMap<>();
        key.put(st1,"key1");
        key.put(st2,"key2");
        key.put(st3,"key3");

        for(Map.Entry<Student,String> it: key.entrySet()){
            System.out.println(it.getKey()+" -> "+it.getValue());
        }

    }
}
