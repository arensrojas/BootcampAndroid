/**
 * 
 */
package com.arens.tareas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class AbpSeguros {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
        // Creau una lista con los usuarios ingresados por teclado
        List<String> userData = new ArrayList<String>();

        // Docs Scanner   https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
        //https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
        Scanner scanner = new Scanner(System.in);
        
        // Bienvenida al programa
        //intuitivo        
        System.out.println("\r\n\t\t----------  Registro de Usuarios  ----------  ");
        
        //  tipo nombre = valor;
        //  nombre = valor2;
        // categoria tipo nombre();
        // nombre();
        // obtener el ingreso de usuarios y crear variables
        System.out.println("\r\nDatos a Ingresar: ");
        
        // obtener  RUT ==> entero  < 999999999
        userData.add(validateMaxNumber(scanner, "RUT (sin puntos ni digito verificador)" , 999999999));

        // obtener Nombres==> requerido, String
        // agregar usuarios a Lista userData 
        userData.add(validateData(scanner, "Nombres"));

        // obtener Apellidos==> requerido, String
        userData.add(validateData(scanner, "Apellidos"));

        //  obtener Teléfono: <= 15 char, String
        // System.out.print("\r\n\t>Teléfono: ");
        userData.add(validateStrLength(scanner, "Teléfono",16));
        
        // obtener AFP ==> requerido, String
        userData.add(validateData(scanner, "AFP"));

        // obtener Sistema de salud ==> 1 (Fonasa) o 2 (Isapre), Menu con int
        userData.add(validateMenu(scanner, "Sistema de Salud", "1-FONASA" , "2-ISAPRE " ));

        //  obtener Dirección: <=50 char, String
        //  input = getCapitalizeCase(validateStrLength(scanner, "Dirección", 51));
        // userData.add(input);
        userData.add(validateStrLength(scanner, "Dirección", 51));

        // obtener Comuna: requerido, String
        userData.add(validateData(scanner, "Comuna"));

     // obtener Edad ==> int <120 años
        userData.add(validateMaxNumber(scanner, "Edad", 120));

        // cerrar objeto scanner
        scanner.close();

        // imprimir datos por consola.
        System.out.println("\r\nDatos Registrados: ");
        System.out.print("\r\n\t>Nombres: " + userData.get(1));
        System.out.print("\r\n\t>Apellidos: " + userData.get(2));
        System.out.print("\r\n\t>Edad: " + userData.get(8));
        System.out.print("\r\n\t>RUN: " + userData.get(0));
        System.out.print("\r\n\t>Telefono: " + userData.get(3));
        System.out.print("\r\n\t>Dirección: " + userData.get(6));
        System.out.print("\r\n\t>Comuna: " + userData.get(7));
        System.out.print("\r\n\t>AFP: " + userData.get(4));
        System.out.print("\r\n\t>Sistema de Salud: " + userData.get(5));

        
        // variable tipo cadena se le asigna valor vacio
        String healthinsurance = "";
        switch (userData.get(5)) {
            case "1":
                healthinsurance =  "FONASA";          
                break;
            case "2":
                healthinsurance =  "ISAPRE";         
                break;     
        }
        System.out.print("\r\n\t>Sistema de Salud: " + healthinsurance); 

        

    }

    // validar datos de entrada ==> method (metodos)
    public static String validateData(Scanner scanner, String label) {
        boolean process = true;
        String input = "";
          
        
        // mientras (nombre de la variable)
        while (process) {
            System.out.print("\r\n\t>" + label + ": ");
            input = scanner.nextLine();
            if (input.length() > 1) {
                input = getCapitalizeCase(input);
                process = false;
            } else {
                // imprimir por pantalla mensaje de error si es necesario
                System.out.println("\r\n\t>> ¡! Por favor, escribe tu " + label);
            }
        }
        return input;
    }

    // Validar datos de entrada por el menú de opciones ==> method
    public static String validateMenu(Scanner scanner, String label, String option1, String option2) {
        boolean process = true;
        String input = "";
        while (process) {
            System.out.print("\r\n\t>" + label + ": ");
            System.out.print("\r\n\t>> " + option1);
            System.out.println("\r\n\t>> " + option2);

            input = scanner.nextLine();
            if (input.equals("1")) {
                process = false;
            } else if (input.equals("2")) {
                process = false;
            } else {
                // Print error message if neccesary
                System.out.print("\r\n\t>> ¡! La opción " + input + " no es válida.");
            }
        }
        return input;
    }

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

}