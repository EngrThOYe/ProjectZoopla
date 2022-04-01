package co.uk.zoopla.StepDefinitions;

import co.uk.zoopla.Pages.BasePage;
import co.uk.zoopla.Pages.HomePage;
import co.uk.zoopla.Pages.ProductdetailsPage;
import co.uk.zoopla.Pages.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.uk.zoopla.Commons.DriverManager.driver;

public class Steps_To_Search_For_Property extends BasePage
{
    HomePage homePage = new HomePage(driver);
    SearchResultPage searchResultPage = new SearchResultPage(driver);
    ProductdetailsPage productdetailsPage = new ProductdetailsPage(driver);

    @Given("I navigate to Zoopla homepage")
    public void i_navigate_to_zoopla_homepage() throws InterruptedException{
        NavigateToHomePage();
        homePage.acceptCookiesPolicy();
        Thread.sleep(1000);

    }

    @When("I enter location as {string}")
    public void i_enter_location_as(String location) throws InterruptedException{

        homePage.enterLocation(location);
        Thread.sleep(1000);
    }

    @And("I select minimum bed as {string}")
    public void i_select_minimum_bed_as(String mini){

        homePage.dropBedselector();
        homePage.selectMinBed(mini);
    }

    @And("I select maximum bed as {string}")
    public void i_select_maximum_bed_as(String max) {

        homePage.selectMaxBed(max);
    }


    @And("I select minimum price as {string}")
    public void i_select_minimum_price_as(String mini) {

        homePage.dropPiceselector();
        homePage.selectMinPrice(mini);
    }


    @And("I select maximum price as {string}")
    public void i_select_maximum_price_as(String max){

        homePage.selectMaxPrice(max);
    }


    @And("I choose {string} as the property type")
    public void i_choose_as_the_property_type(String property){

        homePage.Propertyselector();
        homePage.clickOnProperty(property);
    }


    @And("I click on Search button")
    public void i_click_on_search_button(){
        searchResultPage = homePage.clickSearchButton();
    }


    @Then("search result page is displayed")
    public void search_result_page_is_displayed(){
        searchResultPage.isSearchResultPageDisplayed();
    }

    @And("I can click on any of the results")
    public void iCanClickOnAnyOfTheResults() {
        productdetailsPage = searchResultPage.clickResult();

    }


}