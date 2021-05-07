package com.sample.test.pages;

import com.sample.test.demo.TestBase;
import com.sample.test.demo.constants.PizzaToppings;
import com.sample.test.demo.constants.PizzaTypes;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends TestBase {


    public BasePage() {
        try {
            init();
        } catch (Throwable e) {
            System.out.println("Error occurred" + e.getMessage());
            // e.printStackTrace();
        }
        PageFactory.initElements(driver, this);

    }


    @FindBy(id = "pizza1Pizza")
    public WebElement pizza1;

    @FindBy(xpath = "//div[@id='pizza1']//select[@class='toppings1']")
    public WebElement pizza1Toppings1;

    @FindBy(xpath = "//div[@id='pizza1']//select[@class='toppings2']")
    public WebElement pizza1Toppings2;

    @FindBy(id = "pizza1Qty")
    public WebElement pizza1Quantity;

    @FindBy(id = "pizza1Cost")
    public WebElement pizza1Cost;

    @FindBy(id = "ccpayment")
    public WebElement radioCreditCard;

    @FindBy(id = "cashpayment")
    public WebElement radioCash;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "phone")
    public WebElement phone;

    @FindBy(id = "placeOrder")
    public WebElement placeOrderButton;

    @FindBy(id = "reset")
    public WebElement resetButton;

    @FindBy(id = "dialog")
    public WebElement dialog;

    @FindBy(xpath = "//div[@id='dialog']/p")
    public WebElement dialogText;

    public String pizzaType = PizzaTypes.LARGE_THREETOPPINGS.getDisplayName();
    public String pizzaToppingsItalianHam = PizzaToppings.ITALIANHAM.getDisplayName();
    public String pizzaToppingsExtraCheese = PizzaToppings.EXTRACHEESE.getDisplayName();

}