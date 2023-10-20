/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7.Transportes;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * Clase MediosTransportes con tipo, numPasajeros y costo
 */
public class MediosTransportes extends Object{
    /**
     * Atributos del medio de transporte
     * tipo: tipo de transporte: terrestre, acuatico y aereo
     */
    private String tipo;
    private int numPasajeros;
    private float costo;
    /**
     * Constructor vacio
     */
    public MediosTransportes() {
    }
    /**
     * Constructor lleno
     * @param tipo tipo de transporte
     * @param numPasajeros numero de pasajeros del transporte
     * @param costo costo del transporte
     */
    public MediosTransportes(String tipo,
            int numPasajeros, float costo) {
        this.tipo = tipo;
        this.numPasajeros = numPasajeros;
        this.costo = costo;
    }
    
    /**
     * Metodo getTipo
     * @return returna el tipo de transporte
     */
    public String getTipo() {
        return tipo;
    }
    
    /**
     * Método modifica el tipo de transporte
     * @param tipo tipo de transporte
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /**
     * Metodo getNumPasajeros 
     * @return returna el numero de pasajeros del medio de transporte
     */
    public int getNumPasajeros() {
        return numPasajeros;
    }
    
    /**
     * Metodo que modifica el numero de pasajeros del medio de transporte
     * @param numPasajeros numero de pasajeros
     */
    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
    
    /**
     * Método getCosto
     * @return returna el costo del transporte
     */
    public float getCosto() {
        return costo;
    }
    
    /**
     * Metodo que modifica el costo del transporte
     * @param costo costo del transporte
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }
     
    /**
     * Método que sirve para indicar que el transporte avanza
     */
    public void avanzar(){
        System.out.println("Avanzando...");
    }
    
    /**
     * Método que sirve para indicar que el transporte frena
     */
    public void frenar(){
        System.out.println("Frenando...");
    }
    
    /**
     * Metodo que sirve para calcular la distancia que recorre el transporte en base a 
     * @param tiempo tiempo que recorre el transporte
     * @param velocidad velocidad a la que va el transporte
     */
    public void calcularDistancia(float tiempo, float velocidad){
        float distancia=tiempo*velocidad;
        System.out.println("Distancia recorrida: "+distancia+" [km]");
    }

     /**
     * Método toString sobrescrito que muestra los valores de los atributos del medio de transporte
     * @return returna una concatenación de los valores de los atributos del transporte
     */
    @Override
    public String toString() {
        return " MediosTransportes{" + "tipo=" + tipo + ", numPasajeros=" + numPasajeros + ", costo=" + costo + '}';
    }
    
    
}
