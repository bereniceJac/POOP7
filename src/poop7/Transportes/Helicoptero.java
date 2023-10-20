/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7.Transportes;

/**
 *
 * @author Santiago Ruiz
 * Clase que define los atributos de un helicoptero, este siendo un transporte aereo
 */
public class Helicoptero extends Aereos{
    /**
     * numHelices: helices que tiene el helicoptero
     * numMotores: numero de motores que tiene
     * asientos: numero de asientos que tiene
     */
    private int numHelices, numMotores, asientos;
    /**
     * Constructor vacio
     */
    public Helicoptero() {
    }
    /**
     * Constructor
     * @param numHelices: numero de helices del helicoptero
     * @param numMotores: numero de motores del helicoptero
     * @param asientos: numero de asientos de helicopetero
     * @param alturaVuelo: altura de vuelo del helicoptero
     * @param velocidadAscenso: velocidad de ascenso del helicoptero
     * @param velocidadDescenso: velocidad de descenso del helicoptero
     */
    public Helicoptero(int numHelices, int numMotores, int asientos, int alturaVuelo, float velocidadAscenso, float velocidadDescenso) {
        super(alturaVuelo, velocidadAscenso, velocidadDescenso);
        this.numHelices = numHelices;
        this.numMotores = numMotores;
        this.asientos = asientos;
    }
    /**
     * Metodo get
     * @return 
     */
    public int getNumHelices() {
        return numHelices;
    }
    /**
     * Metodo Set
     * @param numHelices 
     */
    public void setNumHelices(int numHelices) {
        this.numHelices = numHelices;
    }
    /**
     * Metodo get
     * @return 
     */
    public int getNumMotores() {
        return numMotores;
    }
    /**
     * Metodo set
     * @param numMotores 
     */
    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }
    /**
     * Metodo get
     * @return 
     */
    public int getAsientos() {
        return asientos;
    }
    /**
     * Metodo set
     * @param asientos 
     */
    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }
    /**
     * Metodo que imprime a que velocidad va el helicoptero
     * @param velocidad Velocidad del helicoptero
     */
    public void acelerar(float velocidad){
        System.out.println("Estoy llendo a una velocidad de " + velocidad);
    }
    /**
     * Metodo que imprime hacia que lado va que helicoptero
     * @param lado A que lado gira
     */
    public void girar(String lado){
        System.out.println("Estoy llendo hacia " + lado);
    }
    /**
     * Sobreescribe e imprime los datos de un helicoptero este siendo un transporte aereo
     * @return 
     */
    @Override
    public String toString() {
        return "Helicoptero{" + "numHelices=" + numHelices + ", numMotores=" + numMotores + ", asientos=" + asientos + super.toString()+'}';
    }
}