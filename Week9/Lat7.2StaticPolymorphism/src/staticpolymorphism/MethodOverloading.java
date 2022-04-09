/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staticpolymorphism;

/**
 *
 * @author mferd
 */
class MethodOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Overload Obj = new Overload();
        double result;
        Obj.demo(10);
        Obj.demo(10, 20);
        result = Obj.demo(5.5);
        System.out.println("O/P : " + result);
    }
    
}
