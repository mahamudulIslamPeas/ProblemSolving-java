package seleniumAutomate;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
@SuppressWarnings("unused")
public class AutoMate
{
	public static void main(String[] args) {
//		WebDriver firefoxDriver = new FirefoxDriver();
//		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriverManager.edgedriver().setup();
		WebDriver driver = new ChromeDriver();
		ChromeOptions corsResolved = new ChromeOptions();
		corsResolved.addArguments("--remote--allow-origins");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println("The Title of the Page:" + driver.getTitle());
		
		WebElement staticDropDown = driver.findElement(By.cssSelector("select[name=\'ctl00$mainContent$DropDownListCurrency\']"));
		Select  dropdown = new Select(staticDropDown);
		System.out.println(dropdown.getAllSelectedOptions());
		dropdown.selectByIndex(1);
		String dropDownAssertManually = dropdown.getFirstSelectedOption().toString();
		if (dropDownAssertManually == "INR") {
			System.out.println("DropDown Selected Successfully");
		}
		else {
			System.out.println("DropDown Selection failed");
		}
		
		driver.close();
	
	}
	
}