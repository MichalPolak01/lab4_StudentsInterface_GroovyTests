package org.example;

public interface StudentsOperations {
    boolean addStudnet(String name, String surname, String studentId);
//
    boolean updateStudent(String name, String surname, String studentId);
//
    boolean removeStudent(String studentId);
//
//    boolean addGrade(String studentId, String subject, double grade);
//
//    double calculateAverageGrade(String subject);
//
    void showStudentsList();
}
