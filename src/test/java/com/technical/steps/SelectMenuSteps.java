package com.technical.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.technical.utils.WebDriverUtils.getDriver;


public class SelectMenuSteps {
    private static WebDriver driver;
    @Given("User go to {string}")
    public void userGoTo(String website){
        driver = getDriver();
        driver.get(website);
    }

    @When("User in {string} page")
    public void userInPage(String page) {
        WebElement selectMenu = driver.findElement(By.xpath("//*[text()='Select Menu']"));
        selectMenu.isDisplayed();
        Assert.assertEquals(selectMenu.getText(),page);
    }

    @And("User choose select value {string}")
    public void userChooseSelectValue(String menu1) {
        System.out.println(menu1);
    }

    @And("User choose select one {string}")
    public void userChooseSelectOne(String menu2) {
        System.out.println(menu2);
    }

    @And("User choose old style select menu {string}")
    public void userChooseOldStyleSelectMenu(String menu3) {
        System.out.println(menu3);
    }

    @And("User choose multi select drop down “all color”")
    public void userChooseMultiSelectDropDownAllColor() {
        System.out.println("all color");
    }

    @Then("User success input all select menu")
    public void userSuccessInputAllSelectMenu() {
        System.out.println("all menu");
    }
}
