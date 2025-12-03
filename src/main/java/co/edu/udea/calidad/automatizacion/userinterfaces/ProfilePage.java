package co.edu.udea.calidad.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProfilePage {

    // Contenedor principal del perfil
    public static final Target PROFILE_CONTAINER = Target.the("profile main container")
            .located(By.xpath("//div[@data-slot='card-header']"));

    // Campos del formulario de creación de perfil
    public static final Target NAME = Target.the("name field")
            .located(By.id("name"));
    public static final Target AGE = Target.the("age field")
            .located(By.id("age"));
    public static final Target LOCATION = Target.the("location field")
            .located(By.id("location"));
    public static final Target INTERESTS = Target.the("interests field")
            .located(By.id("interests"));
    public static final Target BIO = Target.the("bio field")
            .located(By.id("bio"));

    // Botón de subir foto
    public static final Target PHOTO_UPLOAD_BUTTON = Target.the("photo upload button")
            .located(By.id("photoUpload"));

    // Botón de guardar perfil
    public static final Target SAVE_BUTTON = Target.the("save profile button")
            .located(By.id("saveProfile"));

    // Mensaje de éxito
    public static final Target SUCCESS_MESSAGE = Target.the("profile success message")
            .located(By.xpath("//*[contains(text(),'Perfil creado')]"));

    // Pestaña de eventos favoritos (si la necesitas también aquí)
    public static final Target FAVORITES_TAB = Target.the("Favorite Events tab")
            .located(By.id("trigger-favoritos"));

    // Lista de eventos favoritos
    public static final Target FAVORITE_EVENTS_LIST = Target.the("List of favorite events")
            .located(By.cssSelector(".favorite-events-list"));

    // Modal de detalles de evento
    public static final Target EVENT_DETAILS_MODAL = Target.the("Event details modal")
            .located(By.cssSelector(".event-details-modal"));

    public static final Target EVENT_ITEM = Target.the("event item")
            .locatedBy("//div[@data-event-id='{0}']");

}
