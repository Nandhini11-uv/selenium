package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment34 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("./TestData/ass-34.properties");
		FileInputStream fis1=new FileInputStream("./TestData/TestScriptData.xlsx");
		
		Properties prop=new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		
		Workbook wb = WorkbookFactory.create(fis1);
		
		String email = wb.getSheet("Signup").getRow(1).getCell(0).getStringCellValue();
		String password = wb.getSheet("Signup").getRow(1).getCell(1).getStringCellValue();
		String firstname = wb.getSheet("Signup").getRow(1).getCell(2).getStringCellValue();
		String username = wb.getSheet("Signup").getRow(1).getCell(3).getStringCellValue();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
	}

}
