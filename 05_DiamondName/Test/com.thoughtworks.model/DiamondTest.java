package com.thoughtworks.model;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class DiamondTest {
    private Diamond diamond;

    @Before
    public void setUp() throws Exception {
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


}