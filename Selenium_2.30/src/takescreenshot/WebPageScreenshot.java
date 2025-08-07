package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPageScreenshot {
	public static void main(String[] args) throws IOException {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		TakesScreenshot ts=(TakesScreenshot) driver;//type casting -->changing driver interface to Takescreenshot type..
		
		File temp = ts.getScreenshotAs(OutputType.FILE);//TAKING SCREENSHOT AND STORING IT TEMPORILY..
		
		File dest = new File("./screenshots/"+timestamp+".png");//CREATING NEW OBJECT TO STORE THE SCREENSHOT FILE PERMANENTLY
		                                                //HERE (.) indicates projectname ,(/) indicates moving forward ,
		                                              //(screenshot) is the folder name
		FileHandler.copy(temp, dest);
		
	}

}
