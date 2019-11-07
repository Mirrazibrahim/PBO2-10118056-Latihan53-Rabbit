/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118056.latihan53.rabbit;

/**
 *
 * @author 
 * Nama : Mirraz Ibrahim
 * Nim : 10118056
 * Kelas: IF-2
 */
public class Rabbit extends Animal{
    private String color,name;  

    public Rabbit(String name, boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    

    
    
    
}
