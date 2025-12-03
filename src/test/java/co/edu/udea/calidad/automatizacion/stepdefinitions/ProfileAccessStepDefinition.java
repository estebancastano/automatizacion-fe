package co.edu.udea.calidad.automatizacion.stepdefinitions;

import co.edu.udea.calidad.automatizacion.models.Credentials;
import co.edu.udea.calidad.automatizacion.tasks.*;
import co.edu.udea.calidad.automatizacion.questions.*;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class ProfileAccessStepDefinition {


    @Given("the user is authenticated on the platform")
    public void authenticated() {
        OnStage.theActorCalled("User").wasAbleTo(OpenHome.open(), Login.with(new Credentials("test@example.com", "123456")));
    }


    @When("the user selects the \"Profile\" option in the main menu")
    public void selectProfileOption() {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenProfile.section());
    }


    @Then("the system displays the user's personal information")
    public void userInfoDisplayed() {
        OnStage.theActorInTheSpotlight().should(seeThat(ProfileInfo.visible()));
    }


    @Then("the \"Favorite Events\" section associated with their profile is visible")
    public void favSectionVisible() {
        OnStage.theActorInTheSpotlight().should(seeThat(FavoriteEventsList.visible()));
    }
}
