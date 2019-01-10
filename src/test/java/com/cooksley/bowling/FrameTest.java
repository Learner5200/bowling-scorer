package com.cooksley.bowling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FrameTest {
    Frame frame;

    @BeforeEach
    public void setup() {
        frame = new Frame();
    }

    @Test
    public void rollAddsItsValueToRolls() {
        frame.roll(5);
        Assertions.assertEquals(5, frame.rolls[0]);
    }

}
