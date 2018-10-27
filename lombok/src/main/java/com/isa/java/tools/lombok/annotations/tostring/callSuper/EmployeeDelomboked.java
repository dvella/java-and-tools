package com.isa.java.tools.lombok.annotations.tostring.callSuper;

public class EmployeeDelomboked extends Citizen {

    private String name;
    private int salary;

    public String toString() {
        return "EmployeeDelomboked(super=" + super.toString() + ", name=" + this.name + ", salary=" + this.salary + ")";
    }
}
