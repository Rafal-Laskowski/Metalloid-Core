package com.github.metalloid.core;

public class Metalloid {

    public static void initializePage(Object page) {
        PageFactory.init(page);
        UtilsFactory.initUtilities(page);
        ConditionEvaluator.evaluate(page);
    }
}
