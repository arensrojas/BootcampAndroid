/**
 * 
 */
package sprintPoo;

/**
 * @author Leonardo Rojas Escárez
 *
 */
public class Accidente {
	
	// TODO	Identificador del accidente: obligatorio, número interno manejado por la compañía.
	// TODO	RUT Cliente: obligatorio
	// TODO	Día: fecha del accidente, independiente si lo declara como una fecha o un
	// TODO	String,debe ser desplegado con el formato DD/MM/AAAA
	// TODO	Hora: debe ser una hora válida del día, en formato HH:MM (hora desde
	// TODO	0 a23, minutos entre 0 y 59)
	// TODO	Lugar: obligatorio, mínimo 10 caracteres, máximo 50
	// TODO	Origen: máximo 100 caracteres
	// TODO	Consecuencias: máximo 100 caracteres
	
	private int idAccidente;
	private String rut;
	private String dia;
	private int hora;
	private String lugarAccidente;
	private String consecuencias;
	
	
	@Override
	public String toString() {
		return "Accidente [idAccidente=" + idAccidente + ", rut=" + rut + ", dia=" + dia + ", hora=" + hora
				+ ", lugarAccidente=" + lugarAccidente + ", consecuencias=" + consecuencias + "]";
	}


	public Accidente(int idAccidente, String rut, String dia, int hora, String lugarAccidente, String consecuencias) {
		super();
		this.idAccidente = idAccidente;
		this.rut = rut;
		this.dia = dia;
		this.hora = hora;
		this.lugarAccidente = lugarAccidente;
		this.consecuencias = consecuencias;
	}


	public Accidente() {
		super();
	}


	/**
	 * @return the idAccidente
	 */
	public int getIdAccidente() {
		return idAccidente;
	}


	/**
	 * @param idAccidente the idAccidente to set
	 */
	public void setIdAccidente(int idAccidente) {
		this.idAccidente = idAccidente;
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


	/**
	 * @return the dia
	 */
	public String getDia() {
		return dia;
	}


	/**
	 * @param dia the dia to set
	 */
	public void setDia(String dia) {
		this.dia = dia;
	}


	/**
	 * @return the hora
	 */
	public int getHora() {
		return hora;
	}


	/**
	 * @param hora the hora to set
	 */
	public void setHora(int hora) {
		this.hora = hora;
	}


	/**
	 * @return the lugarAccidente
	 */
	public String getLugarAccidente() {
		return lugarAccidente;
	}


	/**
	 * @param lugarAccidente the lugarAccidente to set
	 */
	public void setLugarAccidente(String lugarAccidente) {
		this.lugarAccidente = lugarAccidente;
	}


	/**
	 * @return the consecuencias
	 */
	public String getConsecuencias() {
		return consecuencias;
	}


	/**
	 * @param consecuencias the consecuencias to set
	 */
	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}
	
	
	
	

}
