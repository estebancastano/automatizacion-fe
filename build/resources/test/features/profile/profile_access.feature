Feature: Access Own Profile
  As an authenticated user, I want to access my profile to view my information and favorite events section.


  Scenario: Successful access to profile
    Given the user is authenticated on the platform
    When the user selects the "Profile" option in the main menu
    Then the system displays the user's personal information
    And the "Favorite Events" section associated with their profile is visible