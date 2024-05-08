package se.reky.hakan.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.reky.hakan.GameException;

public class GameUtilTest {

    @Test
    @DisplayName("Should throw exception if null in method")
    public void testGameUtilMethod() throws GameException {
        GameUtil gameUtil = new GameUtil();

        Assertions.assertThrows(GameException.class, () -> {gameUtil.toLowerCaseButFirstLetterCapitalized(null);});
    }
}
