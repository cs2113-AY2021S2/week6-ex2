import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.*;

public class TestMain {

    @Test
    public void testOutput() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        Main.main(null);

        String output = "Monday => 2\nFriday => 1\nWednesday => 2";
        // assertion
        assertTrue(bos.toString().equals(output) || bos.toString().equals(output + "\n"));

        // undo the binding in System
        System.setOut(originalOut);
    }
}
