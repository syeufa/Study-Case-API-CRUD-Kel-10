/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composition;

public class Specification {
    //Attributes
    private Smartphone phone;
    private String os;
    private int storage;
    private int ram;
    private int camera;
    private int battery;

    //Constructor
    public Specification(Smartphone phone, String os, int storage, int ram, int camera, int battery) {
        this.phone = phone;
        this.os = os;
        this.storage = storage;
        this.ram = ram;
        this.camera = camera;
        this.battery = battery;
    }
    //Getter
    public Smartphone getPhone() {
        return phone;
    }

    public String getOs() {
        return os;
    }

    public int getStorage() {
        return storage;
    }

    public int getRam() {
        return ram;
    }

    public int getCamera() {
        return camera;
    }

    public int getBattery() {
        return battery;
    }
    //Method
    public String toString() {
        return String.format("%s\n*************************\nOS : %s\nStorage : %dGB\nRAM : %dGB\nCamera : %dMP\nBattery : %dmAH\n", getPhone(), getOs(), getStorage(), getRam(), getCamera(), getBattery());
    }

   
    
    
}
