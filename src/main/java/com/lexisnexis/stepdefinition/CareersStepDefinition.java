package com.lexisnexis.stepdefinition;

import com.lexisnexis.steps.HomePageSteps;
import com.lexisnexis.steps.SearchJobSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class CareersStepDefinition {


  @Steps
  HomePageSteps homePageSteps;

  @Steps
  SearchJobSteps searchJobSteps;

  @Given("I am on LexisNexis Home page")
  public void iAmOnLexisNexisHomePage() {
    homePageSteps.launchApplication();
  }

  @Then("I Navigate to Careers")
  public void iNavigateToCareers() {
    homePageSteps.navigateToCareers();
  }

  @Then("I Click on SearchAll Jobs")
  public void iClickOnSearchAllJobs() {
    searchJobSteps.goToSearchAllJobs();
  }

  @When("I Search Job as {string}")
  public void iSearchJobAs(String searchText) {
    searchJobSteps.searchJobs(searchText);
  }

  @Then("I Can see the results")
  public void iCanSeeTheResults() {
    searchJobSteps.verifySearchResults();
  }
}

