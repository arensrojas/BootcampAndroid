package com.arens.proyectos;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
				Trabajador trabajador1 = new Trabajador( "Carlos", "Caceres", "15345654-6","+569 763491", 45);
				
				//Ahora invocamos los métodos e imprimimos los resultados por consola
				
				//Método toString
				System.out.println(trabajador1.toString());
				
				//Método que concatena nombres y apellidos
				System.out.println(trabajador1.nombreCompleto());
				
				//Método que extrae solamente los números del RUT
				System.out.println(trabajador1.descomponerRut());
			}

	}


