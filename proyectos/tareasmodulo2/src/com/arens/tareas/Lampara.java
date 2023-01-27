package com.arens.tareas;

public class Lampara {
 
	private String color;
	private boolean encendida;
 
	/**
	 * El objeto de tipo Lampara puede instanciarse con un color
	 * elegido al instanciarlo, o con el color "Roja" predeterminado.
	 */
	public Lampara(String color) {
		this.color = color;
	}
	public Lampara() {
		this("Roja");
	}
 
	public String getColor() {
		return color;
	}
 
	/**
	 * Asigna a encendida el valor contrario al que posee.
	 */
	public void interruptor() {
		encendida = !encendida;
		System.out.println("Lámpara: " + encendida);
	}
 
	public boolean isEncendida() {
		return encendida;
	}
 
	@Override
	public String toString() {
		String onOff = encendida ? "ON" : "OFF";
 		return "La lámpara es " + color + " y está " + onOff;
	}	
}
 
class LamparaCreator {
	public static void main(String[] args) {
 
		Lampara lampara = new Lampara();
		System.out.println(lampara);
		System.out.println(lampara.getColor() + " " + lampara.isEncendida());
		lampara.interruptor();
		System.out.println(lampara.getColor() + " " + lampara.isEncendida());
		System.out.println(lampara);
 
	}
}

/*
*   Resultados:
*   La lámpara es Roja y está OFF
*   Roja false
*   Lámpara: true
*   Roja true
*   La lámpara es Roja y está ON
*/
