package com.github.metalloid.core;

import com.github.metalloid.pagefactory.PageFactory;
import com.github.metalloid.webdriver.WebDriverPool;
import com.github.metalloid.webdriver.utils.UtilsFactory;
import com.github.metalloid.webdriver.utils.conditions.ConditionEvaluator;
import org.openqa.selenium.WebDriver;

public class Metalloid {

    public static void initializePage(WebDriver driver, Object page) {
        PageFactory.init(driver, page);
        UtilsFactory.initUtilities(driver, page);
        ConditionEvaluator.evaluate(driver, page);
    }

    /**
     * Use this method only if you use WebDriver-Pool library of Metalloid
     * @param page
     */
    public static void initializePage(Object page) {
        WebDriver driver = WebDriverPool.get();
        initializePage(driver, page);
    }
}
