package org.example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LogTest {
    private static ChromeDriver driver;
    private static Logpage logpage;
    private static Letterpage letterpage;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.ru");
        logpage = new Logpage(driver);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @Test
    public void LoggggTest() {
        logpage.clickLoginBtn();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        logpage.inputLogin("mailadress");
        logpage.clickPasswdBtn();
        logpage.inputPasswd("**********");
        logpage.clickEnterBtn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        letterpage.clickLetterBtn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        letterpage.inputAdressField("mailadress");
        letterpage.clickSendBtn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        letterpage.clickAccountBtn();
        letterpage.clickExitBtn();
    }

    @AfterClass
    public static void afterC() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();

    }


}
