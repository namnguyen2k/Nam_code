package bai8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import Inititation.*;

public class dropDown extends Init{
	public static void main(String[] args) throws InterruptedException {
        Setup();
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Phong Vu bn\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();*/
		driver.navigate().to("https://demo.anhtester.com/basic-select-dropdown-demo.html");
		Select select = new Select(driver.findElement(By.id("multi-select")));
        List<WebElement> listOptions=select.getOptions();
        //List<WebElement> listSelected=select.getAllSelectedOptions();
        for (int i=0; i<listOptions.size();i++) {
        	System.out.println(listOptions.get(i).getText());
        }
        System.out.println(select.isMultiple());
        select.selectByIndex(5);
        select.selectByIndex(6);select.selectByIndex(1);
        List<WebElement> listSelected=select.getAllSelectedOptions();
        for (int i=0; i<listSelected.size();i++) {
        	System.out.println(listSelected.get(i).getText());
        }
        TearDown();
    }
	
}
