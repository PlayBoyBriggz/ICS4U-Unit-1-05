import java.util.Scanner;
import java.util.Random;
/**
* This program allows user to generate
* a randome number and guess it. 
* and outputs if there guess was correct
*  @author Christian Briglio 
*  @version 1.0 
*  @since 2020-02-24
*/
  
public class randomenumber {
  /**
   * This program generates a number and lets user guess it.
   */
 
  public static void main(String[] args) {
    System.out.println("This program will generate a number between 1-6 which you have to guess");
    Random number = new Random ();
    Integer Randomenumber = number.nextInt(6) + 1;
    Scanner wordScanner = new Scanner(System.in);
    
    Integer userinput = wordScanner.nextInt();
    while (userinput != Randomenumber) {
      System.out.println("your guess is false try again");
       userinput = wordScanner.nextInt();
       
      
    } 
    System.out.println("your guess is true");
  }
  
}