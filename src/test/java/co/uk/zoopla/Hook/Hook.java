package co.uk.zoopla.Hook;

import co.uk.zoopla.Commons.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BrowserManager
{
    @Before
    public void setup()
    {
        launchBrowser("Chrome");
    }

    // @After
    public void tearDown()
    {
        closeBrowser();
    }
}