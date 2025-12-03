package co.edu.udea.calidad.automatizacion.utils;

import java.util.UUID;

public class PasswordGenerator {
    public static String generate() {
        return "Pwd" + UUID.randomUUID().toString().substring(0,8) + "*";
    }
}