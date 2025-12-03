package co.edu.udea.calidad.automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ConfirmEmail implements Task {

    private final String email;

    public ConfirmEmail(String email) {
        this.email = email;
    }

    public static ConfirmEmail withLinkFrom(String email) {
        return new ConfirmEmail(email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Aquí iría la lógica para abrir el correo temporal y hacer click en el link de confirmación
        // Para Mailinator o 10minutemail, se puede abrir la web y buscar el mensaje
        System.out.println("Simulando confirmación de email: " + email);
    }
}
