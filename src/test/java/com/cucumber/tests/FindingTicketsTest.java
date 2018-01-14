package com.cucumber.tests;

import com.cucumber.objects.SearchResultsPage;
import com.cucumber.objects.SearchTicketsForm;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FindingTicketsTest {

    @Given("Main page is opened and tickets search form is displayed")
    public void testCanOpenMainPage(){
        new SearchTicketsForm().userCanSeeSearchForm();
    }

    @When("Departure and destination stations are selected")
    public void testCanSelectStationsFromDropdown() {
        new SearchTicketsForm().userCanSelectStartStationFromDropdown();
        new SearchTicketsForm().userCanSelectFinishStationFromDropdown();
    }

    @And("Date and time are set")
    public void testCanSetTripDateAndTime() {
        new SearchTicketsForm().userCanSetTripDateAndTime();
    }

    @And("Passengers types are selected")
    public void testCanSelectPassengers(){
        new SearchTicketsForm().userCanSelectPassengers();
    }

    @And("Find trains button is clicked")
    public void testCanClickFindTrainsButton() {
        new SearchTicketsForm().userCanClickFindButton();
    }

    @Then("Available tickets are displayed")
    public void testCanOpenSearchResults() {
        new SearchResultsPage().userCanSeeSearchResults();
    }

}
