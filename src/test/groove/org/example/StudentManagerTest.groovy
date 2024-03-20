package org.example

import spock.lang.Shared
import spock.lang.Specification

class StudentManagerTest extends Specification {

    @Shared
    StudentsOperations studentsOperations = new StudentManager()

    def "Add student"() {
        expect:
            studentsOperations.addStudnet(name, surname, id) == result

        where:
            name    | surname   | id    | result
            "Michał"| "Polak"   | "1"   | true
            "Michał"| "Polak"   | "1"   | false
            "michał"| "Polak"   | "2"   | false
            "Michał"| "polak"   | "3"   | false
            ""      | "Polak"   | "4"   | false
            "Michał"| ""        | "5"   | false
            "Michał"| "Polak"   | ""    | false

    }
}
