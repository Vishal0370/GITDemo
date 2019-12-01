package qaclickacademy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tablegridTest {
	
		@Test
		public void tab()
		{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22745/ind-vs-rsa-3rd-test-south-africa-tour-of-india-2019");
		int totalScore=0;
		WebElement table=driver.findElement(By.cssSelector("div[id='innings_1'] div:nth-child(1)")); 
		int scores=table.findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']")).size();
		for(int i=1;i<scores;i++)
		{
			String individualScore=table.findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']")).get(i).getText();
			totalScore+=Integer.parseInt(individualScore);
		}
		String extras=table.findElement(By.cssSelector("div[class='cb-col cb-col-8 text-bold cb-text-black text-right']")).getText();
		String total= table.findElement(By.cssSelector("div[class='cb-col cb-col-8 text-bold text-black text-right']")).getText();
		totalScore+=Integer.parseInt(extras);
		int sum=Integer.parseInt(total);
		System.out.println("Total Score : "+totalScore+" sum : "+sum);
		if(sum==totalScore)
		{
			System.out.println("Success.......!");
		}
		System.out.println("GITX updated");
		System.out.println("This is develop branch");
	}

}
