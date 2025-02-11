package org.iitwf.selenium.mmpequinox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PatientApprovalProcess {
	
	static WebDriver driver = new ChromeDriver(ChromePreferences.getChromeOptions());

	public static void main(String[] args) {
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("http://85.209.95.122/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		
		WebElement register = driver.findElement(By.xpath("//input[@value='Register']"));
		register.click();
		
		WebElement fName = driver.findElement(By.name("fname"));
		WebElement lName = driver.findElement(By.name("LastName"));
		WebElement dob = driver.findElement(By.name("dob"));
		WebElement license = driver.findElement(By.name("license"));
		WebElement ssn = driver.findElement(By.name("ssn"));
		WebElement state = driver.findElement(By.name("state"));
		WebElement city = driver.findElement(By.name("city"));
		WebElement address = driver.findElement(By.name("address"));
		WebElement zipcode = driver.findElement(By.name("zipcode"));
		WebElement age = driver.findElement(By.name("age"));
		WebElement height = driver.findElement(By.name("height"));
		WebElement weight = driver.findElement(By.name("weight"));
		WebElement pharmacy = driver.findElement(By.name("pharmacy"));
		WebElement pharmaAdress = driver.findElement(By.name("pharma_adress"));
		WebElement email = driver.findElement(By.name("email"));
		WebElement username = driver.findElement(By.name("username"));
		WebElement pwd = driver.findElement(By.name("pwd1"));
		WebElement confirmPwd = driver.findElement(By.name("pwd2"));
		WebElement securityQ = driver.findElement(By.name("question"));
		WebElement answer = driver.findElement(By.name("answer"));
		WebElement save = driver.findElement(By.name("register"));
		
		String firstName = RandomTextAndNumbergeneration.getRandomFirstName();
		fName.sendKeys(firstName);
		System.out.println(firstName);
		lName.sendKeys(RandomTextAndNumbergeneration.getRandomLastName());
		dob.sendKeys(RandomTextAndNumbergeneration.getRandomDate());
		//license.sendKeys(RandomTextAndNumbergeneration.getLicNumber());
		license.sendKeys("12345678");
		ssn.sendKeys(RandomTextAndNumbergeneration.getSSNNumber());
		state.sendKeys(RandomTextAndNumbergeneration.getRandomState());
		city.sendKeys(RandomTextAndNumbergeneration.getRandomCity());
		address.sendKeys(RandomTextAndNumbergeneration.getRandomAddress());
		zipcode.sendKeys(RandomTextAndNumbergeneration.getRandomZipCode());
		age.sendKeys("45");
		height.sendKeys("175");
		weight.sendKeys("55");
		pharmaAdress.sendKeys(RandomTextAndNumbergeneration.getRandomAddress());
		email.sendKeys(RandomTextAndNumbergeneration.getRandomEmail());
		String userName = RandomTextAndNumbergeneration.getRandomUsername();
		username.sendKeys(userName);
		String password = RandomTextAndNumbergeneration.getRandomPassword(15);
		System.out.println(userName);
		System.out.println(password);
		pwd.sendKeys(password);
		confirmPwd.sendKeys(password);
		RandomTextAndNumbergeneration.selectAndFilterOption1(securityQ, "Select Security Question");
		answer.sendKeys("Testing");
		//Thread.sleep(2000);
		save.click();
		
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		driver.quit();
		
		//LoginTest.login(userName, password);
		
		

	}

}
