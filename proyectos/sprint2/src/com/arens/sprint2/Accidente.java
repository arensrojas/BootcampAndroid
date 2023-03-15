package com.arens.sprint2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Accidente {
    private int identificador;
    private String rutCliente;
    private LocalDate dia;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencias;
    
    public Accidente(int identificador, String rutCliente, LocalDate dia, String hora, String lugar, String origen, String consecuencias) {
        // Validaciones de los campos obligatorios
        if (identificador <= 0) {
            throw new IllegalArgumentException("El identificador debe ser un número positivo.");
        }
        if (rutCliente == null || rutCliente.isEmpty()) {
            throw new IllegalArgumentException("El RUT del cliente es obligatorio.");
        }
        if (dia == null) {
            throw new IllegalArgumentException("El día del accidente es obligatorio.");
        }
        if (hora == null || !hora.matches("\\d{2}:\\d{2}")) {
            throw new IllegalArgumentException("La hora del accidente debe tener formato HH:MM.");
        }
        if (lugar == null || lugar.length() < 10 || lugar.length() > 50) {
            throw new IllegalArgumentException("El lugar del accidente debe tener entre 10 y 50 caracteres.");
        }
        
        // Asignación de los campos
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }
    
    
    
    public Accidente() {
		super();
	}



	// Getters y setters
    
    public int getIdentificador() {
        return identificador;
    }
    
    public void setIdentificador(int identificador) {
        if (identificador <= 0) {
            throw new IllegalArgumentException("El identificador debe ser un número positivo. ");
        }
        this.identificador = identificador;
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
    
    public LocalDate getDia() {
        return dia;
    }
    
    public void setDia(LocalDate dia) {
        if (dia == null) {
            throw new IllegalArgumentException("El día del accidente es obligatorio.");
        }
        this.dia = dia;
    }
    
    public String getHora() {
        return hora;
    }
    
    public void setHora(String hora) {
        if (hora == null || !hora.matches("\\d{2}:\\d{2}")) {
            throw new IllegalArgumentException("La hora del accidente debe tener formato HH:MM.");
        }
        this.hora = hora;
    }
    
    public String getLugar() {
        return lugar;
    }
    
    public void setLugar(String lugar) {
        if (lugar == null || lugar.length() < 10 || lugar.length() > 50) {
            throw new IllegalArgumentException("El lugar del accidente debe tener entre 10 y 50 caracteres.");
        }
        this.lugar = lugar;
    }
    
    public String getOrigen() {
        return origen;
    }
    
    public void setOrigen() {
    	if ( origen.length() > 70) {
            throw new IllegalArgumentException("El texto debe tener menos  de 70 caracteres.");
        }
        this.origen = origen;
    }
    
    
    
    
    
    public String getConsecuencias() {
        return consecuencias;
    }
    
    public void setConsecuencias() {
    	if ( consecuencias.length() > 100) {
            throw new IllegalArgumentException("El texto debe tener menos  de 100 caracteres.");
        }
        this.consecuencias = consecuencias;
    }



	@Override
	public String toString() {
		return "Accidente [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora="
				+ hora + ", lugar=" + lugar + ", origen=" + origen + ", consecuencias=" + consecuencias + "]";
	}
    
    
}

