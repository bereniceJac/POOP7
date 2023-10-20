/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Santiago Ruiz
 * Clase que define los atributos de un perro, este siendo un animal terrestre y un animal
 */
public class Perro extends AnimalTerrestre{
    /**
     * colorCollar: obtiene el color del collar en string
     */
    private String colorCollar;
    /**
     * onstructor vacio
     */
    public Perro() {
    }
    /**
     * Constructor 
     * @param colorCollar: color del collar del perro
     * @param numeroPatas: numero de patas del perro
     * @param nombre: nombre del perro 
     * @param lugarOrignen: lugar de origen del perro
     * @param color : color del perro
     */
    public Perro(String colorCollar, int numeroPatas, String nombre, String lugarOrignen, String color) {
        super(numeroPatas, nombre, lugarOrignen, color);
        this.colorCollar = colorCollar;
    }
    /**
     * Metodo get
     * @return color del collar
     */
    public String getColorCollar() {
        return colorCollar;
    }
    /**
     * Metodo set
     * @param colorCollar  obtiene color del collar
     */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    /**
     * Metodo que imprime cuando el perro esta haciendo un truco
     */
    public void hacerTrucos(){
        System.out.println("Estoy haciendo un backflip");
    }
    /**
     * Sobreescribe e imprime los datos de una perro esta siendo un animal terrestre y un animal
     * @return 
     */
    @Override
    public String toString() {
        return "Perro{" + "colorCollar=" + colorCollar + super.toString()+ '}';
    }
    
}
