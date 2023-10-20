/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7.Transportes;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * Clase que representa a un vehículo de transporte colectivo.
 * Hereda de la clase Supraterraneo, por lo que tiene todas sus propiedades y métodos, más las propiedades y métodos propios de la clase Combi.
 */
public class Combi extends Supraterraneo{
    /**
     * Atibutos de una combi
     * capacidad ruta
     */
    private int capacidad, ruta;
    
    /**
     * Constructor vacio
     */
    public Combi() {
    }
    
    /**
     * Constructor lleno de combi
     * @param capacidad Número de pasajeros que puede transportar 
     * @param ruta Número de la ruta del vehículo
     */
    public Combi(int capacidad, int ruta) {
        this.capacidad = capacidad;
        this.ruta = ruta;
    }
    
    /**
     * 
     * @param capacidad Número de pasajeros que puede transportar 
     * @param ruta Número de la ruta del vehículo
     * @param llantas llantas del vehículo
     * @param motor Potencia del motor del vehículo
     * @param color Color del vehículo
     */
    public Combi(int capacidad, int ruta, int llantas, int motor, String color) {
        super(llantas, motor, color);
        this.capacidad = capacidad;
        this.ruta = ruta;
    }
    /**
     * 
     * @param capacidad Número de pasajeros que puede transportar 
     * @param ruta Número de la ruta del vehículo
     * @param llantas llantas del vehículo
     * @param motor Potencia del motor del vehículo
     * @param color Color del vehículo
     * @param ventanas ventanas del vehículo
     * @param combustible combustible que tiene el vehículo
     * @param puertas puertas del vehículo
     */
    public Combi(int capacidad, int ruta, int llantas, 
            int motor, String color, int ventanas, 
            int combustible, int puertas) {
        super(llantas, motor, color, ventanas, combustible, puertas);
        this.capacidad = capacidad;
        this.ruta = ruta;
    }
    /**
     * 
     * @param capacidad
     * @param ruta
      @param llantas llantas del vehículo
     * @param motor Potencia del motor del vehículo
     * @param color Color del vehículo
     * @param ventanas ventanas del vehículo
     * @param combustible combustible que tiene el vehículo
     * @param puertas puertas del vehículo
     * @param tipo tipo de transporte
     * @param numPasajeros numero de pasajeros del taxi
     * @param costo costo del taxi
     */
    public Combi(int capacidad, int ruta, int llantas, 
            int motor, String color, int ventanas, 
            int combustible, int puertas, String tipo,
            int numPasajeros, float costo) {
        super(llantas, motor, color, ventanas, combustible, 
                puertas, tipo, numPasajeros, costo);
        this.capacidad = capacidad;
        this.ruta = ruta;
    }
    /**
     * 
     * @return la capacidad del vehículo
     */
    public int getCapacidad() {
        return capacidad;
    }
    /**
     * 
     * @param capacidad la capacidad del vehículo
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    /**
     * 
     * @return la ruta del vehículo
     */
    public int getRuta() {
        return ruta;
    }
    /**
     * 
     * @param ruta la ruta del vehículo
     */
    public void setRuta(int ruta) {
        this.ruta = ruta;
    }
    /**
     * Método que sirve para indicar que el viaje aún no termina y se sigue la ruta
     */
    public void seguirRuta(){
        System.out.println("El viaje aun no termina, siguiendo con la ruta");
    }
    /**
     * Metodo que sirve para indicar que Cobra una tarifa por la distancia recorrida.
     * @param distancia distancia recorrida
     * @param precio tarifa por esa distnacia recorrida.
     */
    public void cobrar(int distancia, int precio){
        System.out.println("Por "+distancia+"[km], le cobro: $"+precio);
    }
    
    /**
     * Método que sirve para indicar que freno la combi
     */
    public void frenarr(){
        System.out.println("Frenando...");
    }
    /**
     * Método toString sobrescrito que muestra los valores de los atributos de la combi
     * @return returna una concatenación de los valores de los atributos de la combi
     */
    @Override
    public String toString() {
        return " Combi{" + "capacidad=" + capacidad + ", ruta=" + ruta + super.toString()+'}';
    }
    
    
}
