package tests;


import org.testng.annotations.Test;
import page.object.*;

public class ShoppingCartTest  extends TestBase{
    @Test
    public void failedProceedToCheckout(){
        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();


        LoginPage loginPage = new LoginPage();
        loginPage
                .clickOnFishImageButton()
                .clickOnAngelFishButton()
                .clickAddToCartSmallAngelfish()
                .clickOnProceedToCheckout();

        loginPage = new LoginPage();
        String warningMessage = loginPage.getWarningMessage();
        assertEquals(warningMessage, "You must sign on before attempting to check out. Please sign on and try checking out again.");

    }

    private void assertEquals(String warningMessage, String s) {
    }

}
