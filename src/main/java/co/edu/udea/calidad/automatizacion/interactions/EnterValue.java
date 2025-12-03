package co.edu.udea.calidad.automatizacion.interactions;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.Actor;

public final class EnterValue implements Interaction {
    private final Target target;
    private final String value;

    public EnterValue(Target target, String value){
        this.target = target; this.value = value;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(value).into(target));
    }

    public static EnterValue into(Target target, String value){
        return new EnterValue(target, value);
    }
}

