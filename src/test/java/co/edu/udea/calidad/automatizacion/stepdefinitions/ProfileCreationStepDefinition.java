package co.edu.udea.calidad.automatizacion.stepdefinitions;

import co.edu.udea.calidad.automatizacion.models.Credentials;
import co.edu.udea.calidad.automatizacion.models.RegisterInfo;
import co.edu.udea.calidad.automatizacion.tasks.*;
import co.edu.udea.calidad.automatizacion.questions.UserDashboard;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ProfileCreationStepDefinition {

    @Given("the user is logged into the platform")
    public void loggedIn() {
        // Generar correo temporal
        String tempEmail = TemporaryEmail.generate();

        // Crear objeto RegisterInfo con los datos del formulario
        RegisterInfo registerInfo = new RegisterInfo(
                tempEmail,
                "Contrasena123*",
                "Contrasena123*",
                "Esteban"
        );

        // Guardamos email y password para los siguientes pasos
        OnStage.theActorCalled("User").remember("userEmail", tempEmail);
        OnStage.theActorInTheSpotlight().remember("userPassword", "Contrasena123*");

        // Flujo de registro + confirmación + login
        OnStage.theActorInTheSpotlight().wasAbleTo(
                OpenHome.open(),
                GoToRegister.page(),
                RegisterUser.withData(registerInfo), // Actualizado para RegisterInfo
                ConfirmEmail.withLinkFrom(tempEmail),
                Login.with(new Credentials(tempEmail, "Contrasena123*"))
        );
    }

    @When("the user enters their profile information with name, age, location, interests, photo and optional bio")
    public void enterProfileData() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CreateProfile.withValidData(
                        "Esteban",
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
                SaveProfile.info() // Task que hace click en el botón guardar
        );
    }

    @Then("the system saves the information and displays a profile created confirmation message")
    public void profileCreatedConfirmation() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(UserDashboard.isVisible()) // Verifica que el dashboard se muestre
        );
    }
}
