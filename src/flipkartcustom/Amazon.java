package flipkartcustom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Balaji\\\\work space\\\\customdefined\\\\driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		
		driver.findElement(By.xpath("//span[text()='4 Stars & Up']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'₹5,000 - ₹10,000')]")).click();
		getbook("Samsung On7 Pro (Black, 2GB RAM, 16GB Storage)");

	}

	public static void getbook(String mob) throws Throwable  {

		String locator = "//h2[contains(text(),'$')]";
		locator = locator.replace("$", mob);
		driver.findElement(By.xpath(locator)).click();
		//Thread.sleep(3000);
		//driver.findElement(By.id("add-to-cart-button")).click();

	}

}
