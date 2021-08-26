package com.SeleniumConceptBatch76.SeleniumConcept;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicProgram  {
	public static void main(String[] args) throws InterruptedException {

		/*
		 * For Chrome Driver Using Automation	  
		 */
		String projectPath=System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);

		System.setProperty("webdriver.chrome.driver","A:/Automation/Selenium/SeleniumConcept/Driver/Chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();	   
		driver.get("https://www.google.com/"); //open the website
		System.out.println(" Title : "+driver.getTitle());
		driver.navigate().to("https://www.youtube.com/"); // navigate the website
		System.out.println(" Title : "+driver.getTitle()); //return title name
		driver.manage().window().maximize(); //Maximize tab in chrome
		System.out.println(" Current Url : "+driver.getCurrentUrl()); //return Current url
		//System.out.println(driver.getPageSource()); //prtin the page source code
		driver.close(); //close current page
		driver.quit(); // close all page

		/*
		 * For FireFox Driver Using Automation	   
		 */
		System.setProperty("webdriver.gecko.driver","A:/Automation/Selenium/SeleniumConcept/Driver/FirefoxDriver/geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();;
		driver1.get("https://www.facebook.com/");
		Thread.sleep(5000);
		System.out.println(" Title : "+driver1.getTitle());
		driver1.manage().window().maximize(); 
		System.out.println(" Current Url : "+driver1.getCurrentUrl()); 
		//System.out.println(driver.getPageSource()); 
		driver1.close(); 
		driver1.quit(); 


	}
}