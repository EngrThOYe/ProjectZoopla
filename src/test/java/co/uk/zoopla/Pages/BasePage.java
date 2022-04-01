package co.uk.zoopla.Pages;

import co.uk.zoopla.Commons.DriverManager;
import co.uk.zoopla.Utility.Configuration;
import co.uk.zoopla.Utility.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class BasePage extends DriverManager
{

    public String BASE_URL;

    private String url()
    {
        try {
            if(new Environment().specifiedEnvironment() == null)
            {
                BASE_URL = new Configuration().getPropertiesParameter("prodUrl");
            }
            else
            {
                BASE_URL = new Environment().specifiedEnvironment();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf(BASE_URL);
        return BASE_URL;
    }



    public void NavigateToHomePage()
    {
        driver.navigate().to(url());
    }

    //to enter the iframe in the web
    public static void switchToFrame() {driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"gdpr-consent-notice\"]")));}

    private Select select;

    public void selectByText(WebElement element, String text)
    {
        select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectByValue(WebElement element, String value)
    {
        select = new Select(element);
        select.selectByValue(value);
    }
    public void selectByIndex(WebElement element, int index)
    {
        select = new Select(element);
        select.selectByIndex(index);
    }


}