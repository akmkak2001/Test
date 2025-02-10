package org.iitwf.selenium.mmpequinox;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RandomTextAndNumbergeneration {
		
	
	public static void main(String[] args) {
        
    	System.out.println("Random First Name: " + getRandomFirstName());
        System.out.println("Random Last Name: " + getRandomLastName());
        System.out.println("Random Number: " + getRandomNumber());
        System.out.println("Random StreetNumber: " + getRandomStreetNumber());
        System.out.println("Random StreetName: " + getRandomStreetName());
        System.out.println("Random City: " + getRandomCity());
        System.out.println("Random State: " + getRandomState());
        System.out.println("Random ZipCode: " + getRandomZipCode());
        System.out.println("Random Address: " + getRandomAddress());
        System.out.println("Random Email: " + getRandomEmail());
        System.out.println("Random Password: " + getRandomPassword(20));
        System.out.println("Random Phone#: " + getRandomPhoneNumber());
        System.out.println("Random Future Date: " + getFutureDates(1,"MM/dd/YYYY"));
        System.out.println("Random Date: " + getRandomDate());
    }

	    public static String getRandomFirstName() {
	        String randomName = RandomStringUtils.randomAlphabetic(5, 10); // Generates a random alphabetic string of length 5 to 10
	        return "AUTFirstName" + randomName;
	    }
	    
	    public static String getRandomLastName() {
	        String randomName = RandomStringUtils.randomAlphabetic(5, 10); // Generates a random alphabetic string of length 5 to 10
	        return "AUTLastName" + randomName;
	    }
	    
	    public static String getRandomDate()
	    {
	    	Random random = new Random();

	        // Generate a random year between 1900 and 2025
	        int year = 1940 + random.nextInt(60);

	        // Generate a random month between 0 (January) and 11 (December)
	        int month = random.nextInt(12);

	        // Generate a random day within the month
	        Calendar calendar = Calendar.getInstance();
	        calendar.set(year, month, 1);
	        int day = 1 + random.nextInt(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

	        // Set the calendar date
	        calendar.set(year, month, day);

	        // Get the date and format it
	        Date randomDate = calendar.getTime();
	        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	        String formattedDate = dateFormat.format(randomDate);

	        // Print the formatted date
	        System.out.println("Random Date in MM/dd/yyyy format: " + formattedDate);
	        
	        return formattedDate;
	    }
	    
	    public static int getRandomNumber() {
	    	Random random = new Random();
	    	return random.nextInt(10000000) + 1; // Generates a random number between 1 and 10000000
	    }
	    
	    public static int getRandomNumber1(int lBound, int uBound) {
	    	Random random = new Random();
	    	return random.nextInt(uBound) + lBound; // Generates a random number between 1 and 10000000
	    }
	    
	    public static String getSSNNumber() {
	        Random random = new Random();
	        long ssn = 100000000L + random.nextLong(900000000L); // Generates a random number between 1000000000 and 9999999999
	        return String.valueOf(ssn); // Converts the number to a string and returns it
	    }
	    
	    public static String getLicNumber() {
	    	Random random = new Random();
	        int lic = 10000000 + random.nextInt(90000000); // Generates a random number between 10000000 and 99999999
	        return String.valueOf(lic); // Converts the number to a string and returns it
	    	
	    }
	    
	    private static final String[] STREET_NAMES = {
	            "Main St", "Highland Ave", "Elm St", "Maple Ave", "Oak St", "Pine St", "Cedar Ave", "Washington St",
	            "Lincoln Blvd", "Park St", "Church St", "North St", "South St", "East St", "West St", "Center St"
	        };

	    private static final String[] CITIES = {
	            "Springfield", "Riverside", "Franklin", "Greenville", "Fairview", "Madison", "Georgetown", "Clinton",
	            "Centerville", "Kingston", "Salem", "Bristol", "Milford", "Ashland", "Rockville", "Dover"
	        };

	    private static final String[] STATES = {
	            "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS",
	            "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY",
	            "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"
	        };
	    
	    public static int getRandomStreetNumber()
	    {
	    	Random random = new Random();
	        int streetNumber = random.nextInt(10000) + 1; // Generates a random street number between 1 and 10000
	        return streetNumber;     
	    }
	    
	    public static String getRandomStreetName()
	    {
	    	Random random = new Random();
	    	String streetName = STREET_NAMES[random.nextInt(STREET_NAMES.length)];
	    	return streetName;
	    }
	    
	    public static String getRandomCity()
	    {
	    	Random random = new Random();
	    	String city = CITIES[random.nextInt(CITIES.length)];
	    	return city;
	    }
	    
	    public static String getRandomState()
	    {
	    	Random random = new Random();
	    	String state = STATES[random.nextInt(STATES.length)];
	    	return state;
	    }
	    
	    public static String getRandomZipCode()
	    {
	    	Random random = new Random();
	    	int zipCode = random.nextInt(90000) + 10000; // Generates a random 5-digit zip code
	    	return String.valueOf(zipCode);
	    }
	        
	    public static String getRandomAddress() {
	        Random random = new Random();

	        int streetNumber = random.nextInt(10000) + 1; // Generates a random street number between 1 and 10000
	        String streetName = STREET_NAMES[random.nextInt(STREET_NAMES.length)];
	        String city = CITIES[random.nextInt(CITIES.length)];
	        String state = STATES[random.nextInt(STATES.length)];
	        int zipCode = random.nextInt(90000) + 10000; // Generates a random 5-digit zip code

	        //return streetNumber + " " + streetName + ", " + city + ", " + state + " " + zipCode;
	        return streetNumber + " " + streetName ;
	    }
	    
	    public static String getRandomEmail() {
	    	Random random = new Random();
	    	int num = random.nextInt(1000) + 1;
	        String username = RandomStringUtils.randomAlphanumeric(4, 8); // Generates a random alphanumeric string of length 8 to 12
	        String domain = "gmail.com"; 
	        return "AUT_"+ num + username + "@" + domain;
	        //return "AUT_"+ username + "@" + domain;
	    }
	    
	    public static void getRandomHobbies(WebElement hobbies) {
	    
	    	List<WebElement> divs = hobbies.findElements(By.tagName("input"));
	    	Random random = new Random();
	    	
	    	// Generate a random index to select one of the checkboxes 
	    	int randomIndex = random.nextInt(divs.size()); 
	    	WebElement randomCheckbox = divs.get(randomIndex); 
	    	
	    	// Interact with the checkbox (e.g., click it) 
	    	if (randomCheckbox.isDisplayed() && randomCheckbox.isEnabled() && !randomCheckbox.isSelected()) 
	    	{ 
	    		randomCheckbox.click(); 
	    	}
	    	
	    }
	    
	    public static void getRandomValueFromListBox(WebDriver driver, String listBoxId) {
	        
	        // Locate the list box element by its id
	        WebElement listBox = driver.findElement(By.id(listBoxId));

	        // Create a Select object to interact with the list box
	        Select select = new Select(listBox);

	        // Get all options in the list box
	        List<WebElement> options = select.getOptions();

	        // Generate a random index to select a random option
	        Random random = new Random();
	        int randomIndex = random.nextInt(options.size());

	        // Select the random option
	        select.selectByIndex(randomIndex);

	        // Print the selected option
	        //System.out.println("Selected Option: " + options.get(randomIndex).getText());
	    }
	    
	    public static String getRandomUsername() {
	        String randomName = RandomStringUtils.randomAlphabetic(2, 3); // Generates a random alphabetic string of length 5 to 10
	        return "User" + randomName;
	    }
	    
	    public static String getRandomPassword(int length) {
	        // Define the character set for the password
	        String upperCaseChars = RandomStringUtils.random(2, 65, 90, true, true); // Uppercase letters
	        String lowerCaseChars = RandomStringUtils.random(2, 97, 122, true, true); // Lowercase letters
	        String numericChars = RandomStringUtils.randomNumeric(2); // Digits
	        String specialChars = RandomStringUtils.random(4, 33, 47, false, false); // Special characters

	        // Combine all characters
	        String combinedChars = upperCaseChars + lowerCaseChars + numericChars + specialChars;
	        
	        // Generate remaining characters randomly
	        String remainingChars = RandomStringUtils.random(length - combinedChars.length(), true, true);

	        // Combine all parts and shuffle the characters
	        String password = combinedChars + remainingChars;
	        return RandomStringUtils.random(length, password.toCharArray());
	    }
	    
	    public static String getRandomPhoneNumber() 
	    { 
	    	Random random = new Random(); 
	    	int areaCode = random.nextInt(900) + 100; // Generate a random area code (3 digits)
	    	int centralOfficeCode = random.nextInt(900) + 100; // Generate a random central office code (3 digits)
	    	int lineNumber = random.nextInt(9000) + 1000; // Generate a random line number (4 digits)
	    	return String.valueOf(areaCode) + centralOfficeCode + lineNumber;
	    	//return String.format("(%03d) %03d-%04d", areaCode, centralOfficeCode, lineNumber); 
	    }
	    
	    public static String getFutureDates(int numberOfDays, String dateFormatPattern) 
	    {
	        Calendar calendar = Calendar.getInstance();
	        SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatPattern);

	     // Add the specified number of days to the current date 
	        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays); 
	        
	     // Format the future date 
	        return dateFormat.format(calendar.getTime());

	    }
	    
	    
	    public static void selectAndFilterOption(WebElement element, String defaultText) {
	        Select select = new Select(element);
	        List<WebElement> options = select.getOptions();
	        List<String> filteredOptions = new ArrayList<>();
	        
	        for (WebElement option : options) {
	            String optionText = option.getText();
	            if (!optionText.equalsIgnoreCase(defaultText)) {
	                filteredOptions.add(optionText);
	            }
	        }

	        // Randomly select a value
	        Random random = new Random();
	        int randomIndex = random.nextInt(filteredOptions.size());
	        select.selectByIndex(randomIndex);
	    }
	    
	    public static void multiSelectAndFilterOption(WebElement element, int noOfOptions) {
	    	
	        List<WebElement> options = element.findElements(By.tagName("li"));
	        Random random = new Random();
	        
	        for(int i=0;i<noOfOptions;i++)
	        {
	        	
	        	int randomIndex = random.nextInt(options.size());
	        	WebElement option = options.get(randomIndex); 
	        	if (option.isDisplayed() && option.isEnabled())
	        	{
	        		option.click();
	        	}
	        }
	        
	    }   

	}



