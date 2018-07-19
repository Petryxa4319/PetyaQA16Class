package com.telran.qa16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class GroupCreationTest {
    WebDriver wd;
    @BeforeMethod
    public void setUp(){
        wd=new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get("");
        login("admin","secret");

    }
}
