package com.hscale.ln.ds;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PlayWithStrings {

    // anagram
    // cat -->tac

    boolean isAnagram(String s, String t) {
        Map<Integer, Integer> freq = new HashMap<>();
        s.chars().forEach(ch -> freq.put(ch, freq.getOrDefault(ch, 0) + 1));
        t.chars().forEach(ch -> freq.put(ch, freq.getOrDefault(ch, 0) - 1));
        return freq.entrySet().stream().noneMatch(entry -> entry.getValue() > 0);
    }

    public List<String> filterStrings(List<String> lst, String a) {
        return lst.stream().filter(s -> !s.contains(a)).collect(Collectors.toList());
    }


    public String shortestString(List<String> lst) {
        return lst.stream().min(Comparator.comparingInt(String::length)).orElseThrow();
    }

    public List<String> convertToUpperCase(List<String> lst) {
        return lst.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public List<String> convertToUpperCaseAndRetunLengthLessThanFive(List<String> lst, int i) {
        return lst.stream().map(String::toUpperCase).filter(s -> s.length() < i).collect(Collectors.toList());
    }

    public List<String> sortInAlphabeticalOrder(List<String> lst) {
        return lst.stream().sorted().collect(Collectors.toList());
    }

    public List<String> sortByLength(List<String> lst) {
        return lst.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
    }

    public String findStringWithMaxLength(List<String> lst) {
        return lst.stream().max(Comparator.comparingInt(String::length)).orElseThrow();
    }

    public List<String> sortByNoOfVowels(List<String> lst) {
        return lst.stream().sorted(Comparator.comparing(PlayWithStrings::sortByVowelsCount)).collect(Collectors.toList());
    }

    //
    private static int sortByVowelsCount(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (vowels.contains(c)) {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
        }
        return freq.values().stream().mapToInt(i -> i).sum();

    }


    // to do
    public int indexOfFirstOccurance(String sheep, char e) {
        char[] ch = sheep.toCharArray();
        return IntStream.range(0, ch.length).filter(i -> ch[i] == e).findFirst().orElse(-1);
    }

    public List<String> listContainingSpecificSubstring(List<String> lst, String eep) {
        return lst.stream().filter(e -> e.contains("eep")).collect(Collectors.toList());
    }

    public double avgLengthOfstring(List<String> lst) {
        return lst.stream().collect(Collectors.averagingDouble(String::length));
    }

    public List<String> getStringStartWithVowels(List<String> lst) {

        return lst.stream().filter(PlayWithStrings::startWithVowels).collect(Collectors.toList());
    }

    private static boolean startWithVowels(String s) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        return vowels.contains(s.charAt(0));
    }

    public List<String> getStringSpecificPattern(List<String> lst, String pattern) {
        return lst.stream().filter(s -> s.contains(pattern)).collect(Collectors.toList());
    }

    public int calculateLevDistance(String kitten, String sitting) {
        // to be implemented
        return 0;
    }

    public long countOfWords(String sentence) {
        return Arrays.stream(sentence.split("\\s+")).count();
    }

    // to do
    public String removeDuplicates(String input) {
        return input.chars().distinct().mapToObj(c-> String.valueOf((char) c)).collect(Collectors.joining());
    }


    public long countOfSpecificChar(String input, char l) {
        return input.chars().filter(c->c==l).count();

    }

    public long sentenceHavingMaxWords(String sentence) {
       return Arrays.stream(sentence.split("\\.")).mapToInt(PlayWithStrings::countWords).max().orElseThrow();
    }

    private static int countWords(String s) {
        return (int) Arrays.stream(s.trim().split("\\s+")).filter(s1->!s1.isEmpty()).count();
    }


}
