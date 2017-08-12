package main.java.domain;

import java.util.ArrayList;

public class Manager implements HasEmployee, Employee {

    private ArrayList<Employee> employees = new ArrayList<>();
    private int totalTeamAllocation;

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public int getTeamAllocation() {
        employees.forEach(employee -> totalTeamAllocation += employee.getAllocation());
        return totalTeamAllocation;
    }

    @Override
    public int getAllocation() {
        return 300;
    }
}