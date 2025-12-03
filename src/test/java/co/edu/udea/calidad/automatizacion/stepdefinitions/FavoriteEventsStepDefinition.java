package co.edu.udea.calidad.automatizacion.stepdefinitions;

import co.edu.udea.calidad.automatizacion.models.Credentials;
import co.edu.udea.calidad.automatizacion.tasks.*;
import co.edu.udea.calidad.automatizacion.questions.*;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class FavoriteEventsStepDefinition {

    @Given("the user is authenticated and has marked one or more events as favorites")
    public void userHasFavs() {
        OnStage.theActorCalled("User").wasAbleTo(
                OpenHome.open(),
                Login.with(new Credentials("estebin5372@gmail.com", "123456")),
                // Marcar múltiples eventos como favoritos usando sus ids
                MarkEventAsFavorite.withEventIds("event1", "event2", "event3")
        );
    }

    @When("the user accesses their profile and selects the \"Favorite Events\" section")
    public void accessFavSection() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenProfile.section(),
                OpenFavoriteEvents.section() // Hace click en la pestaña de favoritos
        );
    }

    @Then("the system should display the list of events the user has marked as favorites")
    public void listDisplayed() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(FavoriteEventsList.visible()) // Verifica que la lista se muestre
        );
    }

    @Then("allow the user to access detailed information for each event")
    public void eventDetails() {
        // Por ejemplo, verificamos el detalle del primer evento
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenEventDetails.forEvent("event1") // Task para abrir detalles del evento
        );

        OnStage.theActorInTheSpotlight().should(
                seeThat(EventDetails.accessible("event1")) // Question que verifica que el modal se abra
        );
    }
}
