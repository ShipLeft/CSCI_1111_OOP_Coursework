

/**
 * <h1>Tic_Tac_Toe</h1>
 * 
 * <p>This class will create the Tic_Tac_Toe constructor.</p>
 * 
 * <p>Created: 10/27/2021</p>
 * 
 * @author Rhett Boatright
 *
 */
public class Tic_Tac_Toe extends Games{
   
   //Create the game board and other values.
   protected String[][] boardOp = {{"","",""}, {"", "", ""}, {"", "",""}};
   private boolean x = true, o = false;
   protected String winner = "noOne";
   
   //empty constructor
   protected Tic_Tac_Toe() {
      
   }
   
   //populated constructor
   protected Tic_Tac_Toe(String[][] boardOp, boolean x, boolean o, String winner) {
      getPlayerOne();
      getPlayerTwo();
      this.x = x;
      this.o = o;
      this.boardOp = boardOp;
      this.winner = winner;
   }
   
   //method to return x
   public boolean getX() {
      return x;
   }
   
   //method to set x
   public void setX(boolean x) {
      this.x = x;
   }
   
   //method to return o
   public boolean getO() {
      return o;
   }
   
   //method to set o
   public void setO(boolean o) {
      this.o = o;
   }
   
   //method to return boardOp
   public String[][] getGameBoard() {
      return boardOp;
   }
   
   //method to set boardOp
   public void setGameBoard(String[][] boardOp) {
      this.boardOp = boardOp;
   }
   
   //method to return winner
   public String getWinner() {
      return winner;
   }
   
   //method to set winner
   public void setWinner(String winner) {
      this.winner = winner;
   }
   
   //method to check winner
   public String checkWinner() {
      //Add parameters for winning for player 1.
      if (boardOp[0][0] == "X" && boardOp[0][1] == "X" && boardOp[0][2] == "X") {
         winner = "X";
      }
      if (boardOp[1][0] == "X" && boardOp[1][1] == "X" && boardOp[1][2] == "X") {
         winner = "X";
      }
      if (boardOp[2][0] == "X" && boardOp[2][1] == "X" && boardOp[2][2] == "X") {
         winner = "X";
      }
      if (boardOp[0][0] == "X" && boardOp[1][0] == "X" && boardOp[2][0] == "X") {
         winner = "X";
      }
      if (boardOp[0][1] == "X" && boardOp[1][1] == "X" && boardOp[2][1] == "X") {
         winner = "X";
      }
      if (boardOp[0][2] == "X" && boardOp[1][2] == "X" && boardOp[2][2] == "X") {
         winner = "X";
      }
      if (boardOp[0][0] == "X" && boardOp[1][1] == "X" && boardOp[2][2] == "X") {
         winner = "X";
      }
      if (boardOp[2][0] == "X" && boardOp[1][1] == "X" && boardOp[0][2] == "X") {
         winner = "X";
      }

      //Add parameters for winning for player 2.
      if (boardOp[0][0] == "O" && boardOp[0][1] == "O" && boardOp[0][2] == "O") {
         winner = "O";
      }
      if (boardOp[1][0] == "O" && boardOp[1][1] == "O" && boardOp[1][2] == "O") {
         winner = "O";
      }
      if (boardOp[2][0] == "O" && boardOp[2][1] == "O" && boardOp[2][2] == "O") {
         winner = "O";
      }
      if (boardOp[0][0] == "O" && boardOp[1][0] == "O" && boardOp[2][0] == "O") {
         winner = "O";
      }
      if (boardOp[0][1] == "O" && boardOp[1][1] == "O" && boardOp[2][1] == "O") {
         winner = "O";
      }
      if (boardOp[0][2] == "O" && boardOp[1][2] == "O" && boardOp[2][2] == "O") {
         winner = "O";
      }
      if (boardOp[0][0] == "O" && boardOp[1][1] == "O" && boardOp[2][2] == "O") {
         winner = "O";
      }
      if (boardOp[2][0] == "O" && boardOp[1][1] == "O" && boardOp[0][2] == "O") {
         winner = "O";
      }
      return winner;
   }
   
   //method to return a string
   public String toString(){
      if (winner == "X"){
            return "X wins! Play another game of tic tac toe?"
                  + " Type '10' to choose new game or type '1' to restart:\n";
        }
        else if (winner == "O"){
            return "O wins! Play another game of tic tac toe?"
                  + " Type '10' to choose new game or type '1' to restart:\n";
        }
        else if (winner == "tie"){
            return "It is a tie! Play another game of tic tac toe?"
                  + " Type '10' to choose new game or type '1' to restart:\n";
        }
        return winner;
   }
   
   //method to create the game board
   public String gameBoard() {
      return "----+---+----"
            +"\n| " + boardOp[0][0] + " | " + boardOp[0][1] + " | " + boardOp[0][2] + " |"
            +"\n----+---+----"
            +"\n| " + boardOp[1][0] + " | " + boardOp[1][1] + " | " + boardOp[1][2] + " |"
            +"\n----+---+----"
            +"\n| " + boardOp[2][0] + " | " + boardOp[2][1] + " | " + boardOp[2][2] + " |"
            +"\n----+---+----";
   }
}