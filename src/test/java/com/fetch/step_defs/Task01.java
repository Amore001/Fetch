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

public class Task01 {


    @Test
    public void fetch(){


        Driver.getDriver().get("http://sdetchallenge.fetch.com/");



        WebDriverWait wait =  new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

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

        WebElement weightBtn = Driver.getDriver().findElement(By.id("weigh"));

        weightBtn.click();

        WebElement comparison1 = Driver.getDriver().findElement(By.xpath("//li[1]"));


        WebElement resetBtn = Driver.getDriver().findElement(By.xpath("(//button[@id='reset'])[2]"));

        if(comparison1.getText().contains("<")){
            BrowserUtils.sleep(3);
            resetBtn.click();
            BrowserUtils.sleep(5);
            left1.sendKeys("0");
            right1.sendKeys("1");
            weightBtn.click();
            BrowserUtils.sleep(3);
            WebElement comparison2 = Driver.getDriver().findElement(By.xpath("//li[2]"));

            if(comparison2.getText().contains("<")){
                WebElement coinZeroElement = Driver.getDriver().findElement(By.xpath("//button[@id ='coin_0']"));
                coinZeroElement.click();
                BrowserUtils.sleep(5);
                //System.out.println("You find it! Fake coin is "+coinZeroElement.getText());
                System.out.println("You find it! Fake coin is ZERO");
                BrowserUtils.sleep(5);
                Alert alert = Driver.getDriver().switchTo().alert();
                BrowserUtils.sleep(5);
                System.out.println(alert.getText());
                Assert.assertEquals("Yay! You find it!", alert.getText());

            } else if (comparison2.getText().contains(">")) {
                WebElement coin1Element = Driver.getDriver().findElement(By.xpath("//button[@id ='coin_1']"));
                coin1Element.click();
                BrowserUtils.sleep(5);
               // System.out.println("You find it! Fake coin is "+ coin1Element.getText());
                System.out.println("You find it! Fake coin is ONE");
                BrowserUtils.sleep(5);
                Alert alert = Driver.getDriver().switchTo().alert();
                BrowserUtils.sleep(5);
                System.out.println(alert.getText());
                Assert.assertEquals("Yay! You find it!", alert.getText());

            }else{
                WebElement coin2Element = Driver.getDriver().findElement(By.xpath("//button[@id ='coin_2']"));
                coin2Element.click();
                BrowserUtils.sleep(5);
                //System.out.println("You find it! Fake coin is "+ coin2Element.getText());
                System.out.println("You find it! Fake coin is TWO");
                BrowserUtils.sleep(5);
                Alert alert = Driver.getDriver().switchTo().alert();
                BrowserUtils.sleep(5);
                System.out.println(alert.getText());
                Assert.assertEquals("Yay! You find it!", alert.getText());
            }

        } else if (comparison1.getText().contains(">")) {
            BrowserUtils.sleep(3);
            resetBtn.click();
            BrowserUtils.sleep(5);
            left1.sendKeys("3");
            right1.sendKeys("4");
            weightBtn.click();
            BrowserUtils.sleep(3);
            WebElement comparison2 = Driver.getDriver().findElement(By.xpath("//li[2]"));
            if(comparison2.getText().contains("<")){
                WebElement coinThreeElement = Driver.getDriver().findElement(By.xpath("//button[@id ='coin_3']"));
                coinThreeElement.click();
                BrowserUtils.sleep(5);
                //System.out.println("You find it! Fake coin is "+coinThreeElement.getText());
                System.out.println("You find it! Fake coin is THREE");
                BrowserUtils.sleep(5);
                Alert alert = Driver.getDriver().switchTo().alert();
                BrowserUtils.sleep(5);
                System.out.println(alert.getText());
                Assert.assertEquals("Yay! You find it!", alert.getText());
            } else if (comparison2.getText().contains(">")) {
                WebElement coinFourElement = Driver.getDriver().findElement(By.xpath("//button[@id ='coin_4']"));
                coinFourElement.click();
                BrowserUtils.sleep(5);
               // System.out.println("You find it! Fake coin is "+coinFourElement.getText());
                System.out.println("You find it! Fake coin is FOUR");
                BrowserUtils.sleep(5);
                Alert alert = Driver.getDriver().switchTo().alert();
                BrowserUtils.sleep(5);
                System.out.println(alert.getText());
                Assert.assertEquals("Yay! You find it!", alert.getText());

            }else{

                WebElement coinFiveElement = Driver.getDriver().findElement(By.xpath("//button[@id ='coin_5']"));
                coinFiveElement.click();
                BrowserUtils.sleep(5);
               // System.out.println("You find it! Fake coin is "+coinFiveElement.getText());
                System.out.println("You find it! Fake coin is FIVE ");
                BrowserUtils.sleep(5);
                Alert alert = Driver.getDriver().switchTo().alert();
                BrowserUtils.sleep(5);
                System.out.println(alert.getText());
                Assert.assertEquals("Yay! You find it!", alert.getText());

            }


        }else{
            BrowserUtils.sleep(3);
            resetBtn.click();
            BrowserUtils.sleep(5);
            left1.sendKeys("6");
            right1.sendKeys("7");
            weightBtn.click();
            BrowserUtils.sleep(3);
            WebElement comparison2 = Driver.getDriver().findElement(By.xpath("//li[2]"));
            if(comparison2.getText().contains("<")){
                WebElement coinSixElement = Driver.getDriver().findElement(By.xpath("//button[@id ='coin_6']"));
                coinSixElement.click();
                BrowserUtils.sleep(5);
               // System.out.println("You find it! Fake coin is "+coinSixElement.getText());
                System.out.println("You find it! Fake coin is SIX");
                BrowserUtils.sleep(5);
                Alert alert = Driver.getDriver().switchTo().alert();
                BrowserUtils.sleep(5);
                System.out.println(alert.getText());
                Assert.assertEquals("Yay! You find it!", alert.getText());

            } else if (comparison2.getText().contains(">")) {
                WebElement coinSevenElement = Driver.getDriver().findElement(By.xpath("//button[@id ='coin_7']"));
                coinSevenElement.click();
                BrowserUtils.sleep(5);
               // System.out.println("You find it! Fake coin is "+coinSevenElement.getText());
                System.out.println("You find it! Fake coin is SEVEN");
                BrowserUtils.sleep(5);
                Alert alert = Driver.getDriver().switchTo().alert();
                BrowserUtils.sleep(5);
                System.out.println(alert.getText());
               Assert.assertEquals("Yay! You find it!", alert.getText());

            }else{
                WebElement coinEightElement = Driver.getDriver().findElement(By.xpath(" //button[@id ='coin_8']"));
                coinEightElement.click();
                BrowserUtils.sleep(5);
               // System.out.println("You find it! Fake coin is "+coinEightElement.getText());
                System.out.println("You find it! Fake coin is EIGHT");
                BrowserUtils.sleep(5);
                Alert alert = Driver.getDriver().switchTo().alert();
                BrowserUtils.sleep(5);
                System.out.println(alert.getText());
                Assert.assertEquals("Yay! You find it!", alert.getText());

            }





        }

        BrowserUtils.sleep(3);
        Driver.closeDriver();




    }
}
