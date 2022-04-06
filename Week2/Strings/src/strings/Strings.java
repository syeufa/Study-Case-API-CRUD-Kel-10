package strings;
import java.util.*;

/**
 * Strings adalah program yang menerima input 2 kata lowercase berbahasa Inggris
 * yang ditampung ke dalam string A dan B, kemudian ditentukan:
 * 1. Jumlah string A dan B.
 * 2. Secara leksikografis, apakah string A lebih besar daripada B.
 * 3. Menmbuat huruf pertama pada string A dan B menjadi huruf kapital.
 * @author Mochamad Ferdy Fauzan
 * @version 1.0
 * @since 2022-02-12
*/

public class Strings {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); //menambah scanner baru
        String A = scan.nextLine(); //menerima input dari user ke var A
        String B = scan.nextLine(); //menerima input dari user ke var B
        
        int lengthA = A.length(); //menghitung dan menampung panjang huruf dari var A 
        int lengthB = B.length(); //menghitung dan menampung panjang huruf dari var B
        int sum = lengthA + lengthB; //menjumlahkan var lengthA dan var lengthB
        
        String firstCharA = A.substring(0, 1).toUpperCase(); //mengambil dan menampung huruf pertama dari var A dan mengubahnya menjadi huruf kapital
        String firstCharB = B.substring(0, 1).toUpperCase(); //mengambil dan menampung huruf pertama dari var B dan mengubahnya menjadi huruf kapital
        String charALeft = A.substring(1); //mengambil dan menampung string A tanpa huruf pertama
        String charBLeft = B.substring(1); //mengambil dan menampung string B tanpa huruf pertama
        
        
        System.out.println(sum);
        
        //membandingkan string A dengan string B berdasarkan urutan leksikografis
        if(A.compareTo(B)>B.compareTo(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
         System.out.println(firstCharA + charALeft + " " + firstCharB + charBLeft);
    }   
}
    

