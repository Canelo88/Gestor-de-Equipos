/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorEquipos;
import java.util.Scanner;

/**
 *
 * @author andresgonzalezgarcia
 */
public class Jugador {
    
    //Inicialización de Variables
    Scanner teclado = new Scanner(System.in);
    
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

    //Get & Set
    public String getNombreJugador() {
        return nombreJugador;
    }

    public String getPosicionJugador() {
        return posicionJugador;
    }

    public int getEdadJugador() {
        return edadJugador;
    }

    public int getNumeroJugador() {
        return numeroJugador;
    }
    
    
    
    //Métodos y Funciones
    public void mostrarInformacion()
    {
        System.out.println("===== JUGADOR =====\n");
        System.out.println("Nombre:\t\t" + nombreJugador);
        System.out.println("Edad:\t\t" + edadJugador);
        System.out.println("Posición:\t" + posicionJugador);
        System.out.println("Número:\t\t" + numeroJugador);
        System.out.println();        
    }    
}
