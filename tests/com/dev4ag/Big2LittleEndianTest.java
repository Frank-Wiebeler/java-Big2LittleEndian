package com.dev4ag;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Big2LittleEndianTest {

    @Test
    public void testInt2LittleEndian(){
        // CheckBytes  01234567012345670123456701234567
        int test   = 0b00000001000000100000010000001000;
        int result = 0b00001000000001000000001000000001;
        int compare = Big2LittleEndian.int2LittleEndian(test);
        assertEquals(compare, result);

        compare = Big2LittleEndian.intFromLittleEndian(compare);
        assertEquals(test,compare);    }

    @Test
    public void testShort2LittleEndian(){
        // CheckBytes    0123456701234567
        short test   = 0b0000000100000010;
        short result = 0b0000001000000001;
        short compare = Big2LittleEndian.short2LittleEndian(test);
        assertEquals(compare, result);

        compare = Big2LittleEndian.shortFromLittleEndian(compare);
        assertEquals(test,compare);    }

    @Test
    public void testLong2LittleEndian(){
        // CheckBytes   01234567 01234567012345670123456701234567012345670123456701234567
        long test   = 0b0000000100000010000001000000100000010000001000000100000010000000L;
        long result = 0b1000000001000000001000000001000000001000000001000000001000000001L;
        long compare = Big2LittleEndian.long2LittleEndian(test);
        assertEquals(compare, result);

        compare = Big2LittleEndian.longFromLittleEndian(compare);
        assertEquals(test,compare);
    }

}
