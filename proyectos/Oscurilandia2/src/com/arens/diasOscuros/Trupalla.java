/**
 * 
 */
package com.arens.diasOscuros;

/**
 * @author Leonardo Rojas
 *
 */
   public class Trupalla extends Carro {

	/**
	 * @ private int armadura;
	 * @ private String nombrePersona;
	 */
	
	   private int armadura;
	   private String nombrePersona;
	   
	   
	   
	   

		public Trupalla(String patente, String cantidadOcupantes, String fechaIngreso, int fila, int columna,
			int[][] posicion, int armadura, String nombrePersona) {
		super(patente, cantidadOcupantes, fechaIngreso, fila, columna, posicion);
		
		this.armadura = armadura;
		this.nombrePersona = nombrePersona;
	}
		
		

		@Override
		public String toString() {
			return "Trupalla [armadura=" + armadura + ", nombrePersona=" + nombrePersona + "]";
		}

		/**
		 * @return the armadura
		 */
		public int getArmadura() {
			return armadura;
		}

		/**
		 * @param armadura the armadura to set
		 */
		public void setArmadura(int armadura) {
			this.armadura = armadura;
		}

		/**
		 * @return the nombrePersona
		 */
		public String getNombrePersona() {
			return nombrePersona;
		}

		/**
		 * @param nombrePersona the nombrePersona to set
		 */
		public void setNombrePersona(String nombrePersona) {
			this.nombrePersona = nombrePersona;
		}
	    
	    public  void  trupalla () {
	    	
	    	if (armadura < 5) {
	    		
	    		System.out.println("");
	    	}
	    	
	    	
	    	
	    }
	   
	  	
	
}
