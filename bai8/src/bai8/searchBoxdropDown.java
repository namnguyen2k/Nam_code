package bai8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Inititation.Init;

public class searchBoxdropDown extends Init{
	public static void main(String[] args) throws InterruptedException {
        Setup();
        //Actions action=new Actions(driver);
		driver.navigate().to("https://demo.anhtester.com/jquery-dropdown-search-demo.html");
		
		/*WebElement button_choose=driver.findElement(By.id("country"));
		action.moveToElement(button_choose).click().build().perform();
		//button_choose.click();
		WebElement search=driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input[@role='textbox']"));
		search.sendKeys("Japan");*/
		Select select = new Select(driver.findElement(By.id("country")));
        select.selectByValue("Japan");
		System.out.println(select.getAllSelectedOptions().get(0).getText());
        //action.sendKeys(Keys.ENTER);
        System.out.println("done");
        TearDown();
	}
}
