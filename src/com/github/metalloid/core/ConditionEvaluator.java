package com.github.metalloid.core;

import com.github.metalloid.webdriver.WebDriverPool;

class ConditionEvaluator {

    static void evaluate(Object page) {
        com.github.metalloid.webdriver.utils.conditions.ConditionEvaluator.evaluate(WebDriverPool.get(), page);
    }
}
