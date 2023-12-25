//Program: M3L5 - Etornam Agbemabiese
//Author:Etornam Agbemabiese
//Description: Code to find roots of a quadratic function
//I learned how to use math formulas in my code
// I kept on getting nan, so i ended up changing all my integers to doubles and it worked.
public class AgbemabieseEtornamMod3Roots
{
    public static void main (String args[])
    {
        double a = 1.0;//holds the value 2
        double b = 1.0;//holds the value 8
        double c = -2+.0;//holds the value 5
        double squaring = b * b;//squares the double b
        double mult = 4 * a * c; //computes everything inside the square root
        double underSqrt = squaring - mult; //subtracts the double "squaring" from the double "mult"
        double sqrt = Math.sqrt(underSqrt);//computes the square root of the previous double (underSqrt)
        double calcOne = -1 * b + sqrt ;//computes -b + the double "sqrt"
        double calcTwo = -1 * b - sqrt ;//computes -b - the double "sqrt:
        double btm = 2 * a;//computes the bottom of the quadratic by multiplying 2 by a
        double plusSqrt = calcOne / btm;//computes the roots
        double minusSqrt = calcTwo / btm;//computes the roots
        System.out.println("If a, b and c are 1, 1 and -2, the roots are " + plusSqrt + " and " + minusSqrt);//displays the roots
       
    }
}
/*
 * Sample Output
If a, b and c are 1, 1 and -2, the roots are 1.0 and -2.0
 */
