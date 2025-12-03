package co.edu.udea.calidad.automatizacion.questions;

import co.edu.udea.calidad.automatizacion.userinterfaces.ProfilePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ProfileInfo implements Question<Boolean> {

    public static ProfileInfo visible() {
        return new ProfileInfo();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return ProfilePage.PROFILE_CONTAINER.resolveFor(actor).isVisible();
    }
}
