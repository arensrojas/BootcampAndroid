package com.arens.sprint2;

public class Revision {
    private int idRevision;
    private int idVisitaTerreno;
    private String nombreRevision;
    private String detalle;
    private int estado;

    public Revision(int idRevision, int idVisitaTerreno, String nombreRevision, String detalle, int estado) {
        this.idRevision = idRevision;
        this.idVisitaTerreno = idVisitaTerreno;
        this.nombreRevision = nombreRevision;
        this.detalle = detalle;
        this.estado = estado;
    }
    
    

    public Revision() {
		super();
	}



	public void setIdRevision(int idRevision) {
        if (idRevision <= 0) {
            throw new IllegalArgumentException("El identificador debe ser un número positivo.");
        }
        this.idRevision = idRevision;
    }

    public int getIdVisitaTerreno() {
        return idVisitaTerreno;
    }

    public void setIdVisitaTerreno(int idVisitaTerreno) {
        this.idVisitaTerreno = idVisitaTerreno;
    }

    public String getNombreRevision() {
        return nombreRevision;
    }
    
    public void setNombres(String nombres) {
        if (nombreRevision.length() < 10 || nombreRevision.length() > 50) {
            throw new IllegalArgumentException("El nombre de la persona que revisó debe tener entre 5 y 30 caracteres. ");
        }
        this.nombreRevision = nombreRevision;
    }

    public String getDetalle() {
        return detalle;
    }
    
    public void setDetalle() {
    	if ( detalle.length() > 100) {
            throw new IllegalArgumentException("El texto debe tener menos  de 100 caracteres.");
        }
        this.detalle = detalle;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        if (estado < 1 || estado > 3) {
            throw new IllegalArgumentException("El estado debe ser 1, 2 o 3");
        }
        this.estado = estado;
    }



	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", idVisitaTerreno=" + idVisitaTerreno + ", nombreRevision="
				+ nombreRevision + ", detalle=" + detalle + ", estado=" + estado + "]";
	}
    
    
}
