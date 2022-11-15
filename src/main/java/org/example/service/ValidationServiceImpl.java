package org.example.service;

import java.util.List;

public class ValidationServiceImpl implements ValidationService {

    private final List<String> argumentOpts = List.of("-a", "-b");

    @Override
    public boolean validateArgs(String[] args) {
        if (args.length == 3) {
            if (argumentOpts.contains(args[0])
                    && args[1].matches("[0-9]+")
                    && args[2].matches("[0-9]+")
            ) {
                return true;
            }
        }
        return false;
    }
}
