package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class IOHandlerTest {
    private IOHandler testIOHandler(String dataForScanner) {
        return null;
    }

    @Test
    @DisplayName("nextInt() = true")
    public void testIOHandler() {
        // Instans av klassen "Scanner". (Skapat ett objekt av Scanner klassen).
        String number = "5";
        Scanner scanner = new Scanner(number);

        // Detta är en instans av IOHandler som tar in instansen "scanner" som jag tidigare skapat
        IOHandler ioHandler = new IOHandler(scanner);

        boolean hasNextInt = ioHandler.hasNextInt();

        Assertions.assertTrue(hasNextInt);
    }
}
