package qaclickacademy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouseoverTest {

	@Test
	public void mo() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='_3Njdz7']/button")).click();
		Thread.sleep(2000);
		WebElement w=driver.findElement(By.cssSelector("input.LM6RPg"));
		w.click();
		w.sendKeys(Keys.SHIFT,"hello");
		Actions a=new Actions(driver);  //using action calss we can implement the same
		WebElement mOver=driver.findElement(By.cssSelector("div._2aUbKa"));
		a.moveToElement(mOver).build().perform();   //mouseover
		Thread.sleep(5000);
		WebElement mClick=driver.findElement(By.cssSelector("input.LM6RPg"));
		a.moveToElement(mClick).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();//doublclick & capslock
	}
}
