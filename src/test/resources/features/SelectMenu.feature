#Author        : Dika Auliady
#Created Date  : 11 November 2022
#Updated by    : -
#Updated Date  : -
#Summary       : User can selecting menu

@DemoTest
Feature: Select Menu
  Scenario: User select menu in drop down
    Given User go to "https://demoqa.com/select-menu"
    When User in "Select Menu" page
    And User choose select value "Another root option"
    And User choose select one "Other"
    And User choose old style select menu "Aqua"
    And User choose multi select drop down “all color”
    Then User success input all select menu
