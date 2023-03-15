package com.arens.sprint2;

public class Administrativo extends Usuario {
    private String area;
    private String experienciaPrevia;

    public Administrativo(String area, String experienciaPrevia) {
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }
    
    

    public Administrativo() {
		super();
	}



	public String getArea() {
        return area;
    }

    public void setArea(String area) {
        if (area.length() <= 5 || area.length() < 20) {
            throw new IllegalArgumentException("El area debe tener entre 5 y 20 caracteres. ");
        }
        this.area = area;
    }

    public void setExperiencia(String experienciaPrevia) {
        if (experienciaPrevia.length() < 100) {
            throw new IllegalArgumentException("La Experiencia previa debe tener menos de 100 caracteres. ");
        }
        this.experienciaPrevia = experienciaPrevia;
    }

    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }



	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + "]";
	}



	public String getExperienciaPrevia() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
    
}

