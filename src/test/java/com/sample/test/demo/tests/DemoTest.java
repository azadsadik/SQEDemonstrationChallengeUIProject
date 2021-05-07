package com.sample.test.demo.tests;

import com.github.javafaker.Faker;
import com.sample.test.demo.constants.PizzaTypes;
import com.sample.test.pages.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.sample.test.utility.Utils.select;

public class DemoTest extends BasePage {

    public Faker faker=new Faker();

    @Test
    public void demoTest() {
        System.out.println("HELLO WORLD");
    }

    @Test(description = "happy path")
    public void placingOrderWithValidData(){
        select(pizza1, pizzaType);
        select(pizza1Toppings1, pizzaToppingsItalianHam);
        select(pizza1Toppings2, pizzaToppingsExtraCheese);
        pizza1Quantity.sendKeys("1");
        name.sendKeys(faker.name().firstName());
        email.sendKeys(faker.internet().emailAddress());
        phone.sendKeys(faker.phoneNumber().cellPhone());
        radioCreditCard.click();
        placeOrderButton.click();
        String actualResult= dialogText.getText();
        String expectedResult="Thank you for your order! TOTAL: "+PizzaTypes.LARGE_THREETOPPINGS.getCost()+ " "+pizzaType;
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test(description = "negative")
    public void placingOrderWithInvalidData(){
        select(pizza1, pizzaType);
        select(pizza1Toppings1, pizzaToppingsItalianHam);
        select(pizza1Toppings2, pizzaToppingsExtraCheese);
        pizza1Quantity.sendKeys("4");
        name.sendKeys("-12343464567");
        System.out.println(name.getText());
        email.sendKeys(faker.internet().emailAddress());
        String number=faker.name().fullName();
        phone.sendKeys(number);

        //checking radio buttons assertion
        radioCreditCard.click();
        radioCash.click();
        Assert.assertTrue(radioCreditCard.isSelected());
        Assert.assertFalse(radioCash.isSelected());


        placeOrderButton.click();

        String actualResult= dialogText.getText();
        String expectedResult1="error";
        String expectedResult2="Thank you for your order!";
        Assert.assertTrue(actualResult.contains(expectedResult1));
        Assert.assertFalse(actualResult.contains(expectedResult2));
    }
}
