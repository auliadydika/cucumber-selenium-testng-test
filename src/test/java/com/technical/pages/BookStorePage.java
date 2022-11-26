package com.technical.pages;

import org.openqa.selenium.By;

import static com.technical.utils.WebDriverUtils.driver;

public class BookStorePage {
    public static void searchBook(String book){
        driver.findElement(By.id("searchBox")).sendKeys(book);
    }
}
