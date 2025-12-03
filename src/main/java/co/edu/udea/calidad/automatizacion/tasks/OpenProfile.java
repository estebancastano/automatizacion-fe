package co.edu.udea.calidad.automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import co.edu.udea.calidad.automatizacion.userinterfaces.DashboardPage;


public class OpenProfile implements Task {
    public static OpenProfile section() { return new OpenProfile(); }
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DashboardPage.PROFILE_BUTTON));
    }
}
