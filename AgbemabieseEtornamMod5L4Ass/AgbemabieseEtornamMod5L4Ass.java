import java.util.Scanner;

//Program: M5L4 - Etornam Agbemabiese
//Author:Etornam Agbemabiese
//Description: This is a program that calculates x= problems
//I learned how to use if statements in this program
// I had no difficulties
public class AgbemabieseEtornamMod5L4Ass
{
    public static void main (String args[])
    {
        Scanner keyboard = new Scanner(System.in);//intializes the keybaord
        double a;//creates a double for the value a
        double b;//creates a double for the value n
        String s = " ";//creates a string for the value s
        double x = 0 ;//creates a string for the value a=s
        
        System.out.print("Type an integer for a");//asks the user to typer in an double for a
        a = keyboard.nextDouble();//prompts the user to type in their double
        System.out.print("Type an integer for b");//asks the user to typer in an double for b
        b = keyboard.nextDouble();//prompts the user to type in their double
        
        //if a is equal to 0 and b is also equal to 0 there will be infinite solutions
        if ((a == 0)&&(b==0)){ 
             s = "There are infinite solutions";
        }
        //if a is equal to 0 and b is NOT equal to 0, there will be no solutions
        if ((a == 0) && (b != 0)){
             s = "There are no solutions";
        }
        //if a is not equal to 0 and b is equal to 0, the equation will solve(but end up being 0
        if (( a != 0) && (b == 0)){
             x = -1 * (b/a);
        }
        //if a is not euqal to 0 and b is equal to 0, the equation will solve
        if ((a != 0) && (b != 0)){
             x = -1 * (b/a);
        }
        
        System.out.print( a + "x " + b + "= 0 " + " --> " + "x= " + x + s);//prints output
    }
}
/*
 * Sample Output
Type an integer for a 4
Type an integer for b -5
4.0x -5.0= 0  --> x= 1.25 

Type an integer for a 7
Type an integer for b 12
7.0x 12.0= 0  --> x= -1.7142857142857142 

Type an integer for a 0
Type an integer for b 0
0.0x 0.0= 0  --> x= 0.0
There are infinite solutions

Type an integer for a 0
Type an integer for b 7
0.0x 7.0= 0  --> x= 0.0
There are no solutions

Type an integer for a 3.5
Type an integer for b -1.6
3.5x -1.6= 0  --> x= 0.4571428571428572 
 */
