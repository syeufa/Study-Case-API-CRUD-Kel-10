/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aggregation;

/**
 *
 * @author Ferdy Fauzan
 */
public class Player {
    //Attributes
    private String name;
    private int backNum;
    private Football football;

    //Constructor
    public Player(String name, int backNum, Football football) {
        this.name = name;
        this.backNum = backNum;
        this.football = football;
    }
    //Getter 
    public String getName() {
        return name;
    }
    public int getBackNum() {
        return backNum;
    }
    public Football getFootball() {
        return football;
    }
}
