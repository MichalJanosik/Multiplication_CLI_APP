package org.example;

import org.example.service.PrinterServiceImpl;
import org.example.service.SwitcherServiceImpl;
import org.example.service.ValidationServiceImpl;

public class Main {

    public static void main(String[] args) {
        MultiplicationApp app = new MultiplicationApp(
                new ValidationServiceImpl(),
                new PrinterServiceImpl(),
                new SwitcherServiceImpl()
        );
        app.setArgs(args);
        app.runApp();
    }
}