package co.uk.zoopla.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

public class HomePage extends BasePage

{

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    @FindBy(xpath = "//*[@id=\"save\"]/span[1]/div/span")
    private WebElement acceptCookiesButton;

    @FindBy(xpath = "//*[@id=\"header-location\"]")
    private WebElement location;

    @FindBy(xpath = "//*[@id=\"AnyBeds_testId\"]/div/p")
    private WebElement bedDrop;

    @FindBy(xpath = "//*[@id=\"beds_min\"]")
    private WebElement minimumBed;

    @FindBy(xpath = "//*[@id=\"beds_max\"]")
    private WebElement maximumBed;

    @FindBy(xpath = "//*[@id=\"__next\"]/main/div[1]/div[3]/div[2]/div/div[5]/div/button/div/p")
    private WebElement PriceDrop;

    @FindBy(xpath = "//*[@id=\"price_min\"]")
    private WebElement minimumPrice;

    @FindBy(xpath = "//*[@id=\"price_max\"]")
    private WebElement maximumPrice;

    @FindBy(xpath = "//*[@id=\"__next\"]/main/div[1]/div[3]/div[2]/div/div[7]/div/button/div/p")
    private WebElement selectProperty;

    @FindBy(xpath = "//*[@id=\"__next\"]/main/div[1]/div[3]/div[2]/div/div[7]/div/div/div/div[1]/label")
    private WebElement selectShowAllProperty;

    @FindBy(xpath = "//*[@id=\"__next\"]/main/div[1]/div[3]/div[2]/div/div[7]/div/div/div/div[2]/label")
    private WebElement selectHouseProperty;

    @FindBy(xpath = "//*[@id=\"__next\"]/main/div[1]/div[3]/div[2]/div/div[7]/div/div/div/div[3]/label")
    private WebElement selectFlatsProperty;

    @FindBy(xpath = "//*[@id=\"__next\"]/main/div[1]/div[3]/div[2]/div/div[7]/div/div/div/div[4]/label")
    private WebElement selectFarmsAndLandProperty;

    @FindBy(xpath = "//*[@id=\"__next\"]/main/div[1]/div[3]/div[2]/div/div[8]/button")
    private WebElement searchButton;

    public void acceptCookiesPolicy()
    {
        BasePage.switchToFrame();
        acceptCookiesButton.click();
    }
    public void enterLocation(String loc)
    {
        location.sendKeys(loc);
    }
    public void dropBedselector()
    {
        bedDrop.click();
    }
    public void selectMinBed(String minBed)
    {
        selectByText(minimumBed, minBed);
    }
    public void selectMaxBed(String maxBed)
    {
        selectByText(maximumBed, maxBed);
    }
    public void dropPiceselector()
    {
        PriceDrop.click();
    }
    public void selectMinPrice(String minPrice)
    {
        selectByText(minimumPrice, minPrice);
    }
    public void selectMaxPrice(String maxPrice)
    {
        selectByText(maximumPrice, maxPrice);
    }
    public void Propertyselector()
    {
        selectProperty.click();
    }
    private void ShowAlPropertyselector()
    {
        selectShowAllProperty.click();
    }
    private void HousePropertyselector()
    {
        selectHouseProperty.click();
    }
    private void FlatPropertyselector()
    {
        selectFlatsProperty.click();
    }
    private void FarmAndLandPropertyselector()
    {
        selectFarmsAndLandProperty.click();
    }
    public void clickOnProperty(String prop)
    {
        if(Objects.equals(prop, "Show all"))
        {
            ShowAlPropertyselector();
        }
        else if(Objects.equals(prop, "Houses"))
        {
            HousePropertyselector();
        }
        else if(Objects.equals(prop, "Flats"))
        {
            FlatPropertyselector();
        }
        else if(Objects.equals(prop, "Farms/land"))
        {
            FarmAndLandPropertyselector();
        }
    }
    public SearchResultPage clickSearchButton()
    {
        searchButton.click();
        return new SearchResultPage(driver);

    }

}

