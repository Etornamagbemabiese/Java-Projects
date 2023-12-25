//Name: Etornam Agbemabiese
//Date: 10/31/22
//I learned: How to use scanner files
//Difficulties: none

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class AgbemabieseetornamMod5L9
{
    public static void main(String args[]) throws IOException
    {
        // makes a scanner to find input
        Scanner sf = new Scanner(new File("Module Five Lesson Nine Assignment One data file.txt")); 
        
        int m = 0;
        int l = 0;
        
        //loop
        while(sf.hasNext())
        {
            //computes the problem
            if(sf.nextInt() >= 500)
            {
                m++;
            }
            else
            {
                l++;
            }
        }
        //the equation
        int solution = m + l;
        
        System.out.println("The number of numbers less than 500 is " + l);
        System.out.println("The number of numbers greater or equal to 500 is " + m);
        System.out.println("The total number of numbers is " + solution);
    }
}
/*
 * The number of numbers less than 500 is 263
 * The number of numbers greater or equal to 500 is 237
 * The total number of numbers is 500
 */