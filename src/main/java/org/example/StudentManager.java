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

    public void showStudentsList() {
        for(Student student : students.values()) {
            System.out.println(student.toString());
        }
    }
}
