package com.technical.pages;
import org.openqa.selenium.By;

import static com.technical.utils.WebDriverUtils.*;

public class VerifyPage {
    public static void checkPage(String pageName){
        if (pageName.equals("Select Menu")){
            driver.findElement(By.xpath("//*[text()='Select Menu']")).isDisplayed();
        }else
            System.out.println("salah");
    }
}
