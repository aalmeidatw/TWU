package com.thoughtworks.controll;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DrawAsterisksTest {
  private DrawAsterisks drawAsterisks;

  @Before
  public void setUp() throws Exception {
    this.drawAsterisks = new DrawAsterisks();

  }

  @Test
  public void shouldReturnStringWhenSendNumberOfAsterisks(){
    assertThat(drawAsterisks.drawAsterisks(3), is("***"));
  }



}