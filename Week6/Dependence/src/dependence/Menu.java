/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependence;

/**
 *
 * @author Ferdy Fauzan
 */
public class Menu {
    //Attributes
    private String drink;
    private String topping;
    private int price;

    //Constructor
    public Menu(String drink, String topping, int price) {
        this.drink = drink;
        this.topping = topping;
        this.price = price;
    }
    
    //Getter and Setter

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    //Method
    public void takeOrder(){
        System.out.println(getDrink() + " Berhasil dipesan!");
    }
    
    
    
    
}
