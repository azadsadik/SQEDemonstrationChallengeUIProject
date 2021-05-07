package com.sample.test.utility;

import com.sample.test.demo.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utils extends TestBase {


    public static Select select(WebElement name, String str) {
        Select select = new Select(name);
        select.selectByValue(str);
        return select;
    }

}
