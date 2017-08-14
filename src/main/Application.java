package main;

import main.java.domain.Department;
import main.java.domain.Developer;
import main.java.domain.Manager;
import main.java.domain.QA;

public class Application {
    public static void main(String[] args) {

        Manager managerA = new Manager();
        Manager managerB = new Manager();
        Manager managerC = new Manager();
        managerB.addEmployee(new Developer());
        managerB.addEmployee(new QA());
        managerA.addEmployee(managerB);
        Department department = new Department();
        department.addEmployee(managerB);


        System.out.println(managerB);
    }
}
