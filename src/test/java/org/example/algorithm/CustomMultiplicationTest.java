package org.example.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomMultiplicationTest {

    @Test
    void twoStringsMultiply_OK() {
        String n1 = "11111111111111111111";
        String n2 = "22222222222222222222";
        String expected = "246913580246913580241975308641975308642";

        String result = CustomMultiplication.twoStringsMultiply(n1, n2);

        assertEquals(expected, result);
    }

    @Test
    void twoStringsMultiply_ZERO() {
        String n1 = "00000000000000000000";
        String n2 = "22222222222222222222";
        String expected = "0";

        String result = CustomMultiplication.twoStringsMultiply(n1, n2);

        assertEquals(expected, result);
    }
}