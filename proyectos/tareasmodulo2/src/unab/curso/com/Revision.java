
package com.arens.sprint2;

/**
 * @author Leonardo Rojas Escarez
 *
 */
public class Revision {
    // Atributos
    private int idRevision;
    private int idVisita;
    private String nombre;
    private String detalle;
    private int estado;

    // Constructor
    public Revision(int idRevision, int idVisita, String nombre, String detalle, int estado) {
        this.idRevision = idRevision;
        this.idVisita = idVisita;
        this.nombre = nombre;
        this.detalle = detalle;
        this.estado = estado;
    }

    // Getters y setters
    public int getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(int idRevision) {
        this.idRevision = idRevision;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    // Método para imprimir la información de la revisión
    public void imprimirRevision() {
        System.out.println("ID de revisión: " + idRevision);
        System.out.println("ID de visita: " + idVisita);
        System.out.println("Nombre de la revisión: " + nombre);
        System.out.println("Detalle a revisar: " + detalle);
        System.out.println("Estado: " + estado);
    }
}




		/*En este código, se definen los atributos de la revisión como variables de instancia, y se crea un constructor que inicializa estos atributos. También se crean getters y setters para acceder a estos atributos y modificarlos
 		si es necesario. Finalmente, se incluye un método para imprimir la información de
 		la revisión en la consola.

		Para utilizar esta clase, se puede crear una instancia de la misma en el código 
		principal y llamar al método imprimirRevision para mostrar la información de la 
		revisión en la consola. Por ejemplo:



		Revision revision1 = new Revision(1, 1, "Revisión del equipo de seguridad",
 		"Verificar que todos los elementos de seguridad se encuentren en buen estado", 2);
		revision1.imprimirRevision();


		Esto mostraría en la consola la siguiente información:

		ID de revisión: 1
			ID de visita: 1
		Nombre de la revisión: Revisión del equipo de seguridad
		Detalle a revisar: Verificar que todos los elementos de seguridad se encuentren 
		en buen estado
		Estado: 2

		 */



