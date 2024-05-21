package burgerpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class burgerpage 
{
	ChromeDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopify-section-sections--16786515296479__header\"]/div[1]/header/div/div[2]/div[2]/div/div/div[3]/div/div[1]/a")
	WebElement myaccount;
	
	@FindBy(xpath="//*[@id=\"CustomerEmail\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"CustomerPassword\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"customer_login\"]/input[3]")
	WebElement signin;
	
	@FindBy(xpath="//*[@id=\"shopify-section-sections--16786515296479__header\"]/div[1]/header/div/div[2]/div[2]/div/div/div[2]/div/a/img")
	WebElement homepage;
	
	@FindBy(xpath ="//*[@id=\"shopify-section-sections--16786515296479__header\"]/div[1]/header/div/div[2]/div[3]/div/div/div/nav/div/div[2]/a/span")
	WebElement Collections;
	
	@FindBy(xpath ="/html/body/main/div[2]/div/div/div/div[3]/div/div[1]/div/a")
	WebElement sunny;
	
	@FindBy(xpath="//*[@id=\"product-form-template--16786522996959__main-7986656477407\"]/div[2]/div[1]/fieldset/div/span[2]/label")
	WebElement sunnysize;
	
	@FindBy(xpath="//*[@id=\"product-form-template--16786522996959__main-7986656477407\"]/div[3]/button[2]")
	WebElement count;
	
	@FindBy(xpath="//*[@id=\"product-form-template--16786522996959__main-7986656477407\"]/div[5]/div[2]/button")
	WebElement addtocart;
	
	@FindBy(xpath="//*[@id=\"shopify-section-template--16786522341599__main\"]/div/div/div/div[3]/div/div[2]/div/a")
	WebElement selfcare;
	

	@FindBy(xpath="//*[@id=\"product-form-template--16786522996959__main-7986658377951\"]/div[2]/div[1]/fieldset/div/span[4]/label")
	WebElement selfsize;
	
	@FindBy(xpath="//*[@id=\"product-form-template--16786522996959__main-7986658377951\"]/div[5]/div[2]/button")
	WebElement addtocart1;
	
	
	@FindBy(xpath="//*[@id=\"shopify-section-template--16786522341599__main\"]/div/div/div/div[3]/div/div[3]/div/a")
	WebElement dope;
	
	@FindBy(xpath="//*[@id=\"product-form-template--16786522996959__main-7986662605023\"]/div[2]/div[1]/fieldset/div/span[1]/label")
	WebElement dopesize;
	
	@FindBy(xpath="//*[@id=\"product-form-template--16786522996959__main-7986662605023\"]/div[3]/button[2]")
	WebElement dopecount;
	
	@FindBy(xpath="//*[@id=\"product-form-template--16786522996959__main-7986662605023\"]/div[5]/div[2]/button")
	WebElement addtocart2;
	
	@FindBy(xpath="//*[@id=\"drawer-cart\"]/div/div[3]/form/button")
	WebElement checkout;
	
	@FindBy(xpath="//*[@id=\"shopify-section-sections--16786515296479__header\"]/div[1]/header/div/div[2]/div[2]/div/div/div[3]/div/div[3]/a/div")
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"drawer-cart\"]/div/div[3]/form/button")
	WebElement address;
	
	@FindBy(xpath="//*[@id=\"drawer-cart\"]/div/div[3]/form/button")
	WebElement appartment;
	
	@FindBy(xpath="//*[@id=\"drawer-cart\"]/div/div[3]/form/button")
	WebElement city;
	
	
	@FindBy(xpath="//*[@id=\"drawer-cart\"]/div/div[3]/form/button")
	WebElement state;
	
	@FindBy(xpath="//*[@id=\"drawer-cart\"]/div/div[3]/form/button")
	WebElement pincode;
	
	@FindBy(xpath="//*[@id=\"drawer-cart\"]/div/div[3]/form/button")
	WebElement phonenumber;
	
	@FindBy(xpath="//*[@id=\"drawer-cart\"]/div/div[3]/form/button")
	WebElement check;
	
	@FindBy(xpath="//*[@id=\"drawer-cart\"]/div/div[3]/form/button")
	WebElement shippingadress;
	
	@FindBy(xpath="//*[@id=\"drawer-cart\"]/div/div[3]/form/button")
	WebElement checkout1;
	
	
	
	public burgerpage(ChromeDriver driver ) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void myaccountlink()
	{
		myaccount.click();
	}

	public void setvalues(String emailid, String pswd) 
	{
	email.sendKeys(emailid);
	password.sendKeys(pswd);
		
	}
	
	public void back()
	{
		driver.navigate().back();
	}
	
	public void homepage()
	{
		homepage.click();
	}

	public void signin()
	{
		signin.click();
	}
	
	public void trixie() 
	{
	sunny.click();
	}
	
	public void sunny()
	{
	sunnysize.click();
	}
	
	public void countplus()
	{
	count.click();	
	}
	
	public void addtocart()
	{
		addtocart.submit();
		
	}
	
	public void selfcare()
	{
	selfcare.click();	
	}
	
	public void self()
	{
		selfsize.click();
	}
	
	public void addtocart1()
	{
		addtocart1.submit();
	}
	
	public void dope()
	{
	dope.click();	
	}
	
	public void dopesize()
	{
		dopesize.click();
	}
	
	public void dopecount()
	{
	dopecount.click();
	}
	
	public void addtocart2()
	{
	addtocart2.submit();	
	}
	
	public void cart()
	{
		cart.click();
	}
	
	public void checkout()
	{
	checkout.click();
	}


}
