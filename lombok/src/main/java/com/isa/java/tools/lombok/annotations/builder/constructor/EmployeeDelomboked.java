package com.isa.java.tools.lombok.annotations.builder.constructor;

public class EmployeeDelomboked {

    private String name;
    private int salary;
    private String company;
    private String department;
    private String project;

    public EmployeeDelomboked(String company, String department, String project) {
        this.company = company;
        this.department = department;
        this.project = project;
    }

    public static EmployeeDelombokedBuilder builder() {
        return new EmployeeDelombokedBuilder();
    }

    public static class EmployeeDelombokedBuilder {

        private String company;
        private String department;
        private String project;

        EmployeeDelombokedBuilder() {
        }

        public EmployeeDelombokedBuilder company(String company) {
            this.company = company;
            return this;
        }

        public EmployeeDelombokedBuilder department(String department) {
            this.department = department;
            return this;
        }

        public EmployeeDelombokedBuilder project(String project) {
            this.project = project;
            return this;
        }

        public EmployeeDelomboked build() {
            return new EmployeeDelomboked(company, department, project);
        }

        public String toString() {
            return "EmployeeDelomboked.EmployeeDelombokedBuilder(company=" + this.company + ", department=" + this.department + ", project="
                    + this.project + ")";
        }
    }
}
