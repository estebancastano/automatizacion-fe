package co.edu.udea.calidad.automatizacion.tasks;

import co.edu.udea.calidad.automatizacion.userinterfaces.DashboardPage;
import co.edu.udea.calidad.automatizacion.userinterfaces.ProfilePage;
import co.edu.udea.calidad.automatizacion.userinterfaces.FavoriteEventsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenFavoriteEvents implements Task {

    public static OpenFavoriteEvents section() {
        return instrumented(OpenFavoriteEvents.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProfilePage.FAVORITES_TAB)
        );
    }
}
