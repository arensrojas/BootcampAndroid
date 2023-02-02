/**
 * 
 */
package unab.curso.com;

import java.util.Scanner;

/**
 * @author Leonardo Rojas
 *
 */
public class Curso {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String nombreAlumno ;
		int notaAlumno;
		double calificacion, sumaCalificaciones = 0, promedio, minNota = 100, maxNota = 0;
		int contadorAlumnos = 0;
		String nombreMinNota ="", nombreMaxNota = "";
		
		System.out.println("----------- Ingreso de Alumnos y Notas por Curso -----------");
		
		System.out.println("\nIngrese Nombre del Alumno: ");
		nombreAlumno = scanner.nextLine();
		
		System.out.println("\nIngrese Notas del Alumno: ");
		nombreAlumno = scanner.nextLine();
		
		System.out.println("\nIngrese Nombre del Alumno: ");
		nombreAlumno = scanner.nextLine();
		
		System.out.println("\nIngrese Notas del Alumno: ");
		nombreAlumno = scanner.nextLine();
		
		while (!nombreAlumno.equals("salir")) {
			calificacion = scanner.nextDouble();
			scanner.nextLine();
			
			sumaCalificaciones += calificacion;
			contadorAlumnos ++;
			
			if (calificacion < minNota) {
				minNota = calificacion;
				nombreMinNota = nombreAlumno;
			}
			if (calificacion > maxNota) {
				maxNota = calificacion;
				nombreMaxNota = nombreAlumno;
			} 
			
			System.out.println("Desea Seguir ingresando Alumnos y Notas o Digite salir: ");
			nombreAlumno = scanner.nextLine();
			
		}
	
			promedio = sumaCalificaciones / contadorAlumnos;
			System.out.println("\nEl promedio del curso es: " + promedio);
			System.out.println("\nEl con la menor nota  es: " + nombreMinNota + " con " + minNota);
			System.out.println("\nEl con la mayor nota  es: " + nombreMaxNota + " con " + maxNota);

	}

}
