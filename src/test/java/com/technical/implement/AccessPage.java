package com.technical.implement;
import com.technical.utils.WebDriverUtils.*;
import org.openqa.selenium.By;

import static com.technical.utils.WebDriverUtils.*;

public class AccessPage {
    public static void accessPage(String website){
        driver = getDriver();
        driver.get(website);
    }
}
