package com.subrutin.selenium.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;

@Configuration
public class WebDriverConfig {
	
	@Bean
	public WebDriver chromeDriver() {
		WebDriverManager.chromedriver().version("95.0.4638.54").setup();
		return new ChromeDriver();
	}

	@Bean
	public WebDriverWait webDriverWait(WebDriver driver) {
		return new WebDriverWait(driver, 30);
	}
}
