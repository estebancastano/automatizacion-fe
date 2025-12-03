package co.edu.udea.calidad.automatizacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import co.edu.udea.calidad.automatizacion.userinterfaces.ProfilePage;

public class EventDetails implements Question<Boolean> {

    private String eventId;

    public EventDetails(String eventId) {
        this.eventId = eventId;
    }

    public static EventDetails accessible(String eventId) {
        return new EventDetails(eventId);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return ProfilePage.EVENT_DETAILS_MODAL.resolveFor(actor).isVisible();
    }
}
