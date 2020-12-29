package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.DriverManager;

public class MainPage {
    @FindBy(xpath = "//*[@id=\"SidebarContent\"]/a[1]")
    WebElement fishButton;

    public MainPage( ) {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnFishButton(){
        fishButton.click();
    }
}
