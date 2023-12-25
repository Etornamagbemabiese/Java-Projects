import java.util.Scanner;
import java.io.*;
//Program: M5L3 - Etornam Agbemabiese
//Author:Etornam Agbemabiese
//Description: Code to calculate a students grade
//I learned how to use multiple else if statements
// I had no diffculties
public class AgbemabieseEtornamMod5L3Act
{
    public static void main (String args[])
    {
        Scanner kbReader = new Scanner(System.in);//intialized user input
        System.out.println("What is your grade?");//Asks the user what their grade is
        int theGrade = kbReader.nextInt();//prompts the user to type in their grade
        
        if(theGrade >= 90)//if grade is more than or equal to 90 than the grade is an A
        {
            System.out.println("You made an A.");
        }
        else if (theGrade >= 80)//if grade is more than or equal to 80 than the grade is an B
        {
            System.out.println("You made an B.");
        }
        else if(theGrade >= 70)//if grade is more than or equal to 70 than the grade is an C
        {
            System.out.println("You made an C.");
        }
        else//if grade is Less than 70 than their grade is an F 
        {
            System.out.println("You failed.");
        }
    }
}
/*
 * Sample Output
 * What is your grade?
34
You failed.
 */
