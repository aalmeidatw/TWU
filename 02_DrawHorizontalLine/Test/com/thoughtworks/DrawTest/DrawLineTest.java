package com.thoughtworks.DrawTest;

import com.thoughtworks.Draw.DrawLine;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class DrawLineTest {
    DrawLine drawLine;

    @Before
    public void setUp() throws Exception {
        this.drawLine = new DrawLine();
    }

    @Test
    public void shouldPrintSevenAsterisksInOneLine(){
         assertThat(drawLine.drawLine(7), is ("*******"));
    }

    @Test
    public void shouldPrintEmptyLine(){
        assertThat(drawLine.drawLine(0), is (""));
    }
    

}