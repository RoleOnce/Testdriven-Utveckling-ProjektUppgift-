package se.reky.hakan.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ActorTest {

    Actor actor;

    @Test
    @DisplayName("Test attack method in Actor-class")
    public void testAttackMetod () {
        Goblin goblin = new Goblin();
        Guard guard = new Guard();

        goblin.attack(guard);

        Assertions.assertEquals(17, guard.getHp());
    }
}
