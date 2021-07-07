package com.algorhythm.medium.string;

public class ReverseString {
  public static void main(String[] args) {
    System.out.println(new ReverseString().reverseWords(" io  iok io  plk    "));
  }

  public String reverseWords(String s) {
    StringBuffer sb = new StringBuffer();
    char preCh = s.charAt(s.length() - 1);
    if (preCh != ' ') {
      sb.append(preCh);
    }
    int i = s.length() - 1;
    while (i >= 0) {
      char ch = s.charAt(i--);
      if (preCh == ' ' && ch != ' ') {

      }
    }
    return sb.toString();
  }
}
