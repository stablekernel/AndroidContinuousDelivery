package com.stablekernel.cda.model;

import org.junit.Before;
import org.junit.Test;

import static com.stablekernel.cda.model.NumberMultiplier.*;
import static com.stablekernel.cda.model.NumberSlot.*;
import static junit.framework.Assert.*;

public class CricketGameTest {

    private CricketGame cricketGame;

    @Before
    public void setUp() {
        cricketGame = new CricketGame();
    }

    @Test
    public void newGameHasScoresOfZero() {
        CricketPlayer player1 = cricketGame.getPlayer1();
        assertEquals(0, player1.getScore());
        assertEquals(0, player1.getHitCount(TWENTY));
        assertEquals(0, player1.getHitCount(NINETEEN));
        assertEquals(0, player1.getHitCount(EIGHTEEN));
        assertEquals(0, player1.getHitCount(SEVENTEEN));
        assertEquals(0, player1.getHitCount(SIXTEEN));
        assertEquals(0, player1.getHitCount(FIFTEEN));
        assertEquals(0, player1.getHitCount(BULLSEYE));

        CricketPlayer player2 = cricketGame.getPlayer2();
        assertEquals(0, player2.getScore());
        assertEquals(0, player2.getHitCount(TWENTY));
        assertEquals(0, player2.getHitCount(NINETEEN));
        assertEquals(0, player2.getHitCount(EIGHTEEN));
        assertEquals(0, player2.getHitCount(SEVENTEEN));
        assertEquals(0, player2.getHitCount(SIXTEEN));
        assertEquals(0, player2.getHitCount(FIFTEEN));
        assertEquals(0, player2.getHitCount(BULLSEYE));
    }

    @Test
    public void player1StartsWithTwoTripleTwenties() {
        CricketPlayer player1 = cricketGame.getPlayer1();
        player1.add(new Throw(TRIPLE, TWENTY));
        player1.add(new Throw(TRIPLE, TWENTY));

        assertEquals(3, player1.getHitCount(TWENTY));
        assertEquals(0, player1.getScore());
        assertEquals(60, cricketGame.getPlayer2().getScore());
    }
}