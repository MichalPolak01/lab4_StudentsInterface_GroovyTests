package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManager implements StudentsOperations {

    private Map<String, Student> students = new HashMap<>();

    StudentValidator studentValidator = new StudentValidator();
    @Override
    public boolean addStudnet(String name, String surname, String studentId) {
        if (studentValidator.addStudentValidate(name, surname, studentId, students)) {
            students.put(studentId, new Student(name, surname, studentId));
            return true;
        }
        return false;
    }

    @Override
    public boolean updateStudent(String name, String surname, String studentId) {
        if (studentValidator.updateStudentValidate(name, surname, studentId, students)) {
            students.replace(studentId, new Student(name, surname, studentId));
            return true;
        }
        return false;
    }

    @Override
    public boolean removeStudent(String studentId) {
        if (studentValidator.removeStudentValidate(studentId, students)) {
            students.remove(studentId);
            return true;
        }
        return false;
    }

    @Override
    public boolean addGrade(String studentId, String subject, double grade) {
        if (studentValidator.addGradeValidate(studentId, subject, grade, students)) {
            students.get(studentId).addGrade(subject, grade);
            return true;
        }
        return false;
    }

    @Override
    public double calculateAverageGrade(String subject) {
        if (studentValidator.calculateGradeValidate(subject)) {
            double sum = 0;
            int count = 0;
            for(Student student : students.values()) {
                if(student.getGrades().containsKey(subject)) {
                    List<Double> grades = student.getGrades().get(subject);
                    sum = grades.stream().reduce(sum, Double::sum);
                    count += grades.size();
                }
            }
            if (count != 0) {
                return sum / count;
            }
        }
        return 0;
    }

    public void showStudentsList() {
        int id = 1;
        for(Student student : students.values()) {
            System.out.println(id++ + ". "+ student.toString());
        }
    }
}
