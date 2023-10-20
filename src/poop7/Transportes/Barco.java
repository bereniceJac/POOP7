/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7.Transportes;

/**
 *
 * @author Franco Ramírez Christian
 * Define la clase Barco y hereda los atributos de 'Acuatico'
 */
public class Barco extends Acuaticos{
    private String tipoBar;
    /**
     * Constructor vacio
     */
    public Barco() {
    }

    public Barco(String tipoBar) {
        this.tipoBar = tipoBar;
    }
    /**
     * Constructor
     * @param tipoBar: tipo de barco
     * @param tripulante: Numero de tripulantes
     * @param capacidad: Cantidad de capacidad
     * @param tipoAc: Tipo de acuatico
     * @param tipo: Tipo de transporte
     * @param numPasajeros: Cantidad de pasajeros
     * @param costo 
     */
    public Barco(String tipoBar, int tripulante, int capacidad, String tipoAc, String tipo, int numPasajeros, float costo) {
        super(tripulante, capacidad, tipoAc, tipo, numPasajeros, costo);
        this.tipoBar = tipoBar;
    }

    /**
     * Get y set para ver y obtener valor de atributo
     * @return 
     */
    public String getTipoBar() {
        return tipoBar;
    }

    public void setTipoBar(String tipoBar) {
        this.tipoBar = tipoBar;
    }
    
    /**
     * Imprime cuando navegan
     */
    public void navegar(){
        System.out.println("Navegando...");
    }
    /**
     * Imprime cuando estan anclando
     */
    public void anclar(){
        System.out.println("Anclando...");
    }

    /**
     * Devuelve una representación de cadena
     * @return 
     */
    @Override
    public String toString() {
        return "Barco{" + "tipoBar=" + tipoBar +'}';
    }
    
    
}
