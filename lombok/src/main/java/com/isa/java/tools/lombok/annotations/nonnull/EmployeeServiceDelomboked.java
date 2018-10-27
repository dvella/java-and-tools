package com.isa.java.tools.lombok.annotations.nonnull;

public class EmployeeServiceDelomboked {

    public void increaseSalary(String name) {
        if (name == null) {
            throw new NullPointerException("name");
        }

        System.out.println(name);
    }
}
