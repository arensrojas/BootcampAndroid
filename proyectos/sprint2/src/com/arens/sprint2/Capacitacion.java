package com.arens.sprint2;

public class Capacitacion {
    private int identificador;
    private String rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantidadAsistentes;
    
    public Capacitacion(int identificador, String rutCliente, String dia, String hora, String lugar, String duración, int cantidadAsistentes) {
        // Validaciones de los campos obligatorios
        if (identificador <= 0) {
            throw new IllegalArgumentException("El identificador debe ser un número positivo.");
        }
        if (rutCliente == null || rutCliente.isEmpty()) {
            throw new IllegalArgumentException("El RUT del cliente es obligatorio.");
        }
        if (dia == null || (!dia.equalsIgnoreCase("lunes") && !dia.equalsIgnoreCase("martes") && !dia.equalsIgnoreCase("miércoles")
                && !dia.equalsIgnoreCase("jueves") && !dia.equalsIgnoreCase("viernes") && !dia.equalsIgnoreCase("sábado") && !dia.equalsIgnoreCase("domingo"))) {
            throw new IllegalArgumentException("El día de la capacitación debe ser un valor permitido entre 'lunes' y 'domingo'.");
        }
        if (hora == null || !hora.matches("\\d{2}:\\d{2}")) {
            throw new IllegalArgumentException("La hora de la capacitación debe tener formato HH:MM.");
        }
        if (lugar == null || lugar.length() < 10 || lugar.length() > 50) {
            throw new IllegalArgumentException("El lugar de la capacitación debe tener entre 10 y 50 caracteres.");
        }
        if (cantidadAsistentes <= 0 || cantidadAsistentes >= 1000) {
            throw new IllegalArgumentException("La cantidad de asistentes debe ser un número entero positivo menor que 1000.");
        }
        
        // Asignación de los campos
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }
    
    // Getters y setters
    
    public int getIdentificador() {
        return identificador;
    }
    
    public void setIdentificador(int identificador) {
        if (identificador <= 0) {
            throw new IllegalArgumentException("El identificador debe ser un número positivo.");
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
    
    public String getDia() {
        return dia;
    }
    
    public void setDía(String día) {
        if (dia == null || (!día.equalsIgnoreCase("lunes") && !dia.equalsIgnoreCase("martes") && !dia.equalsIgnoreCase("miércoles")
                && !dia.equalsIgnoreCase("jueves") && !dia.equalsIgnoreCase("viernes") && !dia.equalsIgnoreCase("sábado") && !dia.equalsIgnoreCase("domingo"))) {
            throw new IllegalArgumentException("El dia de la capacitación debe ser un valor permitido entre 'lunes' y 'domingo'.");
        }
        
    }
    
    public String getHora() {
        return hora;
    }
    
    // public void setHora(String Hora) {
    //    if (hora == null || (!dia.equalsIgnoreCase("lunes") && !día.equalsIgnoreCase("martes") && !dia.equalsIgnoreCase("miércoles")
    //            && !dia.equalsIgnoreCase("jueves") && !dia.equalsIgnoreCase("viernes") && !dia.equalsIgnoreCase("sábado") && !dia.equalsIgnoreCase("domingo"))) {
    //        throw new IllegalArgumentException("El día de la capacitación debe ser un valor permitido entre 'lunes' y 'domingo'.");
    //    }
        
    //}
    
    public String getLugar() {
        return lugar;
    }
    
    public void setLugar() {
    	if (lugar.length() > 10 || lugar.length() > 50) {
            throw new IllegalArgumentException("El debe tener más de 10 caracteres y menos de 50.");
        }
        this.lugar = lugar;
    }
    
    public String getDuracion() {
        return duracion;
    }
    
    public void setDuracion() {
    	if ( duracion.length() > 70) {
            throw new IllegalArgumentException("El texto debe tener menos  de 70 caracteres.");
        }
        this.duracion = duracion;
    }
    
    
    public int cantidadAsistentes() {
        return cantidadAsistentes;
    }
    
    public void setCantidadAsistentes() {
    	while (cantidadAsistentes >= 1000 || cantidadAsistentes < 1) {
            throw new IllegalArgumentException("La cantidad de Asistentes es : .");
        }
        this.cantidadAsistentes = cantidadAsistentes;
    }

	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadAsistentes="
				+ cantidadAsistentes + "]";
	}

	public String getCapacitacionId() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
    
}



		/*//Se solicita al usuario que ingrese la cantidad de asistentes
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de asistentes (menor que 1000): ");
		cantidadAsistentes = scanner.nextInt();

		//Se verifica que la cantidad ingresada sea un número entero menor que 1000
		while (cantidadAsistentes >= 1000 || cantidadAsistentes < 1) {
 		System.out.print("Cantidad de asistentes inválida. Ingrese nuevamente (menor que 1000): ");
		cantidadAsistentes = scanner.nextInt();
		}

		 */

