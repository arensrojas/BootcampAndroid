/**
 * 
 */
package com.pildoras.arens;
import javax.swing.*;
/**
 * @author Leonardo Rojas
 *
 */
public class BucleWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave = "leo";
		String pass = "";
		
		while (clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contraseña de tres letras en minusculas,  por favor");
			
			if (clave.equals(pass)==false) {
				System.out.println("Contraseña Incorrecta ");
			}
		}
		
		System.out.println("Contraseña correcta, acceso permitido");
	}

}
