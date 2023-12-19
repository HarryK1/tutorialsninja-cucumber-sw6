package com.tutorialsninja.steps;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.pages.ProductPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LaptopAndNotebooksSteps {

    @And("I hover on Laptops & Notebooks Tab and click")
    public void iHoverOnLaptopsNotebooksTabAndClick()
    {
        new HomePage().mouseHoverOnLaptopsAndNotebooksLinkAndClick();
    }

    @And("I click on “Show All Laptops & Notebooks”")
    public void iClickOnShowAllLaptopsNotebooks(String text)
    {
        new HomePage().selectMenu("Show All Laptops & Notebooks");
    }

    @And("I select Sort By {string}")
    public void iSelectSortBy(String aToz)
    {
        new LaptopsAndNotebooksPage().selectSortByOption(aToz);
    }

    @Then("I can see the Product price will arrange in High to Low order.")
    public void iCanSeeTheProductPriceWillArrangeInHighToLowOrder()
    {
        new LaptopsAndNotebooksPage().getProductsPriceList();
    }

    @And("I select Product {string}")
    public void iSelectProductMacBook(String product)
    {
        new LaptopsAndNotebooksPage().selectProductByName(product);
    }

    @And("I click on ‘Add To Cart’ button")
    public void iClickOnAddToCartButton()
    {
        new ProductPage().clickOnAddToCartButton();
    }

    @And("I click on link {string} displayed into success message")
    public void iClickOnLinkShoppingCartDisplayedIntoSuccessMessage()
    {
        new ProductPage().clickOnShoppingCartLinkIntoMessage();
    }

    @Then("I can able to see the text {string}")
    public void iCanAbleToSeeTheText(String arg0)
    {
        Assert.assertEquals(new ProductPage().getProductText(), "Welcome, Please Sign In", "Success: You have added MacBook to your shopping cart!");
    }

    @Then("I can able to see the Product name {string}")
    public void iCanAbleToSeeTheProductName(String arg0)
    {
        new ProductPage().getProductText();
    }

    @And("I change Quantity to {int}")
    public void iChangeQuantityTo(String  qty)
    {
        new ShoppingCartPage().changeQuantity(qty);
    }

    @And("I click on {string} Tab")
    public void iClickOnUpdateTab()
    {
        new ShoppingCartPage().clickOnQtyUpdateButton();
    }

    @Then("I can see the Total £{double}")
    public void iCanSeeTheTotal£(int arg0, int arg1)
    {
        Assert.assertEquals(new ShoppingCartPage().getTotal(), "£737.45", "Error message");
    }

    @And("I click on {string} button")
    public void iClickOnCheckoutButton()
    {
        new ProductPage().clickOnAddToCartButton();
    }

    @Then("I can see the Text {string}")
    public void iCanSeeTheTextNewCustomer()
    {
        new ShoppingCartPage().getShoppingCartText();
    }

    @And("I click on {string} radio button")
    public void iClickOnGuestCheckoutRadioButton()
    {

    }

    @And("I click on {string} tab")
    public void iClickOnContinueTab()
    {

    }

    @And("I fill the mandatory fields")
    public void iFillTheMandatoryFields() {
    }

    @And("I click on {string} Button")
    public void iClickOnContinueButton()
    {

    }

    @And("I add Comments About your order into text area")
    public void iAddCommentsAboutYourOrderIntoTextArea()
    {
    }

    @And("I check the Terms & Conditions check box")
    public void iCheckTheTermsConditionsCheckBox()
    {
    }
}
