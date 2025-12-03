package co.edu.udea.calidad.automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import co.edu.udea.calidad.automatizacion.userinterfaces.EventsPage;

public class MarkEventAsFavorite implements Task {

    private final String[] eventIds;

    // Constructor privado para usar factory method
    private MarkEventAsFavorite(String... eventIds) {
        this.eventIds = eventIds;
    }

    // Factory method para invocar el Task
    public static MarkEventAsFavorite withEventIds(String... eventIds) {
        return new MarkEventAsFavorite(eventIds);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Itera sobre cada id de evento y hace click en su botón de favorito
        for (String id : eventIds) {
            actor.attemptsTo(
                    Click.on(EventsPage.EVENT_FAVORITE_BUTTON.of(id))
            );
        }
    }
}
