package com.hp.opr.qa.testclass;

import com.hp.opr.qa.pageclass.ChromeMainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLogin {
    WebDriver driver=null;
    ChromeMainPage mainpage;
    public void initpages(){
        mainpage= PageFactory.initElements(driver,ChromeMainPage.class);
    }

    @Test
    public void testMethod(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.close();

    }
}
