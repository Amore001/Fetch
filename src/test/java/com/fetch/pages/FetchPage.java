package com.fetch.pages;

import com.fetch.utilities.BrowserUtils;
import com.fetch.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FetchPage {
    public FetchPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
    // boxes

    @FindBy(id = "left_0")
    public WebElement left1;


    @FindBy(id = "left_1")
    public WebElement left2;

    @FindBy(id = "left_2")
    public WebElement left3;

    @FindBy(id = "right_0")
    public WebElement right1;

    @FindBy(id = "right_1")
    public WebElement right2;

    @FindBy(id = "right_2")
    public WebElement right3;

    @FindBy(id = "weigh")
    public WebElement weightBtn;

    @FindBy(xpath = "//li[1]")
    public WebElement comparison1;

    @FindBy(xpath = "//li[2]")
    public WebElement comparison2;

    @FindBy(xpath = "(//button[@id='reset'])[2]")
    public WebElement resetBtn;

    // coins
    @FindBy(xpath = "//button[@id ='coin_0']")
    public WebElement coinZeroElement;

    @FindBy(xpath = "//button[@id ='coin_1']")
    public WebElement coinOneElement;

    @FindBy(xpath = "//button[@id ='coin_2']")
    public WebElement coinTwoElement;

    @FindBy(xpath = "//button[@id ='coin_3']")
    public WebElement coinThreeElement;

    @FindBy(xpath = "//button[@id ='coin_4']")
    public WebElement coinFourElement;

    @FindBy(xpath = "//button[@id ='coin_5']")
    public WebElement coinFiveElement;

    @FindBy(xpath = "//button[@id ='coin_6']")
    public WebElement coinSixElement;


    @FindBy(xpath = "//button[@id ='coin_7']")
    public WebElement coinSevenElement;

    @FindBy(xpath = "//button[@id ='coin_8']")
    public WebElement coinEightElement;

    public void assertWin(WebElement anyCoin){
        System.out.println("You find it! Fake coin is "+anyCoin.getText());
        anyCoin.click();
        BrowserUtils.sleep(5);
        Alert alert = Driver.getDriver().switchTo().alert();
        BrowserUtils.sleep(5);
        //Assert winning message is showing
        Assert.assertEquals("Yay! You find it!", alert.getText());

    }

    public void putCoinInBox(String coinA, String coinB){
        resetBtn.click();
        BrowserUtils.sleep(3);
        left1.sendKeys(coinA);
        right1.sendKeys(coinB);
        weightBtn.click();
        BrowserUtils.sleep(3);

    }

    public void putCoinsLeftBox(String coinA, String coinB, String coinC){
        left1.sendKeys(coinA);
        left2.sendKeys(coinB);
        left3.sendKeys(coinC);

    }

    public void putCoinsRightBox(String coinA, String coinB, String coinC){
        right1.sendKeys(coinA);
        right2.sendKeys(coinB);
        right3.sendKeys(coinC);


    }





















}
