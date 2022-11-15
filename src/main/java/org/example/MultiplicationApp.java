package org.example;

import org.example.view.Printer;
import org.example.service.SwitcherService;
import org.example.service.ValidationService;

public class MultiplicationApp {

    private final ValidationService validationService;
    private final Printer printerService;
    private final SwitcherService switcherService;
    private String[] args;

    public MultiplicationApp(ValidationService validationService, Printer printerService, SwitcherService switcherService) {
        this.validationService = validationService;
        this.printerService = printerService;
        this.switcherService = switcherService;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    public void runApp() {
        if (validationService.validateArgs(args)) {
            printerService.print(
                    switcherService.argumentSwitch(args[0], args[1], args[2])
            );
        } else {
            printerService.printDefault();
        }
    }
}
