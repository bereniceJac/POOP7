/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;


/**
 *
 * @author Santiago Ruiz
 * Clase Animal aereo que tiene los atributos de animal
 */
public class AnimalAereo extends Animal{
    /**
     * numeroAlas: numero de alas que tiene el animal aereo
     */
    private int numeroAlas;
    /**
     * Constructor vacio
     */
    public AnimalAereo() {
    }
    /**
     * Constructor
     * @param numeroAlas: numero de alas de un animal aereo
     * @param nombre: nombre del animal aereo
     * @param lugarOrignen: lugar de origen del animal aereo
     * @param color: color del animal aereo
     */
    public AnimalAereo(int numeroAlas, String nombre, String lugarOrignen, String color) {
        super(nombre, lugarOrignen, color);
        this.numeroAlas = numeroAlas;
    }
    /**
     * Metodo get
     * @return numero de alas
     */
    public int getNumeroAlas() {
        return numeroAlas;
    }
    /**
     * Metodo set
     * @param numeroAlas obtiene numero de alas
     */
    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    /**
     * Metodo que imprime cuando un animal aereo esta volando
     */
    public void volar(){
        System.out.println("Estoy volando...");
    }
    /**
     * Metodo que sobreescribe el atributo comer, refiere a la clase animal
     */
    @Override
    public void comer(){
        super.comer();
    }
    /**
     * Sobreescribe e imprime los atributos de un animal aereo junto con los atributos de animal
     * @return 
     */
    @Override
    public String toString() {
        return "AnimalAereo{" + "numeroAlas=" + numeroAlas + super.toString()+'}';
    }
    
}