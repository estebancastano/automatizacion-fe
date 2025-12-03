package co.edu.udea.calidad.automatizacion.utils;

import java.util.UUID;

public class NameGenerator {
    public static String generate() {
        return "User_" + UUID.randomUUID().toString().substring(0,5);
    }
}