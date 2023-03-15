package com.arens.sprint2;

public class VisitaEnTerreno {
    // Atributos
    private int idVisita;
    private String rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String comentarios;

    // Constructor
    public VisitaEnTerreno(int idVisita, String rutCliente, String dia,
 String hora, String lugar, String comentarios) {
        this.idVisita = idVisita;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }
    
    

    public VisitaEnTerreno() {
		super();
	}



	// Getters y setters
    public int idVisita() {
        return idVisita;
    }
    
    public void setidVisita(int idVisita) {
        if (idVisita <= 0) {
            throw new IllegalArgumentException("El identificador debe ser un número positivo.");
        }
        this.idVisita = idVisita;
    }

    public String getRutCliente() {
        return rutCliente;
    }
    
    public void setRutCliente(String rutCliente) {
        if (rutCliente == null || rutCliente.isEmpty()) {
            throw new IllegalArgumentException("El RUT del cliente es obligatorio.");
        }
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }
    
    public void setDia(String diaAccidente) {
        if (dia == null || (!dia.equalsIgnoreCase("lunes") && !dia.equalsIgnoreCase("martes") && !dia.equalsIgnoreCase("miércoles")
                && !dia.equalsIgnoreCase("jueves") && !dia.equalsIgnoreCase("viernes") && !dia.equalsIgnoreCase("sábado") && !dia.equalsIgnoreCase("domingo"))) {
            throw new IllegalArgumentException("El día del Accidente debe ser un valor permitido entre 'lunes' y 'domingo'.");
        }
        
    }

    public String getHora() {
        return hora;
    }
    
    /*public void setHora(String Hora) {
        if (hora == null || (!dia.equalsIgnoreCase("lunes") && !día.equalsIgnoreCase("martes") && !día.equalsIgnoreCase("miércoles")
                && !día.equalsIgnoreCase("jueves") && !día.equalsIgnoreCase("viernes") && !día.equalsIgnoreCase("sábado") && !día.equalsIgnoreCase("domingo"))) {
            throw new IllegalArgumentException("El día de la capacitación debe ser un valor permitido entre 'lunes' y 'domingo'.");
        }
        
    }
	*/
    public String getLugar() {
        return lugar;
    }
    
    public void setLugar() {
    	if (lugar.length() > 10 || lugar.length() > 50) {
            throw new IllegalArgumentException("El debe tener más de 10 caracteres y menos de 50.");
        }
        this.lugar = lugar;
        
        
    }
    public void setComentarios() {
    	if ( comentarios.length() > 100) {
            throw new IllegalArgumentException("El texto debe tener menos  de 100 caracteres.");
        }
        this.comentarios = comentarios;
    }



	@Override
	public String toString() {
		return "VisitaEnTerreno [idVisita=" + idVisita + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora="
				+ hora + ", lugar=" + lugar + ", comentarios=" + comentarios + "]";
	}
    
    
    
    
    /*
    // Método para imprimir la información de la visita
    public void imprimirVisita() {
        System.out.println("ID de visita: " + idVisita);
        System.out.println("RUT del cliente: " + rutCliente);
        System.out.println("Día: " + dia);
        System.out.println("Hora: " + hora);
        System.out.println("Lugar: " + lugar);
        System.out.println("Comentarios: " + comentarios);
        
        
    }*/
}



		/*
		En este código, se definen los atributos de la visita en terreno como variables de 
		instancia, y se crea un constructor que inicializa estos atributos. También se 
		crean getters y setters
 		para acceder a estos atributos y modificarlos si es necesario. Finalmente, se 
		incluye un método para imprimir la información de la visita en la consola.

		Para utilizar esta clase, se puede crear una instancia de la misma en el código 
		principal y llamar al método imprimirVisita para mostrar la información de la 
		visita en la consola. Por ejemplo:

		VisitaEnTerreno visita1 = new VisitaEnTerreno(1, "12345678-9", "01/02/2023", 
		"14:30", "Santiago Centro", "Visita realizada con éxito");
		visita1.imprimirVisita();



		Esto mostraría en la consola la siguiente información:

		ID de visita: 1
		RUT del cliente: 12345678-9
		Día: 01/02/2023
		Hora: 14:30
		Lugar: Santiago Centro
		Comentarios: Visita realizada con éxito

		 */