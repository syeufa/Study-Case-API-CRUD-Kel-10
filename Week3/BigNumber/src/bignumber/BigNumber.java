package bignumber;
import java.util.Scanner; // untuk membuat scanner
import java.math.BigInteger; //untuk membuat tipe data BigInteger

/**
 * BigNumber adalah program untuk menambah dan mengalikan angka besar.
 * Angka - angka ini sangat besar sehingga tidak dapat dimuat dalam 
 * tipe data biasa seperti long integer.
 * @author Mochamad Ferdy Fauzan
 * @version 1.0
 * @since 2022-02-17
 */
public class BigNumber {
    public static void main(String[] args) {
        // Membuat scanner baru
        Scanner sc = new Scanner(System.in);
        
        // Membuat var dengan tipe data BigInteger dan memasukkan scanner ke dalamnya
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        
        // Menginisialisasi c sebagai hasil dari a + b
        BigInteger c = a.add(b);
        
        // Menginisialisasi d sebagai hasil dari a * b
        BigInteger d = a.multiply(b);
        
        // Mencetak c dan d 
        System.out.println(c);
        System.out.println(d);
    }
    
    
}
