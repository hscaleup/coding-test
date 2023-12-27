package com.hscale.ln.streams;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PlayWithStrings {

  public int getCharacterCount(String input, char ch){
      return (int) input.chars().filter(c-> c==ch).count();
    }

    // reverse string using streams

    public String reverseString(String sentence){
       return Arrays.stream(sentence.split("\\s+")).reduce((word1,word2)-> word2 +" "+word1).orElse("");
    }

    // check String is palindrome

    public boolean isPalindrome(String input){
      String cleanedInput = input.replaceAll("\\s+","").toLowerCase();
      return IntStream.range(0,cleanedInput.length()/2).noneMatch(i->cleanedInput.charAt(i)!= cleanedInput.charAt(cleanedInput.length()-1-i));
    }

    public String concatenateStrings(List<String> lst) {
    return String.join("", lst);
    }

  public List<String> removeDuplicates(List<String> str) {
   return new LinkedHashSet<>(str).stream().toList();
  }


  // prctice
//  public List<String> removeDuplicatesAndUpperCaseForFive(List<String> lst) {
//
//    return new LinkedHashSet<>(lst).stream().toList()
//            .stream().filter(str->!str.isEmpty())
//            .map(PlayWithStrings::convertToUppercase)
//            .collect(Collectors.toList());
//
//  }

  private static String convertToUppercase(String s) {
    return s.length() > 5 ? s.toUpperCase() : s;
  }

  public boolean isValidDate(String dateStr) {

    boolean valid=true;
    try {
       LocalDate.parse(dateStr);
    }catch (DateTimeParseException e){
      System.out.println("not valid date "+e);
      valid =false;
    }
    return valid;

  }

  public List<String> findDuplicates(String[] array1, String[] array2) {
    List<String> lst1= Arrays.asList(array1);
    List<String> lst2= Arrays.asList(array2);
    return lst1.stream().filter(lst2::contains).collect(Collectors.toList());
  }

  public List<String> removeDuplicatesAndUpperCaseForFive(List<String> lst) {
     return new LinkedHashSet<>(lst).stream().filter(s->s.length()>5).map(String::toUpperCase).collect(Collectors.toList());
  }

  public List<String> findDuplicatesInArray(String[] array1, String[] array2) {
    return Arrays.stream(array1).filter(s->Arrays.asList(array2).contains(s)).collect(Collectors.toList());
  }
}
