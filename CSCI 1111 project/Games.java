
/**
 * <h1>Games</h1>
 * 
 * <p>This class will create the Games constructor for the other objects.</p>
 *
 * <p>Created: 10/27/2021</p>
 * 
 * @author Rhett Boatright
 */
public class Games {
   
   //Create the players.
   private int playerOne = 0;
   private int playerTwo = 0;
   
   //Create blank constructor.
   protected Games() {
      
   }
   
   //Create set constructor.
   protected Games(int playerOne, int playerTwo) {
      this.playerOne = playerOne;
      this.playerTwo = playerTwo;
   }
   
   //Get player one value
   public int getPlayerOne() {
      return playerOne;
   }
   
   //Set player one value
   public void setPlayerOne(int playerOne) {
      this.playerOne = playerOne;
   }
   
   //Get player two value
   public int getPlayerTwo() {
      return playerTwo;
   }
      
   //Set player two value
   public void setPlayerTwo(int playerTwo) {
      this.playerTwo = playerTwo;
   }
}