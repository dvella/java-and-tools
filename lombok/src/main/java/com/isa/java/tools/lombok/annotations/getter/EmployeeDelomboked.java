package com.isa.java.tools.lombok.annotations.getter;

public class EmployeeDelomboked {

    private String name;
    private int salary;

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
