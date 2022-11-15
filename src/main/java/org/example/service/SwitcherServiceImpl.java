package org.example.service;

public class SwitcherServiceImpl implements SwitcherService {

    @Override
    public String argumentSwitch(String arg, String n1, String n2) {
        switch (arg) {
            case "-a" -> {
                return "Using built in algorithm";
            }
            case "-b" -> {
                return "Using BigInteger class";
            }
            default -> {
                return "Unexpected error";
            }
        }
    }
}
