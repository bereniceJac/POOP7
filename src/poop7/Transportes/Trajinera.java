/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7.Transportes;

/**
 *
 * @author Franco Ramírez Christian
 * Define la lase Trajinera y hereda los atributos de 'Acuatico'
 */
public class Trajinera extends Acuaticos{
    /**
     * Variable que almacena nombre del guia
     */
    private String guia;
    /**
     * Constructor vacio
     */
    public Trajinera() {
    }
    /**
     * Toma como argumento string para establacer la variable guia
     * @param guia 
     */
    public Trajinera(String guia) {
        this.guia = guia;
    }

    /**
     * Constructor
     * @param guia: Nombre del guia
     * @param tripulante: cantidad de tripulante
     * @param capacidad: Capacidad de personas
     * @param tipoAc: Tipo de Acuatico
     * @param tipo: Tipo de transporte
     * @param numPasajeros: Numero de pasajeros
     * @param costo: Costo total
     */
    public Trajinera(String guia, int tripulante, int capacidad, String tipoAc, String tipo, int numPasajeros, float costo) {
        super(tripulante, capacidad, tipoAc, tipo, numPasajeros, costo);
        this.guia = guia;
    }


    /**
     * Get y set para ver y obtener valor de atributo
     * @return 
     */
    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }
    /**
     * Imprime cuando recorre
     */
    public void iniciarRecorrido(){
        System.out.println("Iniciando recorrido...");
    }
    /**
     * imprime cuando para
     */
    public void parar(){
        System.out.println("Parando...");
    }
    
    /**
     * Imprime cuando toma foto
     */
    public void tomarFoto(){
        System.out.println("Tomando foto...");
    }

       /**
        * Devuelve una representación de cadena
        * @return 
        */
    @Override
    public String toString() {
        return "Trajinera{" + "guia=" + guia + super.toString()+'}';
    }
    
    
    
}