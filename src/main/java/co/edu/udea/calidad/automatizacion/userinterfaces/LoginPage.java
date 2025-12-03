package co.edu.udea.calidad.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target EMAIL = Target.the("email field").located(By.id("email"));
    public static final Target PASSWORD = Target.the("password field").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("login button")
            .located(By.xpath("//button[contains(text(), 'Iniciar sesión') or @type='submit']"));

    // Element visible ONLY if login succeeds
    public static final Target PROFILE_LINK = Target.the("profile link")
            .located(By.xpath("//a[contains(@href,'/account')]"));}
