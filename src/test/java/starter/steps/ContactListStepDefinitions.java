package starter.steps;

import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import starter.actions.ContactListSteps;

public class ContactListStepDefinitions {
    @Steps
    ContactListSteps contactList;

	@Then("I log out")
	public void i_log_out() {
	    contactList.logOut();
	}

}
