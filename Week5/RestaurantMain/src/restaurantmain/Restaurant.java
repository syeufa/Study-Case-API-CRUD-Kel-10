/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurantmain;

/**
 *
 * @author Ferdy Fauzan
 */
public class Restaurant {   
    /*Mengubah akses modifier attribute ke private*/
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    /*-----------------------------*/
    public static byte id = 0;

    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }
    
    /*Menggunakan setter pada method tambahMenuMakanan*/
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        setNama_makanan(nama, id);
        setHarga_makanan(harga, id);
        setStok(stok, id);
    }
    
    /*Menambah method TakeOrder untuk memesan makanan */
    /*Ketika method ini dipanggil, maka stok makanan yang tersedia akan berkurang*/
    public void takeOrder(String nama, int banyak){
        int tempId = -1;
        for(int i=0; i<=id; i++){
            if(!isOutOfStock(i)){
                if (nama.compareToIgnoreCase(this.getNama_makanan(i))== 0) {
                    tempId = i; 
                }
            }
        }
        if(tempId == -1){
            System.out.println(nama + " tidak ada di dalam menu!");
            return;
        }
        if (getStok(tempId) < banyak) {
            System.out.println("Stok " + getNama_makanan(tempId) + " tidak cukup untuk pesanan!");
            }
        else{
            this.setStok(getStok(tempId)-banyak, tempId);
        }
        
    }
    
    public boolean isOutOfStock(int id){
        if(getStok(id) == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void nextId(){
        id++;
    }
    
     /*Menggunakan getter dan setter yang telah dibuat pada method tampilMenuMakanan*/
    public void tampilMenuMakanan(){
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println(getNama_makanan(i) + "[" + getStok(i) + "]" + " \tRp. " + getHarga_makanan(i));
            }else{
                System.out.println("Stok " + getNama_makanan(i) + " habis!");
            }
        }
    }
    
    /*Membuat Getter and Setter*/
    public String[] getNama_makanan() {
        return nama_makanan;
    }
    public String getNama_makanan(int id) {
        return nama_makanan[id];
    }
    public void setNama_makanan(String[] nama_makanan) {
        this.nama_makanan = nama_makanan;
    }
    public void setNama_makanan(String nama_makanan, int id) {
        this.nama_makanan[id] = nama_makanan;
    }
    public double[] getHarga_makanan() {
        return harga_makanan;
    }
    public double getHarga_makanan(int id) {
        return harga_makanan[id];
    }
    public void setHarga_makanan(double[] harga_makanan) {
        this.harga_makanan = harga_makanan;
    }
    public void setHarga_makanan(double harga_makanan, int id) {
        this.harga_makanan[id] = harga_makanan;
    }
    public int[] getStok() {
        return stok;
    }
    public int getStok(int id) {
        return stok[id];
    }
    public void setStok(int[] stok) {
        this.stok = stok;
    }
    public void setStok(int stok, int id) {
        this.stok[id] = stok;
    }
    public static byte getId() {
        return id;
    }
    public static void setId(byte id) {
        Restaurant.id = id;
    }
}
    
