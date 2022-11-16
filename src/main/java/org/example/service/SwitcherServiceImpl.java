package org.example.service;

import org.example.algorithm.BigIntegerMultiplication;
import org.example.algorithm.CustomMultiplication;

public class SwitcherServiceImpl implements SwitcherService {

    private final CustomMultiplication customMultiplication;
    private final BigIntegerMultiplication bigIntegerMultiplication;

    public SwitcherServiceImpl(CustomMultiplication customMultiplication,
                               BigIntegerMultiplication bigIntegerMultiplication
    ) {
        this.customMultiplication = customMultiplication;
        this.bigIntegerMultiplication = bigIntegerMultiplication;
    }

    @Override
    public String argumentSwitch(String arg, String n1, String n2) {
        switch (arg) {
            case "-a" -> {
                return customMultiplication.twoStringsMultiply(n1, n2);
            }
            case "-b" -> {
                return bigIntegerMultiplication.twoStringsMultiply(n1, n2);
            }
            default -> {
                return "Unexpected error";
            }
        }
    }
}
