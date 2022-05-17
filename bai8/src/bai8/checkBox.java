package bai8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Phong Vu bn\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.anhtester.com/basic-checkbox-demo.html");
		WebElement checkbox_age=driver.findElement(By.id("isAgeSelected"));
		if (checkbox_age.isSelected()==false) 
		{
			System.out.println("Chua duoc chon");
			checkbox_age.click();
			if (checkbox_age.isSelected()==true) System.out.println("Vua chon xong");
			System.out.println(driver.findElement(By.id("txtAge")).getText());
		}
		else {
			System.out.println("Da duoc chon");
			}
        
    }
}
