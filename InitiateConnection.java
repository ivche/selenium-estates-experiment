package seleniumestatesexperiment;

import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.*;

import com.thoughtworks.selenium.*;
//import org.junit.Before;
public class InitiateConnection {
  public Selenium selenium;
  public WebDriver driver;

  @Before
  public void setup() throws Exception{
	  driver = new FirefoxDriver();
      driver.get("http://www.rightmove.co.uk/property-to-rent/search.html?searchLocation=Waterloo%2C+South+East+London&locationIdentifier=&useLocationIdentifier=false&rent=To+rent");
  }
  @Test
  public void Test() throws Exception{
      // displayPropertyType
      Select select1 = new Select(driver.findElement(By.id("displayPropertyType")));

      select1.selectByVisibleText("Flats / Apartments");
      
      //maxPrice
      Select select2 = new Select(driver.findElement(By.id("maxPrice")));

      select2.selectByVisibleText("2,000 PCM");
      
      //Bedrooms
      Select select3 = new Select(driver.findElement(By.id("minBedrooms")));
      select3.selectByVisibleText("2");
      Select select4 = new Select(driver.findElement(By.id("maxBedrooms")));
      select4.selectByVisibleText("2");
      
      //maxDaysSinceAdded
      Select select5 = new Select(driver.findElement(By.id("maxDaysSinceAdded")));
      select5.selectByVisibleText("Last 24 hours");
      
      driver.manage().window().maximize();
      driver.findElement(By.id("submit")).click();
      
  }
  @After
  public void Close() throws Exception{
      System.out.println("how are you?");
  }

}
