Feature: Login Scenarios

  @Progression
  Scenario: CTHMS Login with valid credentials
    Given a CTHMS user is on the Login Page
    When user enters username "admin@chroma.com" in username text box
    And enters password "123456" in password text box
    And clicks on Sign In button
