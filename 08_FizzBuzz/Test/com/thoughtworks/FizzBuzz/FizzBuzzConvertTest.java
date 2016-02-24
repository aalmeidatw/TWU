package com.thoughtworks.FizzBuzz;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FizzBuzzConvertTest {

    private FizzBuzzConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new FizzBuzzConverter();
    }

    @Test
    public void shouldReturn2WhenSendNumber2() {
        assertThat(converter.numberConvert(2), is("2"));
    }

    @Test
    public void shouldReturnFizzWhenDivisibleBy3(){
        assertThat(converter.numberConvert(9), is("Fizz"));
    }

    @Test
    public void shouldReturnBuzzWhenDivisibleBy5() throws Exception {
        assertThat(converter.numberConvert(10), is("Buzz"));

    }

    @Test
    public void shoudReturnFizzBuzzWhenDivisibleBy3And5() throws Exception {
        assertThat(converter.numberConvert(15), is("FizzBuzz"));

    }

    @Test
    public void shouldTrueWhenNumberIsDivisible(){
        assertThat(converter.isDivisible(9,3), is (true));
    }

    @Test
    public void shoudFalseWhenNumberIsNotDivisible(){
        assertThat(converter.isDivisible(3,2), is(false));
    }

}
