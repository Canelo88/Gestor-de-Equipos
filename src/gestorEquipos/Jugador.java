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
    private String nombre;
    private int edad;
    private String posicion;
    private int numero;

    //Constructor
    public Jugador(String nombre, int edad, String posicion, int numero) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.numero = numero;
    }

    //Get & Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //Métodos y Funciones
    public void mostrarInformacion()
    {
        System.out.println("===== JUGADOR =====\n");
        System.out.println("Nombre:\t\t" + nombre);
        System.out.println("Edad:\t\t" + edad);
        System.out.println("Posición:\t" + posicion);
        System.out.println("Número:\t\t" + numero);
        System.out.println();        
    }    
}
