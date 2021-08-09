package com.cts.academy.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TrainerCohortMapDAOTest.class);
        if (result.getFailureCount() == 0) {
            System.out.println("All Test cases Cleared");
        } else {
            System.out.println("One or more test case(s) failed");
            System.out.println("===============================");
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.getMessage());
            }
        }
    }
}
