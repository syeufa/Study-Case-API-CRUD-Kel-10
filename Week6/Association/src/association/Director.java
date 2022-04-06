/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package association;
import java.util.List;

public class Director {
    //Attribute
    private String directorName;
    List<Movie> movies;

    //Getter and Setter
    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
    
    //Method
    public void setDirector(List<Movie> movies){
        this.movies = movies;
    }
    
    
}
