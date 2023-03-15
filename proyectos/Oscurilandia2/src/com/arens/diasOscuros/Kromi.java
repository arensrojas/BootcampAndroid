/**
 * 
 */
package com.arens.diasOscuros;

import java.util.Arrays;

/**
 * @author Leonardo Rojas
 *
 */
public class Kromi extends Carro {
	/**
	 * @ String annoFabricacion; 
	 * @ String marca;
	 */
	
	String annoFabricacion;
	String marca;
	public Kromi(String patente, String cantidadOcupantes, String fechaIngreso, int fila, int columna,
			int[][] posicion) {
		super(patente, cantidadOcupantes, fechaIngreso, fila, columna, posicion);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Kromi [annoFabricacion=" + annoFabricacion + ", marca=" + marca + ", patente=" + patente
				+ ", cantidadOcupantes=" + cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", fila=" + fila
				+ ", columna=" + columna + ", posicion=" + Arrays.toString(posicion) + ", toString()="
				+ super.toString() + ", getPatente()=" + getPatente() + ", getCantidadOcupantes()="
				+ getCantidadOcupantes() + ", getFechaIngreso()=" + getFechaIngreso() + ", getFila()=" + getFila()
				+ ", getColumna()=" + getColumna() + ", getPosicion()=" + Arrays.toString(getPosicion())
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	/**
	 * @return the annoFabricacion
	 */
	public String getAnnoFabricacion() {
		return annoFabricacion;
	}
	/**
	 * @param annoFabricacion the annoFabricacion to set
	 */
	public void setAnnoFabricacion(String annoFabricacion) {
		this.annoFabricacion = annoFabricacion;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	

}
