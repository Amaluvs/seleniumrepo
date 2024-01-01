package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base
{
public void locatingMethods()
{
WebElement showMessageButton=driver.findElement(By.id("button-one"));
WebElement showMessageButton1=driver.findElement(By.id("button-two"));
WebElement showMessageButton2=driver.findElement(By.id("single-input-field"));
WebElement showMessageButton3=driver.findElement(By.id("value-a"));
WebElement showMessageButton4=driver.findElement(By.id("value-b"));

WebElement showclass1=driver.findElement(By.className("header-top"));
WebElement showclass2=driver.findElement(By.className("clearfix"));
WebElement showclass3=driver.findElement(By.className("mb-sec"));
WebElement showclass4=driver.findElement(By.className("navbar-brand"));
//WebElement showclass5=driver.findElement(By.className("col-lg-3 col-md-3 col-sm-12 col-xs-12"));

WebElement name1=driver.findElement(By.name("viewport"));
WebElement name2=driver.findElement(By.name("description"));
WebElement name3=driver.findElement(By.name("keywords"));
WebElement name4=driver.findElement(By.name("author"));



WebElement link1=driver.findElement(By.linkText("Simple Form Demo"));
WebElement link2=driver.findElement(By.linkText("Checkbox Demo"));
WebElement link3=driver.findElement(By.linkText("Radio Buttons Demo"));
WebElement link4=driver.findElement(By.linkText("Select Input"));
WebElement link5=driver.findElement(By.linkText("Form Submit"));


//WebElement par=driver.findElement(By.partialLinkText("Simple Form"));
//WebElement par=driver.findElement(By.partialLinkText("Simple Form"));
//WebElement par=driver.findElement(By.partialLinkText("Simple Form"));
//WebElement par=driver.findElement(By.partialLinkText("Simple Form"));
//WebElement par=driver.findElement(By.partialLinkText("Simple Form"));


WebElement cssselector1=driver.findElement(By.cssSelector("button#button-one"));
WebElement cssselector2=driver.findElement(By.cssSelector("div#message-one"));
WebElement cssselector3=driver.findElement(By.cssSelector("button#button-two"));
WebElement cssselector4=driver.findElement(By.cssSelector("div#message-two"));
WebElement cssselector5=driver.findElement(By.cssSelector("input#value-a"));


WebElement cssseletagclass1=driver.findElement(By.cssSelector("div.header-top"));
WebElement cssseletagclass2=driver.findElement(By.cssSelector("button.navbar-toggler"));
WebElement cssseletagclass3=driver.findElement(By.cssSelector("div.mb-sec"));
WebElement cssseletagclass4=driver.findElement(By.cssSelector("div.copyright"));
WebElement cssseletagclass5=driver.findElement(By.cssSelector("section.clearfix"));

//WebElement csssletag=driver.findElement(By.cssSelector(""));*/
}

	public static void main(String[] args) 
	{
		Locators locators=new Locators();
		locators.initializeBrowser();
		locators.locatingMethods();
        locators.driverQuit();
	}

}
