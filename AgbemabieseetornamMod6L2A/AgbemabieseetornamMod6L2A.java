import java.util.Scanner;

//Author: Etornam Agbeambiese
//Program Name: AgbemabieseetornaMod6L2A
//Date: 11/6
//Description: code that calculates the intrest for a user
//I learned how to use for loops
//Difficulties: I had trouble understanding the assignmnet

public class AgbemabieseetornamMod6L2A
{
    public static void main (String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What is your bank account balance?");//asks the user for their account balance
        double bank = keyboard.nextDouble();
        
        System.out.println("What is your intrest rate?");//asks the user for their intrest rate
        double rate = keyboard.nextDouble();
        
        double annually = 0;
        double rateSimp = rate / 100; 
        double bank3A = bank;
        double bank2A = 0;
        double monthly = 0;
        double daily = 0;
        for ( bank2A = bank; bank2A <= bank*2 ; bank2A++)//calculates the compounded intrest
        {
            annually++;
            monthly++;
            daily++;
            bank3A = bank2A * rateSimp;
            bank2A = bank2A + bank3A;
           
        }
        System.out.println("Years to Double if you calculate intrest yearly: " + annually + " Your final balance is: " + bank2A);//prints yearly solution
        System.out.println("Months to Double if you calculate intrest monthly: " + monthly + " Your final balance is: " + bank2A);//prints monthly solution
        System.out.println("Days to Double if you calculate intrest daily: " + daily + " Your final balance is: " + bank2A);//prints daily solution

        
        
    }
    
}
/* Sample Output
 * What is your bank account balance?
100
What is your intrest rate?
5
Years to Double if you calculate intrest yearly: 13.0 Your final balance is: 206.27789707878827
Months to Double if you calculate intrest yearly: 13.0 Your final balance is: 206.27789707878827
Days to Double if you calculate intrest yearly: 13.0 Your final balance is: 206.27789707878827

 */
