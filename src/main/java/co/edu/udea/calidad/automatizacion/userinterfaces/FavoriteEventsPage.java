package co.edu.udea.calidad.automatizacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FavoriteEventsPage {
    public static final Target FAVORITES_TAB = Target.the("favorites tab")
            .located(By.xpath("//button[contains(@id,'favoritos')]"));

    public static final Target FAVORITE_EVENT_CARD = Target.the("favorite event card")
            .located(By.xpath("//div[contains(@class,'card') or .//h3[contains(text(),'evento')]]"));

    public static final Target VIEW_EVENT_BUTTON = Target.the("view event button")
            .located(By.xpath("//button[contains(text(),'Ver evento')]"));

    public static final Target FAVORITE_EVENTS_LIST =
            Target.the("favorite events list section")
                    .locatedBy("//section[contains(@class,'favorite-events')]");
}
