package com.technical.pages;

public class Actual {
    private static String actValue;
    private static String actTitle;
    private static String actTitleBook;
    private static String actPublisherBook;
    private static String actAuthorBook;

    //Setter
    public static void setActValue(String actValue) {
        Actual.actValue = actValue;
    }
    public static void setActTitle(String actTitle) {
        Actual.actTitle = actTitle;
    }

    public static void setActTitleBook(String actTitleBook) {
        Actual.actTitleBook = actTitleBook;
    }

    public static void setActPublisherBook(String actPublisherBook) {
        Actual.actPublisherBook = actPublisherBook;
    }

    public static void setActAuthorBook(String actAuthorBook) {
        Actual.actAuthorBook = actAuthorBook;
    }

    //Getter
    public static String getActValue() {
        return actValue;
    }
    public static String getActTitle() {
        return actTitle;
    }

    public static String getActTitleBook() {
        return actTitleBook;
    }

    public static String getActPublisherBook() {
        return actPublisherBook;
    }

    public static String getActAuthorBook() {
        return actAuthorBook;
    }
}
