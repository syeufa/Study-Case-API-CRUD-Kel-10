<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author user
 */
/**
* The Shape class models a shape with a color and filled.
*/
public class Shape {
    // private instance variable, not accessible from outside this class
    private String color = "red";
    private boolean filled = true ;
    
    // Constructors (overloaded)
    /** Constructs a Shape instance with default value for color and filled */
    public Shape() {// 1st (default) constructor
        color = "green";
        filled = true;
    }
    
    /** Constructs a Circle instance with the given color and given filled */
    public Shape(String color, boolean filled){ // 2nd constructor
        this.color = color;
        this.filled = filled;
    }
    
    /** Getter and Setter **/
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    /** Return a self-descriptive string of this instance in the form of
        "A Shape with color of xxx and filled/Not filled". */
    @Override
    public String toString() {  
        String writeFilled;
        if(isFilled()==true){
            writeFilled = "filled";
        }else{
            writeFilled = "not filled";
        }
        return "A shape with color of " +  color + " and " + writeFilled ;
    }
    
    
    
    
    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author user
 */
/**
* The Shape class models a shape with a color and filled.
*/
public class Shape {
    // private instance variable, not accessible from outside this class
    private String color = "red";
    private boolean filled = true ;
    
    // Constructors (overloaded)
    /** Constructs a Shape instance with default value for color and filled */
    public Shape() {// 1st (default) constructor
        color = "green";
        filled = true;
    }
    
    /** Constructs a Circle instance with the given color and given filled */
    public Shape(String color, boolean filled){ // 2nd constructor
        this.color = color;
        this.filled = filled;
    }
    
    /** Getter and Setter **/
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    /** Return a self-descriptive string of this instance in the form of
        "A Shape with color of xxx and filled/Not filled". */
    @Override
    public String toString() {  
        String writeFilled;
        if(isFilled()==true){
            writeFilled = "filled";
        }else{
            writeFilled = "not filled";
        }
        return "A shape with color of " +  color + " and " + writeFilled ;
    }
    
    
    
    
    
}
>>>>>>> 80ef805 (update commit)
