/**
 * 
 */
package com.arens.tareas;

import java.util.Scanner;
/**
 * @author Leonardo Rojas
 *
 */
public class Contraseña {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String password = "soleado";
		
		for(int i = 0; i < 3; i++) {
			System.out.print("Introduce la contraseña: ");
			String input = scanner.nextLine();
			
			if(input.equals(password)) {
				System.out.println("La clave ingresada es correcta");
				break;
				
			}else {
				System.out.println("Contraseña incorrecta, intenta otra vez ");
				
			}
		}
		
		System.out.println("Perdiste  ");
		scanner.close();
		
	}

}
