/**
 * 
 */
package com.Arens.abpro5;

/**
 * @author Leonardo Rojas
 *
 */
public class Usuario {

	/**
	 * Usuario:
	 *	- Nombre
	 *	- Fecha de nacimiento
	 *	- RUT
	 */
	
	//Atributos
	private String nombres;
	private String fnacimiento;
	private String rut;
	
	
	
	//Constructor vacío
		public Usuario() {
			
		}
		
		
		//Constructor con parámetros
	public Usuario( String nombresUsuario, String fnacimientoUsuario, String rutUsuario) {
		
		this.nombres= nombresUsuario;
		this.fnacimiento = fnacimientoUsuario;
		this.rut = rutUsuario;
	
}
	//Método toString
	@Override
	public String toString() {
		return "Usuario : nombres = " + nombres + ", fnacimiento = " + fnacimiento + ", rut = " + rut ;
	}
	
	//Método nombreCompleto1
			public String nombreCompleto1() {
				return  nombres + " " +  fnacimiento + " " + rut + " " ;
			}
		
}
