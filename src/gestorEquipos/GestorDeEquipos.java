package gestorEquipos;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeEquipos {

    public static void main(String[] args) {

        // <editor-fold defaultstate="collapsed" desc="DECLARACIÓN DE VARIABLES">
        String opcion = "";
        Scanner teclado = new Scanner(System.in);
        ArrayList<Equipo> Equipos = new ArrayList<>();
        ArrayList<Jugador> Jugadores = new ArrayList<>();
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="LLENADO DE BASE DE DATOS">
        Equipos.add(new Equipo("Barcelona", "España", -1));
        Equipos.add(new Equipo("Saprisa", "Costa Rica", 41));
        Equipos.add(new Equipo("Heredia", "Costa Rica", 32));

        Jugadores.add(new Jugador("Andrés", -1, "Central", 6));
        Jugadores.add(new Jugador("Carlos", 38, "Central", 6));
        Jugadores.add(new Jugador("Ignacio", 38, "Central", 6));
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="CODIGO MAIN"> 
        menuPrincipal("");

        while (!opcion.equals("0")) {

            opcion = teclado.nextLine();

            menuPrincipal(textoLineaConsola(String.format("Opción seleccionada: [%s] Continuamos...", opcion)));

            switch (opcion) {
                case "1":
                    System.out.println();
                    menuJugadoresMostrar(Jugadores);
                    break;

                case "2":

                    break;

                case "3":
                    menuJugadoresModificar();
                    break;

                case "5":
                    menuJugadoresAgregar();
                    break;

                case "0":
                    System.out.println("\n║ >>>>>>>>>>>>>> Saliendo del programa... <<<<<<<<<<<<<<<< ║");
                    System.out.println("╚══════════════════════════════════════════════════════════╝");
                    break;

                default:
                    menuPrincipal(textoLineaConsola("¡Opción " + opcion + " inválida!"));
            }
        }
        // </editor-fold>
    }

    // <editor-fold defaultstate="collapsed" desc="MÉTODOS Y FUNCIONES">
    public static void menuPrincipal(String pLineaExtra) {
        System.out.println("\n".repeat(60));

//                          0        1         2         3         4         5         6         7
//                          1234567890123456789012345678901234567890123456789012345678901234567890
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║" + centrar("MENU PRINCIPAL", 58) + "║");
        System.out.println("╠══════════════════════════════════════════════════════════╣");
        System.out.println("║ JUGADORES                                                ║");
        System.out.println("╠══════════════════════════════════════════════════════════╣");
        System.out.println("║ └> 1. Mostrar                                            ║");
        System.out.println("║ └> 2. Agregar                                            ║");
        System.out.println("║ └> 3. Modificar                                          ║");
        System.out.println("║ └> 4. Eliminar                                           ║");
        System.out.println("╠══════════════════════════════════════════════════════════╣");
        System.out.println("║ EQUIPOS                                                  ║");
        System.out.println("╠══════════════════════════════════════════════════════════╣");
        System.out.println("║ └> 5. Mostrar                                            ║");
        System.out.println("║ └> 6. Agregar                                            ║");
        System.out.println("║ └> 7. Modificar                                          ║");
        System.out.println("║ └> 8. Eliminar                                           ║");
        System.out.println("╠══════════════════════════════════════════════════════════╣");
        System.out.println("║                                              0. Salir <┘ ║");
        System.out.println("╠══════════════════════════════════════════════════════════╣");
        
        if (pLineaExtra.length()>0) {
            System.out.println(pLineaExtra);
        } else {
            System.out.println(textoLineaConsola(""));
        }
        
        System.out.println("╠══════════════════════════════════════════════════════════╣");        
        System.out.print(String.format("║ %56s", "Ingrese la opción del menú >>>>>>>>>>>> ["));

        //System.out.println("╔══════════════════════════════════════════════════════════╗");
        //System.out.println("║                     MENU PRINCIPAL                       ║");
        //System.out.println("╠══════════════════════════════════════════════════════════╣");
        //System.out.println("║ JUGADORES                                                ║");
        //System.out.println("╠══════════════════════════════════════════════════════════╣");
        //System.out.println("║ └> 1. Mostrar                                            ║");
        //System.out.println("║ └> 2. Agregar                                            ║");
        //System.out.println("║ └> 3. Modificar                                          ║");
        //System.out.println("║ └> 4. Eliminar                                           ║");
        //System.out.println("╠══════════════════════════════════════════════════════════╣");
        //System.out.println("║ EQUIPOS                                                  ║");
        //System.out.println("╠══════════════════════════════════════════════════════════╣");
        //System.out.println("║ └> 5. Mostrar                                            ║");
        //System.out.println("║ └> 6. Agregar                                            ║");
        //System.out.println("║ └> 7. Modificar                                          ║");
        //System.out.println("║ └> 8. Eliminar                                           ║");
        //System.out.println("╠══════════════════════════════════════════════════════════╣");
        //System.out.println("║                                              0. Salir <┘ ║");
        //System.out.println("╠══════════════════════════════════════════════════════════╣");
        //System.out.println("║                                                          ║");
        //System.out.println("╠══════════════════════════════════════════════════════════╣");
        //System.out.print  ("║ >>>>>>>>>>>>>> Ingrese la opción del menú >>>>>>>>>>>> [");
    }

    public static void menuJugadoresModificar() {
        System.out.println("===== MENU MODIFICAR JUGADORES =====\n");
        System.out.println("Digite el número de jugador a modificar");
        System.out.println();
    }

    /**
     * Muestra en Consola todos los Jugadores registrados
     *
     * @param pJugadores lista de jugadores que se desea mostrar
     * @return no devuelve nada al ser un método void
     */
    public static void menuJugadoresMostrar(ArrayList<Jugador> pJugadores) {
        System.out.println("\n".repeat(60));

        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║                   MOSTRAR JUGADORES                      ║");
        System.out.println("╠══════════════════════════════════════════════════════════╣");
        //System.out.println("║                                                          ║");
        //System.out.println("║                                                          ║");
        //System.out.println("║                                                          ║");
        //System.out.println("║                                                          ║");
        //System.out.println("║                                                          ║");
        //System.out.println("║                                                          ║");
        //System.out.println("║                                                          ║");
        //System.out.println("║                                                          ║");
        //System.out.println("║                                                          ║");
        //System.out.println("║                                                          ║");
        //System.out.println("║                                                          ║");
        //System.out.println("║                                                          ║");
        //System.out.println("║                                                          ║");
        //System.out.println("║                                                          ║");
        //System.out.println("║                                                          ║");
        //System.out.println("║                                                          ║");
        //System.out.println("║                                                          ║");
        //System.out.println("╠══════════════════════════════════════════════════════════╣");
        //System.out.print  ("║ >>>>>>>>>>>>>> Ingrese la opción del menú >>>>>>>>>>>> [");        

        for (int i = 0; i <= 17; i++) {
            if (i < pJugadores.size()) {
                System.out.println(
                        textoLineaConsola(
                                String.format("%03d", (i + 1))
                                + " | "
                                + pJugadores.get(i).getNombreJugador().toUpperCase()
                                + " | "
                                + pJugadores.get(i).getPosicionJugador().toUpperCase()
                        ));
            } else {
                System.out.println(textoLineaConsola(""));
            }

        }
//        System.out.println("=========================");
//        System.out.println("Total de Jugadores: " + pJugadores.size());
//        System.out.println();
    }

    public static void menuJugadoresAgregar() {

    }

    public static void menuJugadoresModificar(Jugador vJugador1, Jugador vJugador2, Jugador vJugador3, Scanner teclado) {

        //Variables Locales
        String opcion = "";
        int lEdad;
        String lPosicion;
        int lNumero;

        while (!opcion.equalsIgnoreCase("0")) {

            opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
//                    System.out.println("===== DIGITES NUEVOS VALORES PARA " + vJugador1.getNombre());
                    break;

                case "2":
//                    System.out.println("===== DIGITES NUEVOS VALORES PARA " + vJugador1.getNombre());
                    break;

                case "3":
//                    System.out.println("===== DIGITES NUEVOS VALORES PARA " + vJugador1.getNombre());
                    break;
                case "0":
                    menuPrincipal("");
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

    public static String textoLineaConsola(String pTexto) {
        return String.format("║ %-56s ║", pTexto);
    }

    public static String centrar(String texto, int ancho) {
        int espacios = ancho - texto.length();
        int izquierda = espacios / 2;
        int derecha = espacios - izquierda;

        return " ".repeat(izquierda) + texto + " ".repeat(derecha);
    }

    // </editor-fold>
}

//| Símbolo | Nombre aproximado          |
//| ------- | -------------------------- |
//| `═`     | Línea horizontal doble     |
//| `║`     | Línea vertical doble       |
//| `╔`     | Esquina superior izquierda |
//| `╗`     | Esquina superior derecha   |
//| `╚`     | Esquina inferior izquierda |
//| `╝`     | Esquina inferior derecha   |
//| `╠`     | Unión izquierda            |
//| `╣`     | Unión derecha              |
//| `╦`     | Unión superior             |
//| `╩`     | Unión inferior             |
//| `╬`     | Cruce                      |
//┌ ─ ┐ │ └ ┘
//├ ┤ ┬ ┴ ┼
