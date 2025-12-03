package co.edu.udea.calidad.automatizacion.tasks;
import co.edu.udea.calidad.automatizacion.utils.Constants;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.Actor;

public class OpenHome implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(Constants.BASE_URL));
    }
    public static OpenHome open() { return new OpenHome(); }
}
