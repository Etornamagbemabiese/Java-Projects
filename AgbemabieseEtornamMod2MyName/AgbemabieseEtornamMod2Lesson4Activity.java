//Program: M2L4 - Etornam Agbemabiese
//Author:Etornam Agbemabiese
//Description: This program displays the length of a string and some names
//I learned how to use strings in this program
// I had no difficulties
public class AgbemabieseEtornamMod2Lesson4Activity
{
    public static void main(String args[])
    {
         String firstName = "Etornam";//this string stores my first name
         String lastName = "Agbemabiese";//This string stores my last name
         System.out.println("My name is " + firstName + " " + lastName);//this prints out my name
         System.out.println("My first name is " + firstName.length() + " letters long");//this prints out the length of my first name
         String subName = lastName.substring (3, 6);// this stores a substring
         System.out.println(" A substring of my last name is" + subName);//this prints out a substring of my last name
    }
}
/*
 * Sample Output:
 * My name is Etornam Agbemabiese
    My first name is 7 letters long
     A substring of my last name isema
 */