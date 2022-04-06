/** 
 * @author Mochamad Ferdy Fauzan
 * @version 1.0
 * @since 2022-02-24
 */
public class KelasDua {
    {
    System.out.println(5);//tidak tampil di output karena tidak ada pembuatan objek dengan class KelasDua
    }
    public static void main(String[] args)
    {
    System.out.println(6);
    KelasSatu satu = new KelasSatu(); //memanggil semua atribut pada kelassatu
    KelasSatu dua = new KelasSatu(10); //pemanggilan parameter agar menggunakan contructor int i
    }
    
}
