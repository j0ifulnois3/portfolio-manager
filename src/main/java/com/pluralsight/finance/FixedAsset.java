package com.pluralsight.finance;

public abstract class FixedAsset implements Valuable {
    private String name;
    private double marketValue;

    // Constructor to set up the baseline data for any physical asset
    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    // Fulfilling the Valuable interface contract
    @Override
    public double getValue() {
        return this.marketValue;
    }
}