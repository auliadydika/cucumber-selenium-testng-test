#Author        : Dika Auliady
#Created Date  : 26 November 2022
#Updated by    : -
#Updated Date  : -
#Summary       : User can find valid book

@DemoTest
Feature: Search book
  Scenario: Show book when user search valid book
    Given User go to "https://demoqa.com/books"
    When User in "Book Store" page
    And User search book "Git Pocket Guide"
    And User click book "Git Pocket Guide"
    Then User see "Git Pocket Guide"


