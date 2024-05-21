package burgerbase;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class burgerbase 
{

	public static ChromeDriver driver;
	String baseurl="https://www.burgerbaeclothing.com/";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}

}
