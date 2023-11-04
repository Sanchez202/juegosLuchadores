/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegocartas;

/**
 *
 * @author APRENDIZ SENA
 */
public class JuegoCartas {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        
        System.out.println("guerrero 1 ");
        Raza1 l1=new Raza1(" goku", 1000,   100, 100,100);
        l1.mostrar1();
        
        System.out.println("guerrero 2 ");
        Raza2 l2=new Raza2("vegeta",1000,100,100,100);
        l2.Robarvida();
         System.out.println("guerero 3");
        Raza3 l3=new Raza3("krilin",1000,100,100,100);
        l3.Dobleataque();
        
        
        
        
        
        
        
    }
    
}
