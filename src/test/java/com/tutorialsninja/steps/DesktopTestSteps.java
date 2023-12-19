package com.tutorialsninja.steps;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ProductPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class DesktopTestSteps {
    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {

    }

    @And("click on {string}")
    public void clickOn(String showAllDesktop) {
        new HomePage().selectMenu("Show All Desktops");

    }

    @And("select sort by position {string}")
    public void selectSortByPosition(String ZToA) {
        new DesktopsPage().selectSortByOption("Name: Z to A");
    }

    @Then("I can see the products in descending order")
    public void iCanSeeTheProductsInDescendingOrder() {
        Assert.assertEquals(new DesktopsPage().getProductsNameList(), "Name: Z to A", "Error Message");
    }

    @And("select sort by the position {string}")
    public void selectSortByThePosition(String AToZ) {
        new DesktopsPage().selectSortByOption("Name: A to Z");
    }

    @And("select product {string}")
    public void selectProduct(int product) {
        new DesktopsPage().selectProductByName("product");
    }

    @And("enter qty {int} using select class")
    public void enterQtyUsingSelectClass(int qty)
    {
        new ProductPage().enterQuantity("");
    }

    @And("click on {string} button")
    public void clickOnAddToCartButton()
    {
        new ProductPage().clickOnAddToCartButton();
    }
    @And("I click on link {string} display into success message")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage()
    {
        new ProductPage().clickOnShoppingCartLinkIntoMessage();
    }

    @Then("I can see the Product name {string}")
    public void iCanSeeTheProductName(String arg0)
    {
        Assert.assertEquals(new ShoppingCartPage().getProductName(),"product name", "Error message displayed");
    }

    @Then("I can see the Delivery Date {string}")
    public void iCanSeeTheDeliveryDate(String arg0) {
    }

    @Then("I can see the Model {string}")
    public void iCanSeeTheModel(String arg0)
    {
        Assert.assertEquals(new ShoppingCartPage().getModel(), "model", "Error Message");
    }

    @Then("I can see the Total {string}")
    public void iCanSeeTheTotal(String arg0)
    {
        Assert.assertEquals(new ShoppingCartPage().getTotal(),"total", "Error message");
    }
}
