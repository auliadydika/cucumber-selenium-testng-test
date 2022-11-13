package com.technical.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.technical.utils.WebDriverUtils.driver;

public class SelectMenuPage {
    public static void selectValue(String value){
        driver.findElement(By.id("withOptGroup")).click();
        if (value.equals("Another root option")){
            driver.findElement(By.id("react-select-2-option-3")).click();
        }else
            System.out.println("salah");
    }
    public static void selectTitle(String title){
        driver.findElement(By.id("selectOne")).click();
        if (title.equals("Other")){
            driver.findElement(By.id("react-select-3-option-0-5")).click();
        }else
            System.out.println("salah");
    }
    public static void selectOldStyle(String color){
        Select oldStyle = new Select(driver.findElement(By.id("oldSelectMenu")));
        if (color.equals("Aqua")){
            oldStyle.selectByValue("10");
        }else
            System.out.println("salah");
    }
    public static void multiSelect(){
        driver.findElement(By.xpath("//*[text()='Select...']")).click();
        driver.findElement(By.id("react-select-4-option-0")).click();
        driver.findElement(By.id("react-select-4-option-1")).click();
        driver.findElement(By.id("react-select-4-option-2")).click();
        driver.findElement(By.id("react-select-4-option-3")).click();
    }

}

