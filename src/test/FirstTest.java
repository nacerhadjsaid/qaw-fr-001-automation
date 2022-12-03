package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    WebDriver driver;

    @Before
    public void setUp(){
        //System.setProperty("driver.chromedriver", "/Users/nacer-zimu/IdeaProjects/qaw-fr-001-automation/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        System.out.println("browser open success");
    }
    @After
    public void close(){
        driver.close();
        System.out.println("browser close success");
    }

    @Test
    public void test1(){
        String expected = "Swag Labs";
        String actual = driver.getTitle();

        Assert.assertEquals(expected, actual);
        System.out.println("page title validation success");
    }

    @Test
    public void test2(){
        String expected = "Swag Labs";
        String actual = driver.getTitle();

        Assert.assertEquals(expected, actual);
        System.out.println("page title validation success");

        //username
        WebElement usernameField = driver.findElement(By.id("user-name"));
        boolean userNameIsDisplayed = usernameField.isDisplayed();
        Assert.assertTrue(userNameIsDisplayed);
        System.out.println("username field is displayed");

        //password
        WebElement passwordField = driver.findElement(By.id("password"));
        boolean passwordFieldIsDisplayed = passwordField.isDisplayed();
        Assert.assertTrue(passwordFieldIsDisplayed);
        System.out.println("password field is displayed");

        //login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        boolean loginButtonIsDisplayed = loginButton.isDisplayed();
        Assert.assertTrue(loginButtonIsDisplayed);
        System.out.println("login button is displayed");
    }
}
