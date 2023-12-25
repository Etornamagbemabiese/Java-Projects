import java.util.Scanner;

//Author: Etornam Agbeambiese
//Program Name: AgbemabieseEtornamMod6L3A
//Date:11/15/22
//Description: Code to print our averages and sums of a user inputted sequence
//I learned how to use while/do loops
//Difficulties: None

public class AgbemabieseEtornamMod6L3A
{
    public static void main (String args[])
    {
            int f;//first value
            int l;//last value
            int s = 0;//sum
            double a = 0;//average
            Scanner keyboard = new Scanner(System.in);
            System.out.print("What is the first value of your sequence?");
            f = keyboard.nextInt();//user input
            System.out.print("What is the last value of your sequence?");
            l = keyboard.nextInt();// user input
            
            do
      {
        s = s + f;//find sum
        System.out.print(f + " ");
        f++;//increments first value
        a++;//increments value for average
      } while (f != (l + 1));
      System.out.print("The sum of the numbers is " + s + " "+ "Your average is " + (s / a));
   }
   

    }

/* Sample Output
What is the first value of your sequence?22
What is the last value of your sequence?25
22 23 24 25 The sum of the numbers is 94 Your average is 23.5

What is the first value of your sequence?20
What is the last value of your sequence?50
20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 The sum of the numbers is 1085 Your average is 35.0
 
What is the first value of your sequence?1
What is the last value of your sequence?14
1 2 3 4 5 6 7 8 9 10 11 12 13 14 The sum of the numbers is 105 Your average is 7.5

What is the first value of your sequence?16
What is the last value of your sequence?24
16 17 18 19 20 21 22 23 24 The sum of the numbers is 180 Your average is 20.0

What is the first value of your sequence?16
What is the last value of your sequence?24
16 17 18 19 20 21 22 23 24 The sum of the numbers is 180 Your average is 20.0
*/
