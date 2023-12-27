package com.hscale.ln.ds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayWithStringsTest {

    private PlayWithStrings playWithStrings;

    @BeforeEach
    void setUp() {
        this.playWithStrings = new PlayWithStrings();

    }

    @Test
    void should_return_true_ifAnagram() {
        boolean actual = playWithStrings.isAnagram("cat", "tac");
        assertEquals(true, actual);
    }

    @Test
    void should_return_false_ifNotAnagram() {
        boolean actual = playWithStrings.isAnagram("cat", "btc");
        assertEquals(false, actual);
    }

    @Test
    void should_return_listOfStrings_not_contains_letter_a() {
        List<String> lst = Arrays.asList("cat", "dog", "sheep", "hen");
        List<String> actual = playWithStrings.filterStrings(lst, "a");
        List<String> expected = Arrays.asList("dog", "sheep");
        assertEquals(expected, actual);
    }

    @Test
    void should_return_shortestString_from_the_list() {
        List<String> lst = Arrays.asList("cat", "sheep", "elephant");
        String actual = playWithStrings.shortestString(lst);
        assertEquals("cat", actual);
    }

    @Test
    void should_return_UpperCaseString_from_the_list() {
        List<String> lst = Arrays.asList("cat", "sheep", "elephant");
        List<String> actual = playWithStrings.convertToUpperCase(lst);
        List<String> expected = Arrays.asList("CAT", "SHEEP", "ELEPHANT");
        assertEquals(expected, actual);
    }

    @Test
    void should_return_list_of_strings_shorter_than_given_len(){
        List<String> lst = Arrays.asList("cat", "sheep", "elephant");
        List<String> expected = Arrays.asList("CAT");
        List<String> actual = playWithStrings.convertToUpperCaseAndRetunLengthLessThanFive(lst,5);
        assertEquals(expected, actual);
    }

    @Test
    void should_return_list_of_strings_sort_than_given_len(){
        List<String> lst = Arrays.asList("cat", "sheep", "elephant");
        List<String> expected = Arrays.asList("cat", "elephant", "sheep");
        List<String> actual = playWithStrings.sortInAlphabeticalOrder(lst);
        assertEquals(expected, actual);
    }

    @Test
    void should_return_list_of_strings_sortByLength_than_given_len(){
        List<String> lst = Arrays.asList("cat", "sheep", "elephant","horse");
        List<String> expected = Arrays.asList("cat", "sheep", "horse", "elephant");
        List<String> actual = playWithStrings.sortByLength(lst);
        assertEquals(expected, actual);
    }

    @Test
    void should_return_list_of_strings_findLongest_than_given_len(){
        List<String> lst = Arrays.asList("cat", "sheep", "elephant","horse");
        String expected = "elephant";
        String actual = playWithStrings.findStringWithMaxLength(lst);
        assertEquals(expected, actual);
    }

    @Test
    void should_return_list_of_strings_sortedByNoOfVowels_than_given_len(){
        List<String> lst = Arrays.asList("cat", "sheep", "elephant", "octopus");
        List<String> expected = Arrays.asList("cat", "sheep", "elephant", "octopus");
        List<String> actual = playWithStrings.sortByNoOfVowels(lst);
        assertEquals(expected, actual);
    }

    @Test
    void should_return_indexOfFirstOccurance(){
        int expected = 2;
        int actual = playWithStrings.indexOfFirstOccurance("sheep",'e');
        assertEquals(expected, actual);
    }

    @Test
    void should_contains_specific_substring_indexOfFirstOccurance(){
        List<String> lst = Arrays.asList("sweep", "sheep", "elephant", "octopus");
        List<String> expected = Arrays.asList("sweep", "sheep");
        List<String> actual = playWithStrings.listContainingSpecificSubstring(lst,"eep");
        assertEquals(expected, actual);
    }

    @Test
    void should_retain_avgLength_inList(){
        List<String> lst = Arrays.asList("sweep", "sheep", "elephant", "octopus");
        double expected = (double) 25 /4;
        double actual = playWithStrings.avgLengthOfstring(lst);
        assertEquals(expected, actual);
    }

    @Test
    void should_return_list_of_strings_start_with_vowels(){
        List<String> lst = Arrays.asList("cat", "sheep", "elephant", "octopus");
        List<String> expected = Arrays.asList( "elephant", "octopus");
        List<String> actual = playWithStrings.getStringStartWithVowels(lst);
        assertEquals(expected, actual);
    }

    @Test
    void should_return_list_of_strings_specific_patter(){
        List<String> lst = Arrays.asList("cat", "sheep", "elephant", "octopus");
        String pattern = "ep";
        List<String> expected = Arrays.asList("sheep", "elephant");
        List<String> actual = playWithStrings.getStringSpecificPattern(lst,pattern);
        assertEquals(expected, actual);
    }

    @Test
    void should_calculate_levenshtein_distance_between_two_strings(){
// to do
        int actual = playWithStrings.calculateLevDistance("kitten","sitting");
        assertEquals(3, actual);
    }

    @Test
    void should_return_count_of_words_in_a_sentence(){
        String sentence= "I am happy and sound";
        long actual = playWithStrings.countOfWords(sentence);
        assertEquals(5l, actual);
    }

    @Test
    void should_remove_duplicate_chars_from_string(){
        String actual = playWithStrings.removeDuplicates("hello");
        assertEquals("helo", actual);
    }

    @Test
    void should_return_count_of_specific_characters_inString(){
        long actual = playWithStrings.countOfSpecificChar("hello",'l');
        assertEquals(2l, actual);
    }

    @Test
    void should_return_sentence_with_max_words(){
        String sentence= "I love travelling to countryside. countryside is beautiful. lots of things to watch";
        long maxWords=playWithStrings.sentenceHavingMaxWords(sentence);
        assertEquals(5, maxWords);
    }

    @Test
    void should_return_zero_as_max_words(){
        String sentence= "";
        long maxWords=playWithStrings.sentenceHavingMaxWords(sentence);
        assertEquals(0, maxWords);
    }


}