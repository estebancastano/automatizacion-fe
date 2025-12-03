package co.edu.udea.calidad.automatizacion.tasks;

import co.edu.udea.calidad.automatizacion.interactions.ClickOn;
import co.edu.udea.calidad.automatizacion.interactions.EnterValue;
import co.edu.udea.calidad.automatizacion.models.Credentials;
import co.edu.udea.calidad.automatizacion.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Login implements Task {
    private final Credentials credentials;


    public Login(Credentials credentials){ this.credentials = credentials; }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterValue.into(LoginPage.EMAIL, credentials.getEmail()),
                EnterValue.into(LoginPage.PASSWORD, credentials.getPassword()),
                ClickOn.the(LoginPage.LOGIN_BUTTON)
        );
    }


    public static Login with(Credentials credentials){ return new Login(credentials); }
}
