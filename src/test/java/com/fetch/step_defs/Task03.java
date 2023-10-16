package com.fetch.step_defs;

import com.fetch.pages.FetchPage;
import com.fetch.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Task03 {


    @Test
    public void winTheGame() {
        Driver.getDriver().get("http://sdetchallenge.fetch.com/");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        FetchPage fp = new FetchPage();

        fp.putCoinsLeftBox("0", "1", "2");//putting first three coins on left box
        fp.putCoinsRightBox("3", "4", "5"); //putting first three coins on right box
        fp.weightBtn.click(); //clicking weight button

        if (fp.comparison1.getText().contains("<")) { // First weighting: to check which side is lighter

            // second weighting: we click reset button and  we put lighter side of 2 coins in the box
            fp.putCoinInBox("0", "1");
/*            fp.resetBtn.click();
            BrowserUtils.sleep(3);
            fp.left1.sendKeys("0");
            fp.right1.sendKeys("1");
            fp.weightBtn.click();
            BrowserUtils.sleep(3);

 */
            if (fp.comparison2.getText().contains("<")) {
/*           fp.coinZeroElement.click();
                BrowserUtils.sleep(3);
                System.out.println("You find it! Fake coin is ZERO");
                BrowserUtils.sleep(3);
                alert = Driver.getDriver().switchTo().alert();
                BrowserUtils.sleep(3);

                //Assert winning message is showing
                Assert.assertEquals("Yay! You find it!", alert.getText());
                  */
                fp.assertWin(fp.coinZeroElement);

            } else if (fp.comparison2.getText().contains(">")) {
/*                fp.coinOneElement.click();
                BrowserUtils.sleep(3);
                System.out.println("You find it! Fake coin is ONE");
                BrowserUtils.sleep(3);
                alert = Driver.getDriver().switchTo().alert();
                BrowserUtils.sleep(3);
                //Assert winning message is showing
                Assert.assertEquals("Yay! You find it!", alert.getText());

 */
                fp.assertWin(fp.coinOneElement);
            } else {
                fp.assertWin(fp.coinTwoElement);
/*                fp.coinTwoElement.click();
                BrowserUtils.sleep(3);
                System.out.println("You find it! Fake coin is TWO");
                BrowserUtils.sleep(3);
                alert = Driver.getDriver().switchTo().alert();
                BrowserUtils.sleep(3);
                //Assert winning message is showing
                Assert.assertEquals("Yay! You find it!", alert.getText());

 */
            }

        } else if (fp.comparison1.getText().contains(">")) {
            fp.putCoinInBox("3", "4");
/*            fp.resetBtn.click();
            BrowserUtils.sleep(3);
            fp.left1.sendKeys("3");
            fp.right1.sendKeys("4");
            fp.weightBtn.click();
            BrowserUtils.sleep(3);

 */
            // evaluate lightest side of three coins
            if (fp.comparison2.getText().contains("<")) {
                fp.assertWin(fp.coinThreeElement);
/*                fp.coinThreeElement.click();
                BrowserUtils.sleep(3);
                System.out.println("You find it! Fake coin is THREE");
                BrowserUtils.sleep(3);
                alert = Driver.getDriver().switchTo().alert();
                BrowserUtils.sleep(3);
                //Assert winning message is showing
                Assert.assertEquals("Yay! You find it!", alert.getText());

 */
            } else if (fp.comparison2.getText().contains(">")) {
                fp.assertWin(fp.coinFourElement);
/*                fp.coinFourElement.click();
                BrowserUtils.sleep(3);
                System.out.println("You find it! Fake coin is FOUR");
                BrowserUtils.sleep(3);
                alert = Driver.getDriver().switchTo().alert();
                BrowserUtils.sleep(3);
                //Assert winning message is showing
                Assert.assertEquals("Yay! You find it!", alert.getText());

 */
            } else {
                fp.assertWin(fp.coinFiveElement);
/*                fp.coinFiveElement.click();
                BrowserUtils.sleep(3);
                System.out.println("You find it! Fake coin is FIVE");
                BrowserUtils.sleep(3);
                 alert = Driver.getDriver().switchTo().alert();
                BrowserUtils.sleep(3);
                //Assert winning message is showing
                Assert.assertEquals("Yay! You find it!", alert.getText());

 */
            }


        } else {
            fp.putCoinInBox("6", "7");
/*            fp.resetBtn.click();
            BrowserUtils.sleep(3);
            fp.left1.sendKeys("6");
            fp.right1.sendKeys("7");
            fp.weightBtn.click();
            BrowserUtils.sleep(3);


 */
            if (fp.comparison2.getText().contains("<")) {
                fp.assertWin(fp.coinSixElement);
/*                fp.coinSixElement.click();
                System.out.println("You find it! Fake coin is SIX");
                BrowserUtils.sleep(3);
                alert = Driver.getDriver().switchTo().alert();
                BrowserUtils.sleep(3);
                //Assert winning message is showing
                Assert.assertEquals("Yay! You find it!", alert.getText());

 */

            } else if (fp.comparison2.getText().contains(">")) {
                fp.assertWin(fp.coinSevenElement);
/*                fp.coinSevenElement.click();
                System.out.println("You find it! Fake coin is SEVEN");
                BrowserUtils.sleep(3);
                alert = Driver.getDriver().switchTo().alert();
                BrowserUtils.sleep(3);
                //Assert winning message is showing
                Assert.assertEquals("Yay! You find it!", alert.getText());


 */
            } else {
                fp.assertWin(fp.coinEightElement);
/*                fp.coinEightElement.click();
                System.out.println("You find it! Fake coin is EIGHT");
                BrowserUtils.sleep(3);
                alert = Driver.getDriver().switchTo().alert();
                BrowserUtils.sleep(3);
                //Assert winning message is showing
                Assert.assertEquals("Yay! You find it!", alert.getText());



 */
            }


        }
        Driver.closeDriver();


    }
}
