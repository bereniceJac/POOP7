/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7.Transportes;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * Clase que representa a un tren suburbano. 
 * Hereda de la clase Subterraneo, por lo que tiene todas sus propiedades y métodos, más las propiedades y métodos propios de la clase Suburbano
 */
public class Suburbano extends Subterraneo {
    /**
     * Atributos del suburbano
     * ruta
     */
    private String ruta;
    
    /**
     * constructor vacio
     */
    public Suburbano() {
    }
    
    /**
     * 
     * @param ruta nombre de la ruta del suburbano
     */
    public Suburbano(String ruta) {
        this.ruta = ruta;
    }
    /**
     * 
    * @param ruta nombre de la ruta del suburbano
    * @param vagones Número de vagones del trasnporte
     * @param capacidad Número de pasajeros que puede transportar 
     * @param linea numero de linea del trasnporte
     */
    public Suburbano(String ruta, int vagones, int capacidad,
            String linea) {
        super(vagones, capacidad, linea);
        this.ruta = ruta;
    }
    
    /**
     * 
     * @param ruta nombre de la ruta del suburbano
     * @param vagones Número de vagones del trasnporte
     * @param capacidad Número de pasajeros que puede transportar 
     * @param linea numero de linea del trasnporte
     * @param ventanas ventanas del vehículo
     * @param combustible combustible que tiene el vehículo
     * @param puertas puertas del vehículo
     */
    public Suburbano(String ruta, int vagones, int capacidad, 
            String linea, int ventanas, int combustible, int puertas) {
        super(vagones, capacidad, linea, ventanas, combustible, puertas);
        this.ruta = ruta;
    }
    /**
     * 
     * @param ruta nombre de la ruta del suburbano
     * @param vagones Número de vagones del trasnporte
     * @param capacidad Número de pasajeros que puede transportar 
     * @param linea numero de linea del trasnporte
     * @param ventanas ventanas del vehículo
     * @param combustible combustible que tiene el vehículo
     * @param puertas puertas del vehículo
      @param tipo tipo de transporte
     * @param numPasajeros numero de pasajeros del suburbanp
     * @param costo costo del suburbanp
     */ 
    public Suburbano(String ruta, int vagones, int capacidad, String linea, 
            int ventanas, int combustible, int puertas, String tipo, 
            int numPasajeros, float costo) {
        super(vagones, capacidad, linea, ventanas, combustible, puertas,
                tipo, numPasajeros, costo);
        this.ruta = ruta;
    }
    /**
     * 
     * @return Devuelve la ruta del suburbano
     */
    public String getRuta() {
        return ruta;
    }
    /**
     * Establece la ruta del suburbrutaano
     * @param ruta ruta del suburbrutaano
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    /**
     * ambia la ruta del suburbano al destino especificado.
     * @param destino destino especificad
     */
    public void cambiarRuta(String destino){
        System.out.println("Cambiando de ruta a "+destino);
    }
    
    /**
     * Método toString sobrescrito que muestra los valores de los atributos del suburbano
     * @return returna una concatenación de los valores de los atributos del suburbano
     */
    @Override
    public String toString() {
        return " Suburbano{" + "ruta=" + ruta + super.toString()+'}';
    }
    
}
