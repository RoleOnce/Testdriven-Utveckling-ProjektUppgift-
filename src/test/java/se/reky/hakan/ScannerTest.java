package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class ScannerTest {

    @Test
    public void testScannerReadLine() {
        // Skapa en Scanner instans med en sträng istället för System.in
        String readLineString = "Test readLine-method!";
        Scanner scanner = new Scanner(readLineString);

        // Testa att readLine() metoden ger tillbaka förväntad data
        Assertions.assertEquals(readLineString, scanner.nextLine());
    }
}
