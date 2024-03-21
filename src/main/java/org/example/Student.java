package org.example;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private String surname;
    private String studentId;
    private Map<String, List<Double>> grades = new LinkedHashMap<>();

    public Student(String name, String surname, String studentId) {
        this.name = name;
        this.surname = surname;
        this.studentId = studentId;
    }

    public void addGrade(String subjectName, Double grade) {
        List<Double> marks = grades.get(subjectName);

        if (marks == null) {
            marks = new LinkedList<>();
            marks.add(grade);
        } else {
            marks.add(grade);
        }

        grades.put(subjectName, marks);
    }

    public Map<String, List<Double>> getGrades() {
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
