package bai1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class location {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Phong Vu bn\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(2000);
		
		//System.out.println(driver.getTitle());
		
		//driver.findElement(By.xpath("//span[@class='kt-info-svg-icon kt-info-svg-icon-fe_star']//*[name()='svg']")).click();//sendKeys("nam123");
		WebElement password=driver.findElement(By.name("txtPassword"));
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		WebElement submit=driver.findElement(By.xpath("//input[@id='btnLogin']"));
		password.sendKeys("admin123");
		username.sendKeys("Admin");
		submit.submit();
	}
}
