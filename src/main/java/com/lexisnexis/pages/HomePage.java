package com.lexisnexis.pages;

import java.util.ArrayList;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage  extends PageObject {


  @FindBy(id = "onetrust-accept-btn-handler")
  WebElement acceptAllCookies;

  @FindBy(partialLinkText = "About Us")
  WebElement aboutUs;

  @FindBy(xpath = "//h4[contains(text(),'Careers')]/following-sibling::div[2]/a[2]")
  WebElement careers;


  public void launchApplication(){
      open();
      getDriver().manage().window().maximize();

  }
  public void acceptCookies(){
      acceptAllCookies.click();
  }

  public void clickOnAboutUs(){
    aboutUs.click();
  }

  public void clickOnCareers(){
    waitFor(ExpectedConditions.elementToBeClickable(careers));
    careers.click();
  }


  public void switchToNewTab() {
    ArrayList<String> tab = new ArrayList<>(getDriver().getWindowHandles());
    getDriver().switchTo().window(tab.get(1));
  }

  public void closeTabAndReturnToMainPage() {
    getDriver().close();
    ArrayList<String> tab = new ArrayList<>(getDriver().getWindowHandles());
    getDriver().switchTo().window(tab.get(0));
  }





}
