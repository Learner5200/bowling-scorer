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
    public void newGameHasZeroScore() {
        Assertions.assertEquals(0, game.calculateScore());
    }

    @Test
    public void rollFiveHasFiveScore() {
        game.roll(5);
        Assertions.assertEquals(5, game.calculateScore());
    }

    @Test
    public void gutterGameHasZeroScore() {
        for (int i = 0; i < 20; i++) game.roll(0);
        Assertions.assertEquals(0, game.calculateScore());
    }

//    @Test
//    public void perfectGameHas300Score() {
//        for (int i = 0; i < 12; i++) game.roll(10);
//        Assertions.assertEquals(300, game.calculateScore());
//    }
}
