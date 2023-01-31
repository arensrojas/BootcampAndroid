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
		
		String Palabra = "";
		int contador = 0;
		Palabra = scanner.nextLine();
		for(int i = 0; i < Palabra.length(); i++) {
			
			
			
			 if ((Palabra.charAt(i) =='a') || (Palabra.charAt(i)=='e') || (Palabra.charAt(i)=='i') || (Palabra.charAt(i)=='o') || (Palabra.charAt(i)=='u')){ 
			    contador++;
			  }
			 System.out.println(" La palabra " + Palabra + " contiene " + contador + " vocales ");
			}
		
	}

}
