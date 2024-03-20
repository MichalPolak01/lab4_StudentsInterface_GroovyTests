package org.example

import spock.lang.Shared
import spock.lang.Specification

class StudentManagerTests extends Specification {

    @Shared
    StudentsOperations studentsOperations = new StudentManager()

    def "Add student"() {
        expect:
            studentsOperations.addStudnet(name, surname, id) == result

        where:
            name    | surname   | id    | result
            "Michał"| "Polak"   | "1"   | true
            "Michał"| "Polak"   | "2"   | true
            "Michał"| "Polak"   | "3"   | true
            "Michał"| "Polak"   | "1"   | false
            "michał"| "Polak"   | "2"   | false
            "Michał"| "polak"   | "3"   | false
            ""      | "Polak"   | "4"   | false
            "Michał"| ""        | "5"   | false
            "Michał"| "Polak"   | ""    | false
    }

    def "Update student"() {
        expect:
            studentsOperations.updateStudent(name, surname, id) == result
        where:
            name    | surname   | id    | result
            "Jan"   | "Kowalski"| "2"   | true
            "Jan"   | "Kowalski"| "9"   | false
            "michał"| "Polak"   | "1"   | false
            "Michał"| "polak"   | "1"   | false
            ""      | "Polak"   | "1"   | false
            "Michał"| ""        | "1"   | false
            "Michał"| "Polak"   | ""    | false
    }

    def "Remove student"() {
        expect:
            studentsOperations.removeStudent(id) == result

        where:
            id  | result
            "3" | true
            "4" | false
            "9" | false
    }

    def "Add grade"() {
        expect:
            studentsOperations.addGrade(id, subject, grade) == result

        where:
            id  |   subject     | grade | result
            "1" |   "Math"      | 4.5   | true
            "1" |   "Math"      | 2     | true
            "2" |   "Math"      | 3.5   | true
            "2" |   "Math"      | 2     | true
            "2" |   "History"   | 5     | true
            "1" |   "History"   | 3.5   | true
            "9" |   "Math"      | 2.5   | false
            ""  |   "History"   | 4     | false
            "2" |   ""          | 3     | false
            "2" |   "Math"      | 0     | false
            "2" |   "Math"      | 1     | false
            "2" |   "Math"      | 6     | false
            "2" |   "Math"      | 9     | false
    }
}
