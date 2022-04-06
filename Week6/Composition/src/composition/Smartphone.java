/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composition;

/**
 *
 * @author Ferdy Fauzan
 */
public class Smartphone {
    //Attributes
    private String brand;
    private String models;
    private String color;
    
    //Constructor
    public Smartphone(String brand, String models, String color) {
        this.brand = brand;
        this.models = models;
        this.color = color;
    }
    
    //Getter
    public String getBrand() {
        return brand;
    }

    public String getModels() {
        return models;
    }

    public String getColor() {
        return color;
    }
    //Method
    @Override
    public String toString(){
        return String.format("Brand : %s\nModels : %s\nColour : %s", this.brand, this.models, this.color);
    }
}
