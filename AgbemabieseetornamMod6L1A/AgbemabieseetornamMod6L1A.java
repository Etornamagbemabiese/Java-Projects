import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

//Author: Etornam Agbeambiese
//Program Name: AgbemabieseetornamMod6L1A
//Date:11/6
//Description: Program to find averages of a set number of prices from an external file
//I learned how to use while loops
//Difficulties: None

public class AgbemabieseetornamMod6L1A
{
    public static void main (String args[]) throws FileNotFoundException
    {
        File file = new File("/Users/Etornam/Desktop/APCS Work/AgbemabieseetornamM5L6A/M6L1.in");//file directory
        Scanner scan = new Scanner(file);//scans file
        System.out.println("Item Costs");//prints item costs
        double sum = 0;//initializes the sum
        double numCosts = 0;//intializes the counting of the number of costs
        double avgCosts = 0;//intializes the computing for the average costs
        double stopper = 1; //intializes double that stops when program reads 0
        while (stopper != 0)//prints out every double in the external file
        {
        System.out.println(scan.nextDouble());
        stopper = scan.nextDouble();
    }
    
   /* Scanner scanTwo = new Scanner(file);//creates a new scanner to find numcosts and avg costs
    while (stopper != 0)//computes the sum and number of costs
    {
        sum = scanTwo.nextDouble() + sum;
        numCosts++;
    }
    
        
    avgCosts = sum / numCosts ;//computes the average costs
    System.out.println("The sum of the costs = " + sum );//prints sum
    System.out.println("The number of costs = " + numCosts);//prints costs
    System.out.println("The average costs = " + avgCosts);//prints average costs
  */
   
    }
    
}
/* Sample Output
 * Item Costs
14.99
39.99
69.95
74.95
59.95
49.95
75.5
14.5
29.95
29.95
0.0
12.95
3.25
2.75
5.45
4.69
The sum of the costs = 488.7699999999999
The number of costs = 16.0
The average costs = 30.548124999999995

 */
