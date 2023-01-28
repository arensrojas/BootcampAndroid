package com.arens.tareas;

import java.util.Scanner;


public class Plataforma2 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			
			Scanner entrada = new Scanner(System.in);
			String respuesta;
			
			int cliente = 1;
			int profesional = 2;
			int administrativo = 3;
			
			System.out.println(" ");
			System.out.println("Seleccione usuario (1, 2 o 3):");
			System.out.println(" ");
			System.out.println("1. Cliente");
			System.out.println("2. Profesional");
			System.out.println("3. Administrativo");
			
			respuesta = entrada.nextLine();
			
			
			switch (respuesta) {
			 
			 case "1":
				 			
				System.out.println(" ");
				System.out.println("Ingrese nombre de cliente: ");
				break;
				
			 case "2":
		 			
					System.out.println(" ");
					System.out.println("Ingrese nombre de profesional: ");
					break;
			 case "3":
		 			
					System.out.println(" ");
					System.out.println("Ingrese nombre de administrativo: ");	
					break;
			}
			
			 {
				    Scanner myName = new Scanner(System.in);
				    

				    String userName = myName.nextLine();
				    System.out.println(" ");
				    System.out.println("Nombre: " + userName);
				    System.out.println(" ");
				    System.out.println("Ingrese fecha de nacimiento: ");
				    
				    
				
				    Scanner myNac = new Scanner(System.in);
				    

				    String userNac = myNac.nextLine();
				    System.out.println(" ");
				    System.out.println("Nombre: " + userName);
				    System.out.println("Fecha de nacimiento: " + userNac);
				    System.out.println(" ");
				    System.out.println("Ingrese RUT: ");
				    
	            Scanner myRut = new Scanner(System.in);
				    

				    String userRut = myRut.nextLine();
				    System.out.println(" ");
				    System.out.println("Nombre: " + userName);
				    System.out.println("Fecha de nacimiento: " + userNac);
				    System.out.println("RUT: " + userRut);
				    
				  
	switch (respuesta) {
			 
			 case "1":
				 			
				System.out.println(" ");
				System.out.println("Ingrese direccion de cliente: ");
						
				Scanner myAdress = new Scanner(System.in);
			    

			    String userAdress = myAdress.nextLine();
			    System.out.println(" ");
			    System.out.println("Nombre: " + userName);
		 	    System.out.println("Fecha de nacimiento: " + userNac);
		 	    System.out.println("RUT: " + userRut);
		        System.out.println("Direccion: " + userAdress);
		        System.out.println(" ");
		        System.out.println("Ingrese telefono: ");
		        
		        Scanner myPhone = new Scanner(System.in);
			    

			    String userPhone = myPhone.nextLine();
			    System.out.println(" ");
			    System.out.println("Nombre: " + userName);
			    System.out.println("Fecha de nacimiento: " + userNac);
			    System.out.println("RUT: " + userRut);
			    System.out.println("Direccion: " + userAdress);
			    System.out.println("Telefono: " + userPhone);
			    System.out.println(" ");
			    System.out.println("Ingrese cantidad de empleados: ");
			    
			    Scanner myEmpleados = new Scanner(System.in);
			    String userEmpleados = myEmpleados.nextLine();
			    System.out.println(" ");
			    System.out.println("Nombre: " + userName);
			    System.out.println("Fecha de nacimiento: " + userNac);
			    System.out.println("RUT: " + userRut);
			    System.out.println("Direccion: " + userAdress);
			    System.out.println("Telefono: " + userPhone);
			    System.out.println("Cantidad de empleados " + userEmpleados);
			    break;
			 
				
			    		 
				 case "2":	
					 System.out.println(" ");
					 System.out.println("Ingrese años de experiencia: ");
					 Scanner myYears = new Scanner(System.in);
					 
					 String userYears = myYears.nextLine();
					 
					 System.out.println(" ");
					 System.out.println("Nombre: " + userName);
					 System.out.println("Fecha de nacimiento: " + userNac);
					 System.out.println("RUT: " + userRut);
					 System.out.println("Años de experiencia:" + userYears);
					 System.out.println(" ");
					 System.out.println("Ingrese departamento ");
					 
					 Scanner myDepto = new Scanner(System.in);
					 
					 String userDepto = myDepto.nextLine();
					 
					 System.out.println(" ");
					 System.out.println("Nombre: " + userName);
					 System.out.println("Fecha de nacimiento: " + userNac);
					 System.out.println("RUT: " + userRut);
					 System.out.println("Años de experiencia:" + userYears);
					 System.out.println("Departamento" + userDepto);
					 break;
					 
					 
				 case "3":
					 System.out.println(" ");
					 System.out.println("Ingrese funcion: ");
					 
					 Scanner myFunction = new Scanner(System.in);
					 
					 String userFunction = myFunction.nextLine();
					 System.out.println(" ");
					 System.out.println("Nombre: " + userName);
					 System.out.println("Fecha de nacimiento: " + userNac);
					 System.out.println("RUT: " + userRut);
					 System.out.println("Funcion:" + userFunction);
					 System.out.println(" ");
					 System.out.println("Ingrese nombre superior: ");
					 
					 Scanner mySuperior = new Scanner(System.in);
					 
					 String userSuperior = mySuperior.nextLine();
					 
					 System.out.println(" ");
					 System.out.println("Nombre: " + userName);
					 System.out.println("Fecha de nacimiento: " + userNac);
					 System.out.println("RUT: " + userRut);
					 System.out.println("Funcion:" + userFunction);
					 System.out.println("Nombre superior:" + userSuperior);
					 break;
					 
		


		}}
	}
}


