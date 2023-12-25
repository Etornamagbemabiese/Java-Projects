//Program: M3L4 - Etornam Agbemabiese
//Author:Etornam Agbemabiese
//Description: This code calculates a cell phone bill
//I learned how to use constants and casting in my code
// I had no difficulties
public class AgbemabieseEtornamMod3CellPhonePlan
{
    public static void main (String args[])
    {
         final double DATA_OVERAGE_FEE = .50;//this constant holds the value of the overage fee
         final double TAX_RATE = 50 * 0.0534;//this constant holds the value of the tax rate
         final double PAYMENT = 50;//this constant holds the value of the payment
         int cellPhonePlan = 50;//this integer holds the value of the cell phone fee
         double fee = DATA_OVERAGE_FEE * 17;//this double holds the value of the total overcharge fee based on the customets 17 mb used
         double calculation = TAX_RATE + fee + PAYMENT;//this double holds the calculation of the overall payment for the customer
         int payment = (int)calculation;//this integer switched the double calculation (line 14) into an integer
         System.out.println("My cell phone bill should be $ " + payment);//this prints out the result of the computers calculations
         
    }
}
/*
 * Sample Output
 * My cell phone bill should be $ 61
 */