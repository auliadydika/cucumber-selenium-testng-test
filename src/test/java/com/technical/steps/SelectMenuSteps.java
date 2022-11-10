package com.technical.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static com.technical.utils.WebDriverUtils.*;

public class SelectMenuSteps {
    @Given("User go to {string}")
    public void userGoTo(String website){
        driver = getDriver();
        driver.get(website);
    }

    @When("User in {string} page")
    public void userInPage(String page) {
        driver.findElement(By.xpath("//*[text()='Select Menu']")).isDisplayed();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,250)","");
    }

    @And("User choose select value {string}")
    public void userChooseSelectValue(String menu1) {
        driver.findElement(By.id("withOptGroup")).click();
        driver.findElement(By.id("react-select-2-option-3")).click();
    }

    @And("User choose select one {string}")
    public void userChooseSelectOne(String menu2) {
        driver.findElement(By.id("selectOne")).click();
        driver.findElement(By.id("react-select-3-option-0-5")).click();
    }

    @And("User choose old style select menu {string}")
    public void userChooseOldStyleSelectMenu(String menu3) {
        Select oldStyle = new Select(driver.findElement(By.id("oldSelectMenu")));
        oldStyle.selectByValue("10");
    }

    @And("User choose multi select drop down “all color”")
    public void userChooseMultiSelectDropDownAllColor() {
        driver.findElement(By.xpath("//*[text()='Select...']")).click();
        driver.findElement(By.id("react-select-4-option-0")).click();
        driver.findElement(By.id("react-select-4-option-1")).click();
        driver.findElement(By.id("react-select-4-option-2")).click();
        driver.findElement(By.id("react-select-4-option-3")).click();
    }

    @Then("User success input all select menu")
    public void userSuccessInputAllSelectMenu() {
        String getActualMenu1 = driver.findElement(By.xpath("//*[@id='withOptGroup']//child::div/div/div")).getText();
        Assert.assertEquals(getActualMenu1,"Another root option");
        driver.close();
        driver.quit();
    }
}
