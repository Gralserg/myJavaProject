package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Letterpage {

    @FindBy(xpath = ".//span[@class='compose-button__wrapper']/parent::a")
    private WebElement letterBtn;

    @FindBy(xpath = ".//div[@class='contacts--1ofjA']//input")
    private WebElement adressField;

    @FindBy(xpath = ".//span[contains(@class,'button2 button2_base button2_primary')]")
    private WebElement sendBtn;

    @FindBy(xpath = ".//span[contains(@class,'ph-dropdown-')]")
    private WebElement accountBtn;

    @FindBy(xpath = ".//div[text()='Выйти']/parent::a")
    private WebElement exitBtn;

    public Letterpage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickLetterBtn() {
        letterBtn.click();
    }

    public void inputAdressField(String adress) {
        adressField.clear();
        adressField.sendKeys(adress);
    }

    public void clickSendBtn() {
        sendBtn.click();
    }

    public void clickAccountBtn() {
        accountBtn.click();
    }

    public void clickExitBtn() {
        exitBtn.click();
    }
}
