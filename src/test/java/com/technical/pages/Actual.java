package com.technical.pages;

public class Actual {
    private static String actValue;
    private static String actTitle;

    public static void setActValue(String actValue) {
        Actual.actValue = actValue;
    }
    public static void setActTitle(String actTitle) {
        Actual.actTitle = actTitle;
    }


    public static String getActValue() {
        return actValue;
    }
    public static String getActTitle() {
        return actTitle;
    }
}
