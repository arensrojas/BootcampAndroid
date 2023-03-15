/**
 * 
 */
package com.arens.diasOscuros;

/**
 * @author Leonardo Rojas
 *
 */
public class Huevo  {
	/**
	 * @param args
	 */
	private int x;
	private int y;
	
	
	public Huevo() {
		super();
	}


	public Huevo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	@Override
	public String toString() {
		return "Huevo [x=" + x + ", y=" + y + "]";
	}


	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}


	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}


	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}


	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	

}
