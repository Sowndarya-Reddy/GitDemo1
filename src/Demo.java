import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:\\SOWNDARYA\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http//google.com");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.close();



	}

}
