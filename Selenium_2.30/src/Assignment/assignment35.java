package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.RegisterPage;
import pom.WelcomePageass35;

public class assignment35 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		FileInputStream fis=new FileInputStream("./TestData/commondata.properties");
		FileInputStream fis1=new FileInputStream("./TestData/TestScriptData.xlsx");
		
		Properties prop=new Properties();
		prop.load(fis);
		Workbook wb=WorkbookFactory.create(fis1);
		
		String url = prop.getProperty("url");
		
		String firstname = wb.getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
		String lastname = wb.getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
		String email = wb.getSheet("Sheet2").getRow(1).getCell(2).getStringCellValue();
		String password = wb.getSheet("Sheet2").getRow(1).getCell(3).getStringCellValue();
		String confirmpassword = wb.getSheet("Sheet2").getRow(1).getCell(4).getStringCellValue();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		
		WelcomePageass35 wp=new WelcomePageass35(driver);
		wp.getRegisterLink().click();
		
	    RegisterPage rp=new RegisterPage(driver);
	    rp.getFirstnameTf().sendKeys(firstname);
	    rp.getLastnameTf().sendKeys(lastname);
	    rp.getEmailTf().sendKeys(email);
	    rp.getPasswordTf().sendKeys(password);
	    rp.getConfirmpasswordTf().sendKeys(confirmpassword);
		
		
		
	}
}	
	


