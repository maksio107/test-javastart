package utils.testng.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    private int count = 0;
    private static final int MAX_NUMBER_OF_RETRIES = 2;
    private Logger logger = LogManager.getLogger(RetryAnalyzer.class);
    @Override
    public boolean retry(ITestResult result) {
        if (!result.isSuccess()) {                      //Sprawdza czy test zakończył się porażką.
            if (count < MAX_NUMBER_OF_RETRIES) {             //Sprawdzamy czy test został powtórzony. Jeśli tak to nie powtarzamy go ponownie
                count++;
                logger.info("Retrying test method {}!", result.getName());
                return true;
            }
        }
        logger.info("Test method {} will be not retried!", result.getName());
        return false;
    }
}
