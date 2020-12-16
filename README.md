# Metalloid-Core

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.metalloid-project/metalloid-core/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.metalloid-project/metalloid-core)

Maven dependency:
```
<!-- https://mvnrepository.com/artifact/com.github.metalloid-project/webdriver-utils -->
<dependency>
    <groupId>com.github.metalloid-project</groupId>
    <artifactId>metalloid-core</artifactId>
    <version>2.2.0</version>
</dependency>
```

Compiled with `Java 1.8`.

# Overview

This is combination of all of the Metalloid libraries.
Contains dependencies:
* Metalloid-Utils
Contains few `WebDriver` wrappers. Javascript, Mouse, Tab and Wait. Allows you to create your own wrappers and inject them into a Page Object class with `@Inject` annotation. 
[Wiki page](https://github.com/Rafal-Laskowski/Metalloid-Utils/wiki)

* Metalloid-Page-Factory
Allows you to annotate Control classes with `@FindBy`. Introduces `@FindComponent` annotation and Component creation. Components can contain Controls or WebElements inside but all are searched in the Search Context of the Component.
Components can also be created with regular constructors.
Introduces 2 new selectors: `textContains` and `textEquals
[Wiki page](https://github.com/Rafal-Laskowski/Metalloid-Page-Factory/wiki)

* Metalloid-Expected-Conditions
Introduces `@ExpectedCondition` annotation to wait until Page Object is in desired state during creation.
Allows to create custom conditions. Works with Controls, WebElements and List<> of those
[Wiki page](https://github.com/Rafal-Laskowski/Metalloid-Expected-Conditions/wiki)

* Metalloid-WebDriver-Pool
Thread-safe WebDriver Factory that creates an instance of a `WebDriver` for each test. Driven by system properties.
Allows to set up options easily
[Wiki page](https://github.com/Rafal-Laskowski/Metalloid-WebDriver-Pool/wiki)

* Metalloid-WebElement-Name
Introduces `@Name` annotation which allows you to add (and then read) the description of WebElements or Controls
[Wiki page](https://github.com/Rafal-Laskowski/Metalloid-WebElement-Name)
