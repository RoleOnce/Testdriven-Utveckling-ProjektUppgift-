package se.reky.hakan.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

@Disabled
public class PlayerControllerTest {

    ChromeDriver driver;

    @BeforeAll
    public static void init() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    @DisplayName("Number of players")
    public void verifyNumberOfPlayersInList() {
        driver.get("http://localhost:8080/players");
        List<WebElement> players = driver.findElements(By.tagName("li"));

        int numberOfPlayers = players.size();
        int expectedNumberOfPlayers = 2;

        Assertions.assertEquals(expectedNumberOfPlayers, numberOfPlayers);
    }

    @Test
    @DisplayName("Verify if name is displayed")
    public void verifyFirstNameOfPlayersInList() {
        driver.get("http://localhost:8080/players");

        WebElement element = driver.findElement(By.cssSelector("body ul li span"));

        Assertions.assertTrue(element.isDisplayed());
    }

    @Test
    @DisplayName("Verify title")
    public void verifyTitle() {
        driver.get("http://localhost:8080/players");
        Assertions.assertEquals("Players List", driver.getTitle());
    }

    @Test
    @DisplayName("Verify button text")
    public void buttonText() {
        driver.get("http://localhost:8080/players");

        WebElement element = driver.findElement(By.tagName("button"));

        Assertions.assertEquals("Logga in", element.getText());
    }
}
