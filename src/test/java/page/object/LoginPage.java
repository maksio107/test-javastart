package page.object;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.DriverManager;
import waits.WaitForElement;

public class LoginPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "signon")
    private WebElement signOnButton;

    @FindBy(css = "#Content ul[class='messages'] li")
    private WebElement messageLabel;

    @FindBy(css = "area[alt='Fish']")
    private WebElement btnFishImage;

    public LoginPage() {

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @Step("Type into User Name Field {username}")
    public LoginPage typeIntoUserNameField(String username) {
        WaitForElement.waitUntilElementVisible(usernameField);
        usernameField.sendKeys(username);
        logger.info("Typed into User Name Field {}", username);
        return this;
    }

    @Step("Type into Password Field {password}")
    public LoginPage typeIntoPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        logger.info("Typed into Password Field {}", password);
        return this;
    }

    @Step("Click on Login Button")
    public FooterPage clickOnSignOnButton() {
        signOnButton.click();
        logger.info("Clicked on Login Button");
        return new FooterPage();
    }

    @Step("Getting warning message from Login Page")
    public String getWarningMessage() {
        WaitForElement.waitUntilElementVisible(messageLabel);
        String warningText = messageLabel.getText();
        logger.info("Returned warning message was: {}", warningText);
        return warningText;
    }

    @Step("Click on Fish Image Button")
    public FishPage clickOnFishImageButton() {
        WaitForElement.waitUntilElementVisible(btnFishImage);
        btnFishImage.click();
        logger.info("Clicked on fish image");
        return new FishPage();
    }
}
