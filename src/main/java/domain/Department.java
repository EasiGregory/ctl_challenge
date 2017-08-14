package main.java.domain;

import java.util.ArrayList;

public class Department implements HasAllocation, HasEmployee {
    private ArrayList<Employee> employees = new ArrayList<>();
    private int totalAllocation;

    @Override
    public int getAllocation() {
        return this.getTotalAllocation();
    }

    @Override
    public int getTotalAllocation() {
        totalAllocation = 0;
        employees.forEach(employee -> totalAllocation += employee.getTotalAllocation());
        return totalAllocation;
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public String toString() {
        return String.format("Department allocation: %s", this.getAllocation());
    }
}
