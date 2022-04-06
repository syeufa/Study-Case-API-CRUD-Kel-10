package operators1;

/**
 * Operators1 adalah program yang melakukan convert tipe data yang berukuran besar ke kecil 
 * (long -> int -> short) dan (double -> float -> byte).
 * @author Mochamad Ferdy Fauzan
 * @version 1.0
 * @since 2022-02-12
 */
class ConvertDataType {
    static short methodOne(long l){
        int i = (int) l;
        return (short) i;
    }
    public static void main(String[] args){
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}
    /**
     * Pertanyaan:
     * 1. Jelaskan output nilai dari variable b.
     *      Jawab:
     *      Nilai dari var d dikonversi dari bilangan double menjadi bilangan float ke var f.
     *      Nilai dari var f dikonversi dari bilangan float menjadi bilangan short melalui
     *      method "methodOne(long l)".
     *      Pada method tersebut, nilai dari var f dikonversi menjadi bilangan long kemudian
     *      dikonversi menjadi bilangan integer ke var i. Lalu nilai dari var i dikembalikan menjadi
     *      bilangan short.
     *      Setelah nilai var i menjadi bilangan short, kemudian dikonversi menjadi bilangan byte
     *      ke var b.
     * 2. Jelaskan apa yang berubah dari variable d menjadi variable b setelah dilakukan cast ?
     *      Jawab:
     *      Nilai dari var d akan berubah atau dikonversi menjadi bilangan byte.
     *      Nilai dari var b yang tadinya 10.25 setelah dikonversi ke bilangan byte pada var b menjadi 10.
    */