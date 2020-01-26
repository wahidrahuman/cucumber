package org.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tech {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\greens\\drover\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.facebook.com/");
	
}
}
