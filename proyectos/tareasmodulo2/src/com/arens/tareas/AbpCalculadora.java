

package com.arens.tareas;

/**
 * @author Leonardo Rojas
 *
 */
import java.util.Scanner;

public class AbpCalculadora {
	
    static Scanner scanner = new Scanner(System.in);
    /*
     * 		Get en java. El método get al igual que el set,
     *  	es un método público, pero el get se encarga de mostrar
     *   	un valor a una propiedad o atributo de un objeto, el 
     *   	cual está encapsulado en la clase correspondiente, es decir,
     *   	 esta declarado con la palabra reservada private o protected.
    */
    
    public static void main(String[] args) {
    	
        int num1 = getInt();					// se declara la variable tipo integer
        int num2 = getInt();					// se declara la variable tipo integer
        char operation = getOperation();		
        int result = calc(num1,num2,operation);
        System.out.println("El resultado de la operación: "+ result);
    }
    public static int getInt(){
        System.out.println("Introduzca un número:");
        int num ;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Te has equivocado al introducir el número. Inténtalo de nuevo.");
            scanner.next();//recursividad
            num = getInt();
        }
        return num;
    }
    public static char getOperation(){
        System.out.println("Introduzca la operación: ( *, : , + , - , % ) ");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ha cometido un error al entrar en la operación. Inténtalo de nuevo.");
            scanner.next();//recursividad
            operation = getOperation();
        }
        return operation;
    }
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            case '%':
            	result = num1/num2;
            default:
                System.out.println("La operación no se reconoce. Repite la entrada.");
                result = calc(num1, num2, getOperation());//recursividad
        }
        return result;
    }
}