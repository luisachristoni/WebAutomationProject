package steps;

import base.Methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import maps.FirstMaps;

public class FirstSteps extends Methods{
	
	FirstMaps firstMaps = new FirstMaps();
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	   navigateToUrl("https://www.google.com.br/");
	}

	@When("I complete action")
	public void i_complete_action() throws InterruptedException {
		escrever(firstMaps.meuElemento(), "Testar");
		Thread.sleep(10000);
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("Cheguei Aqui");
	}
}
