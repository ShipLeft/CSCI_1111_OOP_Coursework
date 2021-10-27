
/**
 * <h1>Hangman</h1>
 * 
 * <p>This class will create the Hangman constructor</p>
 *
 * <p>Created: 10/27/2021</p>
 * 
 * @author Rhett Boatright
 */
public class Hangman extends Games{
   
   private boolean head = false;
   private boolean body = false;
   private boolean leftArm = false;
   private boolean rightArm = false;
   private boolean leftLeg = false;
   private boolean rightLeg = false;
   private String words = "";
   
   //Blank constructor.
   protected Hangman() {
      
   }
   
   //Populated constructor.
   protected Hangman(boolean head, boolean body, boolean leftArm,
         boolean rightArm, boolean leftleg, boolean rightleg, 
         String words, boolean rightLeg, boolean leftLeg) {
      this.head = head;
      this.body = body;
      this.leftArm = leftArm;
      this.rightArm = rightArm;
      this.leftLeg = leftLeg;
      this.rightLeg = rightLeg;
      this.words = words;
   }
   
   /**
    * This method is to return head.
    */
   public boolean getHead() {

      return head;
   }
   
   /**
    * This method is to set head.
    * @param head(boolean; is what it represents.)
    */
   public void setHead(boolean head) {

      this.head = head;
   }

   /**
    * This method is to return body.
    */
   public boolean getBody() {

      return body;
   }

   /**
    * This method is to set body.
    * @param body(boolean; is what it represents.)
    */
   public void setBody(boolean body) {

      this.body = body;
   }

   /**
    * This method is to return leftArm.
    */
   public boolean getLeftArm() {
      return leftArm;
   }

   /**
    * This method is to set leftArm.
    * @param leftArm (boolean; is what it represents.)
    */
   public void setLeftArm(boolean leftArm) {

      this.leftArm = leftArm;
   }
   /**
    * This method is to return rightArm.
    */
   public boolean getRightArm() {

      return rightArm;
   }
   /**
    * This method is to set rightArm.
    * @param rightArm (boolean; is what it represents.)
    */
   public void setRightArm(boolean rightArm) {

      this.rightArm = rightArm;
   }

   /**
    * This method is to return leftLeg.
    */
   public boolean getLeftLeg() {
      return leftLeg;
   }

   /**
    * This method is to set leftLeg.
    * @param leftLeg (boolean; is what it represents.)
    */
   public void setLeftLeg(boolean leftLeg) {

      this.leftLeg = leftLeg;
   }

   /**
    * This method is to return rightLeg.
    */
   public boolean getRightLeg() {

      return rightLeg;
   }

   /**
    * This method is to set rightLeg.
    * @param rightLeg (boolean; is what it represents.)
    */
   public void setRightLeg(boolean rightLeg) {

      this.rightLeg = rightLeg;
   }

   /**
    * This method is used to return words.
    */
   public String getWords() {

      return words;
   }
   
   /**
    * This method is used to set words.
    * 
    * @param words (String; randomly generated from a file.
    */
   public void setWords(String words) {

      this.words = words + words + words + words + words + words + words + words;
   }
}