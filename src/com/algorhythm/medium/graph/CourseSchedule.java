package com.algorhythm.medium.graph;

import java.util.*;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> courses = new HashMap<>();
        for (int i = 0; i < prerequisites.length; i++) {
            int[] courseDependency = prerequisites[i];
            if (courses.containsKey(courseDependency[1])) {
                courses.get(courseDependency[1]).add(courseDependency[0]);
            } else {
                List courseList = new LinkedList();
                courseList.add(courseDependency[0]);
                courses.put(courseDependency[1], courseList);
            }
        }

        boolean[] path = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (icCyclic(i, courses, path)) {
                return false;
            }
        }
        return true;
    }

    private boolean icCyclic(int course, Map<Integer, List<Integer>> courses, boolean[] path) {
        if (path[course]) {
            return true;
        }

        if (!courses.containsKey(course)) {
            return false;
        }

        path[course] = true;
        boolean found = false;
        for (Integer depCourse : courses.get(courses)) {
            if (icCyclic(depCourse, courses, path)) {
                found = true;
                break;
            }
        }
        path[course] = false;
        return found;
    }
}
