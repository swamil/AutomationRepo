package com.hp.opr.qa.pageclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChromeMainPage {


    @FindBy (how=How.CSS, using="input[name='q']")
    WebElement searchtextbox;

    public void testPage(){
        searchtextbox.click();
        searchtextbox.sendKeys("selenium");
        searchtextbox.sendKeys(Keys.ENTER);
    }

}
