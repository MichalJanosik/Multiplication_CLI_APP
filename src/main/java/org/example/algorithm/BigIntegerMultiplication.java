package org.example.algorithm;

import java.math.BigInteger;

public class BigIntegerMultiplication implements Multiplication {
    public String twoStringsMultiply(String n1, String n2) {
        return new BigInteger(n1)
                .multiply(new BigInteger(n2))
                .toString();
    }
}
