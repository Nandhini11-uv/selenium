package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// STEP 1: Create FileInputStram object
		FileInputStream fis=new FileInputStream("./TestData/TestScriptData.xlsx");
		
		//STEP 2: CREATE RESPECTIVE FILE TYPE OBJECT
		Workbook wb = WorkbookFactory.create(fis);
		
		//STEP 3: CALL READ METHODS
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
		
		String email = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(email);
       
		String password = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(password);
     
		double price = wb.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(price);
		
       boolean status = wb.getSheet("Sheet1").getRow(1).getCell(4).getBooleanCellValue();
       System.out.println(status);
       
       Date date = wb.getSheet("Sheet1").getRow(1).getCell(5).getDateCellValue();
       System.out.println(date);
       
        LocalDateTime date1 = wb.getSheet("Sheet1").getRow(1).getCell(5).getLocalDateTimeCellValue();
        System.out.println(date1);
        
//        WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//		driver.get(url);
	}

}
        


        


        
        
		
		
		
		
