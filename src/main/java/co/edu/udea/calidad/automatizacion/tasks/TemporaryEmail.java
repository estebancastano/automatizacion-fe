package co.edu.udea.calidad.automatizacion.tasks;

import java.util.Random;
import java.util.UUID;

public class TemporaryEmail {

    private static final String BASE = "alesarasti";
    private static final Random random = new Random();

    public static String generate() {
        // Insertar puntos aleatorios
        StringBuilder dotted = new StringBuilder();
        for (char c : BASE.toCharArray()) {
            dotted.append(c);
            if (random.nextInt(3) == 0) { // 1 de cada 3 caracteres con punto
                dotted.append(".");
            }
        }

        // Añadir sufijo único
        String uuid = UUID.randomUUID().toString().substring(0, 8);

        return dotted + "+" + uuid + "@gmail.com";
    }
}