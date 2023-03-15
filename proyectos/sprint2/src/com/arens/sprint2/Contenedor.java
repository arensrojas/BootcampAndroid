/**
 * 
 */
package com.arens.sprint2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Leonardo Rojas Escarez
 *
 */
public class Contenedor implements Asesoria {

	public static ArrayList<Usuario> users = new ArrayList<Usuario>();
	public static ArrayList<Capacitacion> capacitacion = new ArrayList<Capacitacion>();
	private String sistemaSalud;

	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub

	}

	public void addCliente() {
		Scanner input = new Scanner(System.in);
		System.out.println("\tINGRESAR NUEVO CLIENTE ");

		// Validate RUT
		String rut;
		do {
			System.out.print("Ingrese RUT (menor a 999999999): ");
			rut = input.nextLine();
			if (rut.isEmpty() || Integer.parseInt(rut) >= 9999999999f) {
				System.out.println("ERROR: El RUT ingresado es invalido.");
			}
		} while (rut.isEmpty() || Integer.parseInt(rut) >= 9999999999f);

		// Validate nombre
		String nombre;
		do {
			System.out.print("Ingrese nombre (entre 5 y 30 caracteres): ");
			nombre = input.nextLine();
			if (nombre.length() < 5 || nombre.length() > 30) {
				System.out.println("ERROR: El nombre ingresado es invalido.");
			}
		} while (nombre.length() < 5 || nombre.length() > 30);

		// Validate apellido
		String apellido;
		do {
			System.out.print("Ingrese apellido (entre 5 y 30 caracteres): ");
			apellido = input.nextLine();
			if (apellido.length() < 5 || apellido.length() > 30) {
				System.out.println("ERROR: El apellido ingresado es invalido.");
			}
		} while (apellido.length() < 5 || apellido.length() > 30);

		// Validate telefono
		String telefono;
		do {
			System.out.print("Ingrese telefono: ");
			telefono = input.nextLine();
			if (telefono.isEmpty()) {
				System.out.println("ERROR: El telefono ingresado es invalido.");
			}
		} while (telefono.isEmpty());

		// Validate afp
		String afp;
		do {
			System.out.print("Ingrese AFP (entre 4 y 30 caracteres): ");
			afp = input.nextLine();
			if (afp.length() < 4 || afp.length() > 30) {
				System.out.println("ERROR: La AFP ingresada es invalida.");
			}
		} while (afp.length() < 4 || afp.length() > 30);

		String sistemaSalud;

		System.out.println("Ingrese sistema de salud, 1 para Fonasa 2 para Isapre");
		sistemaSalud = input.nextLine();

		if (sistemaSalud == "1") {
			this.sistemaSalud = "Fonasa";
		}
		if (sistemaSalud == "2") {
			this.sistemaSalud = "Isapre";
		} else {
			System.out.println("Opcion ingresada es invalida.");
		}

		// Validate direccion
		String direccion;
		do {
			System.out.print("Ingrese direccion (maximo 70 caracteres): ");
			direccion = input.nextLine();
			if (direccion.length() > 70) {
				System.out.println("ERROR: La dirección ingresada es inválida.");
			}
		} while (direccion.length() > 70);

		// Validate comuna
		String comuna;
		do {
			System.out.print("Ingrese comuna (maximo 50 caracteres): ");
			comuna = input.nextLine();
			if (comuna.length() > 50) {
				System.out.println("ERROR: La comuna ingresada es inválida.");
			}
		} while (comuna.length() > 50);

		// Validate edad
		int edad;
		do {
			System.out.print("Ingrese edad (entre 0 y 150): ");
			edad = input.nextInt();
			input.nextLine();
			if (edad < 0 || edad > 150) {
				System.out.println("ERROR: La edad ingresada es inválida.");
			}
		} while (edad < 0 || edad > 150);

		Cliente cliente = new Cliente(edad, comuna, comuna, comuna, comuna, edad, comuna, comuna, edad);
		users.add(cliente);
		System.out.println("Nuevo cliente agregado exitosamente.");
	}

	public void addAdmin() {
		Scanner input = new Scanner(System.in);
		System.out.println("\tINGRESAR NUEVO ADMINISTRATIVO ");
		// Validate RUT
		String rut;
		do {
			System.out.print("Ingrese RUT (menor a 99999999): ");
			rut = input.nextLine();
			if (rut.isEmpty() || Integer.parseInt(rut) >= 99999999) {
				System.out.println("ERROR: El RUT ingresado es invalido.");
			}
		} while (rut.isEmpty() || Integer.parseInt(rut) >= 99999999);
		;
		// Validate nombre
		String nombre;
		do {
			System.out.print("Ingrese nombre (entre 5 y 30 caracteres): ");
			nombre = input.nextLine();
			if (nombre.length() < 5 || nombre.length() > 30) {
				System.out.println("ERROR: El nombre ingresado es invalido.");
			}
		} while (nombre.length() < 5 || nombre.length() > 30);
		System.out.print("Ingrese fecha nacimiento: ");
		String fechaNacimiento = input.nextLine();
		System.out.print("Ingrese area: ");
		String area = input.nextLine();
		System.out.print("Ingrese experiencia previa: ");
		String experienciaPrevia = input.nextLine();
		Administrativo admin = new Administrativo();
		users.add(admin);
		System.out.println("Nuevo administrativo agregado exitosamente.");
	}

	public void addPro() {
		Scanner input = new Scanner(System.in);
		System.out.println("\tINGRESAR NUEVO PROFESIONAL ");
		System.out.print("Ingrese RUT: ");
		String rut = input.nextLine();
		System.out.print("Ingrese nombre: ");
		String nombre = input.nextLine();
		System.out.print("Ingrese fecha nacimiento: ");
		String fechaNacimiento = input.nextLine();
		System.out.print("Ingrese titulo: ");
		String titulo = input.nextLine();
		System.out.print("Ingrese fecha de ingreso: ");
		String fechaIngreso = input.nextLine();
		Profesional pro = new Profesional();
		users.add(pro);
		System.out.println("Nuevo profesional agregado exitosamente.");
	}

	public void addCapacitacion() {
		Scanner input = new Scanner(System.in);
		System.out.println("\tINGRESAR NUEVA CAPACITACION ");
		System.out.print("Ingrese numero de capacitacion: ");
		String capacitacionId = input.nextLine();
		System.out.print("Ingrese rut de cliente: ");
		String rutCliente = input.nextLine();
		System.out.print("Ingrese dia: ");
		String dia = input.nextLine();
		System.out.print("Ingrese hora: ");
		String hora = input.nextLine();
	}

	public void deleteUser() {
		System.out.println("\tELIMINAR USUARIO POR RUT");
		Scanner input = new Scanner(System.in);
		System.out.print("Ingrese rut: ");
		String rut = input.nextLine();
		boolean removed = false;
		for (Usuario user : users) {
			if (user.getRut()== Integer.parseInt(rut)) {
				users.remove(user);
				removed = true;
				System.out.println("Cliente removido exitosamente.");
				break;
			}
		}
		if (!removed) {
			System.out.println("RUT " + rut + " no encontrado.");
		}
	}

	public void showUserList() {
		System.out.println("\tLISTA DE USUARIOS");
		if (users.isEmpty()) {
			System.out.println("Sin usuarios por el momento.");
			return;
		}
		for (Usuario user : users) {
			if (user instanceof Cliente) {
				// Display Cliente-specific fields
				Cliente cliente = (Cliente) user;
				System.out.println("RUT: " + cliente.getRut() + ", Nombre: " + cliente.getNombre()
						+ ", Fecha de nacimiento: " + cliente.getFechaNacimiento() + ", Teléfono: "
						+ cliente.getTelefono() + ", AFP: " + cliente.getAfp() + ", Sistema de salud: "
						+ cliente.getSistemaSalud() + ", Dirección: " + cliente.getDireccion() + ", Comuna: "
						+ cliente.getComuna() + ", Edad: " + cliente.getEdad());
			} else if (user instanceof Administrativo) {
				// Display Administrativo-specific fields
				Administrativo administrativo = (Administrativo) user;
				System.out.println("RUT: " + administrativo.getRut() + ", Nombre: " + administrativo.getNombre()
						+ ", Fecha de nacimiento: " + administrativo.getFechaNacimiento() + ", Área: "
						+ administrativo.getArea() + ", Experiencia previa: " + administrativo.getExperienciaPrevia());
			} else if (user instanceof Profesional) {
				// Display Profesional-specific fields
				Profesional profesional = (Profesional) user;
				System.out.println("RUT: " + profesional.getRut() + ", Nombre: " + profesional.getNombre()
						+ ", Fecha de nacimiento: " + profesional.getFechaNacimiento() + ", Título: "
						+ profesional.getTitulo() + ", Fecha de ingreso: " + profesional.getFechaIngreso());
			} else {
				// Display common fields for all types of users
				System.out.println("RUT: " + user.getRut() + ", Nombre: " + user.getNombre() + ", Fecha de nacimiento: "
						+ user.getFechaNacimiento());
			}
		}
	}

	public void showUserType(String userType) {
		if (users.isEmpty()) {
			System.out.println("Sin usuarios por el momento.");
			return;
		}
		System.out.println("\tLISTA DE " + userType + "s:");
		for (Usuario user : users) {
			if (user instanceof Cliente && userType.equals("Cliente")) {
				// Display Cliente-specific fields
				Cliente cliente = (Cliente) user;
				System.out.println("RUT: " + cliente.getRut() + ", Nombre: " + cliente.getNombre()
						+ ", Fecha de nacimiento: " + cliente.getFechaNacimiento() + ", Teléfono: "
						+ cliente.getTelefono() + ", AFP: " + cliente.getAfp() + ", Sistema de salud: "
						+ cliente.getSistemaSalud() + ", Dirección: " + cliente.getDireccion() + ", Comuna: "
						+ cliente.getComuna() + ", Edad: " + cliente.getEdad());
			} else if (user instanceof Administrativo && userType.equals("Administrativo")) {
				// Display Administrativo-specific fields
				Administrativo administrativo = (Administrativo) user;
				System.out.println("RUT: " + administrativo.getRut() + ", Nombre: " + administrativo.getNombre()
						+ ", Fecha de nacimiento: " + administrativo.getFechaNacimiento() + ", Área: "
						+ administrativo.getArea() + ", Experiencia previa: " + administrativo.getExperienciaPrevia());
			} else if (user instanceof Profesional && userType.equals("Profesional")) {
				// Display Profesional-specific fields
				Profesional profesional = (Profesional) user;
				System.out.println("RUT: " + profesional.getRut() + ", Nombre: " + profesional.getNombre()
						+ ", Fecha de nacimiento: " + profesional.getFechaNacimiento() + ", Título: "
						+ profesional.getTitulo() + ", Fecha de ingreso: " + profesional.getFechaIngreso());
			} else if (userType.equals("Usuario")) {
				// Display common fields for all types of users
				System.out.println("RUT: " + user.getRut() + ", Nombre: " + user.getNombre() + ", Fecha de nacimiento: "
						+ user.getFechaNacimiento());
			}
		}
	}

	public void showCapacitacion() {
		if (capacitacion.isEmpty()) {
			System.out.println("Sin capacitacion por el momento.");
			return;
		}
		System.out.println("List of Capacitaciones:");
		for (Capacitacion cap : capacitacion) {
			System.out.println("Capacitacion ID: " + cap.getCapacitacionId() + ", Rut Cliente: " + cap.getRutCliente()
					+ ", Día: " + cap.getDia() + ", Hora: " + cap.getHora() + ", Lugar: " + cap.getLugar()
					+ ", Duración: " + cap.getDuracion() + ", Cantidad de asistentes: " + cap.cantidadAsistentes());
		}
	}
}