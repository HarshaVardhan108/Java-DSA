package Selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement element = driver.findElement(By.className(""));
        System.out.println(element);
        driver.findElement(By.id(""));
        driver.findElement(By.name(""));
        driver.findElement(By.linkText(""));
        driver.findElement(By.tagName(""));
        driver.findElement(By.cssSelector(""));
        driver.findElement(By.xpath(""));
    }
}