package com.algorhythm.medium.graph;

import java.util.*;

/**
 * Topological Sorting
 * **/
public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> courses = new HashMap<>();
        int[] indegCount = new int[numCourses];

        for (int i = 0; i < prerequisites.length; i++) {
            int[] courseDependency = prerequisites[i];
            if (!courses.containsKey(courseDependency[0])) {
                courses.put(courseDependency[0],new LinkedList());
            }
            courses.get(courseDependency[0]).add(courseDependency[1]);

            indegCount[courseDependency[1]]++;
        }

        int source = findNode(indegCount);
        while(source>-1) {
            updateIndeg(indegCount, source, courses);
            source=findNode(indegCount);
        }

        for(int i:indegCount) {
            if(i!=-1) {
                return false;
            }
        }
        return true;
    }

    private void updateIndeg(int[] indeg,int node, Map<Integer, List<Integer>> courses) {
        if(!courses.containsKey(node)) {
            return;
        }
        for(int curr: courses.get(node)) {
            indeg[curr]--;
        }
    }

    private int findNode(int[] indeg) {
        for(int i=0;i<indeg.length;i++) {
            if(indeg[i]==0) {
                indeg[i]--;
                return i;
            }
        }
        return -1;
    }
}
