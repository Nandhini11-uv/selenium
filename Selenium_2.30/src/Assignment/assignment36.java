package Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.LoginPageAss36;

public class assignment36 {
	public static void main(String[] args) throws IOException {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		FileInputStream fis=new FileInputStream("./TestData/ass-36.properties");
		FileInputStream fis1=new FileInputStream("./TestData/TestScriptData.xlsx");
		
		Properties prop=new Properties();
		prop.load(fis);
		Workbook wb=WorkbookFactory.create(fis1);
		
		String url = prop.getProperty("url");
		
		String usernameTF = wb.getSheet("ass36").getRow(0).getCell(0).getStringCellValue();
		String passwordTF = wb.getSheet("ass36").getRow(0).getCell(1).getStringCellValue();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		
		LoginPageAss36 lp=new LoginPageAss36(driver);
		lp.getUsernameTF().sendKeys(usernameTF);
		lp.getPasswordTF().sendKeys(passwordTF);
		lp.getLoginBtn().click();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/"+timestamp+"ass36.png");
		org.openqa.selenium.io.FileHandler.copy(temp, dest);
		
	}

}
