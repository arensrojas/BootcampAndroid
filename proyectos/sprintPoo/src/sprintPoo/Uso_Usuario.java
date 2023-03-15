/**
 * 
 */
package sprintPoo;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Leonardo Rojas escárez
 *
 */
public class Uso_Usuario {
	// TODO Nombre: obligatorio, mínimo 10 caracteres, máximo 50
	// TODO	Fecha de nacimiento: obligatorio, independiente si lo declara como una
	// TODO	fecha ostring, debe ser desplegado con el formato DD/MM/AAAA
	// TODO	RUN: corresponde a un número menor a 99.999.999
	
	class Usuario {
		
		public Usuario(String nom, int agno, int mes, int dia,  int rut ) {
			
			nombreUsuario=nom;
			rutUsuario=rut;
			//GregorianCalendar fNacimiento=new GregorianCalendar(agno,mes-1,dia);
			//fNacimientoUsuario=fNacimiento.getTime();
			
		}
		
		
		public String dameNombre() {  //getter
			
			return nombreUsuario;
		}
		
		public void validarNombre() { //setter
			
			

			if (nombreUsuario != null && nombreUsuario.length() >= 10 && nombreUsuario.length() <= 50) { //setter
			    System.out.println("El nombre es válido");
			} else {
			    System.out.println("El nombre no es válido");
			}

		}
		
		public int dameRutUsuario() {  //getter
			
			return rutUsuario;
		}
		
		public void validarRut() { //setter
			
			 // aquí se debe asignar el valor del RUN a validar

			if (rutUsuario > 0 && rutUsuario <= 99999999) {
			    System.out.println("El RUT es válido");
			} else {
			    System.out.println("El RUT no es válido");
			}

		}
		
		public void validarFnacimiento() {
		SimpleDateFormat formatoEntrada = new SimpleDateFormat("dd/MM/yyyy");
        formatoEntrada.setLenient(false); // no aceptar fechas inválidas como 31/02/2023
        try {
            Date fecha = formatoEntrada.parse(fNacimientoUsuario);
            SimpleDateFormat formatoSalida = new SimpleDateFormat("dd/MM/yyyy");
            String fechaFormateada = formatoSalida.format(fecha);
            System.out.println("Su fecha de nacimiento es: " + fechaFormateada);
        } catch (ParseException e) {
            System.out.println("La fecha ingresada no es válida. Por favor ingrese la fecha en el formato DD/MM/AAAA.");
        }
		
		}
		
		private String nombreUsuario;
		private String fNacimientoUsuario;
		private int rutUsuario;
		
		
		
	
	
	
	

	


	}
}
