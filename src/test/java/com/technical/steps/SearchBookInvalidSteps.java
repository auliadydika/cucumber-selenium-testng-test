package com.technical.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static com.technical.utils.WebDriverUtils.*;
import static com.technical.pages.BookStorePage.*;

public class SearchBookInvalidSteps {
    @And("User search book {string}")
    public void userSearchBook(String book) {
        searchBook(book);
    }
}
