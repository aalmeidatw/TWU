package printer;


import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;
    private ByteArrayOutputStream outputStream;

    @Before
    public void setUp() throws Exception {
        this.printer = new Printer();
        this.outputStream = new ByteArrayOutputStream();
    }

    @Test
    public void shouldPrinterOneAsterisksInConsole(){

        System.setOut(new PrintStream(outputStream));
        String expected = "*";

        printer.printerInConsole("*");
        assertEquals(outputStream.toString(), expected);

    }

}