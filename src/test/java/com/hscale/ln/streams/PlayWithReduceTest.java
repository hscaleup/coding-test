package com.hscale.ln.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayWithReduceTest {

  private PlayWithReduce playWithReduce;
static List<Integer> numbers= Arrays.asList(1,2,3,4,5);
    @BeforeEach
    void setUp(){
        this.playWithReduce= new PlayWithReduce();


    }

    @Test
    void should_add_elements_of_the_list(){

        Integer sum = playWithReduce.getSumOfNoInList(numbers);
        System.out.println(sum);
        assertEquals(15,sum);
    }

    @Test
    void should_return_zero_on_adding_elements_of_the_list_of_size_zero(){
        List<Integer> numbers= Arrays.asList();
        Integer sum = playWithReduce.getSumOfNoInList(numbers);
        System.out.println(sum);
        assertEquals(0,sum);
    }

    @Test
    void should_multiply_elements_of_the_list(){

        Integer mul = playWithReduce.getMultipyOfListOfIntegers(numbers);
        System.out.println(mul);
        assertEquals(120,mul);
    }

    @Test
    void should_return_zero_on_multiplying_elements_of_the_list_of_size_zero(){
        List<Integer> numbers= Arrays.asList();
        Integer mul = playWithReduce.getMultipyOfListOfIntegers(numbers);
        System.out.println(mul);
        assertEquals(1,mul);
    }

    @Test
    void should_return_maxvalue_elements_of_the_list(){
        Integer max = playWithReduce.getMaxElementsFromList(numbers);
        System.out.println(max);
        assertEquals(5,max);
    }

    @Test
    void should_throw_IllegalArgumentException_for_maxvalue_if_listSizeIsZero(){
        List<Integer> number= Arrays.asList();
       Throwable throwable= assertThrows(IllegalArgumentException.class,()->
            playWithReduce.getMaxElementsFromList(number)
        );
        assertEquals("no values present 0",throwable.getMessage());
    }



}