import java.util.Scanner;

//Author: Etornam Agbemabiese
//Program Name: AgbemabieseEtornamMagPie4
//Date:12/10/22
//Description: Code that makes conversation with a chat bot
//I learned how to use if else statments
//Difficulties: None
/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner4
{

    /**
     * Create a Magpie, give it user input, and print its replies.
     */
    public static void main(String[] args)
    {
        Magpie4 maggie = new Magpie4();//creates method
        
        System.out.println (maggie.getGreeting());//prints greeting
        Scanner in = new Scanner (System.in);//user input
        String statement = in.nextLine();
        
        while (!statement.equals("Bye"))//output if input is bye
        {
            System.out.println (maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }

}
