package tests;

import driver.DriverUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;
import page.object.FooterPage;
import page.object.LandingPage;
import page.object.LoginPage;


import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.AssertJUnit.assertTrue;

public class PositiveLoginTests extends TestBase {

    @TmsLink("ID-2")
    @Severity(SeverityLevel.BLOCKER)
    @Description("The goal of this test is to log in using proper username and password" +
            " and check if Dog Banner is displayed after")
    @Test
    public void asUserLoginUsingValidLoginAndPassword() {
        DriverUtils.navigateToPage(LOGIN_URL);


        LoginPage loginPage = new LoginPage();
        loginPage
                .typeIntoUserNameField("j2ee")
                .typeIntoPasswordField("j2ee")
                .clickOnSignOnButton()
                .asserThatDogBannerIsDisplayed();

    }

}
