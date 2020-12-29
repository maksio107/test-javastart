package page.object;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.DriverManager;
import waits.WaitForElement;

public class TopMenuPage {
    private Logger logger = LogManager.getRootLogger();
    @FindBy(xpath = "//*[@id=\"MenuContent\"]/a[2]")
    private WebElement singInButton;
    public TopMenuPage( ) {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public LoginPage clickOnSignInLink(){
        WaitForElement.waitUntilElementIsClickable(singInButton);
        singInButton.click();
        logger.info("Clicked on Sign on Link");
        return new LoginPage();
    }


}
