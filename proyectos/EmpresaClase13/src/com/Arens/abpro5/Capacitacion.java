/**
 * 
 */
package com.Arens.abpro5;

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
	//Método toString
	@Override
	public String toString() {
		return "Capacitacion: identificador = " + identificador + ", rut = " + rut + ", dia = " + dia + ", hora = " + hora
				+ ", lugar = " + lugar + ", duracion = " + duracion + ", asistentes = " + asistentes ;
	}
	
	
	

}
