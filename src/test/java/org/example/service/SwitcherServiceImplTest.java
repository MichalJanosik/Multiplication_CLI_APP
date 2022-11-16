package org.example.service;

import org.example.algorithm.BigIntegerMultiplication;
import org.example.algorithm.CustomMultiplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SwitcherServiceImplTest {

    @Mock
    CustomMultiplication customMultiplication;

    @Mock
    BigIntegerMultiplication bigIntegerMultiplication;

    @InjectMocks
    SwitcherServiceImpl switcherService;

    @Test
    void argumentSwitch() {
        String argA = "-a";
        String argB = "-b";
        String n1 = "11111111111111111111";
        String n2 = "22222222222222222222";
        String expected = "246913580246913580241975308641975308642";
        when(customMultiplication.twoStringsMultiply(n1, n2)).thenReturn(expected);
        when(bigIntegerMultiplication.twoStringsMultiply(n1, n2)).thenReturn(expected);

        String resultA = switcherService.argumentSwitch(argA, n1, n2);
        String resultB = switcherService.argumentSwitch(argB, n1, n2);

        assertEquals(expected, resultA);
        assertEquals(expected, resultB);
    }
}