package test;

import java.util.regex.Pattern;

public class RegEx {
  private static final Pattern VALID_EMAIL_ID_PATTERN = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
  public static void main(String[] args) {
    System.out.println(VALID_EMAIL_ID_PATTERN.matcher("mock@x.com").matches());
  }
}
