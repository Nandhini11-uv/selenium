package dataProvider;

import org.testng.annotations.DataProvider;

public class dataStorageass41 {
	@DataProvider
	public String[][] dataSender1() {
		
		String[][] data= {{"virat","kohli","virat18@gmail.com","virat@18","virat@18"},{"ms","dhoni","dhoni18@gmail.com","dhoni@18","dhoni@18"},{"rohit","sharma","rohit18@gmail.com","rohit@18","rohit@18"}};
		return data;
	}

}
