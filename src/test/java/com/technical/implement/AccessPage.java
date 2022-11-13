package com.technical.implement;


import static com.technical.utils.WebDriverUtils.*;

public class AccessPage {
    public static void accessPage(String website){
        driver = getDriver();
        driver.get(website);
    }
}
