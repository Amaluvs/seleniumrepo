package testscript;

public class NavigationCommands extends Base
{
	public void navigationCommands()
	{
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	}
	public void browserCommands()
	{
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		String pagesource=driver.getPageSource();
		
	}

	public static void main(String[] args) 
	{
		NavigationCommands navigationcommands=new NavigationCommands();
		navigationcommands.initializeBrowser();
		navigationcommands.browserCommands();
		navigationcommands.driverQuit();
	}

}
