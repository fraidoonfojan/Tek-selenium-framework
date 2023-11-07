Feature: Login Validation

  Scenario: Testing
    Given open browser "chrome"
    When sending username "supervisor" and password "tek_supervisor"
    And click on login button
    Then login success
    And close browser