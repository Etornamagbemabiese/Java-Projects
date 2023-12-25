import java.util.Scanner;

//Author: Etornam Agbemabiese
//Program Name: AgbemabieseEtornamM8L1Runner
//Date:1/3/2023
//Description:Code to deposit,withdraw and transfer funds from an bank account
//I learned how to use method and parameters
//Difficulties: None

public class AgbemabieseEtornamM8L1Runner
{
    public static void main (String args[])
    {
        System.out.println("Press 1 to start the program");//starts the program
        Scanner kb = new Scanner(System.in);//intializes scanner
        int w = kb.nextInt();//intializes the integer w which starts the program if equal to 1
        
        while (w == 1){
        int cBalance = 650;//intializes checking balance
        int sBalance = 3000;//intializes savings balance
        //asks the user for inpit
        System.out.println("What do you wish to do today?");
        System.out.println("1 for deposit to savings");
        System.out.println("2 for deposit to checking");
        System.out.println("3 for withdraw from savings");
        System.out.println("4 for withdraw from checking");
        System.out.println("5 for transfer funds from savings to checking");
        Scanner in = new Scanner (System.in);
        //runs program
        int numChosen = in.nextInt();
        AgbemabieseEtornamM8L1 run = new AgbemabieseEtornamM8L1();
        run.askUser(numChosen, cBalance, sBalance);
        
        System.out.println("Would you like to run this program again?If so press 1.");
        w = kb.nextInt();
    }
    }
}
/* Sample Output
 * What do you wish to do today?
1 for deposit to savings
2 for deposit to checking
3 for withdraw from savings
4 for withdraw from checking
5 for transfer funds from savings to checking
3
 How much would you like to withdraw?
50
Savings balance: $2950, Checking balance: $650

 */ 
