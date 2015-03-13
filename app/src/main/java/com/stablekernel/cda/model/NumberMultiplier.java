package com.stablekernel.cda.model;

public enum NumberMultiplier {
    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3);

    private int mulitplier;

    NumberMultiplier(int mulitplier) {
        this.mulitplier = mulitplier;
    }

    public int getValue() {
        return mulitplier;
    }
}
