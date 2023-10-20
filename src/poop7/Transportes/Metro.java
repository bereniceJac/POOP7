/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7.Transportes;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * Clase que representa a un tren subterráneo.
 * Hereda de la clase Subterraneo, por lo que tiene todas sus propiedades y métodos, más las propiedades y métodos propios de la clase Metro.
 */
public class Metro extends Subterraneo {
    /**
     * Atributos del metro
     * trasbordos, color de la linea
     */
    private String trasbordos, colorLinea;
    /**
     * constructor vacio
     */
    public Metro() {
    }
    /**
     * 
     * @param trasbordos Estaciones en las que se puede hacer transbordo a otra línea
     * @param colorLinea Color de la línea del metro
     */
    public Metro(String trasbordos, String colorLinea) {
        this.trasbordos = trasbordos;
        this.colorLinea = colorLinea;
    }
    
    /**
     * 
    * @param trasbordos Estaciones en las que se puede hacer transbordo a otra línea
     * @param colorLinea Color de la línea del metro
     * @param vagones Número de vagones del trasnporte
     * @param capacidad Número de pasajeros que puede transportar 
     * @param linea numero de linea del trasnporte
     */
    public Metro(String trasbordos, String colorLinea, 
            int vagones, int capacidad, String linea) {
        super(vagones, capacidad, linea);
        this.trasbordos = trasbordos;
        this.colorLinea = colorLinea;
    }
    /**
     * 
     * @param trasbordos Estaciones en las que se puede hacer transbordo a otra línea
     * @param colorLinea Color de la línea del metro
     * @param vagones Número de vagones del trasnporte
     * @param capacidad Número de pasajeros que puede transportar 
     * @param linea numero de linea del trasnporte
     * @param ventanas ventanas del vehículo
     * @param combustible combustible que tiene el vehículo
     * @param puertas puertas del vehículo
     */
    public Metro(String trasbordos, String colorLinea, 
            int vagones, int capacidad, String linea, 
            int ventanas, int combustible, int puertas) {
        super(vagones, capacidad, linea, ventanas, combustible, puertas);
        this.trasbordos = trasbordos;
        this.colorLinea = colorLinea;
    }
    /**
     * 
     * @param trasbordos Estaciones en las que se puede hacer transbordo a otra línea
     * @param colorLinea Color de la línea del metro
     * @param vagones Número de vagones del trasnporte
     * @param capacidad Número de pasajeros que puede transportar 
     * @param linea numero de linea del trasnporte
     * @param ventanas ventanas del vehículo
     * @param combustible combustible que tiene el vehículo
     * @param puertas puertas del vehículo
      @param tipo tipo de transporte
     * @param numPasajeros numero de pasajeros del metro
     * @param costo costo del metro
     */ 
    public Metro(String trasbordos, String colorLinea, 
            int vagones, int capacidad, String linea, 
            int ventanas, int combustible, int puertas,
            String tipo, int numPasajeros, float costo) {
        super(vagones, capacidad, linea, ventanas, combustible, 
                puertas, tipo, numPasajeros, costo);
        this.trasbordos = trasbordos;
        this.colorLinea = colorLinea;
    }
    
    /**
     * 
     * @return Devuelve las estaciones en las que se puede hacer transbordo a otra línea.
     */
    public String getTrasbordos() {
        return trasbordos;
    }
    /**
     * Establece las estaciones en las que se puede hacer transbordo a otra líne
     * @param trasbordos estaciones en las que hay trasbordos
     */
    public void setTrasbordos(String trasbordos) {
        this.trasbordos = trasbordos;
    }
    
    /**
     * 
     * @return Devuelve el color de la línea del metro
     */
    public String getColorLinea() {
        return colorLinea;
    }
    /**
     *  Establece el color de la línea del metro.
     * @param colorLinea color de la línea del metro
     */
    public void setColorLinea(String colorLinea) {
        this.colorLinea = colorLinea;
    }
    
    /**
     * Indica que el metro se está dirigiendo hacia el destino especificado
     * @param destino  destino especificado
     */
    public void viajar(String destino){
        System.out.println("Llendo hacia "+destino);
    }
    
    /**
     * Anuncia la próxima estación
     * @param nombre de la proxima estacion
     */
    public void decirEstacion(String nombre){
        System.out.println("Proxima estacion "+nombre);
    }
    
    /**
     *  Indica el número de personas que ingresan al metro
     * @param numPersonas personas que ingresan al metro
     */
    public void ingresar(int numPersonas){
        System.out.println("Ingresaron "+numPersonas+" personas");
    }
    
    /**
     * Método toString sobrescrito que muestra los valores de los atributos del metro
     * @return returna una concatenación de los valores de los atributos del metro
     */
    @Override
    public String toString() {
        return " Metro{" + "trasbordos=" + trasbordos + ", colorLinea=" + colorLinea + super.toString()+'}';
    }
    
    
}
