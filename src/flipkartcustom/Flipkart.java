package flipkartcustom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	static WebDriver driver;
	 public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Balaji\\work space\\customdefined\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
   driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("mobile",Keys.ENTER);
   gottophone("Samsung ");
   

	 }
	 public  static void gottophone(String phone) throws Exception {
		 String locator = "//div[contains(text(),'$')]";
		 locator = locator.replace("$", phone);
		 Thread.sleep(2000);
	driver.findElement(By.xpath(locator)).click();
	 
}
}