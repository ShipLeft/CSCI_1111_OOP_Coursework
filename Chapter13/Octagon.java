package E13_11;

/**
 * <h1>Octagon</h1>
 * 
 * <p>This class will construct a octagon object</p>
 * 
 * <p>Created: 10/20/2021
 * 
 * @author Rhett Boatright
 */
public class Octagon extends GeometricObject 
implements Cloneable, Comparable<Octagon>{
	
	private double s = 1.0;
	private double area = 1.0;
	
	Octagon(){
		this.s = 1;
	}
	
	Octagon(double s){
		this.s = s;

		
	}
	
	//Method to return s.
	public double getS() {
		return s;
	}
	
	//Method to set s.
	public void setS(double s) {
		this.s = s;
	}
	
	//Method to get the area of the triangle.
	  public double getArea(){
	      double area = (2 + (4 / Math.sqrt(2)) * s * s);
		  return area;
	  }
	
	//Method to get the perimeter of the triangle.
	public double getPerimeter(){
	    return (s * 8);
	}

	//Method to print the new triangle in a string.
	public String becomeString(){
		return "Octagon: side = " + s + "\n Octagon area: " + getArea()
		+ " Octagon perimeter: " + getPerimeter() + "\n"+ getString();
	}

	@Override
	public int compareTo(Octagon o) {
		if (this.s > o.s) {
			return 1;
		}
		else if(this.s < o.s) {
			return -1;
		}
		else {
			return 0;
		}
	}
	 //Method for cloning an object.
    @Override
	public Object clone() {
		try {
			return super.clone();
		}
		catch (CloneNotSupportedException ex) {
			return null;
		}
	}
}