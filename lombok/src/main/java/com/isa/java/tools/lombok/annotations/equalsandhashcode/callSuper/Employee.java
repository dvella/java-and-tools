package com.isa.java.tools.lombok.annotations.equalsandhashcode.callSuper;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class Employee extends Citizen {

    private String name;
    private int salary;
}
