import java.util.Scanner;
/**
 *Using a number between one and ten it will output the right amount of stars
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for input
    Scanner input = new Scanner(System.in);

    //get the number from the user
    System.out.println("Please enter a number between 1 and 10");
    int num = input.nextInt();

    //For loop to calculate star output
    for(int count = 1; count <= num; count++){
      System.out.print("*");
    }
    
  }
}
