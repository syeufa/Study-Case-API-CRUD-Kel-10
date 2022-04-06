/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dependence;

/**
 *
 * @author Ferdy Fauzan
 */
public class Dependence {

    public static void main(String[] args) {
        Person person = new Person("Keanu");
        Menu menu = new Menu("Earl Grey Latte", "Brown Sugar Bobba", 30000);
        
        person.display(menu);
        person.takeOrder(menu);
    }
    
}
