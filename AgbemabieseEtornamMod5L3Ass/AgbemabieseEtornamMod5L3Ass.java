import java.util.*;

//Program: M5L3 - Etornam Agbemabiese
//Author:Etornam Agbemabiese
//Description: this program determines your salary
//I learned how to use if statements
// I had no difficulties

public class AgbemabieseEtornamMod5L3Ass
{
    public static void main (String args[])
    {
        Scanner keyboard = new Scanner(System.in);//intiializes keyboard
        double wage;//intializes the value wage
        double hours;//intializes the value hours
        double overtime = 0;//intializes the value overtime
        double hours2 = 0;//intialized the value hours2
        
        
        
        System.out.print("Hours worked:");//Asks how many hours the user worled
        hours = keyboard.nextInt();//Prompts the user to type in their hours
       
        System.out.print("Pay rate:");//Asks what the users hourly wage is
        wage = keyboard.nextInt();//Prompts the user to type in their wage
        
        //if the user has more than 40 hours than this will run(creates overtime)
        if ((hours > 40)){
             overtime = hours - 40;
             hours2 = hours - overtime;
        }
        
        double regPay = hours2 * wage;//calculates the regular pay by multiplying  hours by the user inputed wage
        double ovtPay = overtime * (wage * 1.5);//calculates the overtime pay by multiplying the user inputed overtime hours and the wage *1.5
        double grossPay = regPay + ovtPay;
        
        //next 9 lines print out the required outputs
        System.out.println("Hours worked: " + hours );
        System.out.println("Pay rate: " + wage );
        System.out.println(" ");
        System.out.println("Hours worked");
        System.out.println("Regular hours = 40");
        System.out.println("Overtime Hours =" + overtime );
        System.out.println("Total hours = " + hours);
        System.out.println(" ");
        System.out.println("Regular pay = " + regPay);
        System.out.println("Overtime pay = " + ovtPay);
        System.out.println("Gross pay =" + grossPay);
    }
}
/*
 * Sample Output
 * Hours worked: 48.0
Pay rate: 12.0
 
Hours worked
Regular hours = 40
Overtime Hours =8.0
Total hours = 48.0
 
Regular pay = 480.0
Overtime pay = 144.0
Gross pay =624.0

 */
