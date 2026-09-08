/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorEquipos;

/* 
 * @author andresgonzalezgarcia
 */
public class Equipo {
    
    //Declaración de variables privadas
    
    private String nombre;
    private String pais;
    private int cantTitulos;
    
    //Constructor

    public Equipo(String nombre, String pais, int cantTitulos) {
        
        this.nombre = nombre;
        this.pais = pais;
        this.cantTitulos = cantTitulos;
        
    }    
    
    //Get & Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCantTitulos() {
        return cantTitulos;
    }

    public void setCantTitulos(int cantTitulos) {
        if (cantTitulos >= 0 && cantTitulos <= 200)
        {
            this.cantTitulos = cantTitulos;
        }
        else
        {
            System.out.println("¡Cantidad de títulos inválida!");
        }
    }
    
    //Métodos
    
    public void mostrarInformacion()
    {
        System.out.println("===== EQUIPO DE FUTBOL =====\n");
        System.out.println("Nombre del Equipo:\t" + nombre);
        System.out.println("País del Equipo:\t" + pais);
        System.out.println("Cantidad de Títulos:\t" + cantTitulos);
        System.out.println();        
    }
    
    public void menuModificarEquipo(){
        
    }
}
