package org.example;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private String surname;
    private String studentId;
    private Map<String, Double> grades = new HashMap<>();

    public Student(String name, String surname, String studentId) {
        this.name = name;
        this.surname = surname;
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void addGrade(String subjectName, Double grade) {
        grades.put(subjectName, grade);
    }

    public Map<String, Double> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", studentId='" + studentId + '\'' +
                ", grades=" + grades +
                '}';
    }
}
