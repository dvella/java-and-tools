package com.isa.java.tools.lombok.annotations.tostring.exclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Manager {

    private String name;
    private Employee subordinate;
}
