package com.springboot.demo;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    String name;
    String location;

    public Employee(String name, String location) {
        super();
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static List<Employee> getAllEmployees() {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Hasith", "Kiribathgoda"));
        employees.add(new Employee("Ruzeik", "Maradana"));
        employees.add(new Employee("Ishan", "Batuwaththa"));
        employees.add(new Employee("Alfer", "Kalaniya"));
        employees.add(new Employee("Shamath", "Gampaha"));
        return employees;

    }

}
