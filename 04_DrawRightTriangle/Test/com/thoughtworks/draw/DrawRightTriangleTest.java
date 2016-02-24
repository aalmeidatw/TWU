package com.thoughtworks.draw;


import com.sun.xml.internal.bind.v2.util.ByteArrayOutputStreamEx;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class DrawRightTriangleTest {
    private DrawRightTriangle drawRightTriangle;
    private ByteArrayOutputStream outputStream;

    @Before
    public void setUp() throws Exception {
        this.drawRightTriangle = new DrawRightTriangle();
        this.outputStream = new ByteArrayOutputStream();
     }

    @Test
    public void shouldReturnSixAsterisks(){
        System.setOut(new PrintStream(outputStream));
        String expected = "******";

        drawRightTriangle.drawHorizontalLine(5);
        assertEquals(outputStream.toString(), expected);
    }


}