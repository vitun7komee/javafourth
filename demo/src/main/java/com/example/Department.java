package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Department {
    private int id;
    private String name;
    @Override
    public String toString() {
        return " department id: " + id + " department name: " + name; 
    }
}
