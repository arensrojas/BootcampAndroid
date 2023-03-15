/**
 * 
 */
package com.arens.diasOscuros;

/**
 * @author Leonardo Rojas
 *
 */
public class Tablero {
	
	
	
		
		//Método mostrarTableroCompleto
		
	/**
	 * @param args
	 */
	String[][] tablero = new String[15][15];
	//ArrayList<Carro> carros = new ArrayList<Carro>();
	//ArrayList<Huevo> tiros = new ArrayList<Huevo>();
	//Marcador marcador = new Marcador();
	
	public Tablero() {
		
		
		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[0].length; y++) {
				tablero[x][y] = "[-]";
			}
		}
	}
	
	/**
	 * Muestra el tablero en pantalla
	 */
	public void mostrarTableroCompleto() {
		for (int i = 0; i < tablero.length; i++) {
			System.out.printf("%3s", i);
		}
		Llamadas.escribir("");
		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[0].length; y++) {
				System.out.print(tablero[x][y]);
			}
			System.out.println(x);
		}
	}
		
		
		
		
	
	}

	
	


