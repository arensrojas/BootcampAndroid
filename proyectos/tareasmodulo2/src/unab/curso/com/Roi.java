/**
 * 
 */
package unab.curso.com;

/**
 * @author Leonardo Rojas
 *
 */
import java.util.Scanner;

public class Roi {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Ingrese los ingresos totales: ");
    double ingresosTotales = input.nextDouble();

    System.out.print("Ingrese los costos totales: ");
    double costosTotales = input.nextDouble();

    System.out.print("Ingrese la inversión inicial: ");
    double inversionInicial = input.nextDouble();

    double ROI = (ingresosTotales - costosTotales) / inversionInicial * 100;

    System.out.println("El ROI es: " + ROI + "%");
  }
}
