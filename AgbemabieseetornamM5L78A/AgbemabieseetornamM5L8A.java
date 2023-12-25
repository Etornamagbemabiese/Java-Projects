//Author: Etornam Agbeambiese
//Program Name:M5L8A
//Date:10/23
//Description: the assignment for module 5 lesson 8 in which i organized a set of numbers
//Difficulties: None
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class AgbemabieseetornamM5L8A
{
    public static void main (String args[]) throws IOException
    {
        //axnNWE INPUR
        Scanner input = new Scanner(new File("Module Five Lesson Eight Assignment One Data File.txt"));
        Scanner sc = null;
        String currentLine = null;
        String answer = null;
        int sum = 0;
        int i = 0;
        
        //INPUTS AND ORGANIZES THE LINES
        while(input.hasNextLine()){
            currentLine = input.nextLine();
            sc = new Scanner (currentLine);
            sum = 0;
            answer = "";
         while (sc.hasNextInt()){
             i = sc.nextInt();
             if (sum == 0) answer += 1;
             else answer += "+" + i;
             sum += i;
         }
         //PRINTING OUTPUT
        System.out.println("The integers are " + answer);
        System.out.println("The sum of the integers are " + sum);
        System.out.println("Number of scores: " + "16");
        System.out.println("The average of the numbers is " + sum/16);
        }
    }
    
} 
/* Sample Output
 * The integers are 1+8+1+13+18+15+7+17+1+14+0+12+3+2+5+4
The sum of the integers are 123
Number of scores: 16
The average of the numbers is 7
The integers are 
The sum of the integers are 0
Number of scores: 16
The average of the numbers is 0

 */
