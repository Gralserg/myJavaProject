package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logpage {
    @FindBy(xpath = ".//button[@class='ph-login svelte-1hiqrvn']")
    private WebElement loginBtn;

    @FindBy(xpath = ".//input[@class='input-0-2-71']")
    private WebElement loginField;

    @FindBy(xpath = ".//button[@class='base-0-2-87 primary-0-2-101 auto-0-2-113']")
    private WebElement passwdBtn;

    @FindBy(xpath = ".//input[@class='input-0-2-77 withIcon-0-2-78']")
    private WebElement passwdField;

    @FindBy(xpath = ".//button[@class='base-0-2-87 primary-0-2-101 auto-0-2-113']")
    private WebElement enterBtn;

    public Logpage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }

    public void inputLogin(String login) {
        loginField.clear();
        loginField.sendKeys(login);
    }

    public void clickPasswdBtn() {
        passwdBtn.click();
    }

    public void inputPasswd(String passwd) {
        passwdField.clear();
        passwdField.sendKeys(passwd);
    }

    public void clickEnterBtn() {
        enterBtn.click();
    }

}
