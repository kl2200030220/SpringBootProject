package com.klef.jfsd.exam;

import java.util.List;

public class Employee {
    private int employeeId;
    private String name;
    private double salary;
    private String department;
    private List<String> skills;

    public Employee(int employeeId, String name, double salary, String department, List<String> skills) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.skills = skills;
    }

    // Getters and setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}