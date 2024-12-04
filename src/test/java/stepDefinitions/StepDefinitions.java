package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumberOption.TestRunner;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends TestRunner {
	
	WebDriver driver;

    @Given("Launch the Browser and Open url")
    public void launch_the_browser_and_open_url()throws Throwable {
        // Set the path to your WebDriver executable
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize the ChromeDriver
//    	
    	
         driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     }



@When("Enter UserName and Password and Click on login button")
public void enter_user_name_and_password_and_click_on_login_button() {
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
    
}


@When("Enter Username as {string} and Password as {string} and Click on login button")
public void enter_username_as_and_password_as_and_click_on_login_button(String username, String password) {
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
   
}
@When("Enter the Username as {string} and the Password as {string}  and Click on login button")
public void enter_the_username_as_and_the_password_as_and_click_on_login_button(String username, String password) {
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
}
@When("Enter Username as  and Password as  and Click on login button")
public void enter_username_as_and_password_as_and_click_on_login_button(DataTable dataTable) {
      List<List<String>>data=dataTable.asLists();
      driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(data.get(0).get(0));
      driver.findElement(By.xpath("//input[@id='password']")).sendKeys(data.get(0).get(1));
    	driver.findElement(By.xpath("//input[@id='login-button']")).click();
}




 @Then("User is logged in")
    public void user_is_logged_in()throws Throwable {
    	String expected_url="https://www.saucedemo.com/inventory.html";
    	Assert.assertEquals(driver.getCurrentUrl(),expected_url);
    	//driver.quit();
   
        
    }
    
    @When("user is on homepage and clicked on any of product")
    public void user_is_on_homepage_and_clicked_on_any_of_product() {
    	driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']")).click();
        
    }
    @When("click on add to cart")
    public void click_on_add_to_cart() {
    	driver.findElement(By.xpath("//button[@name='add-to-cart']")).click();
        
    }
    @When("user clicks on cart link and checkout button")
    public void user_clicks_on_cart_link_and_checkout_button() {
    	driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
    	driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button ']")).click();
       
        
    }
    @When("user enter details and clicked on continue button")
    public void user_enter_details_and_clicked_on_continue_button() {
    	
    	driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("prasad");
    	driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Patil");
    	driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("422228");
    	driver.findElement(By.xpath("//input[@id='continue']")).click();
    	
    }
    @When("user clicks on finish")
    public void user_clicks_on_finish() {
    	driver.findElement(By.xpath("//button[@id='finish']")).click();
        
    }
    @When("Order get placed")
    public void order_get_placed() {
    	String expected_status="Thank you for your order!";
    	String status=driver.findElement(By.xpath("//h2[text()='Thank you for your order!']")).getText();
    	Assert.assertEquals(status,expected_status);
    	
       
    }
    
    @When("Enter Username and Password and Click on login button")
    public void enter_username_and_password_and_click_on_login_button() {
    	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
    	driver.findElement(By.xpath("//input[@id='login-button']")).click();
       
    }
    
    
    @When("click on menu button")
    public void click_on_menu_button() {
    	driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
    	
        
    }
    @When("click on logout button")
    public void click_on_logout_button() {
    	driver.findElement(By.xpath("//a[text()='Logout']")).click();
        
    }
    @Then("user is logout out")
    public void user_is_logout_out() {
    	String expected_url="https://www.saucedemo.com/";
    	Assert.assertEquals(driver.getCurrentUrl(),expected_url);
       
    }
    
    
    
    
    
    
    
    

}

	
    
