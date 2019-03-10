
package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LogStepDefination{
WebDriver driver;

@Given("^Open FREE CRM Login Page$")
public void open_Free_CRM_Login_Page(){
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
}

@When("^Title of login page is displayed$")
public void title_Of_Login_Page_Is_Displayed(){
String title=driver.getTitle();
System.out.println(title);
//Assert.assertEquals("log in or sign up",title);
}

@Then("^Enter User name and password$")
public void enter_User_Name_And_Password(){
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vallampatlasangeeth@gmail.com");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("swiftsol");
}
@And("^Clicks on Login button$")
public void click_On_Login_button(){
   WebElement loginBtn =driver.findElement(By.xpath("//label[@id='loginbutton']"));
   JavascriptExecutor js=(JavascriptExecutor)driver;
   js.executeScript("arguments[0].click();",loginBtn);
	
	
}

@Then("^User is on home page$")
public void user_Is_On_Home_Page(){
	String title=driver.getTitle();
	System.out.println("FREECRM Home Page Title:"+title);
}


	


}