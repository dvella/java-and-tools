package com.isa.java.tools.lombok.annotations.tostring.callSuper;

import lombok.ToString;

@ToString(callSuper = true)
public class Employee extends Citizen {

    private String name;
    private int salary;
}
