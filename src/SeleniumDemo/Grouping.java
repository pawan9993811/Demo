package SeleniumDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

public class Grouping {
  @Test (groups = { "Car" })
  public void Car1() {
    System.out.println("Batch Car - Test car 1");
  }
  @Test (groups = { "Car" })
  public void Car2() {
    System.out.println("Batch Car - Test car 2");
  }
  @Test (groups = { "bike" })
  public void Scooter1() {
    System.out.println("Batch Scooter - Test bike 1");
  }
  @Test (groups = { "bike" })
  public void Scooter2() {
    System.out.println("Batch Scooter - Test bike  2");
  }
  @Test (groups = { "Car", "Sedan Car" })
  public void Sedan1() {
    System.out.println("Batch Sedan Car - Test sedan 1");
  }
}