package com.company;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    public Person(String first, String last, LocalDate date) {
        this.firstName = first;
        this.lastName = last;
        this.birthDate = date;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
}
