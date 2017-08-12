package main;

import main.java.domain.Developer;
import main.java.domain.Manager;
import main.java.domain.QA;

public class Application {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.addEmployee(new Manager());
        manager.addEmployee(new Developer());
        manager.addEmployee(new QA());

        System.out.println(manager.getTeamAllocation());
    }
}
