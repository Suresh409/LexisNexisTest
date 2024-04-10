package com.lexisnexis.steps;

import com.lexisnexis.pages.CareersPage;
import com.lexisnexis.pages.HomePage;
import net.thucydides.core.annotations.Step;
import static org.junit.Assert.*;

public class SearchJobSteps {



  private HomePage homePage;
  private CareersPage careersPage;


  public void goToSearchAllJobs(){
    careersPage.clickOnSearchALlJobs();
  }
  @Step
  public void searchJobs(String text){
    careersPage.searchJob(text);
  }

  public void verifySearchResults(){
    assertTrue(careersPage.checkResultsText());
  }


}
