package stepdefinition;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import mains.CucumberRunner;


public class Homepage extends CucumberRunner {

	@Given("^I am on google page one$")
	public void googlePage() throws Throwable {
		System.out.println("**********************"+driver.getCurrentUrl());

		String title = driver.getTitle();

		Assert.assertEquals(title, "Google");
	}

}
