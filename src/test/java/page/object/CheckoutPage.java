package page.object;

import driver.DriverManager;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    public CheckoutPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }
}
