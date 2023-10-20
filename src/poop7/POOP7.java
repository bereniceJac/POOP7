/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

import poop7.Transportes.Combi;
import poop7.Transportes.Metro;
import poop7.Transportes.Suburbano;
import poop7.Transportes.Taxi;
import poop7.Transportes.Aereos;
import poop7.Transportes.Avion;
import poop7.Transportes.Barco;
import poop7.Transportes.Helicoptero;
import poop7.Transportes.MediosTransportes;
import poop7.Transportes.Trajinera;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {// Animal
        // Animal
        Animal animal = new Animal();
        animal.setNombre("Max");
        animal.setLugarOrigen("CDMX");
        animal.setColor("cafe");
        System.out.println(animal);
    
        //Animal Acuatico
        AnimalAcuatico animalAc =new AnimalAcuatico();
        animalAc.setNombre("Leo");
        animalAc.setLugarOrigen("Africa");
        animalAc.setColor("rojo");
        animalAc.setNumAletas(4);
        System.out.println(animalAc);
        
        //Ballena
        Ballena ballena = new Ballena(30,2,"Wilson","Canada", "gris");
        System.out.println(ballena);
        
        //Animal Terrestre    
         AnimalTerrestre animalTerrestre = new AnimalTerrestre();
         animalTerrestre.setNombre("Fernando");
         animalTerrestre.setLugarOrigen("Peru");
         animalTerrestre.setColor("Lila");
         animalTerrestre.setNumeroPatas(4);
         
         //Perro    
            Perro perro = new Perro("Verde pantano",2,"Bananin","Italia", "Amarillo");
            
            System.out.println(perro);
        //Animal Aereo    
          AnimalAereo animalAereo = new AnimalAereo();
          animalAereo.setNombre("Juan");
          animalAereo.setLugarOrigen("Palestina");
          animalAereo.setColor("Negro");
          animalAereo.setNumeroAlas(2);
            System.out.println(animalAereo);
            
        //Pajaro    
          Pajaro pajaro = new Pajaro(" Redondo",2,"Alison","USA", "Hueso");
          System.out.println(pajaro);
        
        //Medios de transporte
        MediosTransportes mdt = new MediosTransportes();
        //Terrestres
        Taxi taxi=new Taxi("Nissan Versa",10,
                4,21510,"blanco",
                4,2,4,
                "Supraterraneo,",4,10);
        System.out.println(taxi);
        
        Combi combi=new Combi(19,49,4,
                5613,"verde",21,
                4,3,"Supraterraneo",
                10,13);
        System.out.println(combi);
        
        Metro metro=new Metro("de hidalgo","verde"
                ,9,1500,"3",216,
                2,36,"Subterraneo",
                1320,5);
        System.out.println(metro);
        
        Suburbano suburbano =new Suburbano("Buenavista-Huehuetoca",
                4,1130,"1",21,3,
                4,"Subterraneo",460,10);
        System.out.println(suburbano);
        
        //Aereos
            Aereos aereos= new Aereos();
            aereos.setAlturaVuelo(3000);
            aereos.setVelocidadAscenso(200);
            aereos.setVelocidadDescenso(100);
            
            System.out.println(aereos.toString());
            
        //Avion
            Avion avion = new Avion();
            avion.setAlturaMax(3000);
            avion.setAlturaVuelo(2453);
            avion.setModelo("Aereomexico");
            avion.setVelocidadAscenso(1543);
            avion.setVelocidadDescenso(1398);
            
            System.out.println(avion);
            
        //Helicoptero
            Helicoptero helicoptero = new Helicoptero();
            helicoptero.setAlturaVuelo(4000);
            helicoptero.setAsientos(6);
            helicoptero.setNumHelices(10);
            helicoptero.setNumMotores(3);
            helicoptero.setVelocidadAscenso(1234);
            helicoptero.setVelocidadDescenso(4321);
            System.out.println(helicoptero);

         //Acuaticos
         //Trajinera
        Trajinera trajinera = new Trajinera("Pedro",10,5,"veloz","verde",10,100);
        System.out.println(trajinera);
        
        //Barco
        Barco barco = new Barco("Velador", 40, 50, "Azul","Veloz",50,100);
        System.out.println(barco);

    }
    
}
