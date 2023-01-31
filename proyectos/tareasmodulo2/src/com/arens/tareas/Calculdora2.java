/**
 * 
 */
package com.arens.tareas;

/**
 * @author Leonardo Rojas
 *
 */
public class Calculdora2 {

	/**
	 * Atributos
	 */
	private int numero1;
	private int numero2;
	
	
	/*constructores*/
	public Calculdora2() {
		
	}
	
	
	public Calculdora2(int numero1, int numero2) {
	this.numero1 = numero1;
	this.numero2 = numero2;
	}
	
	
	
	public int getNumero1() {
		return numero1;
	}


	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}


	public int getNumero2() {
		return numero2;
	}


	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}


	/*metodos*/
	public int sumar() {
		return this.numero1 + this.numero2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculdora2 calc2 = new Calculdora2();
		
		calc2.setNumero1(100);
		System.out.println(calc2.sumar());
		calc2.setNumero2(10);
		System.out.println(calc2.sumar());
		
		
		
		
		
		
		

	}

}
