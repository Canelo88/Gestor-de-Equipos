package gestorEquipos;

import java.util.Scanner;

public class Jugador {

    //Declaración de variables locales
    private String nombreJugador;
    private int edadJugador;
    private String posicionJugador;
    private int numeroJugador;

    //Constructor
    public Jugador(String pNombreJugador, int pEdadJugador, String pPosicionJugador, int pNumeroJugador) {
        this.nombreJugador = pNombreJugador;
        this.edadJugador = pEdadJugador;
        this.posicionJugador = pPosicionJugador;
        this.numeroJugador = pNumeroJugador;
    }

    //Métodos y Funciones
    public void mostrarInformacion() {
        System.out.println("===== JUGADOR =====\n");
        System.out.println("Nombre:\t\t" + nombreJugador);
        System.out.println("Edad:\t\t" + edadJugador);
        System.out.println("Posición:\t" + posicionJugador);
        System.out.println("Número:\t\t" + numeroJugador);
        System.out.println();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nJugador{");
        sb.append("nombreJugador=").append(nombreJugador);
        sb.append(", edadJugador=").append(edadJugador);
        sb.append(", posicionJugador=").append(posicionJugador);
        sb.append(", numeroJugador=").append(numeroJugador);
        sb.append('}');
        return sb.toString();
    }

}
