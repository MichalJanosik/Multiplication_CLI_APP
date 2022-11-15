package org.example;

import org.example.service.PrinterService;
import org.example.service.ValidationService;

public class MultiplicationApp {

    private final ValidationService validationService;
    private final PrinterService printerService;

    private String[] args;

    public MultiplicationApp(ValidationService validationService, PrinterService printerService) {
        this.validationService = validationService;
        this.printerService = printerService;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    public void runApp() {
        if (validationService.validateArgs(args)) {
            System.out.println("valid");
        } else {
            printerService.printDefault();
        }
    }
}
