package com.isa.java.tools.lombok.annotations.equalsandhashcode.exclude;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Manager {

    private String name;
    private Employee subordinate;
}