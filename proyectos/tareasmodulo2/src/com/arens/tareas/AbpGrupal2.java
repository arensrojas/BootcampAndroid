package com.arens.tareas;

import java.util.Arrays;
import java.util.Scanner;

public class AbpGrupal2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("		BIENVENIDO A INGRESO DE CAPACITACIONES");
		System.out.println(" ");
		System.out.println("	Datos de la capacitacion");
		System.out.println(" ");
		System.out.println("Ingrese nombre de la capacitacion:");

		String nameCap, dateCap, timeCap, placeCap, lengthCap;
		int quantCap;
		String nameClient, rutClient, adressClient, comunaClient, phoneClient;

		nameCap = entrada.nextLine();

		if (nameCap.isEmpty()) {

			System.out.println(" ");
			System.out.println("Error. Campo obligatorio");
			System.out.println("Ingrese nombre de la capacitacion:");
			nameCap = entrada.nextLine();
		}

		else {
			
			
			System.out.println(" ");
			System.out.println(" Capacitacion: " + nameCap);
			System.out.println(" ");
			System.out.println("Ingrese fecha:");
		}
		dateCap = entrada.nextLine();

		if (dateCap.isEmpty()) {
			System.out.println(" ");
			System.out.println("Error. Campo obligatorio");
			System.out.println("Ingrese fecha");
			dateCap = entrada.nextLine();

		} else {
			System.out.println(" ");
			System.out.println("Fecha: " + dateCap);
			System.out.println(" ");
			System.out.println("Ingrese hora:");
		}
		timeCap = entrada.nextLine();

		if (timeCap.isEmpty()) {
			System.out.println(" ");
			System.out.println("Error. Campo obligatorio");
			System.out.println("Ingrese hora:");
			timeCap = entrada.nextLine();

		} else {
			System.out.println(" ");
			System.out.println("Hora: " + timeCap);
			System.out.println(" ");
			System.out.println("Ingrese lugar:");
		}
		placeCap = entrada.nextLine();

		if (placeCap.isEmpty()) {
			System.out.println(" ");
			System.out.println("Error. Campo obligatorio");
			System.out.println("Ingrese lugar:");
			placeCap = entrada.nextLine();

		} else {
			System.out.println(" ");
			System.out.println("Lugar: " + placeCap);
			System.out.println(" ");
			System.out.println("Ingrese duracion:");
		}
		lengthCap = entrada.nextLine();

		if (lengthCap.isEmpty()) {
			System.out.println(" ");
			System.out.println("Error. Campo obligatorio");
			System.out.println("Ingrese duracion:");
			lengthCap = entrada.nextLine();

			
		} else {
			System.out.println(" ");
			System.out.println("Duracion: " + lengthCap);
			System.out.println(" ");
			System.out.println("Ingrese cantidad de asistentes:");
		}
		quantCap = entrada.nextInt();

		if (quantCap == 0) {
			System.out.println(" ");
			System.out.println("Error. Campo obligatorio");
			System.out.println("Ingrese cantidad de asistentes:");
			quantCap = entrada.nextInt();

		} else {

			System.out.println(" ");
			System.out.println("Cantidad de asistentes: " + quantCap);
			System.out.println(" ");
			System.out.println("DATOS DE CAPACITACION ");
			System.out.println(" ");
			System.out.println("Nombre: " + nameCap);
			System.out.println("Fecha: " + dateCap);
			System.out.println("Hora " + timeCap);
			System.out.println("Lugar: " + placeCap);
			System.out.println("Duracion: " + lengthCap);
			System.out.println("Cantidad de asistentes " + quantCap);
		}
		System.out.println(" ");
		System.out.println("	Registro de  datos de clientes ");
		System.out.println(" ");
		System.out.println("Ingrese RUT: ");

		rutClient = entrada.nextLine();

		if (rutClient.isEmpty()) {
			System.out.println(" ");
			System.out.println("Error. Campo obligatorio");
			System.out.println("Ingrese RUT de cliente:");
			rutClient = entrada.nextLine();

		} else {

			System.out.println(" ");
			System.out.println("RUT: " + rutClient);
			System.out.println(" ");
			System.out.println("Ingrese nombre: ");
		}
		nameClient = entrada.nextLine();

		if (nameClient.isEmpty()) {
			System.out.println(" ");
			System.out.println("Error. Campo obligatorio");
			System.out.println("Ingrese nombre de cliente:");
			nameClient = entrada.nextLine();

		} else {
			System.out.println(" ");
			System.out.println("Nombre: " + nameClient);
			System.out.println(" ");
			System.out.println("Ingrese direccion: ");
		}
		adressClient = entrada.nextLine();

		if (adressClient.isEmpty()) {
			System.out.println(" ");
			System.out.println("Error. Campo obligatorio");
			System.out.println("Ingrese direccion de cliente:");
			adressClient = entrada.nextLine();

		} else {
			System.out.println(" ");
			System.out.println("Direccion: " + adressClient);
			System.out.println(" ");
			System.out.println("Ingrese comuna: ");
		}
		comunaClient = entrada.nextLine();

		if (comunaClient.isEmpty()) {
			System.out.println(" ");
			System.out.println("Error. Campo obligatorio");
			System.out.println("Ingrese comuna de cliente:");
			comunaClient = entrada.nextLine();

		} else {
			System.out.println(" ");
			System.out.println("Comuna: " + comunaClient);
			System.out.println(" ");
			System.out.println("Ingrese telefono: ");
		}
		phoneClient = entrada.nextLine();

		if (phoneClient.isEmpty()) {
			System.out.println(" ");
			System.out.println("Error. Campo obligatorio");
			System.out.println("Ingrese comuna de cliente:");
			phoneClient = entrada.nextLine();

		} else {
			System.out.println(" ");
			System.out.println("Telefono: " + phoneClient);
			System.out.println(" ");
			System.out.println("	DATOS DE CLIENTE ");
			System.out.println(" ");
			System.out.println("RUT: " + rutClient);
			System.out.println("Nombre: " + nameClient);
			System.out.println("Direccion: " + adressClient);
			System.out.println("Comuna: " + comunaClient);
			System.out.println("Telefono: " + phoneClient);
		}
		System.out.println(" ");
		System.out.println("	Registro de los asistentes " + "(" + quantCap + " asistentes" + ")");

		String nameAsist[] = new String[quantCap];
		int ageAsist[] = new int[quantCap];

		System.out.println("Ingrese los nombres de los asisitentes ");

		for (int i = 0; i < nameAsist.length; i++) {
			System.out.println("Nombre: ");
			nameAsist[i] = entrada.nextLine();

		}
		System.out.println("Ingrese edades de los asistentes ");

		for (int i = 0; i < ageAsist.length; i++) {
			System.out.println("Edad: ");
			ageAsist[i] = entrada.nextInt();
		}
		System.out.println(Arrays.toString(nameAsist));

		Arrays.sort(ageAsist);

		String edadA = Arrays.toString(ageAsist);

		System.out.println(edadA);

	}

}
			
			
		

