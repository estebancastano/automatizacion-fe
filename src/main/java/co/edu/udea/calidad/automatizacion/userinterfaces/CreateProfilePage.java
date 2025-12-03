package co.edu.udea.calidad.automatizacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CreateProfilePage {
    public static final Target NAME_FIELD = Target.the("name field")
            .located(By.name("nombre"));

    public static final Target AGE_FIELD = Target.the("age field")
            .located(By.name("edad"));

    public static final Target INTERESTS_CHECKBOX = Target.the("interests checkboxes")
            .located(By.xpath("//input[@type='checkbox' and @name='intereses']"));

    public static final Target LOCATION_SELECT = Target.the("location select")
            .located(By.name("ubicacion"));

    public static final Target PHOTO_INPUT = Target.the("photo upload")
            .located(By.xpath("//input[@type='file']"));

    public static final Target BIO_FIELD = Target.the("biography field")
            .located(By.name("biografia"));

    public static final Target SAVE_PROFILE_BUTTON = Target.the("save profile button")
            .located(By.xpath("//button[contains(text(),'Crear perfil')]"));

    // Confirmation: profile header
    public static final Target PROFILE_HEADER = Target.the("profile header name")
            .located(By.xpath("//div[@data-slot='card-title']"));
}
