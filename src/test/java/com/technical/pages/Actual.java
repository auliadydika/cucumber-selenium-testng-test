package com.technical.pages;

public class Actual {
    private static String stored;

    public static void setStored(String stored) {
        Actual.stored = stored;
    }

    public static String getStored() {
        return stored;
    }
}
