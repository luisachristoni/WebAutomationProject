package base;

import org.openqa.selenium.WebElement;

public class Methods extends Driver{

	public void navigateToUrl(String url) {
		driver.get(url);
	}
	
	public void escrever(WebElement elemento, String input) throws InterruptedException {
		elemento.sendKeys(input);
	}
}
