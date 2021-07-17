package com.algorhythm.medium.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Topological Sorting
 **/
public class CourseScheduleI {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> courses = new HashMap<>();
        int[] indegCount = new int[numCourses];
        int[] order = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            int[] courseDependency = prerequisites[i];
            if (!courses.containsKey(courseDependency[0])) {
                courses.put(courseDependency[0], new LinkedList());
            }
            courses.get(courseDependency[0]).add(courseDependency[1]);

            indegCount[courseDependency[1]]++;
        }
        int cnt=0;
        int source = findNode(indegCount);
        while (source > -1) {
            order[cnt]=source;
            updateIndeg(indegCount, source, courses);
            source = findNode(indegCount);
        }

        for (int i : indegCount) {
            if (i != -1) {
                return new int[]{};
            }
        }
        return order;
    }

    private void updateIndeg(int[] indeg, int node, Map<Integer, List<Integer>> courses) {
        if (!courses.containsKey(node)) {
            return;
        }
        for (int curr : courses.get(node)) {
            indeg[curr]--;
        }
    }

    private int findNode(int[] indeg) {
        for (int i = 0; i < indeg.length; i++) {
            if (indeg[i] == 0) {
                indeg[i]--;
                return i;
            }
        }
        return -1;
    }
}
