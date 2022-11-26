package com.technical.steps;

import com.technical.pages.Actual;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.technical.utils.WebDriverUtils.*;
public class SearchBookSteps {
    @And("User click book {string}")
    public void userClickBook(String link) {
        Actual.setActTitleBook(driver.findElement(By.xpath("//*[@class='action-buttons']//child::a")).getText());
        Actual.setActPublisherBook(driver.findElement(By.xpath("//*[@class='rt-tr -odd']//child::div[4]")).getText());
        Actual.setActAuthorBook(driver.findElement(By.xpath("//*[@class='rt-tr -odd']//child::div[3]")).getText());

        driver.findElement(By.linkText(link)).click();
    }
    @Then("User see {string}")
    public void userSee(String result) {
        if(result.equals("No rows found")) {
            driver.findElement(By.xpath("//*[text()='No rows found']")).isDisplayed();
        }else{
            if(Actual.getActTitleBook().equals(result)){
                Assert.assertEquals(Actual.getActTitleBook(),driver.findElement(By.xpath("//*[@id='userName-value'][text()='Git Pocket Guide']")).getText());
                Assert.assertEquals(Actual.getActPublisherBook(),"O'Reilly Media");
                Assert.assertEquals(Actual.getActAuthorBook(),driver.findElement(By.xpath("//*[@id='userName-value'][text()='Richard E. Silverman']")).getText());

            }else{
                System.out.println("Buku yang lain");
            }
        }
        driver.close();
        driver.quit();
    }
}