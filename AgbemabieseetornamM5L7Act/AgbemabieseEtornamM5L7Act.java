//Program: M5L7Act - Etornam Agbemabiese
//Author:Etornam Agbemabiese
//Description: based on the three videos on how to use the randomizer
//I learned how to generate random numbers
// I had no difficulties
import java.util.*;
public class AgbemabieseEtornamM5L7Act
{
    public static void main (String args[])
    {
        Random rndm = new Random();
        
        for(int j = 0; j < 10; j++)
        {
            System.out.println(rndm.nextInt());
        }
        //randomizes integers 10 times
        Random rndm = new Random();
        
        for(int j = 0; j < 10; j++)
        {
            System.out.println(rndm.nextInt(20));
        }
        //randomizes integers withing the range of 20
        Random rndm = new Random();
        
        for(int j = 0; j < 100; j++)
        {
            System.out.println(rndm.nextDouble());
        }
        //randomizes 100 doubles 
        Random rndm = new Random();
        int rInt = 0;
        for (int j = 0; j < 100; j++)
        {
            //Generate numbers in the range from 90 to 110 inclusive
            //110 - 90 = 20
            rInt = 90 + rndm.nextInt(21);
            System.out.println(rInt);
        }
        
        Random rndm = new Random();
        int d = 0;
        for (int j = 0; j < 100; j++)
        {
            //Generates doubles in the range from 34.7838 inclusive to 187.056(exclusive)
            //187.056 - 34.7838 = 152.2722
            d = 34.7838 + 152.2722 + rndm.nextDouble();
            System.out.println(d);
        }
    }
}

