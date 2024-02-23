package starter.actions;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import java.time.Duration;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.pageobjects.AddUserPage;
import starter.pageobjects.LoginPage;

public class LoginSteps extends UIInteractionSteps {
	LoginPage loginPage;

	@Step("User opens the Contacts List App")
	public void openLoginPage() {
		loginPage.open();
		withTimeoutOf(Duration.ofSeconds(10)).waitFor(presenceOfElementLocated(LoginPage.SIGNUP_BUTTON));
	}

	@Step("User navigates to Add User Page")
	public void signUp() {
		find(loginPage.SIGNUP_BUTTON).click();
		withTimeoutOf(Duration.ofSeconds(10)).waitFor(presenceOfElementLocated(AddUserPage.SUBMIT_BUTTON));
	}

}
