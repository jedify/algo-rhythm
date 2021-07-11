package com.algorhythm.hard;

import java.util.Arrays;

public class FindMinimumTimeToFinishAllJobs {
    public static void main(String[] args) {
        System.out.println(new FindMinimumTimeToFinishAllJobs().minimumTimeRequired(new int[] {5,5,4,4,4}, 2));
    }
    public int minimumTimeRequired(int[] jobs, int k) {
        Arrays.sort(jobs);
        int jobIdIndex = jobs.length - 1;
        int[][] allocation = new int[k][2];
        while (jobIdIndex >= 0) {
            for (int i = 0; i < k; i++) {
                if (allocation[i][1] == 0) {
                    allocation[i][0] = allocation[i][0] +jobs[jobIdIndex];
                    allocation[i][1] = jobs[jobIdIndex];
                    jobIdIndex--;
                    if(jobIdIndex<0) {
                        break;
                    }
                } else {
                    allocation[i][1]--;
                }
            }
        }


        int max = -1;
        for (int i = 0; i < k; i++) {
            max = Math.max(max, allocation[i][0]);
        }
        return max;


    }
}
