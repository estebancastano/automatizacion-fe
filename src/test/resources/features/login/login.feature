Feature: User Login
  As a registered user
  I want to log into the platform
  So that I can access my personalized content


  Scenario: Successful login
    Given the user is on the website
    When the user logs in with email and password
    Then the user should be redirected to the dashboard