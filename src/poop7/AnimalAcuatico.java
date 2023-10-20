/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 */
public class AnimalAcuatico extends Animal {
    private int numAletas;
    public AnimalAcuatico() {
    }

    public AnimalAcuatico(int numAletas) {
        this.numAletas = numAletas;
    }

    public AnimalAcuatico(int numAletas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numAletas = numAletas;
    }

    public int getNumAletas() {
        return numAletas;
    }

    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }
    
    public void nadar(){
        System.out.println("glu glu glu");
    }
    
    @Override
    public void comer (){
        System.out.println("Estoy comiendo peces");
    }

    @Override
    public String toString() {
        return " animalAcuatico{" + "numAletas=" + numAletas +super.toString()+'}';
    }

   
}
