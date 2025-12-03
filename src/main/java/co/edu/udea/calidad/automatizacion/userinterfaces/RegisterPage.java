package co.edu.udea.calidad.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage {
    public static final Target USERNAME = Target.the("username field").located(By.id("username"));
    public static final Target EMAIL = Target.the("email field").located(By.id("email"));
    public static final Target PASSWORD = Target.the("password field")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("confirm password field")
            .located(By.id("confirmPassword"));

    public static final Target REGISTER_BUTTON = Target.the("register button")
            .located(By.xpath("//button[contains(text(),'Registrarse') or @type='submit']"));
}

