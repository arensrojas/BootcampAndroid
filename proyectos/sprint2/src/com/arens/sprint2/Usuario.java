package com.arens.sprint2;

import java.text.SimpleDateFormat;
import java.util.Date;



// Clase Usuario que implementa la interfaz Asesoría
public class Usuario implements Asesoria {
    protected String nombre;
    protected Date fechaNacimiento;
    protected int rut;

    // Constructor vacío
    public Usuario() {}

    // Constructor con todos los atributos de la clase
    public Usuario(String nombre, Date fechaNacimiento, int rut) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.rut = rut;
    }

    // Métodos de acceso y mutadores para los atributos de la clase

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
    	
    	if (nombre.length() >= 0 || nombre.length() < 50) {
                throw new IllegalArgumentException("El nombre debe contener menos de 50 caracteres. ");
            }
            this.nombre = nombre;
        
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        if (rut < 0 || rut > 999999999) {
            throw new IllegalArgumentException("El RUT debe ser un número entre 0 y 99.999.999. ");
        }
        this.rut = rut;
    }

    // Método para mostrar la edad del usuario
    public String mostrarEdad() {
        Date fechaActual = new Date();
        long diff = fechaActual.getTime() - fechaNacimiento.getTime();
        long edad = diff / (24 * 60 * 60 * 1000) / 365;
        return "El usuario tiene " + edad + " años";
    }

    // Implementación del método analizarUsuario() de la interfaz Asesoría
    public void analizarUsuario() {
        System.out.println("Nombre: " + nombre);
        System.out.println("RUT: " + rut);
    }

    // Método toString() para imprimir el estado del objeto en forma de cadena de caracteres
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return "Nombre: " + nombre + "\nFecha de nacimiento: " + format.format
(fechaNacimiento) + "\nRUN: " + rut;
    }
    
   
}

