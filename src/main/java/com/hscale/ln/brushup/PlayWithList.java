package com.hscale.ln.brushup;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PlayWithList {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> lnkdList = new LinkedList<>();

        arrayList.add("Abhishek");
        arrayList.add("John");
        arrayList.add("David");
        arrayList.add("Helen");

        lnkdList.add("Abhishek");
        lnkdList.add("John");
        lnkdList.add("David");
        lnkdList.add("Helen");

      //  arrayList.forEach(System.out::println);

     //   lnkdList.forEach(System.out::println);

        //System.out.println(arrayList.get(2));
        arrayList.add(2,"Tim");
       // arrayList.remove(0);
        arrayList.forEach(System.out::println);
        System.out.println("\n========== \n");
        //System.out.println(lnkdList.get(2));
        lnkdList.add(2,"Tim");
        //lnkdList.remove(0);
        lnkdList.forEach(System.out::println);
    }
}
