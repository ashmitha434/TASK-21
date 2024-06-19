package org.WindowsandFrames;
	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.safari.SafariDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class IframeTest {
		
		// Set the path to chromedriver.exe
       // System.setProperty("Webdriver.gecko.driver","C:\\Users\\Dell\\Downloads\\geckodriver-v0.34.0-win64.exe");
    
	    public static void main(String[] args) {
	        // Choose the browser you want to use (uncomment the desired browser)
	       
	         WebDriver driver = new FirefoxDriver();
	        

	        // Open browser and navigate to the URL
	        driver.get("https://the-internet.herokuapp.com/iframe");
	    	driver.manage().window().maximize();

	        // Switch to the iframe using css Selector
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("#mce_0_ifr")));
	     
	        // Switching to the body of the iframe
	       // driver.switchTo().frame("mce_0_ifr");

	        // Locate the "p" tag inside the iframe and write the text "Hello People"
	        WebElement paragraph = driver.findElement(By.id("tinymce"));
	        paragraph.clear(); // Clear any existing text
	        paragraph.sendKeys("Hello People");

	        // Switch back to the main content
	        driver.switchTo().defaultContent();

	        // Close the browser
	        driver.close();
	    }
	}





