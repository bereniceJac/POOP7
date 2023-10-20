/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Santiago Ruiz 
 * Clase Animal Terrestre que tiene los atributos de un animal
 */
public class AnimalTerrestre extends Animal{
    /**
     * numeroPatas: El número de patas de un animal terrestre
     */
    private int numeroPatas;
    /**
     * Constructor vacio
     */
    public AnimalTerrestre() {
    }
    /**
     * Constructor
     * @param numeroPatas: numero de patas de un animal terrestre 
     * @param nombre: nombre del animal terrestre
     * @param lugarOrignen: lugar de origen del animal terrestre
     * @param color: color del animal terrestre
     */
    public AnimalTerrestre(int numeroPatas, String nombre, String lugarOrignen, String color) {
        super(nombre, lugarOrignen, color);
        this.numeroPatas = numeroPatas;
    }
    /**
     * Metodo get
     * @return el numero de patas de un animal 
     */
    public int getNumeroPatas() {
        return numeroPatas;
    }
    /**
     * Metodo set
     * @param numeroPatas obtiene el numero de patas
     */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    /**
     * Metodo que imprime cuando el animal esta corriendo
     */
    public void correr(){
        System.out.println("Estoy corriendo...");
    }
    /**
     * Metodo que sobreescribe el atributo comer, refiere a la clase animal
     */
    @Override
    public void comer(){
        super.comer();
    }
    /**
     * Sobreescribe e imprime los atributos de un animal terrestre junto con los atributos de animal
     * @return 
     */
    @Override
    public String toString() {
        return "AnimalTerrestre{" + "numeroPatas=" + numeroPatas + super.toString()+ '}';
    }
    
}