package alert_handlingpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\deute\\OneDrive\\Documents\\SOFTWARE TESTING\\selenium automation\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/javascript4.htm");
		
		//OK button : accept()
		driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/table[1]/tbody/tr/td/input[1]")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	
		//cancel button : dismiss()
		driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/table[1]/tbody/tr/td/input[2]")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		
		//send data : sendKeys()
		driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/table[1]/tbody/tr/td/input[3]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("abc");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		

	}

}
