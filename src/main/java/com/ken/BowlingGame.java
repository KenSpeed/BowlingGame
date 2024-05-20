package com.ken;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
    private List<Integer> rolls;

    public BowlingGame() {
        rolls = new ArrayList<>();
    }

    public void roll(int pins) {
        rolls.add(pins);
    }

    public int calculateScore() {
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(frameIndex)) {
                score += 10 + strikeBonus(frameIndex);
                frameIndex++;
            } else if (isSpare(frameIndex)) {
                score += 10 + spareBonus(frameIndex);
                frameIndex += 2;
            } else {
                score += sumOfBallsInFrame(frameIndex);
                frameIndex += 2;
            }
        }
        return score;
    }

    private boolean isStrike(int frameIndex) {
        return rolls.get(frameIndex) == 10;
    }

    private boolean isSpare(int frameIndex) {
        return rolls.get(frameIndex) + rolls.get(frameIndex + 1) == 10;
    }

    private int strikeBonus(int frameIndex) {
        return rolls.get(frameIndex + 1) + rolls.get(frameIndex + 2);
    }

    private int spareBonus(int frameIndex) {
        return rolls.get(frameIndex + 2);
    }

    private int sumOfBallsInFrame(int frameIndex) {
        return rolls.get(frameIndex) + rolls.get(frameIndex + 1);
    }
}
