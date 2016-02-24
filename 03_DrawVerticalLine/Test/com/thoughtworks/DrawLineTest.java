package com.thoughtworks;

import com.thoughtworks.draw.DrawLine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class DrawLineTest {


    @Test
    public void shouldDrawOneAxterix(){
       DrawLine drawLine = new DrawLine();
        String line = drawLine.drawLine(1,"");
        assertEquals("*",line);
    }

    @Test
    public void shouldDrawSevenAxterix(){
        DrawLine drawLine = new DrawLine();
        String line = drawLine.drawLine(7,"");
        assertEquals("*******",line);
    }

    @Test
    public void shouldDrawVerticalLineWithOneAxterix(){
        DrawLine drawLine = new DrawLine();
        String line = drawLine.drawLine(2,"\n");
        assertEquals("*\n*\n",line);
    }

}
