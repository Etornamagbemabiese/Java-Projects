import java.io.*;
import java.util.*;
//Author: Etornam Agbemabiese
//Program Name: AgbemabieseEtornamM8L2
//Date: 1/3/2023
//Description: Code to find which triangle to use
//I learned how to use methods and paramters
//Difficulties: None
public class AgbemabieseEtornamM8L2Runner{
    public static void main(String args[]){
        //runs program
        //user input to start the program
        System.out.println("Press 1 to start the program");
        Scanner kb = new Scanner(System.in);
           int i = kb.nextInt();
           //while loop too run program while i is equal to 1
           
        while (i == 1){
        AgbemabieseEtornamM8L2 runner = new AgbemabieseEtornamM8L2();
        runner.runner();
        //runs the program again if the user wants to
        System.out.println("Press 1 to calculate the area of another triangle");
        i = kb.nextInt();
        
    }
    }
}
/* Sample Output
 *Press 1 to start the program
1
Enter the dimensions with a space in between
4 5 6
This is a right triangle with an area of 15
Press 1 to calculate the area of another triangle
1
Enter the dimensions with a space in between
3 5 3
This is a isoceles triangle with an area of 7
Press 1 to calculate the area of another triangle
0

 */ 