package com.isa.java.tools.lombok.annotations.equalsandhashcode.exclude;

public class RecursionTest {

    public static void main(String[] args) {
        Manager manager = new Manager();
        Employee employee = new Employee();
        manager.setSubordinate(employee);
        employee.setManager(manager);
        System.out.println(employee.hashCode());
    }
}
