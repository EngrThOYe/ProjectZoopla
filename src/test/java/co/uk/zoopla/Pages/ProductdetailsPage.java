package co.uk.zoopla.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductdetailsPage extends BasePage
{
    public ProductdetailsPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}
