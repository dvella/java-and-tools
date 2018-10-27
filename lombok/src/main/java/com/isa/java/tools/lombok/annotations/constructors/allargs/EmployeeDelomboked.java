package com.isa.java.tools.lombok.annotations.constructors.allargs;

public class EmployeeDelomboked {

    private String name;
    private int salary;

    @java.beans.ConstructorProperties({"name", "salary"})
    public EmployeeDelomboked(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
