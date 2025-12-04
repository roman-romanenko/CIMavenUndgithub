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

    @Test
    void isEven_shouldReturnTrue_whenArguments6() {
        //GIVEN
        int a = 6;
        boolean expected = true;
        //WHEN
        boolean actual = Main.isEven(a);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void multiply_shouldReturn8_whenArgumentsAre2and4() {
        //GIVEN
        int a = 2;
        int b = 4;
        int expected = 8;
        //WHEN
        int actual = Main.multiply(a, b);
        //THEN
        assertEquals(expected, actual);
    }


}