package com.fetch.step_defs;

import com.fetch.utilities.BrowserUtils;
import com.fetch.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task02 {

    @Test
    public void test01(){

        Driver.getDriver().get("http://sdetchallenge.fetch.com/");
        FetchPage fp = new FetchPage();

    //    fp.assertWinTest(fp.coinOneElement);

       // fp.assertWin(fp.coinOneElement);

        fp.putCoinInBox("0","1");


 /*       WebDriverWait wait =  new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

        WebElement left1 = Driver.getDriver().findElement(By.id("left_0"));
        wait.until(ExpectedConditions.visibilityOf(left1));
        left1.sendKeys("0");

        WebElement left2 = Driver.getDriver().findElement(By.id("left_1"));
        left2.sendKeys("1");

        WebElement left3 = Driver.getDriver().findElement(By.id("left_2"));
        left3.sendKeys("2");

        WebElement right1 = Driver.getDriver().findElement(By.id("right_0"));
        right1.sendKeys("3");

        WebElement right2 = Driver.getDriver().findElement(By.id("right_1"));
        right2.sendKeys("4");

        WebElement right3 = Driver.getDriver().findElement(By.id("right_2"));
        right3.sendKeys("5");

        //  WebDriverWait wait2 =  new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));

     /*   WebElement weightBtn = Driver.getDriver().findElement(By.id("weigh"));

        weightBtn.click();

        WebElement resetBtn = Driver.getDriver().findElement(By.xpath("(//button[@id='reset'])[2]"));
        BrowserUtils.sleep(3);

        resetBtn.click();

        WebElement coin1Element = Driver.getDriver().findElement(By.xpath("//button[@id ='coin_1']"));
        System.out.println("coin1Element.getText() = " + coin1Element.getText());

        coin1Element.click();

        BrowserUtils.sleep(3);

        Alert alert = Driver.getDriver().switchTo().alert();
        BrowserUtils.sleep(3);
        System.out.println(alert.getText());

        Assert.assertEquals("Oops! Try Again!", alert.getText());


      */





    }
}
