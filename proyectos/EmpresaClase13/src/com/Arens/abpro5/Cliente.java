/**
 * 
 */
package com.Arens.abpro5;

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
	private String salud; 
	private String direccion;
	private String comuna;
	private int 	 edad;
	
	
	//Constructor vacío
		public Cliente() {
			
		}
	
	
		//Constructor con parámetros
	public Cliente(String rutCliente, String nombresCliente, String apellidosCliente, String telefonoCliente, String afpCliente, 
			String saludCliente, String direccionCliente, String comunaCliente, int edadCliente) {
		
		this.rut 		= rutCliente;
		this.nombres	= nombresCliente;
		this.apellidos 	= apellidosCliente;
		this.telefono 	= telefonoCliente;
		this.afp	 	= afpCliente;
		this.salud 		= saludCliente;
		this.direccion 	= direccionCliente;
		this.comuna 	= comunaCliente;
		this.edad 		= edadCliente;
	
}
	
	
	//Método nombreCompleto
		public String nombreCompleto() {
			return rut + " " + nombres + " " + apellidos + " " + telefono + " " + afp + " " + salud + " " + 
					direccion + " " + comuna + " " + edad + " " ;
		}
		
		
		
	//Método toString
	@Override
	public String toString() {
		return "Cliente rut = " + rut + ", nombres=" + nombres + ", apellidos = " + apellidos + ", telefono = " + telefono
				+ ", afp = " + afp + ", salud = " + salud + ", direccion = " + direccion + ", comuna = " + comuna + ", edad = "
				+ edad ;
	}
	
	


}