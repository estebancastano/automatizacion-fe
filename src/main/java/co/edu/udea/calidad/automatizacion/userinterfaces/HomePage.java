package co.edu.udea.calidad.automatizacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target LOGIN_BUTTON =
            Target.the("login link")
                    .located(By.xpath("//a[contains(text(),'Iniciar sesión')]"));

    public static final Target REGISTER_BUTTON =
            Target.the("register link")
                    .located(By.xpath("//a[contains(text(),'Registrarse')]"));
}
