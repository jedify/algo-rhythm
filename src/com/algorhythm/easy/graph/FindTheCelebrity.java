package com.algorhythm.easy.graph;

public class FindTheCelebrity {
    boolean knows(int a, int b) {
        return true;
    }

    public int findCelebrity(int n) {
        int[] followersCount = new int[n];
        int[] followCount = new int[n];
        int countOfCelebrity = 0, celebrity = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (knows(i, j)) {
                    followersCount[j] = followersCount[j] + 1;
                    followCount[i]++;
                    if (followersCount[j] == n) {
                        countOfCelebrity++;
                        celebrity = j;
                    }
                }
            }
        }

        if (countOfCelebrity == 0 || countOfCelebrity > 1 || followersCount[celebrity] > 1 || followCount[celebrity]>1) {
            return -1;
        }
        return celebrity;
    }
}
