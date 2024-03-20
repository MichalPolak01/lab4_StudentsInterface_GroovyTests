package org.example;

import java.util.Map;

public class StudentValidator {

    public boolean addStudentValidate(String name, String surname, String id, Map<String, Student> students) {
        return checkName(name) && checkName(surname) &&  checkId(id, students);
    }

    private boolean checkName(String name) {
        return !name.isEmpty() && Character.isUpperCase(name.charAt(0));
    }

    private boolean checkId(String id, Map<String, Student> students) {
        return !id.isEmpty() && !students.containsKey(id);
    }
}
