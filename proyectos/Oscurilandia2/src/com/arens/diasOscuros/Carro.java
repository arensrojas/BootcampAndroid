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
	protected int fila;
	protected int columna;
	protected int [][]posicion=  new int [fila][columna] ;
	
	
	
	


	public Carro(String patente, String cantidadOcupantes, String fechaIngreso, int fila, int columna,
			int[][] posicion) {
		super();
		this.patente = patente;
		this.cantidadOcupantes = cantidadOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.fila = fila;
		this.columna = columna;
		this.posicion = posicion;
	}


	@Override
	public String toString() {
		return "Carro [patente=" + patente + ", cantidadOcupantes=" + cantidadOcupantes + ", fechaIngreso="
				+ fechaIngreso + ", fila=" + fila + ", columna=" + columna + ", posicion=" + posicion + "]";
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
	 * @return the fila
	 */
	public int getFila() {
		return fila;
	}


	/**
	 * @param fila the fila to set
	 */
	public void setFila(int fila) {
		this.fila = fila;
	}


	/**
	 * @return the columna
	 */
	public int getColumna() {
		return columna;
	}


	/**
	 * @param columna the columna to set
	 */
	public void setColumna(int columna) {
		this.columna = columna;
	}


	/**
	 * @return the posicion
	 */
	public int[][] getPosicion() {
		return posicion;
	}


	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int[][] posicion) {
		this.posicion = posicion;
	}


	public void  mostrarDatos() {
		
		System.out.println(this.patente);
		System.out.println(this.cantidadOcupantes);
		System.out.println(this.fechaIngreso);
		System.out.println(this.fila);
		System.out.println(this.columna);
		System.out.println(this.posicion);
	
	}





}
