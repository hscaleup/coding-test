package com.hscale.ln.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayWithStringsTest {

    private PlayWithStrings playWithStrings;

    @BeforeEach
    void setUp() {
        this.playWithStrings = new PlayWithStrings();
    }


    @Test
    void should_returnCountOfCharacters_when_present() {
        String input = "hello";
        char ch = 'l';
        assertEquals(2, playWithStrings.getCharacterCount(input, ch));
    }

    @Test
    void should_returnZero_when_not_present() {
        String input = "hello";
        char ch = 'p';
        assertEquals(0, playWithStrings.getCharacterCount(input, ch));
    }

    @Test
   void should_return_reverse_string_when_present(){
        String input = "hello ! how are you";
        String expected= "you are how ! hello";
        assertEquals(expected, playWithStrings.reverseString(input));
        System.out.println(playWithStrings.reverseString(input));
   }

    @Test
    void should_return_same_string_when_only_one_word_present(){
        String input = "hello";
        String expected= "hello";
        assertEquals(expected, playWithStrings.reverseString(input));
        System.out.println(playWithStrings.reverseString(input));
    }

    @Test
    void should_return_blank_string_when_no_word_present(){
        String input = "";
        String expected= "";
        assertEquals(expected, playWithStrings.reverseString(input));
        System.out.println(playWithStrings.reverseString(input));
    }

    @Test
    void should_return_true_whenString_isPalindrome(){
        String input = "A man a plan a canal Panama";
        assertTrue(playWithStrings.isPalindrome(input));
    }

    @Test
    void should_return_concatenated_string_when_providing_listOfStrings(){
        List<String> lst = new ArrayList<>();
        lst.add("tit");
        lst.add("for");
        lst.add("tat");

      String concatenatedString=  playWithStrings.concatenateStrings(lst);
        System.out.println(concatenatedString);
      String expectedString="titfortat";
      assertEquals(expectedString,concatenatedString);
    }

    @Test
    void should_remove_duplicates_in_an_array(){
        List<String> lst= Arrays.asList( "Apple","Banana","Apple","Mango","Orange","Orange");
        List<String> filteredArray=playWithStrings.removeDuplicates(lst);
        List<String> expected=Arrays.asList("Apple","Banana","Mango","Orange");
        assertEquals(expected,filteredArray);
    }

    @Test
    void should_transform_strings_to_uppercase_when_stringlength_is_greaterThanFive(){
        List<String> lst= Arrays.asList( "Apple","Banana","Apple","Mango","Orange","Orange","");
        long start = System.currentTimeMillis();
        List<String> filteredArray=playWithStrings.removeDuplicatesAndUpperCaseForFive(lst);
        System.out.println("time elapsed :: "+(System.currentTimeMillis()-start));
        List<String> expected=Arrays.asList("Apple","BANANA","Mango","ORANGE");
        assertEquals(expected,filteredArray);
    }

    @Test
    void should_validate_dateString(){
        String dateStr="1999-02-28";
        boolean valid= playWithStrings.isValidDate(dateStr);
        assertTrue(valid);
    }

    @Test
    void should_return_duplicate_elements_in_two_arrays(){
        String[] array1 = {"A", "B", "C", "D", "E"};
        String[] array2 = {"C", "D", "E", "F", "G"};

        List<String> duplicateLst = playWithStrings.findDuplicatesInArray(array1,array2);
        List<String> expectedList= Arrays.asList("C", "D", "E");
        assertEquals(expectedList,duplicateLst);
    }

}