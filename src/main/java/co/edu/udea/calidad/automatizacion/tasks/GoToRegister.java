package co.edu.udea.calidad.automatizacion.tasks;

import co.edu.udea.calidad.automatizacion.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class GoToRegister implements Task {
    public static GoToRegister page() { return new GoToRegister(); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.REGISTER_BUTTON)
        );
    }
}

