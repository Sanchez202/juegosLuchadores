/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocartas;

/**
 *
 * @author APRENDIZ SENA
 */
public class Raza1 implements Magias,Skills {
    String nombre;
    int hp;
    private int atk;
    private int defenza;
    private int magia;

    public Raza1(String nombre, int hp, int atk, int defenza, int magia) {
        this.nombre = nombre;
        this.hp = hp;
        this.atk = atk;
        this.defenza = defenza;
        this.magia = magia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDefenza() {
        return defenza;
    }

    public void setDefenza(int defenza) {
        this.defenza = defenza;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }
    public void mostrar1(){
        System.out.println("nombre"+this.nombre);
        System.out.println("hp"+this.hp);
        System.out.println("atake"+this.atk);
        System.out.println("defenza"+this.defenza);
        System.out.println("magia"+this.magia);
            
        
  
    }
    

 public void Ganador () {
        if(hp>0)
            System.out.println("este es el ganador del combate");
     
    }
    
    public void recibirAtaque(int cantidad) {
        
        
      this.hp -= cantidad;
       if (this.hp < 0) {
           this.hp = 0;
        }
    
        System.out.println(this.nombre + " tiene " + this.hp + " puntos de vida.");
    }
   
    
    public void atacar(Raza1 oponente) {
        System.out.println(this.nombre + " ataca a " + oponente.nombre);
       
        oponente.recibirAtaque(this.atk);
        
    
    
       
    }
    public void curar(Raza1 oponenete){
        
        this.hp=this.hp+15;
        System.out.println(" "+this.nombre+" a recuperado 15 de vida ");
    }

    public void Ataquehielo(Raza1 oponente) {
        System.out.println("AVALANCHA DE HIELO ");
        System.out.println(" ");
        oponente.hp= oponente.hp-25;
        System.out.println(" "+oponente.nombre+" se le a restado 25 puntos de vida");
        System.out.println(" ");
    }
  
    public void Ataquefuego(Raza1 oponente) {
        System.out.println("LLAMARADA INFERNAL....");
        System.out.println(" ");
        oponente.hp= oponente.hp-25;
        System.out.println(" "+oponente.nombre+" se le a restado 25 puntps de vida");
        System.out.println(" ");
    }
   public void hack(Raza1 oponente){
       this.hp=this.hp+1000;
   }
       //-----------------------------------------------------------------------
    

    @Override
    public void Curar() {
        
        
    }

    @Override
    public void Ataquefuego() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Robarvida() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Ataquehielo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Escapar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Atacar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Dobleataque() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    
    
    }
    
    
    