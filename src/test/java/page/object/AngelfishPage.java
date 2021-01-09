package page.object;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.DriverManager;
import waits.WaitForElement;

public class AngelfishPage {
    private Logger logger = LogManager.getLogger(AngelfishPage.class);

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a")
    WebElement addToCardSmallAngelfish;
    @FindBy(xpath = "//*[@id=\"Cart\"]/a")
    WebElement proceedToCheckoutButton;

    public AngelfishPage() {

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public ShoppingCartPage clickAddToCartSmallAngelfish(){
        WaitForElement.waitUntilElementVisible(addToCardSmallAngelfish);
        addToCardSmallAngelfish.click();
        logger.info("Clicked on Small Angelfish Add to cart button");
        return new ShoppingCartPage();
    }
}
