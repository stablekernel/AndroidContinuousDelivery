package com.stablekernel.cda.model;

public class Throw {
    private final NumberSlot slot;

    public NumberMultiplier getMultiplier() {
        return multiplier;
    }

    private final NumberMultiplier multiplier;

    public Throw(NumberMultiplier multiplier, NumberSlot numberSlot) {
        this.slot = numberSlot;
        this.multiplier = multiplier;
    }

    public NumberSlot getNumberSlot() {
        return slot;
    }
}
