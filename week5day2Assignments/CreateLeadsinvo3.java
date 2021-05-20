package week5day2Assignments;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadsinvo3 extends Baseleads {
	
	 @DataProvider(name = "TestData")
		
		public Object[][] fetchData(){
			String[][]data = new String[2][3];
			
			data[0][0]= "Atina";
			data[0][1]="ANi";
			data[0][2]="NAnu";
					
			data[1][0]= "Atina shop ";
			data[1][1]="ANi 22";
			data[1][2]="NAnu 77";
			return data;
	 }
	
	
    @Test(invocationCount = 3)
	public void createleads() {
    	driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Aspire Systems");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("JK");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("VAN");

		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("ASE");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("04434553");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Chennai");

		driver.findElement(By.className("smallSubmit")).click();
    }
}
    	