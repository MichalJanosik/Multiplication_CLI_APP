package org.example;

import org.example.service.ValidationService;

public class MultiplicationApp {

    private final ValidationService validationService;

    private String[] args;

    public MultiplicationApp(ValidationService validationService) {
        this.validationService = validationService;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    public void runApp() {
        if (validationService.validateArgs(args)) {
            System.out.println("valid");
        } else {
            System.out.println("default text");
        }
    }
}
