package com.company;

public class Student {
    private String name;
    private float score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }



}
