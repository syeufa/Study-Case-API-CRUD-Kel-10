package operators;

/**
 * FloatingPoint adalah program yang membulatkan nilai x yang bertipe float
 * menjadi nilai nx yang bertipe data integer menggunakan method Math.round(x).
 * @author Mochamad Ferdy Fauzan
 * @version 1.0
 * @since 2022-02-12
 */
public class FloatingPoint {
    public static void main(String[] args) {
        double x = 92.98;
        int nx = (int) Math.round(x);
        //proses tambahan untuk mengetahui output nx
        System.out.println(nx);
    }
}
/**
 * Math Class berisi bermacam-macam fungsi matematika seperti pada contoh diatas pada penggunaan round(x), 
 * terdapat beberapa pertanyaan yang perlu untuk dijelaskan:
 * 1. Pada kasus berikut jelaskan nilai nx setelah digunakan Math.round(x);
 *      Jawab : 
 *      Method Math.round(x) digunakan untuk membulatkan bilangan desimal ke bilangan bulat terdekat. 
 *      Oleh karena itu, nilai nx = 93 karena nx merupakan hasil pembulatan nilai x.
 * 2.	Kenapa dibutuhkan cast (int) dalam penggunaan Math.round(x) ?
 *      Jawab:
 *      cast (int) dibutuhkan dalam penggunaan Math.round(x) karena nilai kembali dari method round adalah long,
 *      dan long hanya dapat ditetapkan ke int dengan cast eksplisit karena ada kemungkinan kehilangan informasi.
 */
