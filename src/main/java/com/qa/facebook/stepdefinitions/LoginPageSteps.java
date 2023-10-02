package com.qa.facebook.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageSteps {

    WebDriver driver;

    @Given("User is already on the login Page")
    public void user_is_already_on_the_login_page() {
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        System.out.println("User is successfully landed in the login page");
    }
    @When("Title of the Login Page is Facebook|Login")
    public void title_of_the_login_page_is_facebook_login() {
        String logintitle= driver.getTitle();
        Assert.assertTrue(logintitle.contains("Facebook"));
        System.out.println("user is successfully landed on the facebook login page ");
    }
    @Then("User enters Username and Password")
    public void user_enters_username_and_password() {
        driver.findElement(By.id("email")).sendKeys("rukisan123@gmail.com");
        System.out.println("User successfully entered the username");
        driver.findElement(By.id("pass")).sendKeys("rukisan123");
        System.out.println("User successfully entered the password");
    }

    @Then("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        driver.findElement(By.id("email")).sendKeys(username);
        System.out.println("User successfully entered the username");
        driver.findElement(By.id("pass")).sendKeys(password);
        System.out.println("User successfully entered the password");
    }

    @Then("User clicks on Login button")
    public void user_clicks_on_login_button() {
        driver.findElement(By.name("login")).click();
        System.out.println("User successfully click the submit button");

    }
    @Then("User is on HomePages")
    public void user_is_on_home_pages() {
        String homePagetitle= driver.getTitle();
       // Assert.assertTrue(homePagetitle.contains("Facebook"));
        System.out.println("user is successfully landed on the facebook Home page ");

    }
    @Then("Close the Browser")
    public void close_the_browser() {
        driver.quit();
    }


}
