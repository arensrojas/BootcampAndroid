package com.arens.tareas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class abpCapacitacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		// TODO CREAR CAPACITACIONES(DIA,HORA,LUGAR,DURACION,CANTIDAD DE ASISTENTES)
		
		List<String> userData = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\r\n\t\t----------  CAPACITACIONES  ----------  ");
		
		System.out.println("\r\nDatos a Ingresar : ");
		
		// TODO CREAR REGISTROS DE CLIENTES(RUT CLIENTE,NOMBRE,DIRECCION,COMUNA, TELEFONO)
		
		// obtener  RUT ==> entero  < 999999999
        userData.add(validateMaxNumber(scanner, "RUT (sin puntos ni digito verificador)" , 999999999));
        
        // obtener Nombres==> requerido, String
        // agregar usuarios a Lista userData 
        userData.add(validateData(scanner, "Nombres"));
        
        // obtener Apellidos==> requerido, String
        userData.add(validateData(scanner, "Apellidos"));
        
        //  obtener Dirección: <=50 char, String
        //  input = getCapitalizeCase(validateStrLength(scanner, "Dirección", 51));
        // userData.add(input);
        userData.add(validateStrLength(scanner, "Dirección", 51));
		
        // obtener Comuna: requerido, String
        userData.add(validateData(scanner, "Comuna"));
        
        //  obtener Teléfono: <= 15 char, String
        // System.out.print("\r\n\t>Teléfono: ");
        userData.add(validateStrLength(scanner, "Teléfono",16));
        
        // obtener Día: requerido, String
        userData.add(validateData(scanner, "Día"));
        
        // obtener  hora ==> entero  
        userData.add(validateData(scanner, "Hora"  ));
        
        // obtener Lugar: requerido, String
        userData.add(validateData(scanner, "Lugar"));
        
        // obtener  Duración ==> entero  
        userData.add(validateData(scanner, "Duración"));
        
        // obtener  asistentes ==> entero  
        userData.add(validateData(scanner, "Asistentes"));
        
        
         
      
     // Close obj scanner
        scanner.close();
        
     
    
        
        // Print  all data in console.
        
        System.out.println("\r\nDatos Registrados: ");
        System.out.print("\r\n\t>RUN:       " 		+ 	 userData.get(0));
        System.out.print("\r\n\t>Nombre:    " 		+	 userData.get(1));
        System.out.print("\r\n\t>Apellidos: " 	+    userData.get(2));
        System.out.print("\r\n\t>Dirección: " 	+    userData.get(3));
        System.out.print("\r\n\t>Comuna:    " 		+ 	 userData.get(4));
        System.out.print("\r\n\t>Telefono:  "	+ 	 userData.get(5));
        System.out.print("\r\n\t>Dia:       " 		+ 	 userData.get(6));
        System.out.print("\r\n\t>Hora:      " 		+ 	 userData.get(7));
        System.out.print("\r\n\t>Lugar:     "		+ 	 userData.get(8));
        System.out.print("\r\n\t>Duracion:  " 	+    userData.get(9));
        System.out.print("\r\n\t>Asistentes:" 	+    userData.get(10));
        
         
	}

	
        // Validate data entry ==> method
        public static String validateData(Scanner scanner, String label) {
            boolean process = true;
            String input = "";
                        
            while (process) {
                System.out.print("\r\n\t>" + label + ": ");
                input = scanner.nextLine();
                if (input.length() > 1) {
                    input = getCapitalizeCase(input);
                    process = false;
                } else {
                    // Print error message if neccesary
                    System.out.println("\r\n\t>> ¡! Por favor, escribe tu " + label);
                }
            }
            return input;
        }
        
        
	 
	/**
        private static String getCapitalizeCase(String input) {
			// TODO Auto-generated method stub
			return null;
		}
		**/


		// Validate char limit on string inputs ==> method
        public static String validateStrLength(Scanner scanner, String label, int limit) {
            boolean process = true;
            String input = "";
            while (process) {
                // Use print to enable writing after the tag
                System.out.print("\r\n\t>" + label + ": ");
                // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
                // last one is number
                input = scanner.nextLine();
                if (input.length() < limit) {
                    process = false;
                } else {
                    // Print error message if neccesary
                    System.out.print("\r\n\t>> ¡! Dato extenso: Por favor, ingresa sólo la info necesaria");
                }
            }
            return input;
        }
        
        // Validate number max on int inputs ==> method
        public static String validateMaxNumber(Scanner scanner, String label, int max) {
            boolean process = true;
            String inputStr = "";
            while (process) {
                System.out.print("\r\n\t>" + label + ": ");
                inputStr = scanner.nextLine();
                int input = Integer.valueOf(inputStr);

                if (input < max) {
                    process = false;
                } else {
                    // Print error message if neccesary
                    System.out.print("\r\n\t>> ¡! Dato extenso: Por favor, ingresa sólo la cantidad de dígitos necesaria");
                }
            }
            return inputStr;
        }
        
        // Capitalize case in strings
        public static String getCapitalizeCase(String input) {
            // create two substrings from word
            // first substring contains first letter of word
            // second substring contains remaining letters
            String firstLetter = input.substring(0, 1);
            String remainingLetters = input.substring(1, input.length());

            // change the first letter to uppercase
            firstLetter = firstLetter.toUpperCase();

            // join the two substrings
            input = firstLetter + remainingLetters;
            return input;
        }

		// TODO CREAR LISTADO DE ASISTENTES(NOMBRE,EDAD)
        // TODO MOSTRAR EN PANTALLA LOS DATOS DE LA CAPACITACION MISMA + CANTIDAD DE PERSONAS < 25
        
        // TODO MOSTRAR EN PANTALLA ENTRE 26 Y 35
        // TODO MOSTRAR EN PANTALLA LOS < A 35
        
        
        
}


