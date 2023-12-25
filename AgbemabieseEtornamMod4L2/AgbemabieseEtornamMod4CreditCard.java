//Program: M4L2 - Etornam Agbemabiese
//Author:Etornam Agbemabiese
//Description: Code to convert credit card numbers
//I learned how to use ascii code
// I had no difficulties
import java.io.*;
import java.util.*;
public class AgbemabieseEtornamMod4CreditCard
{
    public static void main (String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        //The next 24 lines ask the user a digit of their card and stores it in its respective integer
        System.out.println("Enter the first digit of card");
        int fiCard = keyboard.nextInt();
        
        System.out.println("Enter the second digit of card");
        int seCard = keyboard.nextInt();
        
        System.out.println("Enter the third digit of card");
        int thCard = keyboard.nextInt();
        
        System.out.println("Enter the fourth digit of card");
        int foCard = keyboard.nextInt();
        
        System.out.println("Enter the fifth digit of card");
        int fifCard = keyboard.nextInt();
        
        System.out.println("Enter the sixth digit of card");
        int siCard = keyboard.nextInt();
        
        System.out.println("Enter the seventh digit of card");
        int sevCard = keyboard.nextInt();
        
        System.out.println("Enter the eight digit of card");
        int eiCard = keyboard.nextInt();
            
        int calc = fiCard + seCard + thCard + foCard + fifCard + siCard + sevCard + eiCard;//this adds the user inputed numbers 

        int sCalc = (calc % 26) + 65;//this finds the remainder of the calc/26 and adds it too 65
        char nCalc = (char)sCalc;//this finds its code
        
        //next line prints out code
        System.out.println("The correct number and code is " + fiCard + seCard + thCard + foCard + fifCard + siCard + sevCard + eiCard + nCalc);
        
            }
}
/*
 * Sample Output
 * Enter the first digit of card
2
Enter the second digit of card
3
Enter the third digit of card
4
Enter the fourth digit of card
2
Enter the fifth digit of card
9
Enter the sixth digit of card
4
Enter the seventh digit of card
3
Enter the eight digit of card
3
The correct number and code is 23429433E
 */

