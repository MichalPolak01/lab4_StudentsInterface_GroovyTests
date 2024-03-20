package org.example;

import java.util.Map;

public class StudentValidator {

    public boolean addStudentValidate(String name, String surname, String id, Map<String, Student> students) {
        return checkName(name) && checkName(surname) &&  checkIdNoExists(id, students);
    }

    public boolean updateStudentValidate(String name, String surname, String id, Map<String, Student> students) {
        return checkName(name) && checkName(surname) && checkIdExists(id, students);
    }

    public boolean removeStudentValidate(String id, Map<String, Student> students) {
        return checkIdExists(id, students);
    }

    public boolean addGradeValidate(String id, String subject, double grade, Map<String, Student> students) {
        return checkIdExists(id, students) && checkSubject(subject) && checkGrade(grade);
    }


    private boolean checkName(String name) {
        return !name.isEmpty() && Character.isUpperCase(name.charAt(0));
    }

    private boolean checkIdNoExists(String id, Map<String, Student> students) {
        return !id.isEmpty() && !students.containsKey(id);
    }

    private boolean checkIdExists(String id, Map<String, Student> students) {
        return !id.isEmpty() && students.containsKey(id);
    }

    private boolean checkSubject(String subject) {
        return !subject.isEmpty();
    }

    private boolean checkGrade(double grade) {
        return grade >= 2 && grade <= 5;
    }
}
