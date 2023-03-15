/**
 * 
 */

package com.arens.sprint2;
import java.util.Scanner;
public class Principal {
	
	
	
		public static void main(String[] args) {
			System.out.println("\tBIENVENIDO A REGISTRO DE  ASESORIAS EN PREVENCION DE RIESGOS");

			Contenedor contenedor = new Contenedor();
			Scanner input = new Scanner(System.in);

			boolean menu = true;

			while (menu) {

				System.out.println("");
				System.out.println("Seleccione una opcion del 1 al 9: ");
				System.out.println("");
				System.out.println("1.- Ingresar nuevo cliente.");
				System.out.println("2.- Ingresar nuevo administrativo.");
				System.out.println("3.- Ingresar nuevo profesional.");
				System.out.println("4.- Ingresar nueva capacitacion.");
				System.out.println("5.- Eliminar usuario.");
				System.out.println("6.- Visualizar lista de usuarios.");
				System.out.println("7.- Visualizar lista de usuarios por tipo.");
				System.out.println("8.- Visualizar lista de capacitaciones.");
				System.out.println("9.- Salir");

				String option = input.nextLine();

				switch (option) {

				case "1":
					contenedor.addCliente();
					break;

				case "2":
					contenedor.addAdmin();
					break;

				case "3":
					contenedor.addPro();
					break;

				case "4":
					contenedor.addCapacitacion();
					break;

				case "5":
					contenedor.deleteUser();
					break;

				case "6":
					contenedor.showUserList();
					break;

				case "7":
					contenedor.showUserType(option);
					break;

				case "8":
					contenedor.showCapacitacion();
					break;

				case "9":
					menu = false;
					break;

				default:
					System.out.println("Opción inválida. Seleccione una opción del 1 al 9");
					break;
				}
			}
			input.close();
		}
}