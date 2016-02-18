package com.thoughtworks.exeTriangle;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrintAsteriskTest {
    PrintAsterisk printAsterisk;

    @Before
    public void setUp() throws Exception {
        this.printAsterisk = new PrintAsterisk();
    }

    @Test
    public void shouldReturnTrueWhenSendAsterisk() {
        assertThat(printAsterisk.printerAsteriskOnConsole("*"), is (true));
    }

    @Test
    public void shouldReturnFalseWhenNotSendAsterisk(){
        assertThat(printAsterisk.printerAsteriskOnConsole("$"), is (false));

    }

}