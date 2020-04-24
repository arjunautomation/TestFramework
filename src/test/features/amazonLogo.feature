@regression
Feature: Amazon logo validation

  @amazonLogo
  Scenario: Amazon logo validation
    Given User is on Amazon Homepage
    Then User verifies logo
