package org.example.service;

import org.example.algorithm.CustomMultiplication;

import java.math.BigInteger;

public class SwitcherServiceImpl implements SwitcherService {

    @Override
    public String argumentSwitch(String arg, String n1, String n2) {
        switch (arg) {
            case "-a" -> {
                return CustomMultiplication.twoStringsMultiply(n1, n2);
            }
            case "-b" -> {
                return new BigInteger(n1)
                        .multiply(new BigInteger(n2))
                        .toString();
            }
            default -> {
                return "Unexpected error";
            }
        }
    }
}
