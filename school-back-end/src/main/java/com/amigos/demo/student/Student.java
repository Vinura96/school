package com.amigos.demo.student;

import java.util.UUID;

public class Student {
    private  final UUID studentId;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Gender gender;

    public Student(UUID studentId, String firstName, String lastName, String email, Gender gender) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public UUID getStudentId() {
        return studentId;
    }

    enum Gender {
        MALE, FEMALE
    }
}

//The java.util.UUID class represents an immutable universally unique identifier (UUID).
//A UUID represents a 128-bit value. It is used for creating random file names, session id in web application, transaction id etc.
//There are four different basic types of UUIDs: time-based, DCE security, name-based, and randomly generated UUIDs.
