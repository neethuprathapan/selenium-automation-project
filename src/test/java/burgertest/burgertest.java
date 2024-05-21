package burgertest;

import java.time.Duration;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import burgerbase.burgerbase;
import burgerexcelutilities.burgerutils;
import burgerpage.burgerpage;


public class burgertest extends burgerbase
{
	@Test(priority = 1)
	public void gotologin()
	{
		burgerpage b = new burgerpage(driver);
	    b.myaccountlink();
	}
	
	@Test(priority = 2)
	public void verifyLoginWithValidCred () throws Exception

	{
	          burgerpage b = new burgerpage(driver);

	// Reading the data from excel file by the specified path
                String xl = "C:\\Users\\neethu321\\OneDrive\\Desktop\\burgerbae.xlsx";
                String Sheet = "Sheet1";
	            int rowCount = burgerutils.getRowCount(xl, Sheet);
	            for (int i=1;i<=rowCount;i++)
	            {
	                  String UserName=burgerutils.getCellValue(xl, Sheet, i, 0);
                      System.out.println("username---"+UserName);
	                  String Pwd=burgerutils.getCellValue(xl, Sheet, i, 1);
                      System.out.println("password---"+Pwd);
                  
                    
                      
                      b.setvalues(UserName, Pwd);
                      b.signin();
                      
	            }
	}
	
	@Test(priority = 3)
	public void maintest() throws Exception
	{
		burgerpage b = new burgerpage(driver);
		b.homepage();
		Thread.sleep(3000);
		//b.back();
	}
	
	
	
	@Test(priority = 4)
	public void collections()
	{
		burgerpage b = new burgerpage(driver);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement we=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16786515296479__header\"]/div[1]/header/div/div[2]/div[3]/div/div/div/nav/div/div[2]/a/span"));
		Actions act=new Actions(driver);
		act.moveToElement(we).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dropdown-4161f80a97935ead0e7aafdb80608b60\"]/div/div/a[6]/span"))).click();
		b.trixie();
		}
	
	@Test(priority = 5)
	public void sunnybrand() throws Exception
	{
		burgerpage b = new burgerpage(driver);
		b.sunny();
		b.countplus();
		Thread.sleep(2000);
		b.addtocart();
		Thread.sleep(2000);
		b.back();
		Thread.sleep(2000);
		b.back();
	}
	@Test(priority = 6)
     public void selfcarebrand() throws Exception
     {
		burgerpage b = new burgerpage(driver);
		b.selfcare();
		Thread.sleep(2000);
		b.self();
	    b.addtocart1();
		Thread.sleep(2000);
		b.back();
		Thread.sleep(2000);
		b.back();
     }
	
	@Test(priority = 7)
	public void dopebrand() throws Exception
	{
		burgerpage b = new burgerpage(driver);
		b.dope();
		Thread.sleep(2000);
		b.dopesize();
		b.dopecount();
		b.addtocart2();
		Thread.sleep(2000);
		b.back();
		Thread.sleep(2000);
		b.back();
	}
	
	@Test(priority = 8)
	public void cart()
	{
		burgerpage b = new burgerpage(driver);
		b.cart();
		b.checkout();
	}
	
	}

