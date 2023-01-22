
package com.arens.tareas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * 
 */


/**
 * @author Leonardo Rojas
 *
 */
public class AbpExpresiones {
	
	
	

	/**
	 * NOTE Evalúe las siguientes expresiones lógicas, y determine su valor de verdad. En este punto no debe
usar ninguna ayuda tecnológica, solo las tablas de verdad indicadas en el material de apoyo.


a) V1 = ((‘A’ > ‘B’) O (Largo(‘Hola mundo’) = 10))			= V
b) V2 = No((5 + 2) < 7) Y No((7 > 9) O (3 < 5) Y (4 = 3))	= V
c) V3 = ((2 * 3 + 5 -7) > (2 * (2 + 5)) O ((10 – 5) < 20)	= V


Una vez que tenga la respuesta de todas ellas, traspáselas a un archivo nuevo de Java y verifique
sus resultados. Para que el proceso sea transparente, en el pseudocódigo, a modo de comentario,
debe indicar si contestó correctamente el caso indicado.

	 */
	public static void main(String[] args) {
		
		
		/**if ((( A > B) || (string.length("Hola mundo") = 10))) {
			System.out.println("El caso a es Verdadero");
			
		}else {
			System.out.println("La expresión es Falsa .-");
		}
		*/
		if (!((5 + 2) < 7) && !((7 > 9) || (3 < 5) && (4 == 3))) {
			System.out.println("El caso b es Verdadero.-");
		}else {
			System.out.println("La expresión es Falsa .-");
		}
		
		if ( ((2 * 3 + 5 -7) > (2 * (2 + 5)) || ((10 - 5) < 20))) {
			System.out.println("El caso c es Verdadero.-"); 
		}else { 
			System.out.println("La expresión es Falsa .-");
		}
		
		
		
	}

}


