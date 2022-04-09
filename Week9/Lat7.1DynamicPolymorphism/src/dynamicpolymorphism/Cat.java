/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dynamicpolymorphism;

/**
 *
 * @author mferd
 */

public class Cat extends Animal{

    @Override
    public void sound(){
        System.out.println("Meow");
    }
    public static void main(String[] args) {
        Animal obj = new Cat();
        obj.sound();
    }
    
}
