/**
 * 
 */
package com.arens.diasOscuros;

import java.util.Arrays;

/**
 * @author Leonardo Rojas
 *
 */
public class Caguano extends Carro {

	/**
	 * @ private int alcance;
	 * @ private String colorConfeti;
	 */
	
	private int alcance;
	private String colorConfeti;
	public Caguano(String patente, String cantidadOcupantes, String fechaIngreso, int fila, int columna,
			int[][] posicion) {
		super(patente, cantidadOcupantes, fechaIngreso, fila, columna, posicion);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Caguano [alcance=" + alcance + ", colorConfeti=" + colorConfeti + ", patente=" + patente
				+ ", cantidadOcupantes=" + cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", fila=" + fila
				+ ", columna=" + columna + ", posicion=" + Arrays.toString(posicion) + ", toString()="
				+ super.toString() + ", getPatente()=" + getPatente() + ", getCantidadOcupantes()="
				+ getCantidadOcupantes() + ", getFechaIngreso()=" + getFechaIngreso() + ", getFila()=" + getFila()
				+ ", getColumna()=" + getColumna() + ", getPosicion()=" + Arrays.toString(getPosicion())
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	/**
	 * @return the alcance
	 */
	public int getAlcance() {
		return alcance;
	}
	/**
	 * @param alcance the alcance to set
	 */
	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}
	/**
	 * @return the colorConfeti
	 */
	public String getColorConfeti() {
		return colorConfeti;
	}
	/**
	 * @param colorConfeti the colorConfeti to set
	 */
	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}
	
	
	
	
	
	
	
	
	

}
