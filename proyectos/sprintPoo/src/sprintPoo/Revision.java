/**
 * 
 */
package sprintPoo;

/**
 * @author Leonardo Rojas Escárez
 *
 */
public class Revision {
	
	// TODO	Identificador de la revisión: obligatorio, número interno manejado por la compañía.
	// TODO	Identificador de la visita en terreno: obligatorio, número de la vista a la
	// TODO	que se asócia la revisión.
	// TODO	Nombre alusivo a la revisión: obligatorio, mínimo 10 caracteres, máximo 50
	// TODO	Detalle para revisar: máximo 100 caracteres
	// TODO	Estado: 1 (sin problemas), 2 (con observaciones), 3 (no aprueba), solo se
	// TODO	 pueden ingresar los valores antes indicados.
	
	private int idRevision;
	
	private String nombreRevision;
	private String detalleRevision;
	private boolean esatdo;
	
	
	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", nombreRevision=" + nombreRevision + ", detalleRevision="
				+ detalleRevision + ", esatdo=" + esatdo + "]";
	}
	
	
	public Revision(int idRevision, String nombreRevision, String detalleRevision, boolean esatdo) {
		super();
		this.idRevision = idRevision;
		this.nombreRevision = nombreRevision;
		this.detalleRevision = detalleRevision;
		this.esatdo = esatdo;
	}
	
	
	public Revision() {
		super();
	}
	/**
	 * @return the idRevision
	 */
	public int getIdRevision() {
		return idRevision;
	}
	/**
	 * @param idRevision the idRevision to set
	 */
	public void setIdRevision(int idRevision) {
		this.idRevision = idRevision;
	}
	/**
	 * @return the nombreRevision
	 */
	public String getNombreRevision() {
		return nombreRevision;
	}
	/**
	 * @param nombreRevision the nombreRevision to set
	 */
	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}
	/**
	 * @return the detalleRevision
	 */
	public String getDetalleRevision() {
		return detalleRevision;
	}
	/**
	 * @param detalleRevision the detalleRevision to set
	 */
	public void setDetalleRevision(String detalleRevision) {
		this.detalleRevision = detalleRevision;
	}
	/**
	 * @return the esatdo
	 */
	public boolean isEsatdo() {
		return esatdo;
	}
	/**
	 * @param esatdo the esatdo to set
	 */
	public void setEsatdo(boolean esatdo) {
		this.esatdo = esatdo;
	}
	
	
	

}
