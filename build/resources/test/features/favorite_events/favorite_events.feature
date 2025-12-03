Feature: Favorite Events Visualization
  As an authenticated user
  I want to view the list of my favorite events in my profile
  So that I can see the events I have marked as favorites

  Scenario: Displaying the list of favorite events
    Given the user is authenticated and has marked one or more events as favorites
    When the user accesses their profile and selects the "Favorite Events" section
    Then the system should display the list of events the user has marked as favorites
    And allow the user to access detailed information for each event
