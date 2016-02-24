package com.thoughtworks.FizzBuzz;


import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;
    FizzBuzzMock fizzBuzzMock;

    private class FizzBuzzMock extends FizzBuzzConverter{
        private int count = 0;


        public int getCount() {
            return count;
        }

        @Override
        public String numberConvert(int number) {
            count++;

            return "A";
        }
    }



    @Before
    public void setUp() throws Exception {
        fizzBuzzMock = new FizzBuzzMock();
        fizzBuzz = new FizzBuzz(fizzBuzzMock);
    }

    @Test
    public void shoudReturnResultsOf1At100() {
        fizzBuzz.returnNumbers();
        assertThat(fizzBuzzMock.getCount(), is(100));
    }
}
