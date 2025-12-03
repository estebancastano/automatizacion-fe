package co.edu.udea.calidad.automatizacion.stepdefinitions;

import co.edu.udea.calidad.automatizacion.tasks.GoToLogin;
import co.edu.udea.calidad.automatizacion.tasks.Login;
import co.edu.udea.calidad.automatizacion.tasks.OpenHome;
import co.edu.udea.calidad.automatizacion.models.Credentials;
import co.edu.udea.calidad.automatizacion.questions.UserDashboard;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinition {

    @Given("the user is on the website")
    public void theUserIsOnTheWebsite() {
        OnStage.theActorCalled("User").wasAbleTo(OpenHome.open());
    }

    @When("the user logs in with email and password")
    public void theUserLogsIn() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                GoToLogin.page(),
                Login.with(new Credentials("estebin5372@gmail.com", "Contrasena123*"))
        );
    }

    @Then("the user should be redirected to the dashboard")
    public void redirectedToDashboard() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(UserDashboard.isVisible())
        );
    }
}
