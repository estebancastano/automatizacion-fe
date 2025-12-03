package co.edu.udea.calidad.automatizacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DashboardPage {
    public static final Target DASHBOARD_TITLE = Target.the("Dashboard title 'Explora eventos'")
            .located(By.xpath("//h1[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'explora eventos')]"));
    public static final Target HOME_DASHBOARD_LINK =
            Target.the("dashboard home link")
                    .located(By.xpath("//a[@href='/dashboard' and contains(text(),'Inicio')]"));
    public static final Target PROFILE_BUTTON = Target.the("my profile button")
            .located(By.xpath("//a[contains(@href,'/account') and contains(text(),'Mi Perfil')]"));
    public static final Target FIRST_EVENT_FAV_BUTTON = Target.the("favorite button on first event")
            .locatedBy("//button[.//svg[contains(@class,'lucide-heart')]][1]");
}
