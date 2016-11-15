/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.text.DecimalFormat;

/**
 *
 * @author SirhH
 */
public class Food {
    private String name;
    private double price;
    
    public Food(String name, double price){
        this.name=name;
        this.price=price;
    }
    /**
     * returns the name of the food 
     * @return 
     */
    public String getName(){
        return name;
    }
    /**
     * returns the price of the food 
     * @return 
     */
    public double getPrice(){
        return price;
    }
    /**
     * Use this method to give the food a new price, 
     * @param price
     */
    public void setPrice(double price){
        this.price=price;
    }
    
    @Override
    public String toString(){
        DecimalFormat twoDeciamls = new DecimalFormat("0.00");
        return name+" : "+twoDeciamls.format(price)+"kr";
    }
    //for testData 
    /*public static void main (String[] args){
        Food [] foodItems = { 
            new Food("Warm Soup menu",49.90),
            new Food("Spaghetti",69.90),
            new Food("Beef and fries menu",119.90),
            new Food("Double sandwich",39.90),
            new Food("Finest lobster menu", 139.90),
            new Food("Hot dog",29.90)};
        
        for(Food food: foodItems){
            System.out.println(food);
        }
    }*/
}
