package com.ken;

import com.ken.game.BowlingGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    @Test
    void testAllMissed() {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 10; i++) {
            game.roll(0);
            game.roll(0);
        }
        int expectedScore = 0;
        int actualScore = game.calculateScore();
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void testAllStrikes() {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 12; i++) {
            game.roll(10);
        }
        int expectedScore = 300;
        int actualScore = game.calculateScore();
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void testAllSpares() {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 12; i++) {
            game.roll(5);
            game.roll(5);
        }
        int expectedScore = 150;
        int actualScore = game.calculateScore();
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void testPerfectGameStrikes() {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 12; i++) {
            game.roll(10);
        }
        game.roll(10);
        game.roll(10);
        int expectedScore = 300;
        int actualScore = game.calculateScore();
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void testPerfectGameSpares() {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 12; i++) {
            game.roll(5);
            game.roll(5);
        }
        game.roll(5);
        game.roll(5);
        int expectedScore = 150;
        int actualScore = game.calculateScore();
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void testAlternatingStrikesAndSpares() {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 12; i++) {
            if (i % 2 == 0) {
                game.roll(10);
            } else {
                game.roll(5);
                game.roll(5);
            }
        }
        int expectedScore = 200;
        int actualScore = game.calculateScore();
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void testPerfectGameAlternatingStrikesAndSpares() {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 12; i++) {
            if (i % 2 == 0) {
                game.roll(10);
            } else {
                game.roll(5);
                game.roll(5);
            }
        }
        game.roll(5);
        game.roll(5);
        int expectedScore = 200;
        int actualScore = game.calculateScore();
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void testAllMatched() {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 10; i++) {
            game.roll(0);
            game.roll(0);
        }
        int expectedScore = 0;
        int actualScore = game.calculateScore();
        assertEquals(expectedScore, actualScore);
    }

}