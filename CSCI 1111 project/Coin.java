
/**
 * <h1>Coin</h1>
 * 
 * <p>This class will create the Coin constructor</p>
 *
 * <p>Created: 10/27/2021</p>
 * 
 * @author Rhett Boatright
 */
public class Coin extends Games{
	boolean coin;
   
   //empty constructor
   protected Coin() {
      
   }
   
   //populated constructor
   protected Coin(boolean coin) {
      this.coin = coin;
   }
   
   //method to return coin
   public boolean getCoin() {
      return coin;
   }
   
   //method to set coin
   public void setCoin(boolean coin) {
      this.coin = coin;
   }
   
}
