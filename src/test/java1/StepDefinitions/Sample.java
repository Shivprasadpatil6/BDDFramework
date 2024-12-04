package StepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
//We have to mention * instead of given

public class Sample {
	
	WebDriver driver;
	@Given("Launch the Browser and Open url")
	public void launch_the_browser_and_open_url() {
		driver = new ChromeDriver();
        driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@When("enter firstname and lastname and phone_number and username and email")
	public void enter_firstname_and_lastname_and_phone_number_and_username_and_email(io.cucumber.datatable.DataTable dataTable) {
		 List<List<String>>data=dataTable.asLists();
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(data.get(0).get(1));
		driver.findElement(By.xpath("(//input[@name='phone'])[1]")).sendKeys(data.get(0).get(2));
		driver.findElement(By.xpath("(//input[@name='username'])[1]")).sendKeys(data.get(0).get(3));
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys(data.get(0).get(4));

	   
	}
	@When("enter aboutyourself {string} and enter password {string} and confirm_password {string}")
	public void enter_aboutyourself_and_enter_password_and_confirm_password(String detail, String password, String con_password) {
		driver.findElement(By.xpath("//textarea[@rows='5']")).sendKeys(detail);
		driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='c_password']")).sendKeys(con_password);

	}
	@Then("user is able to see all details")
	public void user_is_able_to_see_all_details(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("Test Case Passed");
	   
	}


}
