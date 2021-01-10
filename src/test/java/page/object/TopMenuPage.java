package page.object;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

public class TopMenuPage extends BasePage{
    @FindBy(xpath = "//*[@id=\"MenuContent\"]/a[2]")
    private WebElement singInButton;

    @Step("Click on Sign In Link")
    public LoginPage clickOnSignInLink(){
        WaitForElement.waitUntilElementIsClickable(singInButton);
        singInButton.click();
        log().info("Clicked on Sign on Link");
        return new LoginPage();
    }


}
