/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Santiago Ruiz
 * Clase que define los atrubutos de un pajaro, siendo esta un animal aereo y un animal
 */
public class Pajaro extends AnimalAereo{
    /**
     * tipoPico: que tipo de pico tendrá el pajaro
     */
    private String tipoPico;
    /**
     * Constructor vacio
     */
    public Pajaro() {
    }
    /**
     * Constructor
     * @param tipoPico: tipo de pico del pajaro
     * @param numeroAlas: numero de alas del pajaro
     * @param nombre: nombre del pajaro
     * @param lugarOrignen: lugar de origen del pajaro 
     * @param color: color del pajaro 
     */
    public Pajaro(String tipoPico, int numeroAlas, String nombre, String lugarOrignen, String color) {
        super(numeroAlas, nombre, lugarOrignen, color);
        this.tipoPico = tipoPico;
    }
    /**
     * Metodo get
     * @return tipo de pico del pajaro
     */
    public String getTipoPico() {
        return tipoPico;
    }
    /**
     * Metodo set
     * @param tipoPico tipo de pico del pajaro
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    /**
     * Metoto que imprime cuando el pajaro esta recogiendo ramas
     */
    public void recolectarRamas(){
        System.out.println("Estoy recolectando ramas");
    }
    /**
     * Sobreescribe e imprime los datos de un pajaro esta siendo un animal aereo y un animal
     * @return 
     */
    @Override
    public String toString() {
        return "Pajaro{" + "tipoPico=" + tipoPico + super.toString()+'}';
    }
    
}
