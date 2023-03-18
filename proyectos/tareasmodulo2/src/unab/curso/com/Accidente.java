
package com.arens.sprint2;

/**
 * @author Leonardo Rojas Escarez
 *
 */
public class Accidente {
    private int id;
    private String rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencias;
    
    public Accidente(int id, String rutCliente, String dia, String hora, String lugar, String origen, String consecuencias) {
        this.id = id;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }
    
    // Getters y setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
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
    
    public String getOrigen() {
        return origen;
    }
    
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    public String getConsecuencias() {
        return consecuencias;
    }
    
    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }
}

