package com.bosonit.block6simplecontrollers.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SimpleControllerService {

    public SimpleControllerService(@Value("${spring.application.name}") String pepe) {

    }

    public String saludar(String nombre)
    {
        return "Hola " + nombre;
    }
}
