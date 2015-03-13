package com.stablekernel.cda.model;

public enum NumberSlot {
    TWENTY(20),
    NINETEEN(19),
    EIGHTEEN(18),
    SEVENTEEN(17),
    SIXTEEN(16),
    FIFTEEN(15),
    BULLSEYE(25);

    private int value;

    NumberSlot(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
