/**
 * 
 */
package com.Arens.abpro5;

import java.util.Scanner;



/**
 * @summary 
 * @author Leonardo Rojas
 * @version 1.0
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
				
		Usuario usuario1 = new Usuario( "Felipe Pavez", "04/09/1982", "14655756-1");
		
		Capacitacion capacitacion1 = new Capacitacion("1", "04/09/1985", "08-02-2023", "Sala 104", " Sala 1", " 120 min", 40);
				
	
				
		//Ahora llamamos los métodos e imprimimos los resultados por consola
				System.out.println("Ingrese los datos del cliente: ");
				
		//Método toString
				System.out.println(cliente1.toString());
			
				
		//Ahora llamamos los métodos e imprimimos los resultados por consola
				System.out.println("Ingrese los datos del Usuario: ");
				
					
		//Método toString
				System.out.println(usuario1.toString());	
				
	    //Ahora llamamos los métodos e imprimimos los resultados por consola
				System.out.println("Ingrese los datos de la capacitación: ");
				
					
		//Método toString
				System.out.println(capacitacion1.toString());			
				
				
				
				
				
				
	}

	

}
