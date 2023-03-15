package com.arens.sprint2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Profesional extends Usuario{
    private String titulo;
    private LocalDate fechaIngreso;

    public Profesional(String titulo, LocalDate fechaIngreso) {
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
    	if (titulo.length() > 10 || titulo.length() < 50) {
    	throw new IllegalArgumentException("El titulo  debe tener entre 10 y 50 caracteres. ");
    	}
        this.titulo = titulo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaIngreso = LocalDate.parse(fechaIngreso, formatter);
    }

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}

	public Profesional() {
		super();
	}
    
    
}




		/*
		La clase Profesional tiene dos campos privados: titulo y fechaIngreso.
 		El constructor de la clase recibe estos dos campos como parámetros. También tiene
 		métodos getter y setter para cada campo.

		En el setter para la fecha de ingreso, se utiliza la clase DateTimeFormatter de 
		Java para parsear una cadena con formato dd/MM/yyyy y obtener una instancia de 
		LocalDate que se almacena en el campo fechaIngreso.

		Con esta clase, se puede crear un objeto Profesional de la siguiente manera:

		LocalDate fechaIngreso = LocalDate.of(2022, 2, 1);
		Profesional profesional = new Profesional("Ingeniero Civil", fechaIngreso);


		También se puede utilizar el setter de la fecha de ingreso para asignar la fecha 
		como una cadena:

		Profesional profesional = new Profesional("Ingeniero Civil", "01/02/2022");

		 */
