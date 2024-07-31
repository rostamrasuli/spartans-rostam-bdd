package tek.bdd.base.steps;

import org.junit.Before;
import tek.bdd.utility.SeleniumUtility;

public class HooksSteps extends SeleniumUtility {


    @Before
    public void beforeEachScenario() {
        setupBrowser();
    }

public void afterEacheScenario() {
        quitBrowser();

}
}
