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
    private String nombre;
    private int hp;
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

    @Override
    public void Curar() {
        System.out.println("curando..");
        
       
    }

    @Override
    public void Robarvida() {
        System.out.println("robando vida..");
    }

    @Override
    public void Ataquehielo() {
        System.out.println("ataque de hielo...");
    }
    @Override
    public void Ataquefuego() {
        System.out.println("atacando con fuego....");
    }

    @Override
    public void Escapar() {
        System.out.println("escapando...");
    }

    @Override
    public void Atacar() {
        System.out.println("atacando....");
        
        
    }

    @Override
    public void Dobleataque() {
        
        System.out.println("doble ataque....");
    }
    
     
    
}
    
    
    
