Feature: To search cucumber in google

    @Regression
    Scenario: Cucumber Google
      Given I am on google page one
      When I type "cucumber"
      Then I click search button
      Then I clear search textbox
