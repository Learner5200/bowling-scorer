package com.cooksley.bowling;

import java.util.ArrayList;

public class Frame {
    private ArrayList<Integer> rolls;

    public Frame() {
        this.rolls = new ArrayList<>();
    }

    public void handleRoll(int value) {
    }

    public ArrayList<Integer> getRolls() {
        this.rolls.add(5);
        return new ArrayList(this.rolls);
    }
}
