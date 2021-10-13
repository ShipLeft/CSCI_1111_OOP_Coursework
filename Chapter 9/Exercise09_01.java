/**
 * <h1>Exercise 9_1</h1>
 * <p>This class will give the width, height, area, and permimeter
 * of rectangle objects.</p>
 * 
 * <p>Created: 10/13/2021
 * 
 * @author Rhett Boatright
 */
public class Exercise09_01 {
	/**
	 * This method will call upon the other class and print results.
	 * 
	 * @param args (String; placeholder of the main method.)
	 * @param width (double; width of current rectangle.)
	 * @param height (double; height of current rectangle.)
	 */
	public static void main(String[] args) {
		
		//Create the first rectangle.
		Rectangle rectangle1 = new Rectangle(4.0, 40.0);
		
		//Print out width, height, area, and perimeter.
		System.out.println("rectangle1:\n" 
				+"---------------------------\n"
				+"Width: " + rectangle1.width
				+ "\nHeight: " + rectangle1.height
				+ "\nArea: " + rectangle1.getArea()
				+ "\nPerimeter: " + rectangle1.getPerimeter());
		
		//Create the second rectangle.
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		
		//Print out width, height, area, and perimeter.
		System.out.println("\nrectangle2:\n" 
				+"---------------------------\n"
				+"Width: " + rectangle2.width
				+ "\nHeight: " + rectangle2.height
				+ "\nArea: " + rectangle2.getArea()
				+ "\nPerimeter: " + rectangle2.getPerimeter());
	}
}
	
//Create a class for the rectangle.
/**
 * <h1>Rectangle</h1>
 * <p>This class is the rectangle object.</p>
 * 	
 * <p>Created: 10/13/2021</p>
 * @author Rhett Boatright
 */
class Rectangle{
	/**
	 * This method is the method that contains the
	 * set height and width of the rectangle.
	 * 
	 * @param width (double; the set width of the rectangle.)
	 * @param height (double; the set height of the rectangle.)
	 */
	double width, height;
		
	//Create no arg constructor.
	Rectangle(){
		width = 1;
		height = 1;
	}
		
	//Create a second constructor.
	/**
	 * This method will determine the width and height
	 * using the values from the main method.
	 * @param newWidth
	 * @param newHeight
	 */
	Rectangle(double newWidth, double newHeight){
		width = newWidth;
		height = newHeight;
	}
		
	//Create getArea() method.
	/**
	 * This method will determine the area of the current rectangle.
	 * 
	 * @return
	 */
	double getArea() {
		return width * height;
	}
		
	//Create getPerimeter() method.
	/**
	 * This method will determine the perimeter of the current rectangle.
	 * 
	 * @return
	 */
	double getPerimeter() {
		return 2 * (width + height);
			
	}
		
}

