package E10_03;

/**
 * <h1>MyInteger</h1>
 * <p>This class will return value, test to see if an in is
 * even, odd, or prime, return a char[] as an int,
 * and return a String as an int.</p>
 * 
 * @author Rhett Boatright
 *
 */
public class MyInteger{

   int value;

   //Create constructor.
   MyInteger(int newValue){
      value = newValue;
   }
   //Create getter method.
   public int getValue() {
      return value;
   }
   //Create isEven non-static method.
   public boolean isEven(){
      return (value % 2 == 0);
   }
   //Create isOdd non-static method.
   public boolean isOdd() {
      return ( value % 2 != 0);
   }
   //Create isPrime non-static method.
   public boolean isPrime() {
      if(value == 1 || value == 2) {
         return true;
      }
      for(int i = 2; i <= value / 2; i++) {
         if(value % i == 0) {
            return false;
         }
      }
      return true;

   }
   //Create isEven static method.
   public static boolean isEvenInt(int number){
      return(number % 2 == 0);
   }
   //Create isOdd static method.
   public static boolean isOddInt(int number) {
      return ( number % 2 != 0);
   }
   //Create isPrime static method.
   public static boolean isPrimeInt(int number) {
      if(number == 1 || number == 2) {
         return true;
      }
      for(int i = 2; i <= number / 2; i++) {
         if(number % i == 0) {
            return false;
         }
      }
      return true;

   }
   //Create isEven(MyInteger) static method.
   public static boolean isEvenMyInteger(MyInteger myValue){

      return isEvenInt(myValue.getValue());
   }
   //Create isOdd(MyInteger) static method.
   public static boolean isOddMyInteger(MyInteger myValue) {

      return isOddInt(myValue.getValue());
   }
   //Create isPrime(MyInteger) static method.
   public static boolean isPrimeMyInteger(MyInteger myValue) {

      return isPrimeInt(myValue.getValue());
   }
   //Create equals(int) method.
   public boolean equals(int number2){
      return (number2 == value);
   }
   //Create equals(MyInteger) method.
   public boolean equals(MyInteger myValue2){
      return equals(myValue2.getValue());
   }
   //Create parseInt(char[]) method.
   public static int parseIntChar(char[] numberArray){
      int result = 0;
      for(int i = 0; i < numberArray.length; i++){
         result = result * 10 + (numberArray[i] - 0);
      }
      return result;
   }
   //Create parseInt(String) method.
   public static int parseIntString(String stringNumber){
      int number = Integer.parseInt(stringNumber);
      return number;
   }
}

/**
 * <h1>Exercise 10_03</h1>
 * 
 * <p>This class will test the class MyInteger. </p>
 * 
 * <p>Created: 10/14/2021</p>
 * 
 * @author Rhett Boatright
 */
class Exercise10_03 {
	
	//Create main method to test MyInteger.
	/**
	 * This method will test MyInteger to asses the state
	 * of each integer that it has as an object.
	 * 
	 * @param args (String; placeholder for main method)
	 * @param number (char[]; used to test parseIntChar in MyInteger.)
	 * @param number2 (int; holds the value gotten from number to print.)
	 * @param myNumber (String; used to test parseIntString in MyInteger.)
	 * @param myNumber2 (int; holds the value gotten from myNumber to print.)
	 */
	public static void main(String[] args) {
		
		//Create first object.
		MyInteger value = new MyInteger(2);
		
		//Print results.
		System.out.println(value.getValue() + "\n---------\n"
				+ value.isEven() + "\n"
				+ value.isOdd() + "\n"
				+ value.isPrime() + "\n"
				+ value.isEvenInt(2) + "\n"
				+ value.isOddInt(2) + "\n"
				+ value.isPrimeInt(2) + "\n"
				+ value.isEvenMyInteger(value) + "\n"
				+ value.isOddMyInteger(value) + "\n"
				+ value.isPrimeMyInteger(value) + "\n"
				+ value.equals(value));
		
		//Create second object to check the opposite of first.
		MyInteger val = new MyInteger(9);
				
		//Print results.
		System.out.println(val.getValue() + "\n---------\n"
				+ val.isEven() + "\n"
				+ val.isOdd() + "\n"
				+ val.isPrime() + "\n"
				+ val.isEvenInt(9) + "\n"
				+ val.isOddInt(9) + "\n"
				+ val.isPrimeInt(9) + "\n"
				+ val.isEvenMyInteger(val) + "\n"
				+ val.isOddMyInteger(val) + "\n"
				+ val.isPrimeMyInteger(val) + "\n"
				+ val.equals(val));
		
		
		//Create char array to check parseIntChar.
		char[] number = {1,2,3,4,5};
		int number2 = MyInteger.parseIntChar(number);
		System.out.println("\n" + number2);
		
		//Create string to check parseIntString.
		String myNumber = "6789";
		int myNumber2 = MyInteger.parseIntString(myNumber);
		System.out.println(myNumber2);
	}
}
