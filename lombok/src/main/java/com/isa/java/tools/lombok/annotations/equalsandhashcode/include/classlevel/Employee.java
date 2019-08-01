package com.isa.java.tools.lombok.annotations.equalsandhashcode.include.classlevel;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = {"name", "age"})
public class Employee {

    private String name;
    private int age;
    private int salary;
}
