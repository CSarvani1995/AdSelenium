package Programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws IOException {
		
		
		String Key="webdriver.driver.chrome";
		String Value="C:\\Selenium\\chromedriver_win32";
		System.setProperty(Key, Value);
		
		WebDriver driver=new ChromeDriver();
		
		FileInputStream fis=new FileInputStream("./src/test/resources/commondata.properties.txt");
		Properties pro=new Properties();
		pro.load(fis); 
		String URL =pro.getProperty("url");
		
		driver.get(URL);
		//pushed
		//2nd pushed

		
		
	}

}
