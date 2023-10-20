/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7.Transportes;

/**
 *
 * @author Santiago Ruiz
 * Clase que define los atributos de un avion, este siendo un transporte aereo
 */
public class Avion extends Aereos{
    /**
     * alturaMax: altura maxima del avion
     * modelo: modelo del avion
     */
    private int alturaMax;
    private String modelo;
    /**
     * Constructor vacio
     */
    public Avion() {
    }
    /**
     * Constructor 
     * @param alturaMax: altura maxima de un avion
     * @param modelo: modelo del avion
     * @param alturaVuelo: altura de vuelo de un avion
     * @param velocidadAscenso: velocidad de ascenso del avion
     * @param velocidadDescenso : velocidad de descenso del avion
     */
    public Avion(int alturaMax, String modelo, int alturaVuelo, float velocidadAscenso, float velocidadDescenso) {
        super(alturaVuelo, velocidadAscenso, velocidadDescenso);
        this.alturaMax = alturaMax;
        this.modelo = modelo;
    }
    /**
     * Metodo get
     * @return 
     */
    public int getAlturaMax() {
        return alturaMax;
    }
    /**
     * Metodo Set
     * @param alturaMax 
     */
    public void setAlturaMax(int alturaMax) {
        this.alturaMax = alturaMax;
    }
    /**
     * Metodo get
     * @return 
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * Metodo Set
     * @param modelo 
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * Metodo que imprime a donde va el vuelo
     * @param destino: destino del avion 
     */
    public void volar(String destino){
        System.out.println("Voy a " + destino);
    }
    /**
     * Metodo que imprime si el avion va subiendo 
     */
    public void subirAltura(){
        System.out.println("Voy subiendo ");
    }
    /**
     * Metodo que imprime si el avion va bajando 
     */
    public void bajarAltura(){
        System.out.println("Voy bajando ");
    }
    /**
     * Sobreescribe e imprime los datos de un avion este siendo un transporte aereo
     * @return 
     */
    @Override
    public String toString() {
        return "Avion{" + "alturaMax=" + alturaMax + ", modelo=" + modelo + super.toString()+'}';
    }
    
    
    
}