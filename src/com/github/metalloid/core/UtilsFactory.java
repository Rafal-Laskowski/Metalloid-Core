package com.github.metalloid.core;

import com.github.metalloid.webdriver.WebDriverPool;

class UtilsFactory {

    static void initUtilities(Object page) {
        com.github.metalloid.webdriver.utils.UtilsFactory.initUtilities(WebDriverPool.get(), page);
    }
}
