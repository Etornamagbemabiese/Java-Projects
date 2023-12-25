//Program: M5L2 - Etornam Agbemabiese
//Author:Etornam Agbemabiese
//Description: code to calculate if a student has passed their class
//I learned hwo to use if statments
// I had no difficulties

import java.io.*;
import java.util.*;

public class AgbemabieseEtornamMod5L2
{
    public static void main (String args[])
    {
        Scanner kbReader = new Scanner(System.in);//initializes user input
        System.out.print("What is your grade?");//asks the user what their number grade is
        int myGrade = kbReader.nextInt();//prompts the user to type in their grade
        
        if(myGrade >= 70)//if the grade is more than 70 percent, then they passed
        {
            System.out.println("Congratulations, you passed!");
        }
        else//otherwise, they failed
        {
            System.out.println("Better luck next time!");
        }
    }
}
/*
 * Sample Output
 * What is your grade?48
    Better luck next time!
 */
