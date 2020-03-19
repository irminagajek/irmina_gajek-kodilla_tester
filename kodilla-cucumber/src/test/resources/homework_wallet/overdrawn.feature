Feature: Prevent users from going overdrawn
  Scenario: User tries to withdraw more than their balance
    Given my wallet has been credited with $100
    When I withdraw $200
    Then $0 should be dispensed
    And I should be told that I have insufficient funds in my account


