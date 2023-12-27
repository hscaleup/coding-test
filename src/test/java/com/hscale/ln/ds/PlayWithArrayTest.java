package com.hscale.ln.ds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PlayWithArrayTest {

    private PlayWithArray playWithArray;

    @BeforeEach
    void setUp() {
        this.playWithArray = new PlayWithArray();
    }

    @Test
    void should_return_merged_sorted_Array() {
        int[] array1 = {3, 5, 1, 9, 6};
        int[] array2 = {4, 6, 2, 1, 2};

        int[] sortedArray = playWithArray.mergedArray(array1, array2);
        int[] expectedArray = {1, 1, 2, 2, 3, 4, 5, 6, 6, 9};

        assertArrayEquals(expectedArray, sortedArray);
    }
    @Test
    void should_return_merged_sorted_Array_while_one_array_is_empty() {
        int[] array1 = {};
        int[] array2 = {4, 6, 2, 1, 2};

        int[] sortedArray = playWithArray.mergedArray(array1, array2);
        int[] expectedArray = {1, 2, 2, 4, 6};

        assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    void should_return_blank_Array_while_both_array_is_empty() {
        int[] array1 = {};
        int[] array2 = {};

        int[] sortedArray = playWithArray.mergedArray(array1, array2);
        int[] expectedArray = {};

        assertArrayEquals(expectedArray, sortedArray);
    }


}