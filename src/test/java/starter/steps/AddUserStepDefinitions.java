package starter.steps;

import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;
import starter.actions.AddUserSteps;
import starter.actions.LoginSteps;

public class AddUserStepDefinitions {

	@Steps
	LoginSteps login;

	@Steps
	AddUserSteps addUser;

	@Given("I create a new user")
	public void i_create_a_new_user() {
		login.signUp();
		addUser.createNewUser();
	}

}
