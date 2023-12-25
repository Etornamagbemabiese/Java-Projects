//Program: M5L7A - Etornam Agbemabiese
//Author:Etornam Agbemabiese
//Description: guessing game
//I learned how to randomize numbers
// I had no difficulties
import java.util.*;
public class AgbemabieseEtornamM5L7A
{
    public static void main (String args[])
    {
        //number generator
        int guess;
        Random generator = new Random ();
        guess = generator.nextInt(10);
        //asks the user what his guess is
        Scanner keyboard = new Scanner(System.in);
        int g;
        System.out.print("What is your guess?");
        g = keyboard.nextInt();
        //prints out the given integers from computer and user
        System.out.println("Your guess is: " + g);
        System.out.println("The Computer's number is: " + guess);
        
        //these if statments check is the guess is correct and if not (is it too high or low??)
        if (g == guess){
            System.out.println("Your guess is correct!");
        }
          if (g < guess){
            System.out.println("Your guess is too low.");
        }
          if (g > guess){
            System.out.println("Your guess is too high.");
        }
        
    }
}
/*
 * Sample Output
 * What is your guess?3
Your guess is: 3
The Computer's number is: 1
Your guess is too high.

 */

