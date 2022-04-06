/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package association;


public class Movie {
    //Attribute
    private String movieTitle;
    
    //Getter and Setter

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
    //toString method
    @Override
    public String toString(){
        return movieTitle;
    }
    
}
