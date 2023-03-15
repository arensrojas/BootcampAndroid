/**
 * 
 */
package sprintPoo;

/**
 * @author Leonardo Rojas Escárez
 *
 */
public class Usuario {
	//TODO 	Nombre: obligatorio, mínimo 10 caracteres, máximo 50
	//TODO- Fecha de nacimiento: obligatorio, independiente si lo declara como una
	//TODO	fecha toString, debe ser desplegado con el formato DD/MM/AAAA
	//TODO- RUN: corresponde a un número menor a 99.999.999
	
	private String nombre;
	private String fNacimiento;
	private String rut;
	
	
	
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fNacimiento=" + fNacimiento + ", rut=" + rut + "]";
	}


	public Usuario(String nombre, String fNacimiento, String rut) {
		super();
		this.nombre = nombre;
		this.fNacimiento = fNacimiento;
		this.rut = rut;
	}


	public Usuario() {
		super();
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the fNacimiento
	 */
	public String getfNacimiento() {
		return fNacimiento;
	}


	/**
	 * @param fNacimiento the fNacimiento to set
	 */
	public void setfNacimiento(String fNacimiento) {
		this.fNacimiento = fNacimiento;
	}


	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}


	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}
	
	
	

}
