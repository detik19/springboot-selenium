package com.subrutin.selenium.page.nostra;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import com.subrutin.selenium.page.AbstractBasePage;

@Component
public class HomePage extends AbstractBasePage {
	
	@FindBy(xpath = "//*[@id=\"nav-collapse\"]/ul[1]/li[1]/a")
	private WebElement aboutUsMenu;
	

	public void goTo() {
		this.driver.get("https://www.nostratech.com/");
	}
	
	public void clickMenu() {
		this.aboutUsMenu.click();
	}

	@Override
	public boolean isAt() {
		return 	this.wait.until((d)->this.aboutUsMenu.isDisplayed());
	}

}
