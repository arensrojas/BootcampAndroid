/**
 * 
 */
package com.arens.abpro6;

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
	private String edad;
	private String rut;
	
	
	//Método toString
		@Override
		public String toString() {
			return "Usuario : nombres = " + nombres + ", fnacimiento = " + edad + ", rut = " + rut ;
		}
	
	
	//Constructor vacío
		public Usuario() {
			
		}
		
		
		//Constructor con parámetros
	public Usuario( String nombresUsuario, String edad, String rutUsuario) {
		
		this.nombres= nombresUsuario;
		this.edad = edad;
		this.rut = rutUsuario;
	
}
	
	
	


			/**
			 * @return the nombres
			 */
			public String getNombres() {
				return nombres;
			}


			/**
			 * @param nombres the nombres to set
			 */
			public void setNombres(String nombres) {
				this.nombres = nombres;
			}


			/**
			 * @return the edad
			 */
			public String getEdad() {
				return edad;
			}


			/**
			 * @param edad the edad to set
			 */
			public void setEdad(String edad) {
				this.edad = edad;
			}


			/**
			 * @return the rut
			 */
			public String getRut() {
				return rut;
			}


			/**
			 * @param rut the rut to set
			 */
			public void setRut(String rut) {
				this.rut = rut;
			}
			
			//Método nombreCompleto1
			public String nombreCompleto1() {
				return  nombres + " " +  edad + " " + rut + " " ;
			}
			
			
			
			
			//método mostrarEdad
			public String mostrarEdad() {
				
				return "\t Su Edad es:" + " " + mostrarEdad();
			}
			
}
