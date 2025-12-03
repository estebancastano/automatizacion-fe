package co.edu.udea.calidad.automatizacion.tasks;

import co.edu.udea.calidad.automatizacion.userinterfaces.ProfilePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

public class CreateProfile implements Task {

    private String name;
    private int age;
    private String location;
    private String interests;
    private String photo;
    private String bio;

    public CreateProfile(String name, int age, String location, String interests, String photo, String bio) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.interests = interests;
        this.photo = photo;
        this.bio = bio;
    }

    public static CreateProfile withValidData(String name, int age, String location, String interests, String photo, String bio) {
        return new CreateProfile(name, age, location, interests, photo, bio);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(ProfilePage.NAME),
                Enter.theValue(String.valueOf(age)).into(ProfilePage.AGE),
                Enter.theValue(location).into(ProfilePage.LOCATION),
                Enter.theValue(interests).into(ProfilePage.INTERESTS),
                Click.on(ProfilePage.PHOTO_UPLOAD_BUTTON),
                Enter.theValue(bio).into(ProfilePage.BIO),
                Click.on(ProfilePage.SAVE_BUTTON)
        );
    }
}
