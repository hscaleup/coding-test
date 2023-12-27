package com.hscale.ln.streams;

import java.util.List;
import java.util.Optional;

public class PlayWithReduce {


    public Integer getSumOfNoInList(List<Integer> numbers) {
        return numbers.stream().reduce(0,(a,b)->a+b);
    }

    public Integer getMultipyOfListOfIntegers(List<Integer> numbers) {
        return numbers.stream().reduce(1,(a,b)->a*b);
    }

    public Integer getMaxElementsFromList(List<Integer> numbers) {
        return numbers.stream().reduce(Integer::max).orElseThrow(()-> new IllegalArgumentException("no values present "+numbers.size()));
    }
}
