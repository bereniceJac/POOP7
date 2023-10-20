/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7.Transportes;

/**
 *
 * @author Santiago Ruiz 
 * Clase de medios de transporte aereos con altura de vuelo y velocidades
 */
public class Aereos {
    /**
     * alturaVuelo: a que altura va el vuelo
     * velocidadAscenso:a que velocidad asciende
     * velocidadDescenso:a que velocidad desciende 
     */
    private int alturaVuelo;
    private float velocidadAscenso, velocidadDescenso;
    /**
     * Constructor vacio
     */
    public Aereos() {
    }
    
    /**
     * Constructor 
     * @param alturaVuelo: altura del vuelo
     * @param velocidadAscenso: ascenso del vuelo
     * @param velocidadDescenso: descenso del vuelo
     */
    public Aereos(int alturaVuelo, float velocidadAscenso, float velocidadDescenso) {
        this.alturaVuelo = alturaVuelo;
        this.velocidadAscenso = velocidadAscenso;
        this.velocidadDescenso = velocidadDescenso;
    }
    /**
     * Metodo Get
     * @return 
     */
    public int getAlturaVuelo() {
        return alturaVuelo;
    }
    /**
     * Metodo Set
     * @param alturaVuelo 
     */
    public void setAlturaVuelo(int alturaVuelo) {
        this.alturaVuelo = alturaVuelo;
    }
    /**
     * Metodo Get
     * @return 
     */
    public float getVelocidadAscenso() {
        return velocidadAscenso;
    }
    /**
     * Metodo Set
     * @param velocidadAscenso 
     */
    public void setVelocidadAscenso(float velocidadAscenso) {
        this.velocidadAscenso = velocidadAscenso;
    }
    /**
     * Metodo Get
     * @return 
     */
    public float getVelocidadDescenso() {
        return velocidadDescenso;
    }
    /**
     * Metodo Set
     * @param velocidadDescenso 
     */
    public void setVelocidadDescenso(float velocidadDescenso) {
        this.velocidadDescenso = velocidadDescenso;
    }
    /**
     * Metodo que imprime cuando despega
     */
    public void depegar(){
        System.out.println("Estoy despegando...");
    }
    /**
     * Metodo que imprime cuando aterriza
     */
    public void aterrizar(){
        System.out.println("Estoy aterrizando...");
    }
    /**
     * Metodo que imprime que ruta sigue
     */
    public void recorrerRuta(){
        System.out.println("Vamos a Chile pasando por...");
    }
    /**
     * Sobreescribe e imprime los datos
     * @return Regresa datos de un medio de transporte aereo
     */
    @Override
    public String toString() {
        return "Aereos{" + "alturaVuelo=" + alturaVuelo + ", velocidadAscenso=" + velocidadAscenso + ", velocidadDescenso=" + velocidadDescenso + '}';
    }
    
    
}
