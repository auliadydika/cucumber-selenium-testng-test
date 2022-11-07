package com.technical.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectMenuSteps {
    @Given("User go to {string}")
    public void userGoTo(String website) {
        System.out.println(website);
    }

    @When("User in {string} page")
    public void userInPage(String page) {
        System.out.println(page);
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
