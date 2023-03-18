
package com.arens.sprint2;

/**
 * @author Leonardo Rojas Escarez
 *
 */
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

    // Getters y setters
    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    // Método para imprimir la información de la visita
    public void imprimirVisita() {
        System.out.println("ID de visita: " + idVisita);
        System.out.println("RUT del cliente: " + rutCliente);
        System.out.println("Día: " + dia);
        System.out.println("Hora: " + hora);
        System.out.println("Lugar: " + lugar);
        System.out.println("Comentarios: " + comentarios);
    }
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

