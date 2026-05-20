package com.pluralsight.finance;

public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double marketValue, double karat) {
        // Pass the name and value up to the FixedAsset parent constructor
        super(name, marketValue);
        this.karat = karat;
    }
}