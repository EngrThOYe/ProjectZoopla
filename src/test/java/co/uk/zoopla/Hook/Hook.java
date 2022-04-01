package co.uk.zoopla.Hook;

import co.uk.zoopla.Commons.BrowserManager;
import co.uk.zoopla.Utility.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class Hook extends BrowserManager
{
    @Before
    public void setup()
    {
        String browser;
        try {
            browser = new Configuration().getPropertiesParameter("browser");
            launchBrowser(browser);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //to lunch chrome as default browser
        //launchBrowser("Chrome");
    }

    // @After
    public void tearDown()
    {
        closeBrowser();
    }
}