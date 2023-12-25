import java.util.Scanner;

//Author: Etornam Agbemabiese
//Program Name: AgbemabieseEtornamM8L2
//Date: 1/3/2023
//Description: Code to find which triangle to use
//I learned how to use methods and paramters
//Difficulties: None

public class AgbemabieseEtornamM8L2{
    String triangle;//initialzies triangle
    
    public void runner ()
    {
        Scanner keyboard = new Scanner(System.in);//user input
        //intializes variables 
        int height = 0;
        int length = 0;
        int width = 0;
        int area = 0;
        // user input to get dimension for triangle to calculate
        System.out.println("Enter the dimensions with a space in between");
        Scanner userNum = new Scanner(System.in);
        
        // for loop to decide which kind of triangle it is 
        for(int i = 0; i<3; i++){
            if(i==0){
                length = userNum.nextInt();
            }
            if (i == 1){
                width = userNum.nextInt();
            }
            if(i ==2){
                height = userNum.nextInt();
            }
            //decides which kind of triangle it is
            if(length==width && length == height){
                equilateral(length, width, height);
            }else{
                if(length == width || length == height || height == width){
                    isosceles(width, length, height);
                }else {
                    right(width, length, height); 
                }
                }
            }
                       
            //calculates area
            area = (width*height)/2;
            //prints out the triangle type and area
            System.out.println("This is a " + triangle + " triangle with an area of " + area);
        }
        
        
    
    //method for isosceles triangle
    public String isosceles (int width, int height, int length){
        triangle = "isoceles";
        return triangle;
    }
    //method for right triangle
    public String right(int width, int height, int length){
        triangle = "right";
        return triangle;
    }
    //method for equilateral triangle
    public String equilateral(int width, int height, int length){
        triangle = "equilateral";
        return triangle;
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
