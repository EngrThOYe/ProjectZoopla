package co.uk.zoopla.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage extends BasePage{

    public SearchResultPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[data-testid=\"listing-details-link\"]")
    //listing the element as they are more than 1 and storing it in result
    private List<WebElement> results;

    public void isSearchResultPageDisplayed()
    {
        //to verify in selenium, we use assert
        Assert.assertTrue(results.size() > 0);
    }

    public ProductdetailsPage clickResult()
    {
        //to click on the 5th result 0,1,2,3,4,5
        results.get(5).click();
        return new ProductdetailsPage(driver);
    }
}
