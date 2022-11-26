#Author        : Dika Auliady
#Created Date  : 21 November 2022
#Updated by    : Dika
#Updated Date  : 26 November 2022
#Summary       : User can't found invalid book

@DemoTest
Feature: Search book
  Scenario: Show message when search invalid book
    Given User go to "https://demoqa.com/books"
    When User in "Book Store" page
    And User search book "qa engineer"
    Then User see "No rows found"

