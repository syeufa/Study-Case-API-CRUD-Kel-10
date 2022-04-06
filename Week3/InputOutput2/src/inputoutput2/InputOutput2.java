package inputoutput2;
import java.util.*; //Untuk membuat scanner

/**
 * InputOutput2 adalah program yang mengatur setiap String agar diluruskan ke kiri dengan spasi 
 * tambahan melalui 15 karakter pertama. Digit utama integer adalah karakter ke-16, dan 
 * setiap integer yang tadinya kurang dari 3 digit sekarang memiliki nol di depan.
 * @author Mochamad Ferdy Fauzan
 * @version 1.0
 * @since 2022-02-17
 */
public class InputOutput2 {
    public static void main(String[] args) {
        //Deklarasi Variabel
        String word; 
        int num;
        
        //Membuat array of string dan array of int
        String[] arrword = new String[3];
        int[] arrint = new int[3];
        
        //Membuat scanner 
        Scanner sc = new Scanner(System.in);
        
        //Memasukkan scanner ke array dengan looping
        for(int i=0; i<3; i++){
            word = sc.next();
            arrword[i] = word;
            num = sc.nextInt();
            arrint[i] = num;
        }
        
        //Mencetak output 
        System.out.println("====================");
        for(int i=0; i<3; i++){
            //Mencetak output dengan format 15 karakter diluruskan ke kiri dan 
            //karakter ke 16 menghasilkan output 3 digit angka yang dimulai dengan angka 0
            System.out.format("%-15s%03d%n", arrword[i], arrint[i]);
        }
        System.out.println("====================");    
    }
    
}
