package com.technical.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static com.technical.utils.WebDriverUtils.*;

public class SearchBookInvalidSteps {
    @And("User search book {string}")
    public void userSearchBook(String arg0) {
        driver.findElement(By.id("searchBox")).sendKeys("Hai");
    }

    @Then("User see {string}")
    public void userSee(String arg0) {
        driver.findElement(By.xpath("//*[text()='No rows found']")).isDisplayed();
        driver.close();
        driver.quit();
    }
}
