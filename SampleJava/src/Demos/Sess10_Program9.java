/*9. Write a program to get the data from properties file.

// Please refer in another eclipse

package sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sess10_Program9 
{
	public static void main(String[] args) throws InterruptedException
	{
		Properties prop = new Properties();
		InputStream input = null;
		try
		{
		input = new FileInputStream("config.properties");
		prop.load(input);
	    WebDriver driver;
	    System.setProperty("webdriver.chrome.driver","D:\\Selenium Projects\\FirstPracticeProject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(prop.getProperty("url"));
        driver.findElement(By.xpath(prop.getProperty("userIDPath").split(":")[1])).sendKeys(prop.getProperty("userIDValue"));
	    driver.findElement(By.xpath(prop.getProperty("passwordPath"))).sendKeys(prop.getProperty("PasswordValue"));
     	driver.findElement(By.xpath(prop.getProperty("signinPath"))).click();
	    Thread.sleep(6000);
	    driver.close();
		}
		catch (IOException ex) {
	        ex.printStackTrace();
		}
		finally 
		{if (input != null) {
	            try 
	            {
	                input.close();
	            } 
	            catch (IOException e) 
	            {
	                e.printStackTrace();
	            }
	    }}
	}
}*/
package sample;
public class Sess10_Program9 
{
	
}