package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.reky.hakan.model.Player;

import java.util.Scanner;

public class PlayerInteractionTest {

    private PlayerInteraction playerInteraction(String dataForScanner) {

        PlayerInteraction playerInteraction = new SimplePlayerInteraction(
                new IOHandler(new Scanner(dataForScanner)));

        return playerInteraction;
    }

    private Player player;

    @BeforeEach
    public void init() {
        player = new Player();
    }

    @Test
    @DisplayName("Player name")
    public void testPlayerName() {
        playerInteraction("Malcolm").setupPlayer(player);

        Assertions.assertEquals("Malcolm", player.getName());
    }

    @Test
    @DisplayName("Player health")
    public void testPlayerHealth() {
        playerInteraction("Malcolm").updatePlayerHealth(player, 2);

        Assertions.assertEquals(2, player.getHp());
    }
}
