package com.thoughtworks.model;


import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;


public class DiamondTest {
    private Diamond diamond;
    private ByteArrayOutputStream outputStream;

    @Before
    public void setUp() throws Exception {
        this.outputStream = new ByteArrayOutputStream();
        this.diamond = new Diamond();

    }

    @Test
    public void  shoudReturnNumberOfAsterisks(){
        assertThat(diamond.findNumberOfAsterisk(2), is (5));
    }

    @Test
    public void shouldReturnNumberOfSpaces(){
        assertThat(diamond.numberOfSpaces(1,10), is(8));
    }

    @Test
    public void shouldPrinter3AsterisksInConsole(){

        System.setOut(new PrintStream(outputStream));
        String expected = "***";

        diamond.printAsterisks(3);
        assertEquals(outputStream.toString(), expected);
    }

    @Test
    public void shoudPrint5SpacesInConsole(){
        System.setOut(new PrintStream(outputStream));
        String expected = "     ";

        diamond.printSpaces(5);
        assertEquals(outputStream.toString(), expected);

    }


}