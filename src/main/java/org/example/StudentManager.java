package org.example;

import java.util.HashMap;
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

    public void showStudentsList() {
        int id = 1;
        for(Student student : students.values()) {
            System.out.println(id++ + ". "+ student.toString());
        }
    }
}
