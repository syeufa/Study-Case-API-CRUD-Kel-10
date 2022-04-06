/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package association;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ferdy Fauzan
 */
public class Association {

    public static void main(String[] args) {
        Director director = new Director();
        director.setDirectorName("Matt Reeves");
        
        Movie movie1 = new Movie();
        movie1.setMovieTitle("War of the Planet of the Apes");
        Movie movie2 = new Movie();
        movie2.setMovieTitle("The Batman");
        
        List<Movie> empList = new ArrayList<Movie>();
        empList.add(movie1);
        empList.add(movie2);
        
        director.setMovies(empList);
        
        System.out.println(director.getMovies()+ " merupakan film yang disutradarai oleh " + director.getDirectorName() );
    }
    
}
