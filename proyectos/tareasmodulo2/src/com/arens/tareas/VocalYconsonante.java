/**
 * 
 */
package com.arens.tareas;
import java.util.Scanner; 
/**
 * @author Leonardo Rojas
 *
 */
public class VocalYconsonante {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese una palabra: ");
		 Scanner scanner = new Scanner(System.in);
		 
		String str = "";
		int vocalesConta = 0, consonantesConta = 0;
		
		str = scanner.nextLine();
		
		//convirtiendo a minusculas
		str = str.toLowerCase();
		
		for(int i = 0; i < str.length();i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vocalesConta++;
			}else if ((ch >= 'a' && ch <= 'z')){
				consonantesConta++;
			}
			
			}
			System.out.println("Numero de vocales:  " + vocalesConta);
			System.out.println("Numero de consonantes: " + consonantesConta);
			
		}
		
	}


