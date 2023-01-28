
package com.arens.tareas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Leonardo Rojas
 *
 */
public class Plataforma {

	/**
	 * @param args
	 */
	
	public class Cliente {
		
		private String nombre;
		private String fechaNacimiento;
		private int rut;
		private String direccion;
		private int telefono;
		private int empleados;
		
		
		/*
		 * Constructor sin parámetros.
		 * Con esto nos aseguramos de que al construir
		 * un objeto Actividad, no tendremos atributos
		 * con valor null
		 */
		public Cliente() {
			nombre = "";
			fechaNacimiento = "";
			rut = 999999999;
			direccion = "";
			telefono = 99999999;
			empleados = 0;
		}
		
		/*
		 * Constructor con parámetros.
		 * El objeto se construye recibiendo los valores
		 * que vamos a asignar a los atributos.
		 */
		public Cliente(String nomCliente, String fNacimiento, int rutCliente, String direccionCliente, int telefonoCliente, int numEmpleadosCliente) {
			nombre = nomCliente;
			fechaNacimiento = fNacimiento;
			rut = rutCliente;
			direccion = direccionCliente;
			telefono = telefonoCliente;
			empleados = numEmpleadosCliente;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nomCliente) {
			nombre = nomCliente;
		}

		public String getfNacimiento() {
			return fechaNacimiento;
		}

		public void setfNacimiento(String fNacimiento) {
			fechaNacimiento = fNacimiento;
		}

		public int getrutCliente() {
			return rut;
		}

		public void setrutCliente(int rutCliente) {
			rut = rutCliente;
		}

		public String getdireccionCliente() {
			return direccion;
		}

		public void setdireccion(String direccionCliente) {
			direccion = direccionCliente;
		}
		public int gettelefono() {
			return telefono;
		}

		public void settelefonoCliente(int telefonoCliente) {
			telefono = telefonoCliente;
		}
		public int getempleados() {
			return empleados;
		}

		public void setnumEmpleadosCliente(int numEmpleadosCliente) {
			empleados = numEmpleadosCliente;
		}

	}
	
	//Aquí se almacenarán los Eventos
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	//Objeto Scanner para leer datos por teclado
	private static Scanner teclado = new Scanner(System.in);
		
		

			public static void main(String[] args) {
				
				
				
				String opcion = "";//Variable para recoger opcion del usuario
				

				do {
					System.out.println("\n\t\tMENU PRINCIPAL");
					System.out.println("\t\t---- -------\n");
					System.out.println("[1] - Ingresar nuevo CLIENTE");
					System.out.println("[2] - Ingresar FECHA NACIMIENTO CLIENTE");
					System.out.println("[3] - Ingresar RUT");
					System.out.println("[4] - Ingresar DIRECCIÓN CLIENTE");
					System.out.println("[5] - Ingresar TELÉFONO CLIENTE");
					System.out.println("[6] - Ingresar CANTIDAD de EMPLEADOS del CLIENTE");
					
					System.out.println("\n[0] - SALIR del programa");
					System.out.print("\nEscoja opción: ");
					opcion = teclado.nextLine();
					
					
					//Evaluamos opcion escogida
					
					switch(opcion) {
					case "0":
						System.out.println("\n\t\t--FIN DE PROGRAMA--");
						break;
					case "1":
						System.out.println("\nNuevo Cliente " + teclado.nextLine());
						
						break;
					case "2":
						System.out.println("\nEn construccion...");
						break;
					case "3":
						System.out.println("\nEn construccion...");
						break;
					case "4":
						System.out.println("\nEn construccion...");
						break;
					case "5":
						System.out.println("\nEn construccion...");
						break;
					case "6":
						System.out.println("\nEn construccion...");
						break;
					case "7":
						
					default:
						System.out.println("\nOpción no válida...");
					}
					pausa();
				} while(!opcion.equals("0"));
			}
			
			/*
			 * Sencillo método que pausa la ejecución del programa
			 * hasta que el usuario pulse ENTER/INTRO
			 */
			private static void pausa() {
				System.out.println("\nPulse ENTER para seguir...\n");
				teclado.nextLine();
			}

		}

	


