Feature: Tickets search
  Scenario: User can search tickets for a trip

    Given Main page is opened and tickets search form is displayed
    When Departure and destination stations are selected
    And Date and time are set
    And Passengers types are selected
    And Find trains button is clicked
    Then Available tickets are displayed