package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		String title = driver.getTitle();
	
		
		if(title.equals("Bus Ticket Booking Online at Cheapest Price with Top Bus Operators- redBus"))
		{
			System.out.println("Welcome page is displayed");
		}else {
			System.out.println("Welcome page is not displayed");
		}
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
		
		System.out.println(title);
		
		
	}

}
