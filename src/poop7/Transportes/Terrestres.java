/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7.Transportes;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * Clase que representa a un medio de transporte terrestre. Hereda de la clase MediosTransportes, por lo que tiene todas sus propiedades y métodos.
 */
public class Terrestres extends MediosTransportes{
    /**
     * Atributos de un transporte terrestre
     * ventanas: Número de ventanas del vehículo
     * combustible: Cantidad de combustible que tiene el vehículo
     * puertas: Número de puertas del vehículo
     */
    private int ventanas, combustible, puertas;
    
    /**
     * Constructor vacio
     */
    public Terrestres() {
    }
    
    /**
     * Constructor lleno
     * @param ventanas ventanas del vehículo
     * @param combustible combustible que tiene el vehículo
     * @param puertas puertas del vehículo
     */
    public Terrestres(int ventanas, int combustible, int puertas) {
        this.ventanas = ventanas;
        this.combustible = combustible;
        this.puertas = puertas;
    }
    
    /**
     * Constructor lleno ue inicializa las propiedades heredadas y propias de la clase Terrestres
     * @param ventanas ventanas del vehículo
     * @param combustible combustible que tiene el vehículo
     * @param puertas puertas del vehículo
     * @param tipo tipo de transporte
     * @param numPasajeros numero de pasajeros del transporte terrestrs
     * @param costo costo del transporte terrestre
     */
    public Terrestres(int ventanas, int combustible, int puertas,
            String tipo, int numPasajeros, float costo) {
        super(tipo, numPasajeros, costo);
        this.ventanas = ventanas;
        this.combustible = combustible;
        this.puertas = puertas;
    }
    /**
     * Metodo getVentanas
     * @return returna el número de ventanas del vehículo
     */
    public int getVentanas() {
        return ventanas;
    }
    /**
     * Metodo que modifica el número de ventanas del vehículo
     * @param ventanas ventanas del vehículo
     */
    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }
    
    /**
     * Metodo getCombustible
     * @return returna la cantidad de combustible del vehículo
     */
    public int getCombustible() {
        return combustible;
    }
    
    /**
     * Metodo que modifica la cantidad de combustible del vehículo
     * @param combustible combustible del vehículo
     */
    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    /**
     * Metodo getPuertas
     * @return returna el número de puertas del vehículo
     */
    public int getPuertas() {
        return puertas;
    }
    /**
     * Metodo que modifica el número de puertas del vehículo
     * @param puertas puertas del vehículo
     */
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    /**
     * Metodo que sirve para indicar que aumenta la velocidad del vehículo
     */
    public void aumentarVelocidad(){
        System.out.println("Amentando la velocidad...");
    }
    
    /**
     * Metodo que sirve para indicar que disminuye la velocidad del vehículo
     */
    public void disminuirVelocidad(){
        System.out.println("Disminuyendo la velocidad...");
    }
    
    /**
     * Método toString sobrescrito que muestra los valores de los atributos del medio de transporte terrestre
     * @return returna una concatenación de los valores de los atributos del transporte terrestre
     */
    @Override
    public String toString() {
        return " Terrestres{" + "ventanas=" + ventanas + ", combustible=" + combustible + ", puertas=" + puertas + super.toString()+ '}';
    }
    
    
}
