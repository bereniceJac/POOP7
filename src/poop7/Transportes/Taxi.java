/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7.Transportes;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * Clase que representa a un vehículo de alquiler.
 * Hereda de la clase Supraterraneo, por lo que tiene todas sus propiedades y métodos, más las propiedades y métodos propios de la clase Taxi.
 */
public class Taxi extends Supraterraneo {
    /**
     * Atributos de un transporte Taxi
     * modelo, taximetro
     */
    private String modelo;
    private int taximetro;
    
    /**
     * Constructor vacio
     */
    public Taxi() {
    }
    
    /**
     * Constructor lleno de taxi
     * @param modelo Modelo del taxi
     * @param taximetro Valor del taxímetro
     */
    public Taxi(String modelo, int taximetro) {
        this.modelo = modelo;
        this.taximetro = taximetro;
    }
    
    /**
     * 
     * @param modelo Modelo del taxi
     * @param taximetro Valor del taxímetro
     * @param llantas llantas del vehículo
     * @param motor Potencia del motor del vehículo
     * @param color Color del vehículo
     */
    public Taxi(String modelo, int taximetro, int llantas,
            int motor, String color) {
        super(llantas, motor, color);
        this.modelo = modelo;
        this.taximetro = taximetro;
    }
    
    /**
     * 
     * @param modelo Modelo del taxi
     * @param taximetro Valor del taxímetro
     * @param llantas llantas del vehículo
     * @param motor Potencia del motor del vehículo
     * @param color Color del vehículo
     * @param ventanas ventanas del vehículo
     * @param combustible combustible que tiene el vehículo
     * @param puertas puertas del vehículo
     */
    public Taxi(String modelo, int taximetro, int llantas,
            int motor, String color, int ventanas, int combustible, int puertas) {
        super(llantas, motor, color, ventanas, combustible, puertas);
        this.modelo = modelo;
        this.taximetro = taximetro;
    }
    
    /**
     * 
     * @param modelo Modelo del taxi
     * @param taximetro Valor del taxímetro
     * @param llantas llantas del vehículo
     * @param motor Potencia del motor del vehículo
     * @param color Color del vehículo
     * @param ventanas ventanas del vehículo
     * @param combustible combustible que tiene el vehículo
     * @param puertas puertas del vehículo
     * @param tipo tipo de transporte
     * @param numPasajeros numero de pasajeros del taxi
     * @param costo costo del taxi
     */
    public Taxi(String modelo, int taximetro, int llantas, 
            int motor, String color, int ventanas, int combustible, 
            int puertas, String tipo, int numPasajeros, float costo) {
        super(llantas, motor, color, ventanas, combustible,
                puertas, tipo, numPasajeros, costo);
        this.modelo = modelo;
        this.taximetro = taximetro;
    }
    /**
     * metodo getModelo
     * @return returna el modelo del taxi.
     */
    public String getModelo() {
        return modelo;
    }
    
    /**
     * metodo que modifica el modelo del taxi.
     * @param modelo modelo del taxi.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    /**
     * metodo getTaximetro
     * @return returna el valor del taxímetro
     */
    public int getTaximetro() {
        return taximetro;
    }
    
    /**
     * metodo que modifica el valor del taxímetro
     * @param taximetro valor del taxímetro
     */
    public void setTaximetro(int taximetro) {
        this.taximetro = taximetro;
    }
    
    /**
     * Método que sirve para indicar Abre la puerta del taxi
     */
    public void abrir(){
        System.out.println("Abriendo puerta");
    }
    
    /**
     * Metodo que sirve para indicar Cobra el valor del taxímetro al pasajero
     * @param taximetro valor del taxímetro
     */
    public void cobrar(int taximetro){
        System.out.println("Total: $"+taximetro);
    }

    /**
     * Método toString sobrescrito que muestra los valores de los atributos del taxi
     * @return returna una concatenación de los valores de los atributos del taxi 
     */
    @Override
    public String toString() {
        return " Taxi{" + "modelo=" + modelo + ", taximetro=" + taximetro + super.toString()+'}';
    }
    
    
}
