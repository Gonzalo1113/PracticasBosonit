package com.bosonit.block5properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Block5PropertiesApplication implements CommandLineRunner {

	@Value("${greeting}")
	private String greeting;

	@Value("${my.number}")
	private int myNumber;

	@Value("${new.property: new.property no tiene valor}")
	private String newProperty;

	@Value("${MYURL: No se encontró la variable MYURL}")
	private String myUrl;

	@Value("${MYURL2: NO_tengo_valor}")
	private String myUrl2;

	public static void main(String[] args) {
		SpringApplication.run(Block5PropertiesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("El valor de greeting es: " + greeting);
		System.out.println("El valor de my.number es: " + myNumber);
		System.out.println("El valor de new.property es: " + newProperty);
		System.out.println("El valor de la variable de entorno MYURL es: " + myUrl);
		System.out.println("El valor de la variable de entorno MYURL2 es: " + myUrl2);
	}
}