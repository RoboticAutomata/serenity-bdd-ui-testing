package starter.pageobjects;

import org.openqa.selenium.By;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://thinking-tester-contact-list.herokuapp.com/login")
public class LoginPage extends PageObject {
    public static final By SIGNUP_BUTTON = By.id("signup");
}
