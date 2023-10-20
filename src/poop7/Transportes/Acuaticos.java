/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7.Transportes;

/**
 *
 * @author Franco Ramírez Christian
 * Define la clase Acuaticco y hereda de la clase 'MediosTransporte
 */
public class Acuaticos extends MediosTransportes{
    /**
     * Variables que almacenan datos
     */
    private int tripulante, capacidad;
    private String tipoAc;
    
    
    /**
     * Constructor vacio
     */
    public Acuaticos() {
    }
    
    /**
     * Constructor
     * @param tripulante: Numero de tripulantes
     * @param capacidad: Cantidad de capacidad
     * @param tipoAc: Tipo de acuatico
     * @param tipo: Tipo de transporte
     * @param numPasajeros: Numero de pasajero
     * @param costo: Costo total
     */
    public Acuaticos(int tripulante, int capacidad, String tipoAc, String tipo, int numPasajeros, float costo) {
        super(tipo, numPasajeros, costo);
        this.tripulante = tripulante;
        this.capacidad = capacidad;
        this.tipoAc = tipoAc;
    }
    /**
     * Get y set, permiten obtener el valor y los métodos
     * @return 
     */
    public int getTripulante() {
        return tripulante;
    }

    public void setTripulante(int tripulante) {
        this.tripulante = tripulante;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipoAc() {
        return tipoAc;
    }

    public void setTipoAc(String tipoAc) {
        this.tipoAc = tipoAc;
    }
    /**
     * Marca donde navegar
     * @param destino 
     */
    public void navegar(String destino){
        System.out.println(destino);
    }
    
    /**
     * Calcula la carga
     * @return 
     */
    public float calcularCarga(){
        float carga = 100.0f;
        return carga;
                
    }
    /**
     * Devuelve una representación de cadena
     * @return 
     */
    @Override
    public String toString() {
        return "Acuaticos{" + "tripulante=" + tripulante + ", capacidad=" + capacidad + ", tipoAc=" + tipoAc + '}';
    }

    
    
    
    
}
