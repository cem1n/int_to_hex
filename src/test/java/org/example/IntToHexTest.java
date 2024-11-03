package org.example;

import org.junit.jupiter.api.Test;

import static org.example.IntToHex.intToHex;
import static org.junit.Assert.assertEquals;

class IntToHexTest {
    @Test
    void test1() {
        for (int index = -10000; index < 10000; index++) {
            String conv = Integer.toString(index, 16);
            System.out.println(index + " - value");
            System.out.println(conv + " - conv");
            System.out.println();
            assertEquals(conv, intToHex(index));
        }
    }

    @Test
    void test2() {
        assertEquals(Integer.toString(0, 16), intToHex(0));
        assertEquals(Integer.toString(10000, 16), intToHex(10000));
        assertEquals(Integer.toString(-10000, 16), intToHex(-10000));
    }


    @Test
    void test3() {
        assertEquals(Integer.toString(2147483647, 16), intToHex(2147483647));
        assertEquals(Integer.toString(-2147483647, 16), intToHex(-2147483647));
    }
}