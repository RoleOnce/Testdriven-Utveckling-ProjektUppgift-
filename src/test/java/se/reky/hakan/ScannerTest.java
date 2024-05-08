package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class ScannerTest {

    @Test
    @DisplayName("Test nextLine()")
    public void testScannerNextLine() {
        // Skapa en Scanner instans med en sträng istället för System.in
        String nextLineString = "Test nextLine-method!";
        Scanner scanner = new Scanner(nextLineString);

        // Testa att readLine() metoden ger tillbaka förväntad data
        Assertions.assertEquals(nextLineString, scanner.nextLine());
    }
}
