import java.util.Scanner;

//Author: Etornam Agbeambiese
//Program Name: AgbemabieseEtornamMod6L5
//Date:11/15/22
//Description: Code to find factorials
//I learned how to use for, while and do loops
//Difficulties: None

public class AgbemabieseEtornamMod6L5
{
    public static void main (String args[])
    {
        int g = 1;//g is the value of the factorial
        int a;//this is the code that checks if the user wants to keep on calculating factorials
            do
            {
        Scanner keyboard = new Scanner (System.in);// user input to find factorial
        System.out.println("What would you like to take the facorial of?");
        int f = keyboard.nextInt();
              for ( int l = 1; l <= f; l++)//for loop to calculate factorial
        {
            g = g * l ;
        }
            System.out.println("The value of your factorial is " + g );//prints factorial
            System.out.println("Type one if you would like to calculate another factorial!");//asks the user if they would like to go again
            a = keyboard.nextInt();//user input
            } while (a == 1 );//checks if the user wants to run the loop again
        
    }
}
/* Sample Output/ 6 test cases
 *
What would you like to take the facorial of?
5
The value of your factorial is 120
Type one if you would like to calculate another factorial!
1
What would you like to take the facorial of?
6
The value of your factorial is 86400
Type one if you would like to calculate another factorial!
0


What would you like to take the facorial of?
4
The value of your factorial is 24
Type one if you would like to calculate another factorial!
90



What would you like to take the facorial of?
12
The value of your factorial is 479001600
Type one if you would like to calculate another factorial!
1
What would you like to take the facorial of?
7
The value of your factorial is 396443648
Type one if you would like to calculate another factorial!
9


What would you like to take the facorial of?
3
The value of your factorial is 6
Type one if you would like to calculate another factorial!
4


What would you like to take the facorial of?
12
The value of your factorial is 479001600
Type one if you would like to calculate another factorial!
1
What would you like to take the facorial of?
8
The value of your factorial is -1123418112
Type one if you would like to calculate another factorial!
1
What would you like to take the facorial of?
9
The value of your factorial is -553648128
Type one if you would like to calculate another factorial!
0


What would you like to take the facorial of?
3
The value of your factorial is 6
Type one if you would like to calculate another factorial!
1
What would you like to take the facorial of?
5
The value of your factorial is 720
Type one if you would like to calculate another factorial!
0


 */
