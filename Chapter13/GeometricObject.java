package E13_11;

/**
 * <h1>GeometricObject</h1>
 * 
 * <p>This class will be an abstract class for Geometric objects.</p>
 * 
 * <p>Created: 10/20/2021
 * 
 * @author Rhett Boatright
 */
public abstract class GeometricObject{

    //Data fields for GeometricObject.
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    
    //Default construct.
    protected GeometricObject(){

        dateCreated = new java.util.Date();
    }   
    
    //Specified construct with color and filled values.
    protected GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    
    //Method to return color.
    public String getColor(){

        return color;
    }
    
    //Method to set color.
    public void setColor(String color){

        this.color = color;
    }
    
    //Method to return filled.
    public boolean isFilled(){

        return filled;
    }
    
    //Method to set filled.
    public void setFilled(boolean filled){

        this.filled = filled;
    }
    
    //Method to obtain the date created.
    public java.util.Date getDateCreated(){

        return dateCreated;
    }
    
    //Method to return the string of the object created.
    public String getString(){

        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
    
    //Method for abstract getArea.
    public abstract double getArea(); 
    
    //Method for abstract getPerimeter.
    public abstract double getPerimeter();
}