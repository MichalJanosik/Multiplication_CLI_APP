package org.example;

import org.example.algorithm.BigIntegerMultiplication;
import org.example.algorithm.CustomMultiplication;
import org.example.view.PrinterImpl;
import org.example.service.SwitcherServiceImpl;
import org.example.service.ValidationServiceImpl;

public class Main {

    public static void main(String[] args) {
        MultiplicationApp app = new MultiplicationApp(
                new ValidationServiceImpl(),
                new PrinterImpl(),
                new SwitcherServiceImpl(new CustomMultiplication(), new BigIntegerMultiplication())
        );
        app.setArgs(args);
        app.runApp();
    }
}