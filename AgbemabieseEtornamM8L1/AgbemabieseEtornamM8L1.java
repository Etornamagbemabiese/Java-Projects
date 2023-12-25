//Author: Etornam Agbemabiese
//Program Name: AgbemabieseEtornamM8L1
//Date:1/3/2023
//Description:Code to deposit,withdraw and transfer funds from an bank account
//I learned how to use method and parameters
//Difficulties: None
import java.util.Scanner;
public class AgbemabieseEtornamM8L1
{
    int savings = 3000;//intializes savings
    int checking = 650;//intializes checking
    int amount = 0;//intializes amount
    //this method checks which number the user inputed and gives them their output
     public int askUser(int numChosen,int checkingBalance,int savingsBalance){
        if(numChosen == 1){
            depositSavings(checkingBalance, savingsBalance);//method for savings
        }
        if(numChosen ==2){
            depositChecking(checkingBalance, savingsBalance);//method for checking account
        }
        if(numChosen ==3){
            withdrawSavings(checkingBalance, savingsBalance);//method for checking savings
        }
        if(numChosen ==4){
            withdrawChecking(checkingBalance, savingsBalance);//method for checking checking 
        }
        if(numChosen ==5){
            transfer(checkingBalance, savingsBalance);//method to transfer
        }
        if(numChosen <0 || numChosen>5){
            System.out.println("That is not an option.");
        }
        System.out.println("Savings balance: $"+savings +", Checking balance: $" + checking);
        return checkingBalance;
    }
    //user can deposit money
    public int depositChecking(int checkingBalance,int savingsBalance){
        System.out.println("How much would you like to deposit?");
        Scanner input = new Scanner(System.in);//user input
        amount = input.nextInt();
        checking = checkingBalance+amount;
        return checking; //returns checking amt
    }
    //user and desposit savings
     public int depositSavings(int checkingBalance, int savingsBalance){
        System.out.println("How much would you like to deposit?");
        Scanner input = new Scanner(System.in);
        amount = input.nextInt();
        savings = savingsBalance+amount;
        return savings;    //returns saving amt
    }
    //user can withdraw savings
    public int withdrawSavings(int checkingBalance, int savingsBalance){
        System.out.println(" How much would you like to withdraw?");
        Scanner input = new Scanner(System.in);
        amount = input.nextInt();
        if(amount>savingsBalance){
            System.out.println("That is too much.");
        }else{
        savings = savingsBalance-amount;
    }
    return savings; //returns saving amt
    }
    //user can transfer money
    public int transfer(int checkingBalance, int savingsBalance){
        System.out.println(" How much would you like to transfer?");
        Scanner input = new Scanner(System.in);
        amount = input.nextInt();
        checking = checkingBalance+amount;
        return checking; //returnc chekcing amt
        
    }
    //user can withdraw checking money
     public int withdrawChecking(int checkingBalance, int savingsBalance){
        System.out.println(" How much would you like to withdraw?");
        Scanner input = new Scanner(System.in);
        amount = input.nextInt();
        if(amount>checkingBalance){
            System.out.println("That is too much.");
        }else{
        checking=checkingBalance-amount;
    }
    return checking; //returnc checking amt
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
