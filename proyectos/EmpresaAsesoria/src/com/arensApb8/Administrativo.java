/**
 * 
 */
package com.arensApb8;

/**
 * @author Leonardo Rojas
 *
 */
public class Administrativo extends Usuario{
		
	
	// TODO En las clases hijas, el método analizarUsuario() debe desplegar la información del
	// TODO método correspondiente al padre, y los datos expuestos en las clases hijas.
		/*
		 * Administrativo
		 *- Área
		 *- Experiencia previa
		 */
		
	private String area;
	private String experiencia;
	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experiencia=" + experiencia + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
