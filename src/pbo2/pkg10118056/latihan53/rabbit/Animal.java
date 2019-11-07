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
public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;

    public Animal(boolean vegetarian, String food, int legs) {
        this.vegetarian = vegetarian;
        eats = food;
        noOfLegs = legs;
    }
    
    public boolean isVegetarian(){
        return vegetarian;
        
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
    

    
    
}
