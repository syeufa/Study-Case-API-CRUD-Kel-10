package datatypes;

import java.util.*;

/**
 * DataTypes adalah program yang menentukan tipe data primitif dari
 * input user. Program ini menggunakan static constants yang menyimpan 
 * nilai langsung untuk menentukan setiap tipe data, yaitu :
 * MAX_VALUE untuk nilai maksimum, dan
 * MIN_VALUE untuk nilai minimum.
 * @author Mochamad Ferdy Fauzan
 * @version 1.0
 * @since 2022-02-12
 */
public class DataTypes {

    public static void main(String[] args) {

        //Kamus Data
        int t; //Variabel untuk menunjukkan test case
        long n; //Variabel untuk menampung angka baik besar maupun kecil
          
        //Algoritma
        Scanner sc = new Scanner(System.in); //Membuat scanner baru
        t = sc.nextInt(); //Menerima input dari user ke variabel t
        String[] total = new String [t]; //Membuat string dengan elemen maks sebanyak t
        
        for(int i=0; i<t; i++){
            total[i] = sc.next(); //Menginisialisasi indeks total ke-i dengan input dari user
        }
        for(int i=0; i<t; i++){ 
            //Dilakukan pengecekan apakah variabel n sesuai dengan ke 4 tipe data primitif
            try{ //Output jika variabel n sesuai dengan salah satu dari ke 4 tipe data primitif
                n = Long.parseLong(total[i]); //Mengkonversi indeks total ke-i ke tipe data long
                System.out.println(n + " can be fitted in :"); 
                if(n>=Byte.MIN_VALUE && n<=Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                if(n>=Short.MIN_VALUE && n<=Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if(n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if(n>=Long.MIN_VALUE && n<=Integer.MAX_VALUE){
                    System.out.println("* long");
                }
            }catch(Exception e){ //Output jika variabel n tidak sesuai dengan ke 4 tipe data primitif
                System.out.println(total[i] + " can’t be fitted anywhere"); 
            }
            
        }
        
        
    }
    
}
