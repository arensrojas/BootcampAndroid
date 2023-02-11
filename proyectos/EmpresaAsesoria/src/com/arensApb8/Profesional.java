/**
 * 
 */
package com.arensApb8;

/**
 * @author Leonardo Rojas
 *
 */
public class Profesional extends Usuario {
	// TODO En las clases hijas, el método analizarUsuario() debe desplegar la información del
	// TODO método correspondiente al padre, y los datos expuestos en las clases hijas.
	/**
	 * Usuario:
	 *	- Título
	 *	- fechaIngreso
	 */
	// Atributos
	private String titulo;
	private String fechaIngreso;
	
	
	//Método ToString
	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	
	

	

}
