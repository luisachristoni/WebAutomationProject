package steps;

import base.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Setup {
	Driver driver = new Driver();
	@Before
	public void setup() {
		 driver.incializar();
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	
}
