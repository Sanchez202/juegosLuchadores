/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocartas;

/**
 *
 * @author APRENDIZ SENA
 */
public class Raza2  implements Magias {
    String nombre;
    int hp;
    private int atk;
    private int defenza;
    private int magia;

    public Raza2(String nombre, int hp, int atk, int defenza, int magia) {
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
    
 
    public void lanzayespada(Raza2 oponente ){
        oponente.hp=oponente.hp-10;
        System.out.println(" "+oponente.nombre+" se le ha restado 10 puntos de vida");
    }
    public void ataque2(Raza2 oponente){
        this.hp=this.hp+15;
        System.out.println(""+this.nombre+" ha recuperado 15 puntos de vida ");
                
    }
    
    
    @Override
    public void Curar() {
        System.out.println("curando....");
    }

    @Override
    public void Robarvida() {
        System.out.println("robando vida...");
    }

    @Override
    public void Ataquehielo() {
        System.out.println("ataque de hielo...");
    }

    @Override
    public void Ataquefuego() {
        System.out.println("ataque de fuego....");
    }
    
    
    
}
