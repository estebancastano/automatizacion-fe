package co.edu.udea.calidad.automatizacion.tasks;

import java.util.UUID;

public class TemporaryEmail {

    // Genera un correo temporal aleatorio
    public static String generate() {
        String uniquePart = UUID.randomUUID().toString().replace("-", "");
        return "testuser_" + uniquePart + "@mailinator.com";
    }
}
