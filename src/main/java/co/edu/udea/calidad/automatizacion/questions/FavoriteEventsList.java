package co.edu.udea.calidad.automatizacion.questions;

import co.edu.udea.calidad.automatizacion.userinterfaces.FavoriteEventsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class FavoriteEventsList implements Question<Boolean> {

    public static FavoriteEventsList visible() {
        return new FavoriteEventsList();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return FavoriteEventsPage.FAVORITE_EVENTS_LIST.resolveFor(actor).isVisible();
    }
}
