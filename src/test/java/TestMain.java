import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.*;

class TestHello {

    @Test
    public void testHelloWorld()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // Path to main class/method
        Main.main(null);

        // This is what it checks for. I edited some of the strings that were incorrect (assuming people use println)
        String checkFor = "is\r\nOedipusComplex\r\nno\r\n";
        assertEquals(checkFor, bos.toString());


        System.setOut(originalOut);
    }
}