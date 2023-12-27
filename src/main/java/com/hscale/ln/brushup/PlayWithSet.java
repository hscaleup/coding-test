package com.hscale.ln.brushup;

import java.util.*;

public class PlayWithSet {

    public static void main(String[] args) {
        Set<String> set= new LinkedHashSet<>();
        set.add("Ball");
        set.add("Apple");
        set.add("Toy");
        set.add("Joy");

        set.forEach(System.out::println);
    }
}
