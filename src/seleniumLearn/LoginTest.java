package seleniumLearn;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
    /*
		ArrayList<String> list1 = new ArrayList<String>();
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Sou");
		list2.add("Reddy");
		list2.addAll(list1);
		System.out.println(list2);
		*/
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://smallpdf.com/pdf-to-jpg");
		//Using Sendkeys
		driver.findElement(By.xpath("(//button[@type=\"button\"])[1]")).sendKeys("C:\\Users\\Pallavi\\Downloads\\Capture.png");
		
		driver.findElement(By.xpath("(//button[@type=\"button\"])[1]")).click();
		//using Auto IT 
		Runtime.getRuntime().exec("C:\\Program Files\\FileUpload.exe");
		// Robot class
		StringSelection select = new StringSelection("C:\\Users\\Pallavi\\Downloads\\Capture.png");

        // Copy to clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
        driver.get("https://smallpdf.com/pdf-to-jpg");
		driver.findElement(By.xpath("(//button[@type=\"button\"])[1]")).click();
		
		Robot robot = new Robot();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		
		
 }


	
		

}
