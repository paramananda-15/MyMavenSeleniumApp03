package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");

        try { Thread.sleep(3000); } catch (InterruptedException e) {}

        // Click Login/Signup
        driver.findElement(By.linkText("Signup / Login")).click();

        try { Thread.sleep(3000); } catch (InterruptedException e) {}

        // Enter email
        driver.findElement(By.name("email")).sendKeys("test@example.com");

        // Enter password
        driver.findElement(By.name("password")).sendKeys("test123");

        try { Thread.sleep(2000); } catch (InterruptedException e) {}

        // Click login button
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        try { Thread.sleep(5000); } catch (InterruptedException e) {}

        System.out.println("Page Title: " + driver.getTitle());

        driver.quit();
    }
}
