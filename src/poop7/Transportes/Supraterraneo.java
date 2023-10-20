/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7.Transportes;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * Clase que representa a un medio de transporte terrestre que se desplaza por la superficie
 * Hereda de la clase Terrestres, por lo que tiene todas sus propiedades y métodos,
 * más las propiedades y métodos propios de la clase Supraterraneo.
 * 
 */
public class Supraterraneo extends Terrestres{
    /**
     * Atributos de un transporte terrestre supraterraneo
     * llantas, motor, color
     */
    private int llantas, motor;
    private String color;
    
    /**
     * Constructor vacio
     */
    public Supraterraneo() {
    }
    
    /**
     * Constructor lleno
     * @param llantas llantas del vehículo
     * @param motor Potencia del motor del vehículo
     * @param color Color del vehículo
     */
    public Supraterraneo(int llantas, int motor, String color) {
        this.llantas = llantas;
        this.motor = motor;
        this.color = color;
    }
    
    /**
     * Constructor lleno eue inicializa las propiedades heredadas y propias de la clase Terrestre
     * @param llantas llantas del vehículo
     * @param motor Potencia del motor del vehículo
     * @param color Color del vehículo
     * @param ventanas ventanas del vehículo
     * @param combustible combustible que tiene el vehículo
     * @param puertas puertas del vehículo
     */
    public Supraterraneo(int llantas, int motor, String color, 
            int ventanas, int combustible, int puertas) {
        super(ventanas, combustible, puertas);
        this.llantas = llantas;
        this.motor = motor;
        this.color = color;
    }
    
    /**
     * Constructor lleno ue inicializa las propiedades heredadas y propias de la clase Supraterraneo
     * @param llantas llantas del vehículo
     * @param motor Potencia del motor del vehículo
     * @param color Color del vehículo
     * @param ventanas ventanas del vehículo
     * @param combustible combustible que tiene el vehículo
     * @param puertas puertas del vehículo
     * @param tipo tipo de transporte
     * @param numPasajeros numero de pasajeros del transporte terrestre supraterraneo
     * @param costo costo del transporte terrestre supraterraneo
     */
    public Supraterraneo(int llantas, int motor, String color, 
            int ventanas, int combustible, int puertas, 
            String tipo,int numPasajeros, float costo) {
        super(ventanas, combustible, puertas, tipo, numPasajeros, costo);
        this.llantas = llantas;
        this.motor = motor;
        this.color = color;
    }
    /**
     * Metodo getLlantas
     * @return returna el número de llantas del vehículo 
     */
    public int getLlantas() {
        return llantas;
    }
    
    /**
     * Metodo que modifica el número de llantas del vehículo
     * @param llantas el número de llantas del vehículo
     */
    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }
    
    /**
     * Metodo getMotor
     * @return returna la potencia del motor del vehículo
     */
    public int getMotor() {
        return motor;
    }
    
    /**
     * Metodo que modifica la potencia del motor del vehículo
     * @param motor potencia del motor del vehículo
     */
    public void setMotor(int motor) {
        this.motor = motor;
    }
    
    /**
     * Metodo get Color
     * @return returna el color del vehículo
     */
    public String getColor() {
        return color;
    }
    
    /**
     * Metodo que modifica el color del vehículo
     * @param color color del vehículo
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Método que sirve para indicar que incia el manejo del vehículo
     */
    public void manejar(){
        System.out.println("Manejo en curso...");
    }
    
    /**
     * Método que sirve para indicar Estaciona el vehículo.
     */
    public void estacionar(){
        System.out.println("Estacionando...");
    }
    
    /**
     * Metodo que sirve para indicar que  Inicia el motor del vehículo. 
     */
    public void arrancar(){
        System.out.println("Calentando motores...");
    }
    
    /**
     * Método toString sobrescrito que muestra los valores de los atributos del medio de transporte terrestre supraterraneo
     * @return returna una concatenación de los valores de los atributos del transporte terrestre supraterraneo
     */
    @Override
    public String toString() {
        return " Supraterraneo{" + "llantas=" + llantas + ", motor=" + motor + ", color=" + color + super.toString()+'}';
    }
    
    
}
