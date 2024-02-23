package starter.actions;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import java.time.Duration;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.pageobjects.ContactListPage;
import starter.pageobjects.LoginPage;

public class ContactListSteps extends UIInteractionSteps {

	@Step("I log out")
	public void logOut() {
		find(ContactListPage.LOGOUT_BUTTON).click();

		withTimeoutOf(Duration.ofSeconds(10)).waitFor(presenceOfElementLocated(LoginPage.SIGNUP_BUTTON));
	}
}
