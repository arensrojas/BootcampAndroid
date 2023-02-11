/**
 * 
 */
package com.arens.diasOscuros;

/**
 * @author Leonardo Rojas
 *
 */
public class Carro {

	/** Atributos
	 * @ cantidadOcupantes;
	 * @ fechaIngreso;
	 */
	
	protected String patente;
	protected String cantidadOcupantes;
	protected String fechaIngreso;
	protected int posicion;
	
	
	
	public Carro(String patente, String cantidadOcupantes, String fechaIngreso, int posicion) {
		super();
		this.patente = patente;
		this.cantidadOcupantes = cantidadOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.posicion = posicion;
	}



	@Override
	public String toString() {
		return "Carro [patente=" + patente + ", cantidadOcupantes=" + cantidadOcupantes + ", fechaIngreso="
				+ fechaIngreso + ", posicion=" + posicion + "]";
	}



	/**
	 * @return the patente
	 */
	public String getPatente() {
		return patente;
	}



	/**
	 * @param patente the patente to set
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}



	/**
	 * @return the cantidadOcupantes
	 */
	public String getCantidadOcupantes() {
		return cantidadOcupantes;
	}



	/**
	 * @param cantidadOcupantes the cantidadOcupantes to set
	 */
	public void setCantidadOcupantes(String cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}



	/**
	 * @return the fechaIngreso
	 */
	public String getFechaIngreso() {
		return fechaIngreso;
	}



	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}



	/**
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}



	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	
	
	
	
	
	
	
	
	

}
