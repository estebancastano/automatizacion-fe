package co.edu.udea.calidad.automatizacion.tasks;

import co.edu.udea.calidad.automatizacion.userinterfaces.CreateProfilePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SaveProfile implements Task {

    public static SaveProfile info() {
        return instrumented(SaveProfile.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CreateProfilePage.SAVE_PROFILE_BUTTON)
        );
    }
}
