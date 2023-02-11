/**
 * 
 */
package com.arens.abpro6;

/**
 * @author Leonardo Rojas
 *
 */
public class Cliente {

	/**
	 * Cliente:
	 *	- RUT: corresponde a un número menor a 99.999.999
	 *	- Nombres
	 *	- Apellidos
	 *	- Teléfono
	 *	- AFP
	 *	- Sistema de salud: 1 (Fonasa) o 2 (Isapre)
	 *	- Dirección
	 *	- Comuna
	 *	- Edad
	 */
	
	//Atributos
	private String rut;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String afp;
	private String sistemaSalud; 
	private String direccion;
	private String comuna;
	private int 	 edad;
	
	
	//Método toString
		@Override
		public String toString() {
			return "Cliente rut = " + rut + ", nombres=" + nombres + ", apellidos = " + apellidos + ", telefono = " + telefono
					+ ", afp = " + afp + ", sistemaSalud = " + sistemaSalud + ", direccion = " + direccion + ", comuna = " + comuna + ", edad = "
					+ edad ;
		}
		
		
		
		
		
	
	//Constructor vacío
		public Cliente() {
			
		}
	
	
		//Constructor con parámetros
	public Cliente(String rut, String nombresCliente, String apellidosCliente, String telefonoCliente, String afpCliente, 
			String sistemaSalud, String direccionCliente, String comunaCliente, int edadCliente) {
		
		
		
	if (rut.matches("[0-9][6,9]")) {
			this.rut = "rut";
		}
		if (sistemaSalud == "1") {
			this.sistemaSalud = "Fonasa";
		}
		if (sistemaSalud == "2") {
			this.sistemaSalud = "Isapre";
		}
		
		this.rut 			= rut;
		this.nombres		= nombresCliente;
		this.apellidos 		= apellidosCliente;
		this.telefono 		= telefonoCliente;
		this.afp	 		= afpCliente;
		this.sistemaSalud 	= sistemaSalud;
		this.direccion 		= direccionCliente;
		this.comuna 		= comunaCliente;
		this.edad 			= edadCliente;
	
}
	
	
	//Método nombreCompleto
		public String nombreCompleto() {
			return rut + " " + nombres + " " + apellidos + " " + telefono + " " + afp + " " + sistemaSalud + " " + 
					direccion + " " + comuna + " " + edad + " " ;
		}
		
		
		
		//Método obtenerdato
				public String obtenerDato() {
					
					return "\t nombres y apellidos:" + " " + nombres + " " + apellidos ;
				}
		
		
		
		
			
		//método sistemaSalud
				public String sistemaSalud() {
					
					return "\t Su Sistema de Salud es:" + " " + sistemaSalud;
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
		 * @return the apellidos
		 */
		public String getApellidos() {
			return apellidos;
		}


		/**
		 * @param apellidos the apellidos to set
		 */
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}


		/**
		 * @return the telefono
		 */
		public String getTelefono() {
			return telefono;
		}


		/**
		 * @param telefono the telefono to set
		 */
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}


		/**
		 * @return the afp
		 */
		public String getAfp() {
			return afp;
		}


		/**
		 * @param afp the afp to set
		 */
		public void setAfp(String afp) {
			this.afp = afp;
		}


		/**
		 * @return the SistemaSalud
		 */
		public String getSistemaSalud() {
			return sistemaSalud;
		}


		/**
		 * @param salud the salud to set
		 */
		public void setSistemaSalud(String sistemaSalud) {
			this.sistemaSalud = sistemaSalud;
		}


		/**
		 * @return the direccion
		 */
		public String getDireccion() {
			return direccion;
		}


		/**
		 * @param direccion the direccion to set
		 */
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}


		/**
		 * @return the comuna
		 */
		public String getComuna() {
			return comuna;
		}


		/**
		 * @param comuna the comuna to set
		 */
		public void setComuna(String comuna) {
			this.comuna = comuna;
		}


		/**
		 * @return the edad
		 */
		public int getEdad() {
			return edad;
		}


		/**
		 * @param edad the edad to set
		 */
		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		
		
	
	
	


}