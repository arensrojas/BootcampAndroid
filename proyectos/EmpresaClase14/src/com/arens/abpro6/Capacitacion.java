/**
 * 
 */
package com.arens.abpro6;

/**
 * @author Leonardo Rojas
 *
 */
public class Capacitacion {

	/**
	 * @param argsCapacitación
	- Identificador: número interno de la capacitación manejado por la empresa
	- RUT cliente
	- Día
	- Hora
	- Lugar
	- Duración
	- Cantidad de asistentes
	 */
	
	//Atributos
	private String identificador;
	private String rut;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int  asistentes;
	
	
	//Método toString
		@Override
		public String toString() {
			return "Capacitacion: identificador = " + identificador + ", rut = " + rut + ", dia = " + dia + ", hora = " + hora
					+ ", lugar = " + lugar + ", duracion = " + duracion + ", asistentes = " + asistentes ;
		}
	
	//Constructor vacío
	public Capacitacion() {
				
	}
	
	
	//Constructor con parámetros
	public Capacitacion(String idCliente ,String rutCliente, String diaCapacitacion, String horaCapacitacion,
			String lugarCapacitacion, String duracionCapacitacion, int asistentesCapacitacion) {
			
		
		this.identificador = idCliente;
		this.rut = rutCliente;
		this.dia = diaCapacitacion;
		this.hora = horaCapacitacion;
		this.lugar = lugarCapacitacion;
		this.duracion = duracionCapacitacion;
		this.asistentes = asistentesCapacitacion;
		

}

	/**
	 * @return the identificador
	 */
	public String getIdentificador() {
		return identificador;
	}

	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
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
	public String getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(String hora) {
		this.hora = hora;
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
	public String getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(String duracion) {
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
	
	
	//metodo mostrar detalles
	public String mostrarDetalles() {
		
		return "\t La capacitación será en " + lugar + " " + "a las " + hora + " " +  "del dia " + dia + " " +
				"y durará " + duracion + " \n"  ; 
	}
	

}
