package com.isa.java.tools.lombok.annotations.builder.constructor;

import lombok.Builder;

public class Employee {

    private String name;
    private int salary;
    private String company;
    private String department;
    private String project;

    @Builder
    public Employee(String company, String department, String project) {
        this.company = company;
        this.department = department;
        this.project = project;
    }
}
