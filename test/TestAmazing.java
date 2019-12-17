package test;// Copyright 2003, William C. Wake. All rights reserved.

import main.Amazing;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class TestAmazing  {

    @Test
    public void testSeed0size15x20() {
        String expected =
                "Amazing - Copyright by Creative Computing, Morristown, NJ\n" +
                "+--+--+--+--+--+--+--+--+--+--+  +--+--+--+--+\n" +
                "|  |           |        |     |     |        | \n" +
                "+  +  +  +  +  +  +--+  +  +  +  +--+  +--+  +\n" +
                "|     |  |  |  |     |     |     |     |  |  | \n" +
                "+--+--+  +  +--+  +  +--+--+--+--+  +  +  +  +\n" +
                "|     |  |        |  |              |  |     | \n" +
                "+  +  +  +--+--+--+  +  +  +--+--+--+--+--+--+\n" +
                "|  |     |        |     |  |     |        |  | \n" +
                "+--+--+  +--+  +--+  +--+  +  +  +  +--+  +  +\n" +
                "|     |        |        |  |  |     |     |  | \n" +
                "+  +  +--+--+--+  +--+  +  +  +--+--+  +--+  +\n" +
                "|  |              |     |  |  |     |  |     | \n" +
                "+  +--+--+--+--+--+--+  +  +  +  +--+  +--+  +\n" +
                "|        |           |  |  |  |     |  |     | \n" +
                "+  +--+  +--+  +  +  +  +  +  +--+  +  +  +--+\n" +
                "|  |     |     |  |  |  |  |     |  |  |  |  | \n" +
                "+  +  +--+  +--+  +  +  +  +--+  +  +  +  +  +\n" +
                "|  |        |     |  |  |        |  |  |  |  | \n" +
                "+  +--+  +--+  +--+  +  +--+--+--+  +  +  +  +\n" +
                "|     |     |  |  |  |  |     |        |     | \n" +
                "+--+  +--+  +  +  +  +--+  +  +  +--+--+  +--+\n" +
                "|  |     |  |     |     |  |  |     |  |     | \n" +
                "+  +--+  +--+--+--+  +  +  +  +--+  +  +  +  +\n" +
                "|     |     |     |  |  |  |     |  |  |  |  | \n" +
                "+  +  +--+  +  +  +--+  +  +--+  +  +  +  +  +\n" +
                "|  |        |  |     |  |     |     |  |  |  | \n" +
                "+  +--+--+  +--+  +  +  +--+  +--+--+  +  +--+\n" +
                "|  |     |        |  |     |     |     |     | \n" +
                "+  +  +--+--+--+--+  +  +--+  +  +  +--+--+  +\n" +
                "|     |           |  |     |  |  |  |     |  | \n" +
                "+  +--+  +--+--+--+  +--+  +  +  +  +  +  +  +\n" +
                "|  |                 |     |  |  |     |  |  | \n" +
                "+  +  +--+--+--+--+--+  +--+  +--+  +--+  +  +\n" +
                "|  |  |  |           |     |     |  |     |  | \n" +
                "+  +  +  +  +--+  +  +--+  +--+  +  +  +--+  +\n" +
                "|  |  |     |     |  |  |     |     |  |     | \n" +
                "+--+  +--+--+  +  +  +  +  +  +--+--+  +--+  +\n" +
                "|     |        |  |  |  |  |  |     |        | \n" +
                "+  +--+  +--+--+  +  +  +  +  +--+  +  +--+--+\n" +
                "|        |        |     |  |        |        | \n" +
                "+--+--+--+--+--+--+--+--+  +--+--+--+--+--+--+\n";

        Amazing.random = new Random(0);
        Amazing.doit(15, 20);

        assertEquals(expected, Amazing.result.toString());
    }

    @Test
    public void testSeed100size4x5() {
        String expected =
                "Amazing - Copyright by Creative Computing, Morristown, NJ\n" +
                "+--+--+  +--+\n" +
                "|     |     | \n" +
                "+  +--+  +  +\n" +
                "|  |     |  | \n" +
                "+  +  +--+  +\n" +
                "|  |  |     | \n" +
                "+  +  +  +  +\n" +
                "|  |  |  |  | \n" +
                "+  +--+  +  +\n" +
                "|  |  |  |  | \n" +
                "+--+--+  +--+\n";

        Amazing.random = new Random(100);
        Amazing.doit(4, 5);
        assertEquals(expected, Amazing.result.toString());
    }

    @Test
    public void testSize1x1GivesEmpty() {
        String expected =
                "Amazing - Copyright by Creative Computing, Morristown, NJ\n";

        Amazing.doit(1, 1);
        assertEquals(expected, Amazing.result.toString());
    }

    @Test
    public void testSize2x2Gives() {
        String expected =
                "Amazing - Copyright by Creative Computing, Morristown, NJ\n" +
                        "+--+  +\n" +
                        "|  |  | \n" +
                        "+  +--+\n" +
                        "|  |  | \n" +
                        "+--+--+\n";


        Amazing.doit(2, 2);
        assertEquals(expected, Amazing.result.toString());
    }
}
