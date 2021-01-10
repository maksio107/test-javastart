package page.object;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import waits.WaitForElement;

import static generic.assertions.AssertWebElement.assertThat;

public class FooterPage extends BasePage{

    @FindBy(css = "#Banner img[src*='dog']")
    private WebElement bannerAfterLoginLogo;


    @Step("Assert that element dog banner is displayed")
    public FooterPage asserThatDogBannerIsDisplayed(){
        log().info("Checking if dog banner is displayed");
        WaitForElement.waitUntilElementVisible(bannerAfterLoginLogo);
        assertThat(bannerAfterLoginLogo).isDisplayed();
        return this;
    }
}
