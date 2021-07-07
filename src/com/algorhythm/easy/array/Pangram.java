package com.algorhythm.easy.array;

public class Pangram {
    public static void main(String[] args) {
        System.out.println(new Pangram().checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }

    public boolean checkIfPangram(String sentence) {
        boolean[] visited = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            visited[(int) sentence.charAt(i) - 97] = true;
        }
        boolean pangram = true;
        for (int i = 0; i < visited.length; i++) {
            pangram = pangram && visited[i];
            if (!pangram) {
                return false;
            }
        }
        return pangram;
    }
}
