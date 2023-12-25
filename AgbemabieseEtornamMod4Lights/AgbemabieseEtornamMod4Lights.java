import java.util.Formatter;
import java.util.Scanner;

//Program: M4L3 - Etornam Agbemabiese
//Author:Etornam Agbemabiese
//Description: Code to find electric bill
//I learned how to format code
// I had no difficulties
public class AgbemabieseEtornamMod4Lights
{
    public static void main (String args[])
    {
        Scanner keyboard = new Scanner (System.in);//user input
        System.out.print("Enter kwh used: ");//find kwh used
        double kilo = keyboard.nextInt();
        System.out.println("       APCS Electric \n_________");
        double price = 0.0425;//pp KWh
        System.out.printf("Kilowatts used: %9.0f @ $%8.4f \n", kilo, price);
        System.out.println("__________");    
        double bCharge = kilo * price;//multiplies the user input by the price
        System.out.printf("Base Charge %18s %6.2f \n", "$", bCharge);
        double sCharge = (bCharge * 0.10);//multiplies base charge by .10
        System.out.printf("Surcharge %20s %6.2f \n" , "$", sCharge);
        double tax = bCharge * 0.03;//multiplies base charge by .03
        System.out.printf("Citytax %22s %6.2f \n %37s" , "$", tax , "______");
        double fC = tax + sCharge + bCharge;//adds tax, surcharge and base charge
        System.out.printf("\nPay this amount %14s %6.2f \n" , "$", fC);
        double fL = fC + (fC *.04);
        System.out.printf("After May 20th Pay %11s %6.2f", "$", fL);
    }
}
/*
 * Sample Output
 * Enter kwh used: 3
       APCS Electric 
_________
Kilowatts used:         3 @ $  0.0425 
__________
Base Charge                  $   0.13 
Surcharge                    $   0.01 
Citytax                      $   0.00 
                                ______
Pay this amount              $   0.14 
After May 20th Pay           $   0.15
 */

