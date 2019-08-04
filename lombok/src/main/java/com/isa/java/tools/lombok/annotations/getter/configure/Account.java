package com.isa.java.tools.lombok.annotations.getter.configure;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true, chain = true)
public class Account {

    private String name;
    private int salary;
}
