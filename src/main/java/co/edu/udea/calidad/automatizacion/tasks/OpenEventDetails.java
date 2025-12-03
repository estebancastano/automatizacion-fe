package co.edu.udea.calidad.automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import co.edu.udea.calidad.automatizacion.userinterfaces.ProfilePage;

public class OpenEventDetails implements Task {

    private String eventId;

    public OpenEventDetails(String eventId) {
        this.eventId = eventId;
    }

    public static OpenEventDetails forEvent(String eventId) {
        return new OpenEventDetails(eventId);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProfilePage.EVENT_ITEM.of(eventId))
        );
    }
}
