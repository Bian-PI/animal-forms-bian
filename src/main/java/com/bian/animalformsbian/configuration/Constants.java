package com.bian.animalformsbian.configuration;

public class Constants {
    private Constants() {
        throw new IllegalStateException("Utility class");
    }

    public static final String RESPONSE_ERROR_MESSAGE_KEY = "error";
    public static final String RESPONSE_MESSAGE_KEY = "message";

    public static final String NO_DATA_FOUND_MESSAGE = "Registros no encontrados.";
    public static final String REPORT_CREATED_MESSAGE = "Registro creado correctamente.";
    public static final String ROLE_NOT_ALLOWED_MESSAGE = "No tiene permisos de administrador.";
}
