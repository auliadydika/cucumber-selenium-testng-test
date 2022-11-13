package com.technical.implement;

import org.openqa.selenium.JavascriptExecutor;
import static com.technical.utils.WebDriverUtils.*;

public class ScrollPage {
    public static void scrollPage(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,250)","");

    }
}
