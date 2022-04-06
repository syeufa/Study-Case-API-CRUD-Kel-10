/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composition;

/**
 *
 * @author Ferdy Fauzan
 */
public class Composition {

    public static void main(String[] args) {
        //Membuat objek dari class Smartphone
        Smartphone hp = new Smartphone("iPhone 13", "A2633" , " Starlight");
        //Membuat objek dari class Specification
        Specification spec = new Specification(hp, "iOS 15", 256, 4, 12, 3240);
        //Menampilkan output
        System.out.println("    This is your Phone");
        System.out.println("=========================");
        System.out.println(spec);
    }
    
}
