/**
 * 
 */
package sprintPoo;

import java.util.*;

/**
 * @author Leonardo Rojas Escárez
 *
 */
public class Capacitacion {
	
	// TODO	Identificador: obligatorio, número interno de la capacitación manejado
	// TODO	por laempresa
	// TODO	 RUT cliente: obligatorio
	// TODO Día: texto, día de la semana. Debe ser un valor permitido entre “lunes” y
	// TODO	“Domingo”(en ese formato)
	// TODO	 Hora: debe ser una hora válida del día, en formato HH:MM (hora desde
	// TODO	0 a23, minutos entre 0 y 59)
	// TODO	 Lugar: obligatorio, mínimo 10 caracteres, máximo 50
	// TODO	 Duración: máximo 70 caracteres
	// TODO	 Cantidad de asistentes: obligatorio, número entero menor que 1000
	
	private int id;
	private String rut;
	private int dia, mes, hora, agno;
	private String lugar;
	private int duracion;
	private int asistentes;
	private Date fCapacitacion;
	
	
	public Capacitacion(int id, String rut, int dia, int mes, int hora, int agno, String lugar, int duracion,
			int asistentes, Date fCapacitacion) {
		super();
		this.id = id;
		this.rut = rut;
		this.dia = dia;
		this.mes = mes;
		this.hora = hora;
		this.agno = agno;
		this.lugar = lugar;
		this.duracion = duracion;
		this.asistentes = asistentes;
		this.fCapacitacion = fCapacitacion;
		
		GregorianCalendar fecha=new GregorianCalendar();
		fCapacitacion=fecha.getTime();
	}


	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", rut=" + rut + ", dia=" + dia + ", mes=" + mes + ", hora=" + hora
				+ ", agno=" + agno + ", lugar=" + lugar + ", duracion=" + duracion + ", asistentes=" + asistentes
				+ ", fCapacitacion=" + fCapacitacion + "]";
	}


	public Capacitacion() {
		super();
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	public int getDia() {
		return dia;
	}


	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}


	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}


	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
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
	 * @return the agno
	 */
	public int getAgno() {
		return agno;
	}


	/**
	 * @param agno the agno to set
	 */
	public void setAgno(int agno) {
		this.agno = agno;
	}


	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}


	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}


	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	/**
	 * @return the asistentes
	 */
	public int getAsistentes() {
		return asistentes;
	}


	/**
	 * @param asistentes the asistentes to set
	 */
	public void setAsistentes(int asistentes) {
		this.asistentes = asistentes;
	}


	/**
	 * @return the fCapacitacion
	 */
	public Date getfCapacitacion() {
		return fCapacitacion;
	}


	/**
	 * @param fCapacitacion the fCapacitacion to set
	 */
	public void setfCapacitacion(Date fCapacitacion) {
		this.fCapacitacion = fCapacitacion;
	}
	
	
	
	
	

}
