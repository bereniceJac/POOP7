/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7.Transportes;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * Clase que representa a un medio de transporte terrestre que se desplaza por túneles. 
 * Hereda de la clase Terrestres, por lo que tiene todas sus propiedades y métodos, más las propiedades y métodos propios de la clase Subterraneo.
 */
public class Subterraneo extends Terrestres{
    
    /**
     * Atributos de un transporte terrestre subterraneo
     * vagones, capacidad, linea
     */
    private int vagones, capacidad;
    private String linea;
    
     /**
     * Constructor vacio
     */
    public Subterraneo() {
    }

    /**
     * Constructor lleno
     * @param vagones Número de vagones del trasnporte
     * @param capacidad Número de pasajeros que puede transportar 
     * @param linea numero de linea del trasnporte
     */
    public Subterraneo(int vagones, int capacidad, String linea) {
        this.vagones = vagones;
        this.capacidad = capacidad;
        this.linea = linea;
    }
    
    /**
     * 
     * @param vagones Número de vagones del trasnporte
     * @param capacidad Número de pasajeros que puede transportar 
     * @param linea numero de linea del trasnporte
     * @param ventanas ventanas del vehículo
     * @param combustible combustible que tiene el vehículo
     * @param puertas puertas del vehículo 
     */
    public Subterraneo(int vagones, int capacidad, String linea,
            int ventanas, int combustible, int puertas) {
        super(ventanas, combustible, puertas);
        this.vagones = vagones;
        this.capacidad = capacidad;
        this.linea = linea;
    }
    /**
     * 
     * @param vagones Número de vagones del trasnporte
     * @param capacidad Número de pasajeros que puede transportar 
     * @param linea numero de linea del trasnporte
     * @param ventanas ventanas del vehículo
     * @param combustible combustible que tiene el vehículo
     * @param puertas puertas del vehículo
      @param tipo tipo de transporte
     * @param numPasajeros numero de pasajeros del transporte terrestre subterraneo
     * @param costo costo del transporte terrestre subterraneo 
     */
    public Subterraneo(int vagones, int capacidad, String linea,
            int ventanas, int combustible, int puertas, 
            String tipo, int numPasajeros, float costo) {
        super(ventanas, combustible, puertas, tipo, numPasajeros, costo);
        this.vagones = vagones;
        this.capacidad = capacidad;
        this.linea = linea;
    }
    
    /**
     * Metodo getVagones
     * @return returna el número de vagones del transporte
     */
    public int getVagones() {
        return vagones;
    }
    
    /**
     *  Metodo que modifica el el número de vagones
     * @param vagones 
     */
    public void setVagones(int vagones) {
        this.vagones = vagones;
    }
    /**
     * Metodo getCapacidad
     * @return returna la capacidad del transporte
     */
    public int getCapacidad() {
        return capacidad;
    }
    /**
     * Metodo que modifica la capacidad del transporte
     * @param capacidad capacidad del transporte
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    /**
     * metodo getLinea
     * @return returna el numero de linea del trasnporte
     */
    public String getLinea() {
        return linea;
    }
    
    /**
     * metodo que modifica el numero de linea del trasnporte
     * @param linea numero de linea del trasnporte
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }
    
    /**
     * Método que sirve para indicar Abre las puertas
     */
    public void abrirPuertas(){
        System.out.println("Abriendo puertas en 3, 2, 1...");
    }
    /**
     * Método que sirve para indicar Cierra las puertas
     */
    public void cerrarPuertas(){
        System.out.println("Cerrando puertas en 3, 2, 1");
    }
    
    /**
     * Método toString sobrescrito que muestra los valores de los atributos del medio de transporte terrestre subterraneo
     * @return returna una concatenación de los valores de los atributos del transporte terrestre subterraneo
     */
    @Override
    public String toString() {
        return " Subterraneo{" + "vagones=" + vagones + ", capacidad=" + capacidad + ", linea=" + linea + super.toString()+'}';
    }
    
    
}
