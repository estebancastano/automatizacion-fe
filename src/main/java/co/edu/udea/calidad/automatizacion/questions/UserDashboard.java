package co.edu.udea.calidad.automatizacion.questions;

import co.edu.udea.calidad.automatizacion.userinterfaces.DashboardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;

public class UserDashboard implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(DashboardPage.HOME_DASHBOARD_LINK, WebElementStateMatchers.isVisible())
                .forNoMoreThan(10).seconds()
                .performAs(actor);

        return DashboardPage.HOME_DASHBOARD_LINK.resolveFor(actor).isVisible();
    }

    public static UserDashboard isVisible() {
        return new UserDashboard();
    }
}
