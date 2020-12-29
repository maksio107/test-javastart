package page.object;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.DriverManager;
import waits.WaitForElement;

public class FishPage {
    private Logger logger = LogManager.getRootLogger();

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    WebElement angelFishButton;
    public FishPage( ) {

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public AngelfishPage clickOnAngelFishButton(){
        WaitForElement.waitUntilElementVisible(angelFishButton);
        angelFishButton.click();
        logger.info("Clicked on Angelfish Link");
        return new AngelfishPage();
    }

}
