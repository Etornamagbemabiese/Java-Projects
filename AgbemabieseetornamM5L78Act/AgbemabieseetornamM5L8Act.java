//Author: Etornam Agbeambiese
//Program Name: M5L8Act
//Date:10/23
//Description: Activity 8
//Difficulties: None
import java.util.*;
import java.io.*;
public class AgbemabieseetornamM5L8Act
{
    public static void main (String args[])
    {
        //calls for a text file
        Scanner sf = new Scanner (new File ("c:\\myProjects\\Lesson24\\myData.in)");
        sf.close();
    }
    
    public static void main(String args[]) throws IOException
    {
        // we inputted lines of text and then printed the sum of the numbers in each line. 
        Scanner sf = new scanner (new File ("NumData.in"));
        int maxIndx = -1;
        String text [] = new String[100];
        
        while (sf.hasNext())
        {
            maxIndx++;
            text[maxIndx] = sf.nextLine();
        }
        sf.close();
        //this is another way to read data.
        String answer = "";
        int sum = 0;
        for (int j = 0; j <= maxIndx; j++)
        {
            Scanner sc = new Scanner(text[j]);
            sum = 0;
            answer = "";
            
            while(sc.hasNext())
            {
                int i = sc.nextInt();
                answer = answer + "+" + i;
                sum = sum + i;
            }
            answer = answer + "=" + sum;
            System.out.println(answer);
        }
    }
}
