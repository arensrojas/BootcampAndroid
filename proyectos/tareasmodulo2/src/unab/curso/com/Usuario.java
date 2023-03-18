/**
 * 
 */
package com.arens.sprint2;

/**
 * @author Leonardo Rojas Escarez
 *
 */
import java.text.SimpleDateFormat;
import java.util.Date;



	// Clase Usuario que implementa la interfaz Asesoría
 	public class Usuario  {
    protected String nombre;
    protected Date fechaNacimiento;
    protected int run;

    // Constructor vacío
    public Usuario() {}

    // Constructor con todos los atributos de la clase
    public Usuario(String nombre, Date fechaNacimiento, int run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    // Métodos de acceso y mutadores para los atributos de la clase

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
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
        System.out.println("RUN: " + run);
    }
    
    
    
    // Método toString() para imprimir el estado del objeto en forma de cadena de 
    //	caracteres

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run + "]";
	}
    

   
    
    

   
}

