/**
 * 
 */
package com.arens.tareas;

import java.util.Scanner;

/**
 * @author Leonardo Rojas
 *
 */
public class Vocales {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Ingrese una palabra: ");
		
		String sPalabra ="";
		int contador = 0;
		
		for(int x=0;x<sPalabra.length();x++) {
			 if ((sPalabra.charAt(x)=='a') || (sPalabra.charAt(x)=='e') || (sPalabra.charAt(x)=='i') || (sPalabra.charAt(x)=='o') || (sPalabra.charAt(x)=='u')){ 
			    contador++;
			  }
			 System.out.println("La palabra " + sPalabra + " contiene " + contador + " vocales");
			}
		
	}

}
