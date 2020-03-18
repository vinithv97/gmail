
Feature: Gmail sent mail validation

  Scenario: Gmail sent mail validation
  	Given I enter dummy Username   
    And I click next button
    And I enter pw  
    And user click nextSec
    And I click compose button and maximize the tab
    When I enter valid receiver address and subject 
    But I click on send button
    And I click on sent tab
    And click on the sent mail
    Then I verify the sent mail status
    