package The_Sparks_Foundation_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;

public class The_Sparks_Foundation_Class
{
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		// Setting the Web Driver Executable Property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse\\java-2023-03\\eclipse\\drivers\\chromedriver.exe");
		
		// Initiating the Chrome Driver
		WebDriver driver = new ChromeDriver();
		
		// Applying the Implicitly Wait Time
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		// Maximizing the Window
		driver.manage().window().maximize();
		
		// Opening the Desired Browser
		driver.get("https://www.thesparksfoundationsingapore.org/");
		
		////////////////////////////////////////////////// 10 Elements Test //////////////////////////////////////////////////
		
		// Element 1 - Check whether the Title Matches or Not
		if(driver.getTitle().contains("The Sparks Foundation | Home"))
		{
			System.out.println("Title Matches | Test 1 Successful");
		}
		else
		{
			System.out.println("Title Not Matches | Test 1 Failed");
		}
		
		// Element 2 - Check whether the URL Matches or Not
		if(driver.getCurrentUrl().contains("https://www.thesparksfoundationsingapore.org/"))
		{
			System.out.println("URL Matches | Test 2 Successful");
		}
		else
		{
			System.out.println("URL Not Matches | Test 2 Failed");
		}
		
		// Element 3 - Check whether the Navbar Exists or Not
		try
		{
			driver.findElement(By.className("navbar"));
			Thread.sleep(2000);
			System.out.println("Navbar Exists | Test 3 Successful");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Navbar Not Exists | Test 3 Failed");
		}
		
		// Element 4 - Check whether the Page Scrolls Down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 2750)");
		Thread.sleep(2000);
		System.out.println("Scrolled Down | Test 4 Successful");
		
		// Element 5 - Check whether the Page Scrolls Up
		driver.findElement(By.id("toTopHover")).click();
		Thread.sleep(2000);
		System.out.println("Scrolled Up | Test 5 Successful");
		
		// Element 6 - Check whether the AINE AI Exists or Not
		try
		{
			driver.findElement(By.linkText("About Us")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Corporate Partners")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/h3/span")).isEnabled();
			Thread.sleep(2000);
			System.out.println("AINE AI Exists | Test 6 Successful");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("AINE AI Not Exists | Test 6 Failed");
		}
		
		// Element 7 - Check whether the Procedure, Purpose & Scope Exists or Not
		try
		{
			driver.findElement(By.linkText("Policies and Code")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Whistle Blowing Policy")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/h3/span")).isEnabled();
			Thread.sleep(2000);
			System.out.println("Procedure, Purpose & Scope Exists | Test 7 Successful");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Procedure, Purpose & Scope Not Exists | Test 7 Failed");
		}
		
		// Element 8 - Check whether the Helping Children on Urgent Needs Exists or Not
		try
		{
			driver.findElement(By.linkText("Programs")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Student SOS Program")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/h3/span")).isEnabled();
			Thread.sleep(2000);
			System.out.println("Helping Children on Urgent Needs Exists | Test 8 Successful");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Helping Children on Urgent Needs Not Exists | Test 8 Failed");
		}
		
		// Element 9 - Check whether the LINKS (Learning Integration and Knowledge Sharing) Application Exists or Not
		try
		{
			driver.findElement(By.linkText("LINKS")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Salient Features")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/h3/span")).isEnabled();
			Thread.sleep(2000);
			System.out.println("LINKS (Learning Integration and Knowledge Sharing) Application Exists | Test 9 Successful");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("LINKS (Learning Integration and Knowledge Sharing) Application Not Exists | Test 9 Failed");
		}
		
		// Element 10 - Check whether the Be Your Own Boss Exists or Not
		try
		{
			driver.findElement(By.linkText("Join Us")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Why Join Us")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/h3/span")).isEnabled();
			Thread.sleep(2000);
			driver.findElement(By.name("Name")).sendKeys("Pranjul Verma");
			Thread.sleep(2000);
			driver.findElement(By.name("Email")).sendKeys("justmailtopranjul908@gmail.com");
			Thread.sleep(2000);
			Select dropdown = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/form/select")));
			dropdown.selectByVisibleText("Student");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/form/input[3]")).submit();
			Thread.sleep(2000);
			System.out.println("Be Your Own Boss Exists | Test 10 Successful");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Be Your Own Boss Not Exists | Test 10 Failed");
		}
		
		// Back to Home Page
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/h1/a")).click();
		Thread.sleep(2000);
		System.out.println("Back To Home Page Successfully");
		
		////////////////////////////////////////////////// 5 Pages Test //////////////////////////////////////////////////
		
		// Page 1 - Check whether the LinkedIn Page Works or Not
		try
		{
			driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[1]/div[1]/ul/li[2]/a")).click();
			Thread.sleep(2000);
			System.out.println("LinkedIn Page Works | Test 11 Successful");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("LinkedIn Page Not Works | Test 11 Failed");
		}
		
		// Page 2 - Check whether the Xaltius Page Works or Not
		try
		{
			driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[1]/ul/li[1]/a")).click();
			Thread.sleep(2000);
			System.out.println("Xaltius Page Works | Test 12 Successful");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Xaltius Page Not Works | Test 12 Failed");
		}
		
		// Page 3 - Check whether the Jobs at Indeed Portal Page Works or Not
		try
		{
			driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/ul/li[1]/a")).click();
			Thread.sleep(2000);
			System.out.println("Indeed Portal Page Works | Test 13 Successful");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Indeed Portal Page Not Works | Test 13 Failed");
		}
		
		// Page 4 - Check whether the Internships at Internshala Page Works or Not
		try
		{
			driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[3]/ul/li/a")).click();
			Thread.sleep(2000);
			System.out.println("Internships at Internshala Page Works | Test 14 Successful");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Internships at Internshala Page Not Works | Test 14 Failed");
		}
		
		// Page 5 - Check whether the The Sparks Foundation (Global) Page Works or Not
		try
		{
			driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[4]/ul/li[1]/a")).click();
			Thread.sleep(2000);
			System.out.println("The Sparks Foundation (Global) Page Works | Test 15 Successful");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("The Sparks Foundation (Global) Page Not Works | Test 15 Failed");
		}
		
		//Closing the Browser
		driver.close();
	}
}
