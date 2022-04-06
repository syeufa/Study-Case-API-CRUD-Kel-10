/** 
 * @author Mochamad Ferdy Fauzan
 * @version 1.0
 * @since 2022-02-24
 */
class KelasSatu {
    {
        System.out.println(11); // blok inisialisasi bakal dipanggil ketika ada objek yg dibuat dengan class yg didefinisikan
    }
    static //blok static diprint pertama kali saat class dipanggil sebanyak satu kali
    {
        System.out.println(2);
    }
    public KelasSatu(int i) //constructor akan dijalankan setelah blok static & inisialisasi dijalankan
    {
        System.out.println(3); 
    }
    public KelasSatu() //constructor tanpa parameter akan dijalankan sesuai kondisi saat pemanggilannya
    {
        System.out.println(4);
    }    
}
