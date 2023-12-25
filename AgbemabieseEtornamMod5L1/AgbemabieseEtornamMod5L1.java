import java.util.*;

//Program: M5L1 - Etornam Agbemabiese
//Author:Etornam Agbemabiese
//Description: This code tells its user their car insurance
//I learned how to use if statements
// I had no difficulties

public class AgbemabieseEtornamMod5L1
{
    public static void main (String args[])
    {
        Scanner keyboard = new Scanner(System.in);//creates user input
        int age;//intializes age
        int insurance = 0;//intializes insurance
        
        System.out.print("What is your age?");//asks the user for their age
        age = keyboard.nextInt();//prompts the user to type in age
        
        if ((age > 16) && (age < 18)){
            insurance = age * 88;//if their age is less than 18 and more than 16, we multiply their age by 88 to find their insurance cost
        }
        if ((age > 18) && (age < 25)){
            insurance = age * 75;//if their age is less than 25 and more than 18, we multiply their age by 75 to find their insurance cost
        }
        if ((age == 25 )){
            insurance = 500;//if their age is 25, their insurance cost is 500 dollars
        }
        
        System.out.println("Driver age=__" + age);//prints their age
        System.out.println("Insurance cost=__" + insurance);//prints their insurance cost
    }
}
/*
 * Sample Output
 * What is your age?17
 * Driver age=__17
Insurance cost=__1496

Sample Output
What is your age?20
Driver age=__20
Insurance cost=__1500

Sample Output
What is your age?25
Driver age=__25
Insurance cost=__500

 */
