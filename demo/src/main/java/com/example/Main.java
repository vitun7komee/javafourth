package com.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import au.com.bytecode.opencsv.CSVReader;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Person> people = new ArrayList<>();
        Map<String, Department> departments = new HashMap();
        int depId = 0;
         try (InputStream in = Main.class.getClassLoader().getResourceAsStream("foreign_names.csv");
                CSVReader reader = in == null ? null : new CSVReader(new InputStreamReader(in), ';')) {
            if (reader == null) {
                throw new FileNotFoundException("foreign_names.csv");
            }
            String[] nextLine;
            boolean notFirstLine = false;
            while ((nextLine = reader.readNext()) != null) {
                if(notFirstLine){
                    if(!departments.containsKey(nextLine[4]))
                    departments.put(nextLine[4], new Department(depId++, nextLine[4]));
                people.add(new Person(Integer.parseInt(nextLine[0]), nextLine[1], nextLine[2], departments.get(nextLine[4]), Integer.parseInt(nextLine[5]), nextLine[3]));
            }
            else
            notFirstLine = true;
            }
        }
        for(int i = 0; i < people.size(); i++){
            System.out.println(people.get(i));
        }
}
}