package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import actions_robot.Setup;

public class alert extends Setup{
	@Test
	public void alert() throws InterruptedException {
		driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).submit();

        // Khai báo chuyển hướng đến Alert với đối tượng
        Alert alert = driver.switchTo().alert();

        // Get message trên alert
        String alertMessage = driver.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);
        Thread.sleep(2000);

        // accept() = nhấn Ok button
        // driver.switchTo().alert().accept(); //Cách 1
        alert.accept(); //Cách 2

        //Nhấn Cancel button
        //alert.dismiss();

        Thread.sleep(2000);
	}
	@Test
    public void TestAlert02() throws InterruptedException {
        driver.get("http://demo.automationtesting.in/Alerts.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();
        //button[normalize-space()='click the button to demonstrate the prompt box']
        //Nhấn sendKeys vào ô text
        driver.switchTo().alert().sendKeys("Anh Tester");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
    }
	@Test
	public void TestAlert03() throws InterruptedException {
	    driver.get("https://demoqa.com/alerts");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	    Thread.sleep(500);
	    //Nhấn sendKeys vào ô text
	    driver.switchTo().alert().sendKeys("Anh Tester");
	    Thread.sleep(500);
	    //Nhấn Ok button
	    driver.switchTo().alert().accept();
	    Thread.sleep(1000);
	    //Kiểm tra giá trị sendKeys
	    String value = driver.findElement(By.xpath("//span[@id='promptResult']")).getText();
	    System.out.println(value);
	    Assert.assertTrue(value.contains("Anh Tester"), "Không chứa Text sendKeys");
	    Thread.sleep(2000);
	}
}
