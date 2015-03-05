package com.stablekernel.cda.model;

import java.util.HashMap;
import java.util.Map;

public class CricketPlayer {

    private final CricketGame cricketGame;
    private int score;
    private Map<NumberSlot, Integer> hitMap = new HashMap<>();

    public CricketPlayer(CricketGame cricketGame) {
        this.cricketGame = cricketGame;
        hitMap.put(NumberSlot.TWENTY, 0);
        hitMap.put(NumberSlot.NINETEEN, 0);
        hitMap.put(NumberSlot.EIGHTEEN, 0);
        hitMap.put(NumberSlot.SEVENTEEN, 0);
        hitMap.put(NumberSlot.SIXTEEN, 0);
        hitMap.put(NumberSlot.FIFTEEN, 0);
        hitMap.put(NumberSlot.BULLSEYE, 0);
    }

    public int getScore() {
        return score;
    }

    public void add(Throw aThrow) {
        NumberSlot slot = aThrow.getNumberSlot();
        NumberMultiplier multiplier = aThrow.getMultiplier();

        for (int i = 0; i < multiplier.getValue(); i++) {
            Integer hits = hitMap.get(slot);
            if (hits < 3) {
                hitMap.put(slot, hits + 1);
            } else {
                cricketGame.distribute(slot);
            }
        }
    }

    public void addPenalty(NumberSlot slot) {
        if (hitMap.get(slot) < 3) {
            score += slot.getValue();
        }
    }

    public int getHitCount(NumberSlot slot) {
        return hitMap.get(slot);
    }
}
