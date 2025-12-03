package co.edu.udea.calidad.automatizacion.tasks;

import co.edu.udea.calidad.automatizacion.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class GoToLogin implements Task {
    public static GoToLogin page() { return new GoToLogin(); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.LOGIN_BUTTON)
        );
    }
}

