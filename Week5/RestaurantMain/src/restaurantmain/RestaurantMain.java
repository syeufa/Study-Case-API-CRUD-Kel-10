/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurantmain;

/**
 *
 * @author Ferdy Fauzan
 */
public class RestaurantMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
       
        menu.tampilMenuMakanan();
        
        System.out.println("\n====================================");
        System.out.println("\tStok setelah dipesan");
        System.out.println("====================================");
        menu.takeOrder("Bala-bala", 5);
        menu.takeOrder("Gehu", 21);
        menu.takeOrder("Tahu", 4);
        menu.takeOrder("pisang", 2);
       // menu.takeOrder("pisang", 3);
        menu.tampilMenuMakanan();
       
    }
    
}
