package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person {
    private int id;
    private String name;
    private String gender;
    private Department department;
    private int salary;
    private String birthDate;
    @Override
    public String toString() {
        return "id: " + id + " name: " + name + " gender: " + gender + department + " salary: " + salary + " birthdate: " + birthDate;
    }
}
