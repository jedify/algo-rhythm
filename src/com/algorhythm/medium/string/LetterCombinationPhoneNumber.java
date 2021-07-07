package com.algorhythm.medium.string;

import java.util.*;
import java.util.stream.Collectors;

public class LetterCombinationPhoneNumber {

  public static void main(String[] args) {
    System.out.println(
     Arrays.toString(letterCombinations("237").toArray())
    );
  }

  public static List<String> letterCombinations(String digits) {
    if (digits.length() == 0) {
      return new ArrayList<>();
    }
    Map<Character, Character[]> keyMaps = new HashMap<>();
    keyMaps.put('2', new Character[]{'a', 'b', 'c'});
    keyMaps.put('3', new Character[]{'d', 'e', 'f'});
    keyMaps.put('4', new Character[]{'g', 'h', 'i'});
    keyMaps.put('5', new Character[]{'j', 'k', 'l'});
    keyMaps.put('6', new Character[]{'m', 'n', 'o'});
    keyMaps.put('7', new Character[]{'p', 'q', 'r', 's'});
    keyMaps.put('8', new Character[]{'t', 'u', 'v'});
    keyMaps.put('9', new Character[]{'w', 'x', 'y', 'z'});
    int[] frequency = new int[digits.length()];
    int runningFrequency = 1;
    for (int i = digits.length() - 1; i >= 0; i--) {
      frequency[i] = runningFrequency;
      runningFrequency = runningFrequency * keyMaps.get(digits.charAt(i)).length;
    }
    List<StringBuffer> results = new ArrayList<>();
    for (int j = 0; j < runningFrequency; j++) {
      results.add(new StringBuffer(digits.length()));
    }
    for (int i = 0; i < digits.length(); i++) {
      Character ch = digits.charAt(i);
      Character[] letters = keyMaps.get(ch);
      int letterIndex = 0, times = 0;
      for (int j = 0; j < runningFrequency; j++) {
        results.get(j).append(letters[letterIndex]);
        if (++times == frequency[i]) {
          times = 0;
          letterIndex++;
        }

        if(letterIndex==letters.length){
          letterIndex=0;
        }
      }
    }
    return results.stream().map(stringBuffer -> stringBuffer.toString()).collect(Collectors.toList());
  }
}
