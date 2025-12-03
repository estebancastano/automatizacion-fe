package co.edu.udea.calidad.automatizacion.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

import co.edu.udea.calidad.automatizacion.models.Credentials;
import co.edu.udea.calidad.automatizacion.models.RegisterInfo;
import co.edu.udea.calidad.automatizacion.questions.UserDashboard;
import co.edu.udea.calidad.automatizacion.tasks.ConfirmEmail;
import co.edu.udea.calidad.automatizacion.tasks.CreateProfile;
import co.edu.udea.calidad.automatizacion.tasks.GoToRegister;
import co.edu.udea.calidad.automatizacion.tasks.Login;
import co.edu.udea.calidad.automatizacion.tasks.OpenHome;
import co.edu.udea.calidad.automatizacion.tasks.RegisterUser;
import co.edu.udea.calidad.automatizacion.tasks.SaveProfile;
import co.edu.udea.calidad.automatizacion.tasks.TemporaryEmail;
import co.edu.udea.calidad.automatizacion.utils.NameGenerator;
import co.edu.udea.calidad.automatizacion.utils.PasswordGenerator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class ProfileCreationStepDefinition {

    @Given("the user is logged into the platform")
    public void loggedIn() {

        // Datos dinámicos
        String tempEmail = TemporaryEmail.generate();
        String password = PasswordGenerator.generate();
        String name = NameGenerator.generate();

        // Guardar en memoria para otros steps
        OnStage.theActorCalled("User").remember("userEmail", tempEmail);
        OnStage.theActorInTheSpotlight().remember("userPassword", password);
        OnStage.theActorInTheSpotlight().remember("userName", name);

        // Crear objeto RegisterInfo
        RegisterInfo registerInfo = new RegisterInfo(
                tempEmail,
                password,
                password,
                name
        );

        // Flujo de registro
        OnStage.theActorInTheSpotlight().wasAbleTo(
                OpenHome.open(),
                GoToRegister.page(),
                RegisterUser.withData(registerInfo),
                ConfirmEmail.withLinkFrom(tempEmail),
                Login.with(new Credentials(tempEmail, password))
        );
    }

    @When("the user enters their profile information with name, age, location, interests, photo and optional bio")
    public void enterProfileData() {

        String name = OnStage.theActorInTheSpotlight().recall("userName");

        OnStage.theActorInTheSpotlight().attemptsTo(
                CreateProfile.withValidData(
                        name,
                        28,
                        "Medellín",
                        "Programación, Lectura",
                        "FotoDePerfil.jpg",
                        "Opcional bio"
                )
        );
    }

    @When("confirms the registration")
    public void confirmRegistration() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SaveProfile.info()
        );
    }

    @Then("the system saves the information and displays a profile created confirmation message")
    public void profileCreatedConfirmation() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(UserDashboard.isVisible())
        );
    }
}
