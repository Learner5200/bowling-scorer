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
        frame.handleRoll(5);
        int firstRollValue = frame.getRolls().get(0);
        Assertions.assertEquals(5, firstRollValue);
    }

}
