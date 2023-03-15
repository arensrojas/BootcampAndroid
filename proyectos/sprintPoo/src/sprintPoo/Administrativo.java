/**
 * 
 */
package sprintPoo;

/**
 * @author Leonardo Rojas Escárez
 *
 */
public class Administrativo extends Usuario {
	
	// TODO	Área: obligatorio, mínimo 5 caracteres, máximo 20
	// TODO Experiencia previa: máximo 100 caracteres
	
	private String area;
	private String experiencia;
	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experiencia=" + experiencia + "]";
	}
	public Administrativo(String nombre, String fNacimiento, String rut, String area, String experiencia) {
		super(nombre, fNacimiento, rut);
		this.area = area;
		this.experiencia = experiencia;
	}
	public Administrativo(String nombre, String fNacimiento, String rut) {
		super(nombre, fNacimiento, rut);
	}
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}
	/**
	 * @return the experiencia
	 */
	public String getExperiencia() {
		return experiencia;
	}
	/**
	 * @param experiencia the experiencia to set
	 */
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	

	
	

}
