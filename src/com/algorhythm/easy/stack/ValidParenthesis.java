package com.algorhythm.easy.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
  public static void main(String[] args) {
    System.out.println(new ValidParenthesis().isValid("{[]"));
  }

  public boolean isValid(String s) {
    Map<Character, Character> characterMap = new HashMap<>();
    characterMap.put('[', ']');
    characterMap.put('{', '}');
    characterMap.put('(', ')');
    Stack<Character> characters = new Stack<>();
    char[] chs = s.toCharArray();
    for (int i = 0; i < chs.length; i++) {
      if (characterMap.get(chs[i]) != null) {
        characters.push(chs[i]);
      } else {
        if(characters.isEmpty()) {return false;}
        char poppedChar = characters.pop();
        if (characterMap.get(poppedChar) != chs[i]) {
          return false;
        }
      }
    }
    if (characters.isEmpty()) {
      return true;
    }
    return false;
  }

}
