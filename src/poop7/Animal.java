/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * Clase Animal con nombre, lugar de origen y color
 */
public class Animal extends Object {
    /**
     * Atributos de animal
     * nombre: nombre del animal
     * lugarOrigen: lugar de origen del animal
     * color: color del animal
     */
    private String nombre, lugarOrigen, color;
    
    /**
     * Constructor vacío de animal
     */
    public Animal() {
    }
    
    /**
     * Constructor lleno de animla
     * @param nombre nombre del animal
     * @param lugarOrigen lugar de origen del animal
     * @param color color del animal
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    
    /**
     * Método getNombre
     * @return returna el nombre del animal
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Método que modifica el nombre del animal
     * @param nombre nombre del animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método getLugar
     * @return returna el lugar de origen del animal
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }
    
    /**
     * Metodo que modifica el lugar de origen del animal
     * @param lugarOrigen lugar de origen del animal
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }
    
    /**
     * Método getColor
     * @return reutrna el color del animal
     */
    public String getColor() {
        return color;
    }
    
    /**
     * Método que modifica el color del animal
     * @param color color del animal
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Método  que sirve para indicar el sonido que hace el animal
     * @param sonido del animal
     */
    public void hacerSonido(String sonido){
        System.out.println("Sonido: "+sonido);
    }
    
    /**
     * Método que sirve para indicar que el animal está comiendo
     */
    public void comer(){
        System.out.println("Estoy comiendo...");
    }
    
    /**
     * Método toString sobrescrito que muestra los valores de los atributos
     * @return returna una concatenación de los valores de los atributos del animal
     */
    @Override
    public String toString() {
        return " Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }

    
    
}
