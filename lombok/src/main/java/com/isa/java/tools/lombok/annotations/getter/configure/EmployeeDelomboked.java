package com.isa.java.tools.lombok.annotations.getter.configure;

public class EmployeeDelomboked {

    private String name;
    private int salary;

    public String name() {
        return this.name;
    }

    public int salary() {
        return this.salary;
    }

    public EmployeeDelomboked name(String name) {
        this.name = name;
        return this;
    }

    public EmployeeDelomboked salary(int salary) {
        this.salary = salary;
        return this;
    }
}
