package selenium;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;


public class PruebaTest {
  private WebDriver driver;

  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }

  @Test
  public void prueba1000() {
    driver.get("http://automationpractice.com/index.php");
    driver.manage().window().setSize(new Dimension(1792, 1120));
    driver.findElement(By.cssSelector("#homefeatured > .ajax_block_product:nth-child(3) .button:nth-child(1) > span")).click();
    driver.findElement(By.cssSelector(".button-medium > span")).click();
    driver.findElement(By.cssSelector(".standard-checkout > span")).click();
    driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
    driver.findElement(By.id("email_create")).click();
    driver.findElement(By.id("email_create")).sendKeys("grupo2devops2020-1@gmail.com");
    driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("#SubmitCreate > span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id("id_gender2")).click();
    driver.findElement(By.id("customer_firstname")).click();
    driver.findElement(By.id("customer_firstname")).sendKeys("grupo");
    driver.findElement(By.id("customer_lastname")).sendKeys("dos");
    driver.findElement(By.id("passwd")).click();
    driver.findElement(By.id("passwd")).sendKeys("6aq@g5Xhu!TW@!D");
    driver.findElement(By.id("days")).click();
    {
      WebElement dropdown = driver.findElement(By.id("days"));
      dropdown.findElement(By.xpath("//option[. = 'regexp:5\\s+']")).click();
    }
    driver.findElement(By.id("months")).click();
    {
      WebElement dropdown = driver.findElement(By.id("months"));
      dropdown.findElement(By.xpath("//option[. = 'regexp:May\\s']")).click();
    }
    driver.findElement(By.id("years")).click();
    {
      WebElement dropdown = driver.findElement(By.id("years"));
      dropdown.findElement(By.xpath("//option[. = 'regexp:1989\\s+']")).click();
    }
    driver.findElement(By.cssSelector(".checkbox:nth-child(8)")).click();
    driver.findElement(By.id("firstname")).click();
    driver.findElement(By.id("address1")).click();
    driver.findElement(By.id("address1")).sendKeys("damian");
    driver.findElement(By.id("city")).click();
    driver.findElement(By.id("city")).sendKeys("santiago");
    driver.findElement(By.cssSelector(".required:nth-child(7)")).click();
    driver.findElement(By.id("id_state")).click();
    {
      WebElement dropdown = driver.findElement(By.id("id_state"));
      dropdown.findElement(By.xpath("//option[. = 'District of Columbia']")).click();
    }
    driver.findElement(By.id("postcode")).click();
    driver.findElement(By.id("postcode")).sendKeys("12345");
    driver.findElement(By.id("other")).click();
    driver.findElement(By.id("phone")).click();
    driver.findElement(By.cssSelector(".required:nth-child(14)")).click();
    driver.findElement(By.id("phone_mobile")).click();
    driver.findElement(By.id("phone_mobile")).sendKeys("56988776655");
    driver.findElement(By.cssSelector(".form-group:nth-child(13)")).click();
    driver.findElement(By.id("alias")).click();
    driver.findElement(By.cssSelector("#submitAccount > span")).click();
    driver.findElement(By.cssSelector(".columns-container")).click();
    driver.findElement(By.cssSelector("html")).click();
    driver.findElement(By.cssSelector(".button:nth-child(4) > span")).click();
    driver.findElement(By.id("cgv")).click();
    driver.findElement(By.cssSelector(".standard-checkout > span")).click();
    driver.findElement(By.linkText("Pay by bank wire (order processing will be longer)")).click();
    driver.findElement(By.cssSelector("#cart_navigation span")).click();
    driver.findElement(By.cssSelector(".footer-container")).click();
    driver.findElement(By.cssSelector(".columns-container")).click();
  }
}
