package example;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import POM.Login;

public class NewTest 
{   
	WebDriver driver;
    Login objlogin;
    String baseUrl = "https://stagingprogramui.azurewebsites.net/";
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\himan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize(); 
		  driver.get(baseUrl);
	}
  @Test
  public  void testone() {
	  
	  objlogin = new Login(driver);
	  
	  objlogin.logintonovus("program@owner.com","Owner@!2019!", "https://stagingprogramui.azurewebsites.net/Dashboard") ;
	 }
  
   public static void main(String args[]) {
	   NewTest n= new NewTest();
	   n.testone();
   }
   }
   

