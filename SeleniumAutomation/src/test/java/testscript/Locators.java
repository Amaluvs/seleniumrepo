package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base
{
public void locatingMethods()
{
	//id
WebElement showMessageButton=driver.findElement(By.id("button-one"));
WebElement showMessageButton1=driver.findElement(By.id("button-two"));
WebElement showMessageButton2=driver.findElement(By.id("single-input-field"));
WebElement showMessageButton3=driver.findElement(By.id("value-a"));
WebElement showMessageButton4=driver.findElement(By.id("value-b"));
//byclassname
WebElement showclass1=driver.findElement(By.className("header-top"));
WebElement showclass2=driver.findElement(By.className("clearfix"));
WebElement showclass3=driver.findElement(By.className("mb-sec"));
WebElement showclass4=driver.findElement(By.className("navbar-brand"));
//name
WebElement name1=driver.findElement(By.name("viewport"));
WebElement name2=driver.findElement(By.name("description"));
WebElement name3=driver.findElement(By.name("keywords"));
WebElement name4=driver.findElement(By.name("author"));

WebElement link1=driver.findElement(By.linkText("Simple Form Demo"));
WebElement link2=driver.findElement(By.linkText("Checkbox Demo"));
WebElement link3=driver.findElement(By.linkText("Radio Buttons Demo"));
WebElement link4=driver.findElement(By.linkText("Select Input"));
WebElement link5=driver.findElement(By.linkText("Form Submit"));

WebElement par=driver.findElement(By.partialLinkText("Simple Form "));
WebElement par1=driver.findElement(By.partialLinkText("Checkbox "));
WebElement par2=driver.findElement(By.partialLinkText("Radio Buttons Demo"));
WebElement par3=driver.findElement(By.partialLinkText("Select Input"));
WebElement par4=driver.findElement(By.partialLinkText("Ajax Form "));


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

WebElement xpathmethodtype1=driver.findElement(By.xpath("//div[@id='message-one']"));
WebElement xpathmethodtype2=driver.findElement(By.xpath("//button[@id='button-two']"));
WebElement xpathmethodtype3=driver.findElement(By.xpath("//input[@id='value-a']"));
WebElement xpathmethodtype4=driver.findElement(By.xpath("//input[@id='value-b'] "));
WebElement xpathmethodtype5=driver.findElement(By.xpath("//div[@id='message-one']"));
WebElement xpathmethodtype6=driver.findElement(By.xpath("//button[@id='button-one']"));

WebElement xpathcontains1=driver.findElement(By.xpath("//button[contains(@id,'button-o')]"));
WebElement xpathcontains2=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')] "));
WebElement xpathcontains3=driver.findElement(By.xpath(" //button[contains(@id,'button-two')]"));
WebElement xpathcontains4=driver.findElement(By.xpath("//div[contains(@class,'header-to')]"));
WebElement xpathcontains5=driver.findElement(By.xpath("//div[contains(@id,'message-o')] "));

WebElement xpathstartswith1=driver.findElement(By.xpath("//button[starts-with(@id,'button-one')]"));
WebElement xpathstartswith2=driver.findElement(By.xpath("//div[starts-with(@id,'message-o')]"));
WebElement xpathstartswith3=driver.findElement(By.xpath("//input[starts-with(@id,'single-input')] "));
WebElement xpathstartswith4=driver.findElement(By.xpath("//div[starts-with(@class,'header-to')] "));
WebElement xpathstartswith5=driver.findElement(By.xpath("//div[contains(@id,'message-o')]"));

WebElement xpathtext1=driver.findElement(By.xpath("//button[text()='Show Message']"));
WebElement xpathtext2=driver.findElement(By.xpath("//button[text()='Get Total']"));
WebElement xpathtext3=driver.findElement(By.xpath(" //label[text()='Enter Message']"));
WebElement xpathtext4=driver.findElement(By.xpath(" //button[text()='Get Total']"));
WebElement xpathtext5=driver.findElement(By.xpath("//button[text()='Show Message']"));

WebElement xpathmethodand1=driver.findElement(By.xpath("//button[text()='Show Message' and @id='button-one']"));
WebElement xpathmethodand2=driver.findElement(By.xpath("//button[text()='Get Total' and @id='button-two']"));
WebElement xpathmethodand3=driver.findElement(By.xpath(" //label[text()='Enter Message' and @for='inputEmail4']"));
WebElement xpathmethodand4=driver.findElement(By.xpath(" //div[text()='Total A + B : NaN' and @id='message-two']"));
WebElement xpathmethodand5=driver.findElement(By.xpath("//button[text()='Show Message' and @ id='button-one']"));


WebElement xpathmethodor1=driver.findElement(By.xpath("//button[text()='Show Message' or @id='button-one']"));
WebElement xpathmethodor2=driver.findElement(By.xpath("//button[text()='Get Total' or @id='button-two']"));
WebElement xpathmethodor3=driver.findElement(By.xpath("//label[text()='Enter Message'or @for='inputEmail4']"));
WebElement xpathmethodor4=driver.findElement(By.xpath(" //div[text()='Total A + B : NaN' or @id='message-two']"));
WebElement xpathmethodor5=driver.findElement(By.xpath("//button[text()='Show Message' or @ id='button-one']"));

//Access methods
WebElement xpathmethodoraccess1=driver.findElement(By.xpath("//button[@id='button-one']/.. "));
WebElement xpathmethodoraccess2=driver.findElement(By.xpath("//div[@id='message-one']/.. "));
WebElement xpathmethodoraccess3=driver.findElement(By.xpath("//button[@id=\"button-two\"]/.."));
WebElement xpathmethodoraccess4=driver.findElement(By.xpath("//div[@id='message-two']/.."));
WebElement xpathmethodoraccess5=driver.findElement(By.xpath(" //input[@id='value-b']/.."));
WebElement xpathmethodoraccess6=driver.findElement(By.xpath(" //input[@id='value-a']/.."));
//child-->parent
WebElement xpathmethodoparent1=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
WebElement xpathmethodoparent2=driver.findElement(By.xpath("//button[@id='button-two']//parent::form"));
WebElement xpathmethodoparent3=driver.findElement(By.xpath("//input[@id='value-a']//parent::div "));
WebElement xpathmethodoparent4=driver.findElement(By.xpath(" //input[@id='single-input-field']//parent::div"));
WebElement xpathmethodoparent5=driver.findElement(By.xpath("//div[@id='message-two']//parent::div "));
WebElement xpathmethodoparent6=driver.findElement(By.xpath("//div[@id='message-one']//parent::div "));
//parent-->child
WebElement xpathmethodchild1=driver.findElement(By.xpath(" //div[@id='collapsibleNavbar']//child::ul "));
WebElement xpathmethodchild2=driver.findElement(By.xpath(" //button[@type='button']//child::span"));
WebElement xpathmethodchild3=driver.findElement(By.xpath("//a[@class='navbar-brand']//child::img"));
WebElement xpathmethodchild4=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul  "));
WebElement xpathmethodchild5=driver.findElement(By.xpath(" "));
WebElement xpathmethodchild6=driver.findElement(By.xpath(" "));
//following sibling
WebElement xpathmethodfollowsibilng1=driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div "));
WebElement xpathmethodfollowsibilng2=driver.findElement(By.xpath("//button[@id='button-two']//following-sibling::div "));
WebElement xpathmethodfollowsibilng3=driver.findElement(By.xpath(" //label[@for='inputEmail4']//following-sibling::input"));
WebElement xpathmethodfollowsibilng4=driver.findElement(By.xpath(" //button[@id='button-two']//following-sibling::div"));
WebElement xpathmethodfollowsibilng5=driver.findElement(By.xpath(" //label[@for='inputEmail4']//following-sibling::input"));
//following
WebElement xpathmethodfollowing1=driver.findElement(By.xpath(" //button[@id='button-one']//following::div[@id='message-one']"));
WebElement xpathmethodfollowing2=driver.findElement(By.xpath(" //button[@id='button-two']//following::div[@class='container']"));
WebElement xpathmethodfollowing3=driver.findElement(By.xpath(" //input[@id='value-a']//following::div[@id='message-two']"));
WebElement xpathmethodfollowing4=driver.findElement(By.xpath(" //input[@id='value-b']//following::div[@class='copyright']"));
WebElement xpathmethodfollowing5=driver.findElement(By.xpath("//div[@id='message-two']//following::div[@class='container'] "));
//preceding
WebElement xpathmethodfollowin1=driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@id='collapsibleNavbar'] "));
WebElement xpathmethodfollowin2=driver.findElement(By.xpath(" //button[@id='button-two']//preceding::div[@id='message-one'] "));
WebElement xpathmethodfollowin3=driver.findElement(By.xpath(" //input[@id='value-a']//preceding::div[@id='collapsibleNavbar']"));
WebElement xpathmethodfollowin4=driver.findElement(By.xpath(" //input[@id='value-b']//preceding::div[@id='message-one']"));
WebElement xpathmethodfollowin5=driver.findElement(By.xpath("//div[@id='message-two']//following::div[@class='container'] "));
//Ancestor
WebElement xpathmethodancestor1=driver.findElement(By.xpath("//input[@id='value-b']//ancestor::div[@class='row'] "));
WebElement xpathmethodancestor2=driver.findElement(By.xpath("//button[@id='button-two']//ancestor::div[@class='example my-3'] "));
WebElement xpathmethodancestor3=driver.findElement(By.xpath("//input[@id='value-a']//ancestor::div[@class='example my-3'] "));
WebElement xpathmethodancestor4=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='example my-3'] "));
WebElement xpathmethodancestor5=driver.findElement(By.xpath(" //input[@id='single-input-field']//ancestor::div[@class='container page']"));
//descendant
WebElement xpathmethodes1=driver.findElement(By.xpath(" //div[@id='collapsibleNavbar']//descendant::ul "));
WebElement xpathmethodes2=driver.findElement(By.xpath(" //button[@type='button']//descendant::span"));
WebElement xpathmethodes3=driver.findElement(By.xpath(" //a[@class='navbar-brand']//child::img"));
//indexing
WebElement xpathmethodes11=driver.findElement(By.xpath(" //div[@id='collapsibleNavbar']//descendant::ul[1] "));
WebElement xpathmethodes22=driver.findElement(By.xpath(" //button[@type='button']//descendant::span[1]"));
WebElement xpathmethodes33=driver.findElement(By.xpath(" //a[@class='navbar-brand']//child::img[1]"));

//
}
	public static void main(String[] args) 
	{
		Locators locators=new Locators();
		locators.initializeBrowser();
		locators.locatingMethods();
        locators.driverQuit();
	}

}
