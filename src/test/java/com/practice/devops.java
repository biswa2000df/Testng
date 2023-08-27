package com.practice;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class devops {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\browserdrivers\\msedgedriver.exe");
		EdgeOptions opt=new EdgeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(opt);
		driver.get("https://google.com");

	}

}
