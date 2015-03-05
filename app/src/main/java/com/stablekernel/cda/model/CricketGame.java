package com.stablekernel.cda.model;

public class CricketGame {
    private CricketPlayer player1;
    private CricketPlayer player2;

    public CricketGame() {
        this.player1 = new CricketPlayer(this);
        this.player2 = new CricketPlayer(this);
    }

    public CricketPlayer getPlayer1() {
        return player1;
    }

    public CricketPlayer getPlayer2() {
        return player2;
    }

    public void distribute(NumberSlot slot) {
        player1.addPenalty(slot);
        player2.addPenalty(slot);
    }
}
