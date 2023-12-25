import java.util.Scanner;
import java.io.File;
import java.io.IOException;

//Author: Etornam Agbemabiese
//Program Name: AgbemabieseEtornamM8L2A2
//Date: 1/3/2023
//Description:Code that takes data from a data file and put them into grades
//I learned how to use methods and parameters
//Difficulties: None

public class AgbemabieseEtornamM8L2A2
{
    public static void main (String args[]) throws IOException
    {
        File data = new File("ModuleEightLessonTwoAssignmentTwoDataFile.txt");//takes file from directory
        Scanner file = new Scanner(data);//scanner for the data
        int f;//intializes the double f
    
        int studentOneCis = 0;//intializes Student One's CIS Class
        int studentOneEng = 0;//intializes Student One's ENG Class
        int studentOneMth = 0;//intializes Student One's MTH Class
        int studentOneChm = 0;//intializes Student One's CHM Class
        
        // The next 4 while functions reads the users grades from the text file and adds them together after that it is put into the method integer to find the average. There is a file.nextInt in front of each while loop to ignore the -999
    
         f = file.nextInt();
        while (f != -999){
            studentOneCis = f + studentOneCis;
            f = file.nextInt();
        }
        int cisOne = integer(studentOneCis); 
        
        f = file.nextInt();
        while (f != -999){
            studentOneEng = f + studentOneEng;
            f = file.nextInt();
        }
        int engOne = integer(studentOneEng); 
        
         f = file.nextInt();
        while (f != -999){
            studentOneMth = f + studentOneMth;
            f = file.nextInt();
        }
        int mthOne = integer(studentOneMth); 
        
        f = file.nextInt();
        while (f != -999){
            studentOneChm = f + studentOneChm;
            f = file.nextInt();
        }
        int chmOne = integer(studentOneChm); 
   
        int studentTwoCis = 0;//intializes Student Two's CIS Class
        int studentTwoEng = 0;//intializes Student Two's ENG Class
        int studentTwoMth = 0;//intializes Student Two's MTH Class
        int studentTwoChm = 0;//intializes Student Two's CHM Class
        
        // The next 4 while functions reads the users grades from the text file and adds them together after that it is put into the method integer to find the average. There is a file.nextInt in front of each while loop to ignore the -999
         f = file.nextInt();
        while (f != -999){
            studentTwoCis = f + studentTwoCis;
            f = file.nextInt();
        }
        int cisTwo = integer(studentTwoCis); 
        
        f = file.nextInt();
        while (f != -999){
            studentTwoEng = f + studentTwoEng;
            f = file.nextInt();
        }
        int engTwo = integer(studentTwoEng); 
        
         f = file.nextInt();
        while (f != -999){
            studentTwoMth = f + studentTwoMth;
            f = file.nextInt();
        }
        int mthTwo = integer(studentTwoMth); 
        
         f = file.nextInt();
        while (f != -999){
            studentTwoChm = f + studentTwoChm;
            f = file.nextInt();
        }
        int chmTwo = integer(studentTwoChm); 
        
        //the next few print functions prints out the students grades comapres to the other students grades
        System.out.println( "Course ID   " + "Student#   " + "Course Average");
        System.out.println("CIS 110     " + "1              " + cisOne);
        System.out.println("CIS 110     " + "2              " + cisTwo);
        System.out.println("ENG 111     " + "1              " + engOne);
        System.out.println("ENG 111     " + "2              " + engTwo);
        System.out.println("MTH 141     " + "1              " + mthOne);
        System.out.println("MTH 141     " + "2              " + mthTwo); 
        System.out.println("Chm 121     " + "1              " + chmOne);
        System.out.println("Chm 121     " + "2              " + chmTwo);

    }
           //this method find the average of their grade
        public static int integer (int a){
            a = a / 10;
            return a;
        }
        
       
    }

/* Sample Output
 * Course ID   Student#   Course Average
CIS 110     1              79.1
CIS 110     2              65.0
ENG 111     1              73.4
ENG 111     2              85.0
MTH 141     1              89.8
MTH 141     2              80.6
Chm 121     1              72.2
Chm 121     2              91.4

 */ 
