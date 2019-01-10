package com.cooksley.bowling;

import com.cooksley.bowling.Game;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {
    Game game;

    @BeforeEach
    public void setup() {
        game = new Game();
    }

    @Test
    public void testGutterGame() {
        for (int i = 0; i < 20; i++) game.roll(0);
        Assertions.assertEquals(0, game.calculateScore());
    }
}
