/**
 * 
 */
package sprintPoo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 * @author Leonardo Rojas Escárez
 *
 */
public class Principal extends Uso_Usuario{

	/**
	 * @param args
	 */
	public class Main {
	    public static void main(String[] args) throws ParseException {
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	        Date fechaNacimiento = sdf.parse("01/01/2000");
	        Usuario persona = new Usuario("Juan Pérez", fechaNacimiento, 12345678);
	        System.out.println(persona.getNombre());
	        System.out.println(persona.getFechaNacimientoFormatted());
	        System.out.println(persona.getRun());
	    }
	}
		

		
		        

		        
		    }
		

		
		
		

	





