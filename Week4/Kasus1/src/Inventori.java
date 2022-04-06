/** 
 * @author Mochamad Ferdy Fauzan
 * @version 1.0
 * @since 2022-02-24
 */

public class Inventori {
    
    Barang[] barangs; //deklarasi class barang dengan nama var barangs bertipe array

    //methods
    void initBarang() { 
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }// untuk mengintansiasi objek barang
    
    void showBarang() {
        System.out.println(barangs[0].getNamaBarang() + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].getNamaBarang() + "(" + barangs[1].getStok() + ")");
    }// untuk menampilkan objek barang dan stoknya
    
    void pengadaan() {
        initBarang();
        barangs[0].setStok(20);
     //   barangs[0].stok -= 30; //Bisa juga dikurangi dong?
     //   barangs[0].stok *= 30; //dikali juga bisa dong??
        showBarang();
    }//untuk pengadaan stok barang
    
    //main method
    public static void main(String[] args) {
        Inventori beli = new Inventori(); //instansiasi objek beli dengan class inventori
        beli.pengadaan(); //pemanggilan method pengadaan pada objek beli
    }
}
