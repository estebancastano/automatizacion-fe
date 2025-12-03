Feature: User Profile Creation
  As a user, I want to register my profile information to personalize my experience.


  Scenario: Successful profile registration
    Given the user is logged into the platform
    When the user enters their profile information with name, age, location, interests, photo and optional bio
    And confirms the registration
    Then the system saves the information and displays a profile created confirmation message