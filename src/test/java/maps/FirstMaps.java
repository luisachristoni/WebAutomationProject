package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Driver;

public class FirstMaps extends Driver{

	public WebElement meuElemento() {
		WebElement elemento = driver.findElement(By.name("q"));
		return elemento;
	}
}
