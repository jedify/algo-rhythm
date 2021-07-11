package com.algorhythm.easy.graph;

import java.util.HashMap;
import java.util.Map;

public class FindTheTownJudge {
    public int findJudge(int N, int[][] trust) {
        boolean[] townPeople = new boolean[N + 1];
        for (int[] t : trust) {
            townPeople[t[0]] = true;
        }

        int potentialJudge = -1, count = 0;
        for (int i = 1; i < townPeople.length; i++) {
            if (!townPeople[i]) {
                potentialJudge = i;
                count++;
            }
        }
        if (count > 1) {
            return -1;
        }

        int trustCount=0;
        for (int[] t : trust) {
            if(t[1]==potentialJudge) {
                trustCount++;
            }
        }
        if(trustCount==N-1) {
            return potentialJudge;
        }
        return -1;


    }
}
