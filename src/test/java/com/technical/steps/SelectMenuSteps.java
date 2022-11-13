package com.technical.steps;

import com.technical.pages.Actual;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static com.technical.implement.AccessPage.accessPage;
import static com.technical.pages.SelectMenuPage.*;
import static com.technical.pages.VerifyPage.checkPage;
import static com.technical.utils.WebDriverUtils.*;
import static com.technical.implement.ScrollPage.scrollPage;

public class SelectMenuSteps {
    Actual asd = new Actual();

    @Given("User go to {string}")
    public void userGoTo(String website){
        accessPage(website);
    }

    @When("User in {string} page")
    public void userInPage(String pageName) {
        checkPage(pageName);
        scrollPage();
    }

    @And("User choose select value {string}")
    public void userChooseSelectValue(String value) {
        selectValue(value);
        Actual.setStored(driver.findElement(By.xpath("//*[@id='withOptGroup']//child::div/div/div")).getText());
    }

    @And("User choose select one {string}")
    public void userChooseSelectOne(String title) {
        selectTitle(title);
    }

    @And("User choose old style select menu {string}")
    public void userChooseOldStyleSelectMenu(String color) {
        selectOldStyle(color);
    }

    @And("User choose multi select drop down “all color”")
    public void userChooseMultiSelectDropDownAllColor() {
        multiSelect();
    }

    @Then("User success input all select menu")
    public void userSuccessInputAllSelectMenu() {
        Assert.assertEquals(Actual.getStored(),"Another root option");

        String getActualMenu2 = driver.findElement(By.xpath("//*[@id='selectOne']//child::div/div/div")).getText();
        Assert.assertEquals(getActualMenu2,"Other");

        driver.findElement(By.xpath("//*[text()='Aqua']")).isDisplayed();

        driver.findElement(By.xpath("//*[text()='Green']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Blue']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Black']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Red']")).isDisplayed();

        driver.close();
        driver.quit();
    }
}
