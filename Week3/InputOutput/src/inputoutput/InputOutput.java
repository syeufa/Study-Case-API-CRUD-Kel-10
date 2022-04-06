package inputoutput;
import java.util.*;//Untuk membuat scanner

/**
 * InputOutput adalah program yang memisahkan string dari input user menjadi token
 * Token tersebut dipisahkan berdasarkan format specifier menjadi satu atau lebih huruf 
 * alfabet Inggris berturut-turut. Kemudian, jumlah token dicetak dan diikuti oleh setiap
 * token pada baris baru.
 * @author Mochamad Ferdy Fauzan
 * @version 1.0
 * @since 2022-02-17
 */
public class InputOutput {

    public static void main(String[] args) {
        // Deklarasi variabel
        String s; 
        int n;
        
        // Membuat scanner baru
        Scanner sc = new Scanner(System.in);
        
        //Memasukkan scanner ke string s
        s = sc.nextLine();
        
        //Membuat array of string untuk memisahkan string menjadi token berdasarkan format specifier
        String[] stringarr = s.split("[@ ? ! _ , . ']+");
        
        //Menginisialisasi n dengan jumlah token pada stringarr
        n = stringarr.length;
        
        //Mencetak n
        System.out.println(n);
        
        //Mencetak token secara berurutan
        for(int i=0; i < n; i++){
            System.out.println(stringarr[i]);
        }   
    }
}

