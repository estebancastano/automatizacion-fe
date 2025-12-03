package co.edu.udea.calidad.automatizacion.utils;

import co.edu.udea.calidad.automatizacion.models.Credentials;
import co.edu.udea.calidad.automatizacion.models.User;

import java.util.UUID;

public class DataFactory {
    public static User randomUser(){
        return new User(
                "user" + UUID.randomUUID().toString().substring(0,5),
                "email" + UUID.randomUUID().toString().substring(0,5) + "@test.com",
                "Password123*"
        );
    }


    public static Credentials validCredentials(){
        return new Credentials("existingemail@test.com", "Password123*");
    }
}
