package co.edu.udea.calidad.automatizacion.questions;

import co.edu.udea.calidad.automatizacion.userinterfaces.ProfilePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ProfileCreated implements Question<Boolean> {

    public static ProfileCreated success() {
        return new ProfileCreated();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return ProfilePage.SUCCESS_MESSAGE.resolveFor(actor).isVisible();
    }
}
