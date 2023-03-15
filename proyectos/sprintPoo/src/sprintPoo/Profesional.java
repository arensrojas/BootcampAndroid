/**
 * 
 */
package sprintPoo;

/**
 * @author Leonardo Rojas Escárez
 *
 */
public class Profesional extends Usuario {
	
	// TODO	Título: obligatorio, mínimo 10 caracteres, máximo 50
	// TODO	Fecha de ingreso: independiente si lo declara como una fecha o un String,
	// TODO	debe ser desplegado con el formato DD/MM/AAAA
	
	private String titulo;
	private String fingreso;
	
	
	
	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fingreso=" + fingreso + "]";
	}
	public Profesional(String nombre, String fNacimiento, String rut, String titulo, String fingreso) {
		super(nombre, fNacimiento, rut);
		this.titulo = titulo;
		this.fingreso = fingreso;
	}
	public Profesional(String nombre, String fNacimiento, String rut) {
		super(nombre, fNacimiento, rut);
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the fingreso
	 */
	public String getFingreso() {
		return fingreso;
	}
	/**
	 * @param fingreso the fingreso to set
	 */
	public void setFingreso(String fingreso) {
		this.fingreso = fingreso;
	}
	
	
		

}
