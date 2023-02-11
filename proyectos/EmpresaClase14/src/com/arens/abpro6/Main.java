/**
 * 
 */
package com.arens.abpro6;





/**
 * @summary 
 * @author Leonardo Rojas
 * @version 1.1
 *  
 */
public class Main {

	/**
	 * @param args
	 */
	
	//Atributos
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**Por último, debe crear una clase adicional que contenga un método main(), a través del 
		 * cual se cree
		*una instancia de cada clase, y se desplieguen sus datos a través del método toString().
		*/
		
		
		//Instanciamos la clase Cliente1 y Usuario1 .
				
		Cliente cliente1 = new Cliente("12230369-1", "Leonardo Arens", "Rojas Escarez", "+569 55175276", "capital", "Fonasa",
					"Los Algarrobos 895", "Villa Alemana", 45);
		
		
		Cliente cliente2 = new Cliente("15367456-k", "francisco francisco ", "perez  perez", "+569 33445566", "modelo", "Isapre",
				"Los Canales 34", "Viña del Mar", 32);
				
		Usuario usuario1 = new Usuario( "Felipe Pavez", "04/09/1982", "14655756-1");
		
		Usuario usuario2 = new Usuario( "Verónica Valenzuela", "025/06/1993", "14647364-1");
		
		Capacitacion capacitacion1 = new Capacitacion("iD 1", "xxxxxxxxx", "08-02-2023", "1400", " Sala 1", " 120 min", 40);
		
		Capacitacion capacitacion2 = new Capacitacion("ID 2", "xxxxxxxxx", "10-02-2023", "1100", " Sala 4", " 60 min", 20);
				
	
				System.out.println(cliente1.obtenerDato());
				
				System.out.println(cliente1.sistemaSalud());
				
				//System.out.println(usuario1.mostrarEdad());
				
				System.out.println(capacitacion1.mostrarDetalles());
				
				
				
				
				
		
				System.out.print("\n\t\t\t------- Mostrar los datos del Cliente -------\n");
				
				System.out.print(" \n\t" + cliente1.getRut());
				System.out.print(" \n\t" + cliente1.getNombres());
				System.out.print(" \n\t" + cliente1.getApellidos());
				System.out.print(" \n\t" + cliente1.getTelefono());
				System.out.print(" \n\t" + cliente1.getAfp());
				System.out.print(" \n\t" + cliente1.getSistemaSalud());
				System.out.print(" \n\t" + cliente1.getDireccion());
				System.out.print(" \n\t" + cliente1.getComuna());	
				System.out.print(" \n\t" + cliente1.getEdad());
				
				
				
				System.out.print("\n\t\t\t------- Mostrar los datos del Usuario -------\n");
				
				System.out.print(" \n\t" + usuario1.getNombres());
				System.out.print(" \n\t" + usuario1.getEdad());
				System.out.print(" \n\t" + usuario1.getRut());
				
				
				System.out.print("\n\t\t\t------- Mostrar los datos de la Capacitación -------\n");
				
				System.out.print(" \n\t" + capacitacion1.getIdentificador());
				System.out.print(" \n\t" + capacitacion1.getRut());
				System.out.print(" \n\t" + capacitacion1.getDia());
				System.out.print(" \n\t" + capacitacion1.getHora());
				System.out.print(" \n\t" + capacitacion1.getLugar());
				System.out.print(" \n\t" + capacitacion1.getDuracion());
				System.out.print(" \n\t" + capacitacion1.getAsistentes());
				
				
				System.out.print("\n\t\t\t------- Mostrar los datos del Cliente -------\n");
				System.out.print("\n\t------- Nuevo Cliente -------\n");
				System.out.print(" \n\t" + cliente2.getRut());
				System.out.print(" \n\t" + cliente2.getNombres());
				System.out.print(" \n\t" + cliente2.getApellidos());
				System.out.print(" \n\t" + cliente2.getTelefono());
				System.out.print(" \n\t" + cliente2.getAfp());
				System.out.print(" \n\t" + cliente2.getSistemaSalud());
				System.out.print(" \n\t" + cliente2.getDireccion());
				System.out.print(" \n\t" + cliente2.getComuna());	
				System.out.print(" \n\t" + cliente2.getEdad());
				
				
				
				System.out.print("\n\t\t\t------- Mostrar los datos del Usuario -------\n");
				System.out.print("\n\t------- Nuevo Usuario -------\n");
				
				System.out.print(" \n\t" + usuario2.getNombres());
				System.out.print(" \n\t" + usuario2.getEdad());
				System.out.print(" \n\t" + usuario2.getRut());
				
				
				
				System.out.print("\n\t\t\t------- Mostrar los datos de la Capacitación -------\n");
				System.out.print("\n\t------- Nueva Capacitación -------\n");
				
				System.out.print(" \n\t" + capacitacion2.getIdentificador());
				System.out.print(" \n\t" + capacitacion2.getRut());
				System.out.print(" \n\t" + capacitacion2.getDia());
				System.out.print(" \n\t" + capacitacion2.getHora());
				System.out.print(" \n\t" + capacitacion2.getLugar());
				System.out.print(" \n\t" + capacitacion2.getDuracion());
				System.out.print(" \n\t" + capacitacion2.getAsistentes());
				
				
				
	}

	

}
