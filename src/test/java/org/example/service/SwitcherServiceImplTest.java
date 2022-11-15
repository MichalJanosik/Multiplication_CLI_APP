package org.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwitcherServiceImplTest {

    @Test
    void argumentSwitch_OK() {
        String argA = "-a";
        String argB = "-b";
        String n1 = "11111111111111111111";
        String n2 = "22222222222222222222";
        String expected = "246913580246913580241975308641975308642";

        SwitcherServiceImpl switcherService = new SwitcherServiceImpl();
        String resultA = switcherService.argumentSwitch(argA, n1, n2);
        String resultB = switcherService.argumentSwitch(argB, n1, n2);

        assertEquals(expected, resultA);
        assertEquals(expected, resultB);
        assertEquals(resultA, resultB);
    }
}