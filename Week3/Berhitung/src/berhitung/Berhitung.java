package berhitung;
import java.util.*;//Untuk membuat scanner

/**
 * Berhitung adalah sebuah program kalkulator sederhana.
 * Terdapat 5 buah operator matematika:
 * Penjumlahan, direpresentasikan dengan '+'.
 * Pengurangan, direpresentasikan dengan '-'.
 * Perkalian, direpresentasikan dengan '*'.
 * Pembagian, direpresentasikan dengan '/'.
 * Sisa hasil bagi, direpresentasikan dengan '%'.
 * @author Mochamad Ferdy Fauzan
 * @version 1.0
 * @since 2022-02-17
 */
public class Berhitung {
    public static void main(String[] args) {
        //Deklarasi variabel
        int A,B,hasil;
        char operator;
        
        //Membuat scanner baru
        Scanner sc = new Scanner(System.in);
        
        //Memasukkan scanner ke variabel
        A = sc.nextInt();
         //charAt digunakan untuk memasukkan scanner ke var tipe data char
        operator = sc.next().charAt(0); 
        //Memasukkan scanner ke variabel
        B = sc.nextInt();
        
        //Pengecekan operator yang digunakan berdasarkan input user kemudian hasil operasi dicetak
        if((A>=1 && A<=1000)&&(B>=1 && B<=1000)){
            switch(operator){
                case '+':
                    hasil = A + B;
                    System.out.println(hasil);
                    break;
                case '-':
                    hasil = A - B;
                    System.out.println(hasil);
                    break;
                case '*':
                    hasil = A * B;
                    System.out.println(hasil);
                    break;
                case '/':
                    hasil = A / B;
                    System.out.println(hasil);
                    break;
                case '%':
                    hasil = A % B;
                    System.out.println(hasil);
                default:
                    System.out.println("SALAH OPERATOR BESTIEE!!!");
                }
        }else
            System.out.println("SALAH ANGKA BESTIEEE!!!");
    }
}