package driver;

public enum BrowserType {
    FIREFOX("firefox"),
    CHROME("chrome"),
    IE("internetexplorer");

    BrowserType(String browser) {
        this.browser = browser;
    }

    private final String browser;
}
