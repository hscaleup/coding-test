package com.hscale.ln.ds;

import java.util.Arrays;

import static java.util.stream.IntStream.concat;


public class PlayWithArray {


    public int[] mergedArray(int[] array1, int[] array2) {
        return concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().toArray();
    }
}
