package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import actions_robot.Setup;

public class popup extends Setup{

	@Test
    public void TestPopup01() throws InterruptedException {
        driver.get("http://demo.guru99.com/popup.php");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

        // Lưu lại lớp window đầu tiên - mã ID hơi dài, in ra sẽ thấy :)
        String MainWindow = driver.getWindowHandle();
        System.out.println(MainWindow);

        // Get all new opened tab Window.
        Set<String> windows = driver.getWindowHandles();

        //Set là một Collection để lưu các phần tử giá trị KHÔNG trùng lặp.
        //Cách duyệt từng phần tử không trùng lặp trong Collection (Set) - Java Basic
        for (String window : windows) {
            System.out.println(window);
            if (!MainWindow.equals(window)) {
                //So sánh nếu thằng nào khác thằng Chính (đầu tiên) thì chuyển hướng qua nó mới thao tác được
                //Switch to Child window
                driver.switchTo().window(window);
                Thread.sleep(2000);
                System.out.println("Đã chuyển đến lớp Window con");

                //Một số hàm hỗ trợ
                System.out.println(driver.switchTo().window(window).getTitle());
                System.out.println(driver.switchTo().window(window).getCurrentUrl());

                driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
                driver.findElement(By.name("btnLogin")).click();
                Thread.sleep(1000);
                //Get text trang sau khi Submit
                System.out.println(driver.findElement(By.xpath("//table//td//h2")).getText());

                // Closing the Child Window.
                Thread.sleep(2000);
                driver.close();
            }
        }
        // Switching to Parent window (Main Window)
        driver.switchTo().window(MainWindow);
        System.out.println("Đã chuyển về lớp Window chính: " + driver.getCurrentUrl());

        Thread.sleep(2000);
    }
}
