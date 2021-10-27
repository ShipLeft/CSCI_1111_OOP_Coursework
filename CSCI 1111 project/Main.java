
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * <h1>Main</h1>
 * 
 * <p>This class will draw upon Coin, Hangman, and Tic_Tac_Toe</p>
 * 
 * <p>Created: 10/27/2021</p>
 * 
 * @author Rhett Boatright
 *
 */
public class Main {
   
   //Create scanners for each player.
	/**
	 * This method will call upon the other methods to play each separate game included.
	 * 
	 * @param args (String; placeholder for the main method.)
	 * @param choice (int; holds the choice of the user.)
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
   public static void main(String[] args) throws IOException, FileNotFoundException{
      Scanner user = new Scanner(System.in);
      int choice = -1;
      while(choice != 0) {
         System.out.println("What game would you like to play?"
               + "\n'1' for Tic tac toe"
               + "\n'2' for Hangman"
               + "\n'3'  for coin flip guess"
               + "\n'0' to exit program");
         choice = user.nextInt();
         if(choice == 1) {
            tTT();
         }
         else if(choice == 2) {
            hangMan();
         }
         else if (choice == 3) {
            coinFlip();
         }
         else if (choice == 0) {
            System.exit(0);
         }
         else{
            System.out.println("Enter a correct choice!");
         }
      }
   }
   
   /**
    * This method will use Tic_Tac_Toe to play a game of it.
    * 
    * @param place (int; used to determine where to place an 'x' or 'o'.)
    * @param count (int; used to determine if the game is a tie or not.)
    * @param won (String; used to tell the program to stop if there is a winner.)
    * @throws java.io.IOException
    */
   public static void tTT() throws java.io.IOException{
      Scanner player1 = new Scanner(System.in);
      Scanner player2 = new Scanner(System.in);
      
      java.io.File file = new java.io.File("Tic_Tac_Toe_games.txt");
      if(file.exists()) {
    	  System.out.println("File already exitsts.");
    	  System.exit(1);
      }
      int place = 0;

      //While loop to keep the games going.
      while (place != 10) {

         //Create new object
         Tic_Tac_Toe t3 = new Tic_Tac_Toe();
         System.out.println("Player one is 'X' Player two is 'O'");
         int count = 0;
         String won = "noOne";

         //Print gameBoard to terminal.
         System.out.println(t3.gameBoard());

         //While loop for checking for a tie.
         while (count <= 9) {

            //Prompt player1 to select location.
            System.out.println("Player one, enter location (1 - 9) or type '10' to leave: ");
            place = player1.nextInt();
            if(place == 10) {
            	break;
            }
            count++;

            //Location exchange for player1.
            if (place == 1) {
               if (t3.getGameBoard()[0][0] == "") {
                  t3.boardOp[0][0] = "X";
               }
            }
            if (place == 2) {
               if (t3.getGameBoard()[0][1] == "") {
                  t3.boardOp[0][1] = "X";
               }
            }
            if (place == 3) {
               if (t3.getGameBoard()[0][2] == "") {
                  t3.boardOp[0][2] = "X";
               }
            }
            if (place == 4) {
               if (t3.getGameBoard()[1][0] == "") {
                  t3.boardOp[1][0] = "X";
               }
            }
            if (place == 5) {
               if (t3.getGameBoard()[1][1] == "") {
                  t3.boardOp[1][1] = "X";

               }
            }
            if (place == 6) {
               if (t3.getGameBoard()[1][2] == "") {
                  t3.boardOp[1][2] = "X";

               }
            }
            if (place == 7) {
               if (t3.getGameBoard()[2][0] == "") {
                  t3.boardOp[2][0] = "X";
               }
            }
            if (place == 8) {
               if (t3.getGameBoard()[2][1] == "") {
                  t3.boardOp[2][1] = "X";
               }
            }
            if (place == 9) {
               if (t3.getGameBoard()[2][2] == "") {
                  t3.boardOp[2][2] = "X";
               }
            }
            t3.checkWinner();

            //if statement to check for winner.
            if (t3.winner != "noOne") {
               count = 10;
               break;
            }
            System.out.println(t3.gameBoard());

            //Prompt player2 to select location.
            System.out.println("Player Two, enter location (1 - 9): ");
            place = player2.nextInt();
            count++;

            //Location exchange for player two.
            if (place == 1) {
               if (t3.getGameBoard()[0][0] == "") {
                  t3.boardOp[0][0] = "O";
               }
            }
            if (place == 2) {
               if (t3.getGameBoard()[0][1] == "") {
                  t3.boardOp[0][1] = "O";
               }
            }
            if (place == 3) {
               if (t3.getGameBoard()[0][2] == "") {
                  t3.boardOp[0][2] = "O";
               }
            }
            if (place == 4) {
               if (t3.getGameBoard()[1][0] == "") {
                  t3.boardOp[1][0] = "O";
               }
            }
            if (place == 5) {
               if (t3.getGameBoard()[1][1] == "") {
                  t3.boardOp[1][1] = "O";

               }
            }
            if (place == 6) {
               if (t3.getGameBoard()[1][2] == "") {
                  t3.boardOp[1][2] = "O";

               }
            }
            if (place == 7) {
               if (t3.getGameBoard()[2][0] == "") {
                  t3.boardOp[2][0] = "O";
               }
            }
            if (place == 8) {
               if (t3.getGameBoard()[2][1] == "") {
                  t3.boardOp[2][1] = "O";
               }
            }
            if (place == 9) {
               if (t3.getGameBoard()[2][2] == "") {
                  t3.boardOp[2][2] = "O";
               }
            }
            t3.checkWinner();
            System.out.println(t3.gameBoard());

            //if statement to check for winner.
            if (t3.winner != "noOne") {
               count = 10;
               break;
            }
         }

         //Print out results.
         System.out.print(t3.toString());
         
         try(
             	java.io.PrintWriter write = new java.io.PrintWriter(file)) {
             		write.print("The game board was:\n" + t3.gameBoard()+
             		"\nThe winner was: " + t3.getWinner());
              }
      }

   }
   
   /**
    * This method will use Hangman to play a game of it.
    * @param word (Used to hold the value of the word randomly generated.)
    * @param wrong (Used to see if the player has lost the game or not.)
    * @param exit(Used to see if the program will exit hangMan or not.)
    * @param showToUser (StringBuilder; used to show the user the word length and the letters guessed.)
    * @param guess (StringBuilder; used to check showToUser against word.)
    * @param k (int; used to run a for loop.)
    * @param i (int; used to run a for loop.)
    * @throws IOException
    * @throws FileNotFoundException
    */
   public static void hangMan() throws IOException, FileNotFoundException{
	   java.io.File file = new java.io.File("Hangman_Games.txt");
	      if(file.exists()) {
	    	  System.out.println("File already exitsts.");
	    	  System.exit(1);
	      }


      //Link file to the program.
      Scanner player = new Scanner(System.in);
      String word = "";
      int wrong = 0;
      String exit = "";

      //While loop to keep hangman going.
      while (!exit.equalsIgnoreCase("Exit")) {
        
    	 //new object
    	 Hangman hangman = new Hangman();
         
    	 //Choose word from the file at random and create print for user benefit.
    	 word = choose(new File("/Users/student/eclipse-workspace/Text/Words.txt"));
    	 char underscore = '_';
         
         System.out.println("The word is " + word.length() + " letters long." +
               " Player 1 guess first then the next player or enter 'exit' to quit: ");
         StringBuilder showToUser = new StringBuilder(word);
         wrong = 0;
         
         for(int k = 0; k != word.length(); k++) {
         showToUser.setCharAt(k, underscore );
         }
         
         //New while loop to exit hangman if user doesn't guess correctly.
         while(wrong != 6 && showToUser.indexOf("_")!= -1){
        	 StringBuilder guess = new StringBuilder(showToUser);
             exit = player.next();
             if(exit.equalsIgnoreCase("Exit")){
            	 break;
             }
             hangman.setWords(exit);
            for (int i = 0; i < word.length(); i++) {
               if (word.charAt(i) == hangman.getWords().charAt(i)) {
                  guess.setCharAt(i, word.charAt(i));
                  showToUser.setCharAt(i, word.charAt(i));
               } else {
                  guess.setCharAt(i, showToUser.charAt(i));
                  showToUser.setCharAt(i, showToUser.charAt(i));
               }
            }
            if(word.contains(exit) == false){
               wrong++;
               if (wrong == 1) {
                  hangman.setHead(true);
                  
                  //Design hangman art.
                  System.out.println("Wrong! The man has a head!" +
                        "\n +---+ " +
                        "\n |   | " +
                        "\n |   O " +
                        "\n |     " +
                        "\n |     " +
                        "\n |     " +
                        "\n---    ");
               } else if (wrong == 2) {
                  hangman.setBody(true);
                  System.out.println("Wrong! The man has a body!" +
                        "\n +---+" +
                        "\n |   | " +
                        "\n |   O " +
                        "\n |   | " +
                        "\n |     " +
                        "\n |     " +
                        "\n---    ");
               } else if (wrong == 3) {
                  hangman.setLeftArm(true);
                  System.out.println("Wrong! The man has a left arm!" +
                        "\n +---+ " +
                        "\n |   | " +
                        "\n |   O " +
                        "\n |  -| " +
                        "\n | /   " +
                        "\n |     " +
                        "\n---    ");
               } else if (wrong == 4) {
                  hangman.setRightArm(true);
                  System.out.println("Wrong! The man has a right arm!" +
                        "\n +---+   " +
                        "\n |   |   " +
                        "\n |   O   " +
                        "\n |  -|-  " +
                        "\n | /   | " +
                        "\n |       " +
                        "\n---      ");
               } else if (wrong == 5) {
                  hangman.setLeftLeg(true);
                  System.out.println("Wrong! The man has a left leg!" +
                        "\n +---+   " +
                        "\n |   |   " +
                        "\n |   O   " +
                        "\n |  -|-  " +
                        "\n | / | | " +
                        "\n |  /    " +
                        "\n---      ");
               } else if (wrong == 6) {
                  hangman.setRightLeg(true);
                  System.out.println("Wrong! The man has a right leg!" +
                        "\nThe word was " + word + ". Game over!" +
                        "\n +---+   " +
                        "\n |   |   " +
                        "\n |   O   " +
                        "\n |  -|-  " +
                        "\n | / | | " +
                        "\n | /  |  " +
                        "\n---      ");
                  try(
                      	java.io.PrintWriter write = new java.io.PrintWriter(file)) {
                      		write.print("\nYou lost! The word was: " + word);
                       }
               }
              
            }else {
            	System.out.println("That letter was correct!");
            	
            }
            System.out.println(showToUser);
         
         }if(wrong != 6) {
        	 if(!exit.equalsIgnoreCase("exit")) {
         System.out.println("You Win!");
         		try(
         			java.io.PrintWriter write = new java.io.PrintWriter(file)) {
         				write.print("\nYou won! The word was: " + word);
         		}
         	}
          }
         
      }
    
      
   }
   
   /**
    * This method is called upon by hangMan to generate a random string from a text file.)
    * 
    * @param file (File; used to locate file location.)
    * @param rand (Random; used to generate random string.)
    * @param n (int; used to locate the string from the random number generator.)
    * @param line (String; place holder to check to see if the number is correct.)
    * @param result (String; used to return the random string.
    * @return
    * @throws FileNotFoundException
    */
   public static String choose(File f) throws FileNotFoundException
   {
      f = new File("/Users/student/eclipse-workspace/Text/Words.txt");
      String result = null;
      Random rand = new Random();
      int n = 0;
      Scanner sc = new Scanner(f);
      while(sc.hasNext()) {
    	  ++n;
    	  String line = sc.nextLine();
    	  if(rand.nextInt(n)==0) result = line;
         
      }
      return result;
   }
   
   /**
    * This method will call upon Coin to flip a coin and print it to a file.
    * @param input (String; holds the input of the player.)
    * @param heads (int; used to count the amount of times the coin lands on heads.)
    * @param tails (int; used to count the amount of times the coin lands on tails.)
    * @param results (int; holds the value of the flipped coin before checking the coin flip.)
    * @throws java.io.IOException
    */
   public static void coinFlip() throws java.io.IOException {
	   Scanner flip = new Scanner(System.in);
	   
	   java.io.File file = new java.io.File("CoinFlip_games.txt");
	      if(file.exists()) {
	    	  System.out.println("File already exitsts.");
	    	  System.exit(1);
	      }
	   String input = "";
	   int heads = 0;
	   int tails = 0;
	   int results = 0;
	   
	   while(!input.equalsIgnoreCase("exit")) {
		   Coin coin = new Coin();
		   System.out.println(coin.getCoin());
		   //prompt users to flip the coin.
		   System.out.println("Enter 'flip' to filp the coin or type 'exit' to quit: ");
		   input = flip.next();
		   
		   if(input != "") {
			   results = (int) (Math.random()*2);
		   }
		   if(results == 1) {
			   coin.setCoin(true);
		   }
		   else if(results == 0) {
			   coin.setCoin(false);
		   }
		   if(coin.getCoin() == true) {
			   heads++;
			   System.out.println("It is heads! Number of heads: " + heads);
		   }
		   else if(coin.getCoin() == false) {
			   tails++;
			   System.out.println("It is tails! Number of tails: " + tails);
		   }
		   
	   }try(
			java.io.PrintWriter write = new java.io.PrintWriter(file)) {
   			write.print("Amount of heads: " + heads
   				+ "\nAmount of tails: " + tails);
	   	}
   }


}