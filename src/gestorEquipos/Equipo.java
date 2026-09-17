package gestorEquipos;

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

    /**
     * Método encargado de setear la cantidad de títulos de un equipo
     * con la condición de que estos no sean menores a 0 ni mayores a
     * 200 títulos
     * @param cantTitulos 
     */
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nEquipo{");
        sb.append("nombre=").append(nombre);
        sb.append(", pais=").append(pais);
        sb.append(", cantTitulos=").append(cantTitulos);
        sb.append('}');
        return sb.toString();
    }
    
    
}
