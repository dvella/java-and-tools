package com.isa.java.tools.lombok.annotations.tostring.exclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = "manager")
public class Employee {

    private String name;
    private int salary;
    private Manager manager;
}
