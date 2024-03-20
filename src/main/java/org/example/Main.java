package org.example;

public class Main {
    public static void main(String[] args) {

        StudentsOperations studentsOperations = new StudentManager();

        studentsOperations.addStudnet("Michał", "Polak", "1");
        studentsOperations.addStudnet("Michał", "Polak", "1");
        studentsOperations.addStudnet("Michał", "Polak", "2");
        studentsOperations.addStudnet("Michał", "Polak", "3");
        studentsOperations.addStudnet("Michał", "Polak", "4");

        studentsOperations.updateStudent("Jan", "Nowak", "2");

        studentsOperations.removeStudent("4");


        studentsOperations.showStudentsList();
    }
}