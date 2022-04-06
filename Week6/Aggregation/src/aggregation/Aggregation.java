/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aggregation;

/**
 *
 * @author Ferdy Fauzan
 */
public class Aggregation {

    public static void main(String[] args) {
        //Membuat objek dari kelas Football
        Football football = new Football("Paris Saint-Germain", "Ligue 1");
        //Membuat objek dari kelas Player
        Player player = new Player("Neymar", 11, football);
        //Menampilkan output
        System.out.println(football.getClub() + " has a player with the back number " + player.getBackNum());
        System.out.println(player.getName()+ " has been transferred to " + football.getLeague());
        
    }
    
}
