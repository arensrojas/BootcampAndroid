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
		
		String sPalabra = "";
		int contador = 0;
		
		for(int i = 0; i < sPalabra.length(); i++) {
			
			sPalabra = scanner.nextLine();
			
			 if ((sPalabra.charAt(i)=='a') || (sPalabra.charAt(i)=='e') || (sPalabra.charAt(i)=='i') || (sPalabra.charAt(i)=='o') || (sPalabra.charAt(i)=='u')){ 
			    contador++;
			  }
			 System.out.println(" La palabra " + sPalabra + " contiene " + contador + " vocales ");
			}
		
	}

}
