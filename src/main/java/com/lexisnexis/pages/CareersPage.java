package com.lexisnexis.pages;

import java.util.ArrayList;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CareersPage  extends PageObject{


  @FindBy(xpath = "//a[@class='score-button hidden-xs hidden-sm']")
  WebElement searchAllJobs;

  @FindBy(className = "search-box-input")
  WebElement searchBox;

  @FindBy(id = "search-box-button")
  WebElement searchBtn;

  @FindBy(xpath = "//div[contains(@id,'search-results-statistics')]")
  WebElement searchResults;



  public void clickOnSearchALlJobs(){
    waitFor(ExpectedConditions.elementToBeClickable(searchAllJobs));
    searchAllJobs.click();
  }

  public void searchJob(String text){
    searchBox.clear();
    searchBox.sendKeys(text);
  }

  public void clickOnSearchButton(){

    searchBtn.click();
  }

  public boolean checkResultsText(){

    String result= StringUtils.getDigits(searchResults.getText());

    return  result!=null && !result.isEmpty();
  }




}
