package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sum_shouldReturn4_whenArgumentsAre2and2() {
        //GIVEN
            int a = 2;
            int b = 2;
            int expected = 4;
        //WHEN
            int actual = Main.sum(a, b);
        //THEN
            assertEquals(expected, actual);
    }
}