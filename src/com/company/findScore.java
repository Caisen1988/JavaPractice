package com.company;

import java.util.List;
import java.util.Map;

public class findScore {
    List<Student> list;
    Map<String, Integer> cache;

    findScore(List<Student> list) {
        this.list = list;
    }
    /**
     * 根据name查找score，找到返回score，未找到返回0
     * @return
     */
    public float getScoreByStudentName(String name) {
        for (Student s : this.list) {
            if (s.getName().equals(name)) {
                return s.getScore();
            } else {
                return 0;
            }
        }
        return 0;
    }
}
