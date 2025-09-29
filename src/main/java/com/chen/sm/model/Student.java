package com.chen.sm.model;

import java.util.Objects;

public class Student {
    private String id;
    private String name;
    private int age;
    private double score;
    public Student(String id, String name, int age, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if(obj == this) {
            return true;
        }
        if(obj instanceof Student s) {
            if(Objects.equals(this.id, s.id)){
                return true;
            }
        }
        return false;
    }
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("Student{id='%s', name='%s', age=%d, score=%.2f}", id, name, age, score);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
