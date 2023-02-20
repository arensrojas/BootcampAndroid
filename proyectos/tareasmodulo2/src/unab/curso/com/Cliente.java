/**
 * 
 */
package com.arens.sprint2;

/**
 * @author Leonardo Rojas escarez
 *
 */


public class Cliente {
    private int rut;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;
    
    public Cliente(int rut, String nombres, String apellidos, String telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
        setRut(rut);
        setNombres(nombres);
        setApellidos(apellidos);
        setTelefono(telefono);
        setAfp(afp);
        setSistemaSalud(sistemaSalud);
        setDireccion(direccion);
        setComuna(comuna);
        setEdad(edad);
    }
    
    public int getRut() {
        return rut;
    }
    
    public void setRut(int rut) {
        if (rut < 0 || rut > 99999999) {
            throw new IllegalArgumentException("El RUT debe ser un número entre 0 y 99.999.999");
        }
        this.rut = rut;
    }
    
    public String getNombres() {
        return nombres;
    }
    
    public void setNombres(String nombres) {
        if (nombres.length() < 5 || nombres.length() > 30) {
            throw new IllegalArgumentException("Los nombres deben tener entre 5 y 30 caracteres");
        }
        this.nombres = nombres;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public void setApellidos(String apellidos) {
        if (apellidos.length() < 5 || apellidos.length() > 30) {
            throw new IllegalArgumentException("Los apellidos deben tener entre 5 y 30 caracteres");
        }
        this.apellidos = apellidos;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        if (telefono.isEmpty()) {
            throw new IllegalArgumentException("El teléfono es obligatorio");
        }
        this.telefono = telefono;
    }
    
    public String getAfp() {
        return afp;
    }
    
    public void setAfp(String afp) {
        if (afp.length() < 4 || afp.length() > 30) {
            throw new IllegalArgumentException("La AFP debe tener entre 4 y 30 caracteres");
        }
        this.afp = afp;
    }
    
    public int getSistemaSalud() {
        return sistemaSalud;
    }
    
    public void setSistemaSalud(int sistemaSalud) {
        if (sistemaSalud != 1 && sistemaSalud != 2) {
            throw new IllegalArgumentException("El sistema de salud debe ser 1 (Fonasa) o 2 (Isapre)");
        }
        this.sistemaSalud = sistemaSalud;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        if (direccion.length() > 70) {
            throw new IllegalArgumentException("La dirección debe tener a lo más 70 caracteres");
        }
        this.direccion = direccion;
    }
    
    public String getComuna() {
        return comuna;
    }
    
    public void setComuna(String comuna) {
        if (comuna.length() > 50) {
            throw new IllegalArgumentException("La comuna debe tener a lo más 50 caracteres");
        }
        this.comuna = comuna;
    }
}
