package com.isa.java.tools.lombok.annotations.tostring;

public class EmployeeDelomboked {

    private String name;
    private int salary;

    public String toString() {
        return "EmployeeDelomboked(name=" + this.name + ", salary=" + this.salary + ")";
    }
}
