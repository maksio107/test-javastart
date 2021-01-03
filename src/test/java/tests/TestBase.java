package tests;

import driver.BrowserType;
import driver.DriverManager;
import driver.DriverUtils;
import org.testng.annotations.*;
import configuration.ConfigurationProperties;
import configuration.PropertiesLoader;

import java.util.Properties;

import static navigation.ApplicationURLs.APPLICATION_URL;

public class TestBase   {

    @BeforeClass
    public void beforeClass() {
        PropertiesLoader propertiesLoader = new PropertiesLoader();
        Properties propertiesFromFile = propertiesLoader.getPropertiesFromFile("configuration.properties");
        ConfigurationProperties.setProperties(propertiesFromFile);
    }
    @Parameters("browser")
    @BeforeMethod
    public void beforeTest(@Optional BrowserType browserType) {
        DriverManager.setWebDriver(browserType);
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage(APPLICATION_URL);
    }

    @AfterMethod
    public void afterTest() {
        DriverManager.disposeDriver();
    }

}
