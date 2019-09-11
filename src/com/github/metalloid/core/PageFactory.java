package com.github.metalloid.core;

import com.github.metalloid.webdriver.WebDriverPool;

class PageFactory {

    static void init(Object page) {
        com.github.metalloid.pagefactory.PageFactory.init(WebDriverPool.get(), page);
    }
}
