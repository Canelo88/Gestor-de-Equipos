/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestorEquipos;

import java.util.ArrayList;
import java.util.Scanner;
import gestorEquipos.Equipo;
import gestorEquipos.Jugador;

public class GestorDeEquipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Variables Locales
        String opcion = "";
        Scanner teclado = new Scanner(System.in);
        ArrayList<Equipo> Equipos = new ArrayList<>();

        //Llena la Base de datos
        Equipo Equipo1 = new Equipo("Barcelona", "España", -1);
        Equipo Equipo2 = new Equipo("Saprisa", "Costa Rica", 41);
        Equipo Equipo3 = new Equipo("Heredia", "Costa Rica", 32);

        Jugador Jugador1 = new Jugador("Andrés", -1, "Central", 6);
        Jugador Jugador2 = new Jugador("Carlos", 38, "Central", 6);
        Jugador Jugador3 = new Jugador("Ignacio", 38, "Central", 6);

        //Código del main        
        menuPrincipal();

        while (!opcion.equalsIgnoreCase("0")) {

            opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Seleccionó Mostrar Equipos");
                    Equipo1.mostrarInformacion();
                    Equipo2.mostrarInformacion();
                    Equipo3.mostrarInformacion();
                    break;

                case "2":
                    System.out.println("Seleccionó Mostrar Jugadores");
                    Jugador1.mostrarInformacion();
                    Jugador2.mostrarInformacion();
                    Jugador3.mostrarInformacion();
                    break;

                case "3":
                    limpiarPantalla();
                    break;

                case "4":
                    menuModificarJugadores();
                    System.out.println("1. " + Jugador1.getNombre());
                    System.out.println("2. " + Jugador2.getNombre());
                    System.out.println("3. " + Jugador3.getNombre());
                    System.out.println("0. Para volver al menu anterior!");
                    menuModificarJugador(Jugador1, Jugador2, Jugador3, teclado);
                    break;

                case "0":
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    public static void menuPrincipal() {
        System.out.println("===== MENU PRINCIPAL =====\n");
        System.out.println("1. Mostrar Equipos");
        System.out.println("2. Mostrar Jugadores");
        System.out.println("3. Limpiar Consola");
        System.out.println("4. Modificar Jugadores");
        System.out.println("0. Salir");
        System.out.println("==========================\n\n");

        System.out.println("Ingrese la opción del menú: ");
    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
        menuPrincipal();
    }

    public static void menuModificarJugadores() {
        System.out.println("===== MENU MODIFICAR JUGADORES =====\n");
        System.out.println("Digite el número de jugador a modificar");
        System.out.println();
    }

    public static void menuModificarJugador(Jugador vJugador1, Jugador vJugador2, Jugador vJugador3, Scanner teclado) {

        //Variables Locales
        String opcion = "";
        int lEdad;
        String lPosicion;
        int lNumero;

        while (!opcion.equalsIgnoreCase("0")) {

            opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("===== DIGITES NUEVOS VALORES PARA " + vJugador1.getNombre());
                    break;

                case "2":
                    System.out.println("===== DIGITES NUEVOS VALORES PARA " + vJugador1.getNombre());
                    break;

                case "3":
                    System.out.println("===== DIGITES NUEVOS VALORES PARA " + vJugador1.getNombre());
                    break;
                case "0":
                    menuPrincipal();
                    break;
                default:
                    System.out.println("Jugador inválido.");
            }
        }

        System.out.print("Edad:\t\t");
        lEdad = teclado.nextInt();

        System.out.print("Posición:\t");
        lPosicion = teclado.nextLine();

        System.out.print("Número:\t\t");
        lNumero = teclado.nextInt();

        System.out.println();
    }
}
