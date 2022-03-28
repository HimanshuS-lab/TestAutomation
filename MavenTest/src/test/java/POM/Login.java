
package POM;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class Login 
{
public WebDriver driver;
@FindBy(id= "Input_Email")
@CacheLookup
WebElement Input_Email;
@FindBy(xpath= "//*[@id=\"Input_Password\"]")
@CacheLookup
WebElement pass;
@FindBy(xpath = "//*[@id=\"account\"]/div[2]/div[3]/div[3]/button")
@CacheLookup
WebElement loginbtn;

public Login(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);

}
public void setuser(String UID) {
	System.out.println(UID);
	Input_Email.sendKeys(UID);
	
}
public void setpass(String pas) {
	pass.sendKeys(pas);
}
public void clklog() {
	loginbtn.click();
}
public void gettittle(String Expectedurl) {
	String str= driver.getCurrentUrl();
	assertEquals(str, Expectedurl, "test failed");
}
public void logintonovus(String UID, String pas, String Expectedurl) {
	setuser(UID);
	this.setpass(pas);
	this.clklog();
	this.gettittle(Expectedurl);
}
}
