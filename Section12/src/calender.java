import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ushan\\Documents\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		//need to select December 23
		driver.findElement(By.xpath("//*[@id=\"travel_date\"]")).click();
		//negation ! 
		while(!driver.findElement(By.xpath("//th[contains(text(),'December 2021')]")).getText().contains("April"))
		{
			driver.findElement(By.xpath("//body[1]/div[7]/div[1]/table[1]/thead[1]/tr[1]/th[3]")).click();
		}
		// while loop is keep on executing until it becomes false 
	
		List<WebElement> list=driver.findElements(By.className("day"));
		
		//Grab the common attribute //put into the list and iterate
		int count=driver.findElements(By.className("day")).size();
		
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		

	}

}
