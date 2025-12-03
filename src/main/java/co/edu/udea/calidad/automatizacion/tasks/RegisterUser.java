package co.edu.udea.calidad.automatizacion.tasks;

import co.edu.udea.calidad.automatizacion.models.RegisterInfo;
import co.edu.udea.calidad.automatizacion.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegisterUser implements Task {

    private final RegisterInfo registerInfo;

    public RegisterUser(RegisterInfo registerInfo) {
        this.registerInfo = registerInfo;
    }

    public static RegisterUser withData(RegisterInfo registerInfo) {
        return new RegisterUser(registerInfo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(RegisterPage.USERNAME, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(registerInfo.getUsername()).into(RegisterPage.USERNAME),
                Enter.theValue(registerInfo.getEmail()).into(RegisterPage.EMAIL),
                Enter.theValue(registerInfo.getPassword()).into(RegisterPage.PASSWORD),
                Enter.theValue(registerInfo.getConfirmPassword()).into(RegisterPage.CONFIRM_PASSWORD),
                WaitUntil.the(RegisterPage.REGISTER_BUTTON, isEnabled()).forNoMoreThan(10).seconds(),
                Scroll.to(RegisterPage.REGISTER_BUTTON),
                Click.on(RegisterPage.REGISTER_BUTTON)
        );
    }
}
