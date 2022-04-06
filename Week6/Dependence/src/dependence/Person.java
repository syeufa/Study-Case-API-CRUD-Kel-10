/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependence;

/**
 *
 * @author Ferdy Fauzan
 */
public class Person {
    //Attribute
    public String name;
    
    //Constructor

    public Person(String name) {
        this.name = name;
    }
    
    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //method
    public void display(Menu drinks){
        System.out.println("Customer : " + getName());
        System.out.println("Menu : " + drinks.getDrink());
        System.out.println("Topping : " + drinks.getTopping());
        System.out.println("Price : " + drinks.getPrice());
    }
    
    public void takeOrder(Menu drinks){
        drinks.takeOrder();
        System.out.println("by " + getName());
    }
    
    
}
