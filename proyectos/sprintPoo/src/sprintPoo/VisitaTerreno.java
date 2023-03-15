/**
 * 
 */
package sprintPoo;

/**
 * @author Leonardo Rojas Escárez
 *
 */
public class VisitaTerreno {
		
	// TODO	Identificador de la visita en terreno: obligatorio, número interno manejado
	// TODO	porla compañía.
	// TODO	RUT cliente: obligatorio
	// TODO	Día: fecha del accidente, independiente si lo declara como una fecha o un
	// TODO	String,debe ser desplegado con el formato DD/MM/AAAA
	// TODO	 Hora: debe ser una hora válida del día, en formato HH:MM (hora desde
	// TODO	0 a23, minutos entre 0 y 59)
	// TODO	Lugar: obligatorio, mínimo 10 caracteres, máximo 50
	// TODO	Comentarios: máximo 100 caracteres
	
	
	private int idVisitaTerreno;
	private String rut;
	private String dia;
	private int hora;
	private String lugarVisita;
	private String comentarios;
	
	
	@Override
	public String toString() {
		return "VisitaTerreno [idVisitaTerreno=" + idVisitaTerreno + ", rut=" + rut + ", dia=" + dia + ", hora=" + hora
				+ ", lugarVisita=" + lugarVisita + ", comentarios=" + comentarios + "]";
	}


	public VisitaTerreno(int idVisitaTerreno, String rut, String dia, int hora, String lugarVisita, String comentarios) {
		super();
		this.idVisitaTerreno = idVisitaTerreno;
		this.rut = rut;
		this.dia = dia;
		this.hora = hora;
		this.lugarVisita = lugarVisita;
		this.comentarios = comentarios;
	}


	public VisitaTerreno() {
		super();
	}


	/**
	 * @return the idVisita
	 */
	public int getIdVisita() {
		return idVisitaTerreno;
	}


	/**
	 * @param idVisita the idVisita to set
	 */
	public void setIdVisita(int idVisita) {
		this.idVisitaTerreno = idVisita;
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
	 * @return the lugarVisita
	 */
	public String getLugarVisita() {
		return lugarVisita;
	}


	/**
	 * @param lugarVisita the lugarVisita to set
	 */
	public void setLugarVisita(String lugarVisita) {
		this.lugarVisita = lugarVisita;
	}


	/**
	 * @return the comentarios
	 */
	public String getComentarios() {
		return comentarios;
	}


	/**
	 * @param comentarios the comentarios to set
	 */
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	
	
	


}
