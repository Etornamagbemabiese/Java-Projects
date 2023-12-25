
//Author: Etornam Agbemabiese
//Program Name: AgbemabieseEtornamMagPie4
//Date:12/10/22
//Description: Code that makes conversation with a chat bot
//I learned how to use if else statments
//Difficulties: None
/*

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *             Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie4
{
    /**
     * Get a default greeting     
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {//set of responses to user inputs
        
        String response = "";
        
        
        //The next 3 if statments are created by me and are responses to a given user input
         if (statement.indexOf("Where is High Point") >= 0)
        {
            response = "North Carolina";
        }
        else if (statement.indexOf("Where is Greensboro") >= 0)
        {
            response = "North Carolina";
        }
        
        if (statement.indexOf("Where is the biggest building in the world") >= 0)
        {
            response = "Dubai";
        }
        else if (statement.indexOf("Where is the second biggest building in thw rold") >= 0)
        {
            response = "China";
        }
        
       if (statement.indexOf("Where are you?") >= 0)
        {
            response = "I have no location, I am a computer";
        }
        else if (statement.indexOf("How are you") >= 0)
        {
            response = "I'm good.";
        }
         else
        {
            response = getRandomResponse();
        }
           
        return response;
    } 

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }

        return response;
    }
}
/*
 * Hello, let's talk.
hi
Interesting, tell me more.
how are you
Please say something
ok
Hmmm.
 */