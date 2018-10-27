package com.isa.java.tools.lombok.annotations.builder;

public class EmployeeDelomboked {

    private String name;
    private int salary;

    @java.beans.ConstructorProperties({"name", "salary"})
    EmployeeDelomboked(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public static EmployeeDelombokedBuilder builder() {
        return new EmployeeDelombokedBuilder();
    }

    public static class EmployeeDelombokedBuilder {

        private String name;
        private int salary;

        EmployeeDelombokedBuilder() {
        }

        public EmployeeDelombokedBuilder name(String name) {
            this.name = name;
            return this;
        }

        public EmployeeDelombokedBuilder salary(int salary) {
            this.salary = salary;
            return this;
        }

        public EmployeeDelomboked build() {
            return new EmployeeDelomboked(name, salary);
        }

        public String toString() {
            return "EmployeeDelomboked.EmployeeDelombokedBuilder(name=" + this.name + ", salary=" + this.salary + ")";
        }
    }
}
