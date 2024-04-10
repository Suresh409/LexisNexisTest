package com.lexisnexis.steps;

import com.lexisnexis.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class HomePageSteps {

  private HomePage homePage;

@Step
  public void launchApplication(){
    homePage.launchApplication();
    homePage.acceptCookies();
  }


  @Step
  public void navigateToCareers(){
    homePage.clickOnAboutUs();
    homePage.clickOnCareers();
    homePage.switchToNewTab();

  }




}
