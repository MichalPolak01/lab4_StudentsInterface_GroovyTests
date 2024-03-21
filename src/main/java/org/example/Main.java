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

        studentsOperations.addGrade("1", "Matematyka", 4);
        studentsOperations.addGrade("1", "Matematyka", 4.5);
        studentsOperations.addGrade("2", "Matematyka", 5);
        studentsOperations.addGrade("3", "Matematyka", 3.5);
        studentsOperations.addGrade("2", "Matematyka", 3);

        studentsOperations.addGrade("1", "Historia", 2.5);
        studentsOperations.addGrade("1", "Historia", 3.5);
        studentsOperations.addGrade("2", "Historia", 5);

        double averageGradeMath = studentsOperations.calculateAverageGrade("Matematyka");
        double averageGradeHistory = studentsOperations.calculateAverageGrade("Historia");

        System.out.println("Średnia ocen z matematyki: " + averageGradeMath + "\nŚrednia ocen z historii: " + averageGradeHistory + "\n");

        studentsOperations.showStudentsList();
    }
}