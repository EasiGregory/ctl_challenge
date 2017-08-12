package test;

import main.java.domain.Developer;
import main.java.domain.Manager;
import main.java.domain.QA;
import org.junit.Test;

public class AllocationTest {

    @Test
    public void verifyQaAllocation() {
        QA qa = new QA();

        assert qa.getAllocation() == 500;
    }

    @Test
    public void verifyDeveloperAllocation() {
        Developer developer = new Developer();

        assert developer.getAllocation() == 1000;
    }

    @Test
    public void verifyManagerAllocation() {
        Manager manager = new Manager();

        assert manager.getAllocation() == 300;
    }
}
