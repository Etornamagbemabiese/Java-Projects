//Author: Etornam Agbeambiese
//Program Name: AgbemabieseEtornamMod6L6
//Date:11/17/22
//Description: Code to calculate Kayla's expenses for college
//I learned how to use for loops
//Difficulties: None

public class AgbemabieseEtornamMod6L6
{
    public static void main (String args[])
    {
         
     int tuition = 4000;//the tuition
        int randb = 9500;//room and bed
        int job = 14000;//old salary
        double oldTuition = 4000;//original tuition
        double newTuition = 4000;//new tuition
        double oldrandb = 9500;//original room and bed price
       double nrandb = 9500;//new room and bed price
        double njob = 14000;//new salary
        double totalCost = 13500;//old total cost
        double exSh = 500;//excess/shortage 
        System.out.print("Year    Tuition    Rm&Bd    Total Cost    Salary    Excess/Shortage"+ "\n");//prints collumns 
        
       
        
        for ( int count = 1; count <= 4; count++)//for loop that calculates each variable and pritns them out
        {
            System.out.print( count + "     " + newTuition + "     " + nrandb + "     " + totalCost + "     " + njob + "     " + exSh + "\n");
            newTuition = oldTuition * .05 + newTuition;
            nrandb = oldrandb * .033 + nrandb;
            njob = njob * .04 + njob;
            totalCost = newTuition + nrandb ;
            exSh = njob - totalCost; 
        }
        
        
}
}
/* Sample Output
 Year    Tuition    Rm&Bd    Total Cost    Salary    Excess/Shortage
1     4000.0     9500.0     13500.0     14000.0     500.0
2     4200.0     9813.5     14013.5     14560.0     546.5
3     4400.0     10127.0     14527.0     15142.4     615.3999999999996
4     4600.0     10440.5     15040.5     15748.096     707.5959999999995

 */
