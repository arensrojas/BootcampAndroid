/**
 * 
 */
package com.arens.proyectos;

/**
 * @author Leonardo Rojas
 *
 */
public class Trabajador {

	
	private String nombres ;
	private String apellidos;
	private String rut;
	private String telefono;
	private int edad;
	
	
	
	public Trabajador() {
		super();
	}
	

	public Trabajador(String nombres, String apellidos, String rut, String telefono, int edad) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.rut = rut;
		this.telefono = telefono;
		this.edad = edad;
	}

	
	@Override
	public String toString() {
		return "Trabajador :nombres=" + nombres + ", apellidos=" + apellidos + ", rut=" + rut + ", telefono=" + telefono
				+ ", edad=" + edad ;
	}
	
	//Método nombreCompleto
		public String nombreCompleto() {
			return nombres + " " + apellidos;
		}

	
	//Método descomponerRut
		public int descomponerRut() {
			String rutSinDV = "";
			for (int i = 0; i < rut.length(); i++) {
				char c = rut.charAt(i);
				if(c == '-') {
					break;
				}else {
					rutSinDV = rutSinDV + c;
				}
			}
			
			return Integer.valueOf(rutSinDV);
		}
	

	/**
	 * @param args
	 */
	

}
