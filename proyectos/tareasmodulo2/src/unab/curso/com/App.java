package unab.curso.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);

        bailar(scanner);
    }

    public static String bailar(Scanner scanner) {
        System.out.print("¡Ey Bailarín! ¿Cuál es tu nombre?: ");
        String nombreBailarin = scanner.nextLine();
        System.out.println(nombreBailarin + " está bacilando " + escucharMusica(scanner) + "\r\n");

        //
        return nombreBailarin;
    }

    public static String escucharMusica(Scanner scanner) {

        String cancion = "";
        ArrayList<String> playlist = new ArrayList<String>(Arrays.asList("Flowers - Miley Cyrus",
                "Billie Jean - Michael Jackson", "Imagine - John Lennon", "Uptown Funk - Mark Ronson ft. Bruno Mars",
                "Marisola - Stanly ft Cris MJ", "Motomami - Rosalia ", "Ultra solo - Paloma mami ft Polima"));
        Random rand = new Random();
        boolean process = true;
        while (process) {
            cancion = playlist.get(rand.nextInt(playlist.size()));
            System.out.print("Está sonando " + cancion + ".\r\nTe gusta? (Si/No):");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("Si")) {
                System.out.println("Disfruta tu canción ;) ");
                process = false;
            } else if (respuesta.equalsIgnoreCase("No")) {
                System.out.println("Ahí va otra.");
            } else {
                System.out.println("Respuesta Inválida");
            }

        }

        return cancion;

    }

}
