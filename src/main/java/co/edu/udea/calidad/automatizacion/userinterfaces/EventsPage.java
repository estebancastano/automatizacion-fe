package co.edu.udea.calidad.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class EventsPage {

    // Botón para marcar un evento como favorito
    // El {0} será reemplazado por el id o nombre del evento
    public static final Target EVENT_FAVORITE_BUTTON = Target.the("Favorite button for event")
            .locatedBy("//div[@data-event-id='{0}']//button[contains(@class,'favorite')]");

    // Opcional: nombre del evento o contenedor de la tarjeta del evento
    public static final Target EVENT_ITEM = Target.the("Event item")
            .locatedBy("//div[@data-event-id='{0}']");
}
