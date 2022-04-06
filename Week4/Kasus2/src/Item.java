/** 
 * @author Mochamad Ferdy Fauzan
 * @version 1.0
 * @since 2022-02-24
 */
public class Item {
    private String name;
    private Item() {
        this.name = "Ipin"; //penambahan this mengacu pada variabel yang dimiliki oleh class Item
    }
    public Item(String name) {
        this.name = "Ipin" ;//mengisi var this.name dengan string Ipin
        System.out.println(this.name);//menampilkan var this.name
    }
    
}
