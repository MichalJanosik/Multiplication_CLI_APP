package org.example.view;

public class PrinterImpl implements Printer {
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public void printDefault() {
        System.out.println(
                """
                Calculate multiplication app
                ============================
                
                Calculates multiplication of two positive
                integers which are passed in as command line
                arguments.
                
                Command line arguments:
                    -a  uses built in algorithm
                    -b  uses BigInteger class
                    
                Example:
                calculate_multiplication.jar -a 1234566789 123456789
                """
        );
    }
}
