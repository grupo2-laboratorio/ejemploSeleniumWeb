package selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    private WebDriver driver;

    @Before
    public void setUp(){
        System.out.println("Iniciando configuración...");
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.google.com");
    }

    @Ignore
    @Test
    public void shouldAnswerWithTrue()
    {
        System.out.println("Iniciando Pruebas...");
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("HandBook Devops");
        searchbox.submit();
        driver.findElement(By.linkText("Imágenes")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Shopping")).click();
        assertEquals("HandBook Devops - Google Shopping", driver.getTitle());
    }

    @Ignore
    @Test
    public void amazonTest()
    {
        driver.navigate().to("https://www.amazon.com");
        System.out.println("Iniciando Pruebas...");
         WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
         searchbox.sendKeys("the phoenex project");
         searchbox.submit();
    }
}
