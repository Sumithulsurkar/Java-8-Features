package com.basics;

public class Student {
    private int rollNumber;
    private Integer maths;
    private Integer science;
    private Integer english;

    private float avg;

    public Student() {
    }

    public Student(int rollNumber, Integer maths, int science, int english, float avg) {
        this.rollNumber = rollNumber;
        this.maths = maths;
        this.science = science;
        this.english = english;
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber='" + rollNumber + '\'' +
                ", maths=" + maths +
                ", science=" + science +
                ", english=" + english +
                ", avg=" + avg +
                '}';
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setName(int rollNumber) {
        this.rollNumber = this.rollNumber;
    }

    public Integer getMaths() {
        return maths;
    }

    public void setMaths(Integer maths) {
        this.maths = maths;
    }

    public Integer getScience() {
        return science;
    }

    public void setScience(Integer science) {
        this.science = science;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }
}
