package variables;

/**
 * Constants2 adalah program yang menghitung ukuran lebar dan tinggi kertas
 * dalam ukuran cm ke ukuran inch dengan menggunakan konstanta.
 * @author Mochamad Ferdy Fauzan
 * @version 1.0
 * @since 2022-02-12
 */
public class Constants2 {
    public static final double CM_PER_INCH = 2.54;
     public static void main(String[] args) {
         double paperWidth = 8.5;
         double paperHeight = 11;
         System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
     }
}

/**
 * Pertanyaan:
 * 1) Bagaimana output dari masing masing class Constants dan Constants2?
 *      Jawab:
 *      Masing - masing class Constants dan Constants2 memiliki output yang sama.
 * 2) Apa perbedaan penggunaan final double dengan public static final double?
 *      Jawab:
 *      Penggunaan final double hanya bisa digunakan di dalam method itu sendiri
 *      sedangkan penggunaan public static final double bisa digunakan atau dipanggil 
 *      di dalam method lain. Karena public itu hak akses dari method/class dan 
 *      fungsi static digunakan agar method tersebut dapat di akses tanpa melakukan 
 *      inisialisasi pada class tersebut.
 */