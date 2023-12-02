/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegocartas;

import java.util.Scanner;
import javax.sound.midi.SoundbankResource;

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
        
        
        
        int opc = 0;
      Scanner sc = new Scanner(System.in);
      
      
        System.out.println("VIENVENIDOS AL JUEGO DE LUCHADORES 1 CONTRA 1  ");
       System.out.println(" ");
        System.out.println("Ingresa tu nombre jugador 1 ");
               sc.next();
         System.out.println("Ingresa tu nombre jugador 2");
               sc.next();
        
           System.out.println(" precione 1 para iniciar el juego ");
           System.out.println(" ");
           
           
           System.out.println("1: INICIAR");
           
      
         opc=sc.nextInt();
         
        switch(opc ){
            case 1:
                int esc= 0;
                
               int dl=0,desc=0;  
                  Raza1 l1 = new Raza1("Jugador 1 ",100,10,10,10);
                  Raza1 l2 = new Raza1("Jugador 2 ",100,10,10,10);
                  
        while(l1.getHp()>0 & l2.getHp()>0)
    {
      
         int op=0;
         System.out.println(" LANZANDO DADOS PARA SABER TURNO...");
         System.out.println(" ");
          dl = (int) (Math.random() * (2 - 1+1)) + 1;    
          esc=(int) (Math.random() * (20 - 1+1)) + 1;   
          if(dl==1){
         System.out.println("GANO EL PRIMER JUGADOR ");
          
          System.out.println(" " ); 
         System.out.println(" "+l1.nombre +" seleccione su atake :");
              System.out.println("MAGO DE FUEGO");
              System.out.println(" ");
           System.out.println("1.vola de fuego ");
           System.out.println("2. curacion de fuego");
           System.out.println("3. SUPER ATAKE de fuego  ");
           op = sc.nextInt();
           
           switch(op){
               
               case 1:
                 {
                      l1.atacar(l2);
                      System.out.println(" ");
                        System.out.println("TABLA DE VIDA ");
           System.out.println(""+l1.nombre+" HP= "+l1.hp);
             System.out.println(""+l2.nombre+" HP= "+l2.hp);
                   
                   }
                    
             
               break;
               case 2:
                   
                   l1.curar(l2);
                   System.out.println(" ");    
              System.out.println("TABLA DE VIDA ");
           System.out.println(""+l1.nombre+" HP= "+l1.hp);
             System.out.println(""+l2.nombre+" HP= "+l2.hp);

               break;
               case 3:
                   if (esc<=15){
                       l1.Ataquefuego(l2);
                        System.out.println(" ");    
              System.out.println("TABLA DE VIDA ");
           System.out.println(""+l1.nombre+" HP= "+l1.hp);
             System.out.println(""+l2.nombre+" HP= "+l2.hp);
                   }
                   else{
                       System.out.println("EL JUEGADOR 2 A LOGRADO ESQUIVAR TU ATAKE ");
                   }
               break;
                case 9:
                   
                   l1.hack(l2);
                   System.out.println(" ");    
              System.out.println("TABLA DE VIDA ");
           System.out.println(""+l1.nombre+" HP= "+l1.hp);
             System.out.println(""+l2.nombre+" HP= "+l2.hp);
                   break;
           }
          
          
                              //inicio jugador 2
               
          } else {
                   System.out.println("GANO EL SEGUDO JUGADOR   ");
          System.out.println(" "+l2.nombre+" seleccione su atake");
         System.out.println("");
              System.out.println("MAGO DE HIELO");
           System.out.println("1. vola de hielo ");
           System.out.println("2. curacion de hielo ");
           System.out.println("3. SUPER ATAKE DE HIELO");
              
           op = sc.nextInt();
                   
                    switch(op){
               
               case 1:
                  
                       
                    l2.atacar(l1);
                   System.out.println(" ");    
              System.out.println("TABLA DE VIDA ");
           System.out.println(""+l1.nombre+" HP= "+l1.hp);
             System.out.println(""+l2.nombre+" HP= "+l2.hp);
                    
                   
                   
                    
                   
                    
                    
               break;
               case 2:
                   
                   
                   l2.curar(l2);
                   System.out.println(" ");    
              System.out.println("TABLA DE VIDA ");
           System.out.println(""+l1.nombre+" HP= "+l1.hp);
             System.out.println(""+l2.nombre+" HP= "+l2.hp);

               break;
               case 3:
                   
                   
                   if (esc<=15){
                       l2.Ataquehielo(l1);
                        System.out.println(" ");    
              System.out.println("TABLA DE VIDA ");
           System.out.println(""+l1.nombre+" HP= "+l1.hp);
             System.out.println(""+l2.nombre+" HP= "+l2.hp);
                   }
                   else{
                       System.out.println("EL JUEGADOR 1 A LOGRADO ESQUIVAR TU ATAKE ");
                   }
                   
                  
                   
               break;
               case 9:
                   
                   l2.hack(l1);
                   System.out.println(" ");    
              System.out.println("TABLA DE VIDA ");
           System.out.println(""+l1.nombre+" HP= "+l1.hp);
             System.out.println(""+l2.nombre+" HP= "+l2.hp);
                   break;
           }
                    
          }
          
    
           }
        
         
                 if (l1.hp<=0) {
         System.out.println("EL GANADOR ES: "+l2.nombre);
     }
     else {
         System.out.println("EL GANADOR ES: "+l1.nombre);
    
      }
        //-----------------------------------------------------------------------
        //---------------------------------------------------------------------- 
                 
                 
                break;
            case 2:
                  int s= 0;
                
               int dl1=0;
                  Raza2 n1 = new Raza2("Jugador 1 ",100,10,10,10);
                  Raza2 n2 = new Raza2("Jugador 2 ",100,10,10,10);
                  
        while(n1.getHp()>0 & n1.getHp()>0)
    {
                int op=0;
         System.out.println(" LANZANDO DADOS PARA SABER TURNO...");
         System.out.println(" ");
          dl = (int) (Math.random() * (2 - 1+1)) + 1;    
          esc=(int) (Math.random() * (20 - 1+1)) + 1;   

          if(dl==1){
         System.out.println("GANO EL PRIMER JUGADOR ");
          
          System.out.println(" " ); 
         System.out.println(" "+n1.nombre+" seleccione su atake :");
              System.out.println("GUERRERO DE LA LANZA ");
              System.out.println(" ");
           System.out.println("1.atake de lanza");
           System.out.println("2. curacion de la lanza ");
           System.out.println("3. SUPER ATAKE DE LA LANZA ");
           op = sc.nextInt();
           
           switch(op){
               
               case 1:
                 {
                     n1.lanzayespada(n2);
                   System.out.println(" ");
                        System.out.println("TABLA DE VIDA ");
           System.out.println(""+n1.nombre+" HP= "+n1.hp);
             System.out.println(""+n2.nombre+" HP= "+n2.hp);
                   }
                    
             
               break;
               case 2:
                   
                   

               break;
               case 3:
                   
               break;
               
           }
          
          
                              //inicio jugador 2
               
          } else {
                   System.out.println("GANO EL SEGUDO JUGADOR   ");
          System.out.println(" "+n2.nombre+" seleccione su atake");
         System.out.println("");
              System.out.println("GUERRERO DE LA ESPADA ");
           System.out.println("1. epadazo");
           System.out.println("2. curacion de la espAda ");
           System.out.println("3. SUPER ATAKE DE LA ESPADA ");
              
           op = sc.nextInt();
                   
                    switch(op){
               
               case 1:
                  
                   n2.lanzayespada(n1);
                   System.out.println(" ");
                        System.out.println("TABLA DE VIDA ");
           System.out.println(""+n1.nombre+" HP= "+n1.hp);
             System.out.println(""+n2.nombre+" HP= "+n2.hp);
               break;
               case 2:
                   
                 
                   
               break;
               case 3:
                   }
                   
                  
                   
               break;
               
           }
                    
          }
          
    
        
        
         
        }
    }
}
       
    
           
     
    
        