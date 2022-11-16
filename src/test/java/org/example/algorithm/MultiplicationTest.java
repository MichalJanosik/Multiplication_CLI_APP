package org.example.algorithm;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class MultiplicationTest {


    @InjectMocks
    CustomMultiplication customMultiplication;

    @InjectMocks
    BigIntegerMultiplication bigIntegerMultiplication;

    static String N1;
    static String N2;
    static String N3;
    static String EXPECTED_OK;
    static String EXPECTED_ZERO;
    static String RESULT_CUSTOM;
    static String RESULT_BIG_INT;

    @BeforeAll
    static void setup() {
        N1 = "11111111111111111111";
        N2 = "22222222222222222222";
        N3 = "00000000000000000000";
        EXPECTED_OK = "246913580246913580241975308641975308642";
        EXPECTED_ZERO = "0";
    }

    @Test
    void customTwoStringsMultiply_OK() {
        RESULT_CUSTOM = customMultiplication.twoStringsMultiply(N1, N2);

        assertEquals(EXPECTED_OK, RESULT_CUSTOM);
    }

    @Test
    void customTwoStringsMultiply_ZERO() {
        String result = customMultiplication.twoStringsMultiply(N1, N3);

        assertEquals(EXPECTED_ZERO, result);
    }

    @Test
    void bigIntTwoStringsMultiply_OK() {
        RESULT_BIG_INT = bigIntegerMultiplication.twoStringsMultiply(N1, N2);

        assertEquals(EXPECTED_OK, RESULT_BIG_INT);
    }

    @Test
    void bigIntTwoStringsMultiply_ZERO() {
        String result = bigIntegerMultiplication.twoStringsMultiply(N1, N3);

        assertEquals(EXPECTED_ZERO, result);
    }

    @Test
    void resultComparativeTest() {
        RESULT_CUSTOM = customMultiplication.twoStringsMultiply(N1, N2);
        RESULT_BIG_INT = bigIntegerMultiplication.twoStringsMultiply(N1, N2);
        assertEquals(RESULT_CUSTOM, RESULT_BIG_INT);
    }
}