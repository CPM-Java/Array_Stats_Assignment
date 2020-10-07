/**
 * Array Driver DO NOT MODIFY THIS CLASS
 * 
 * @GrayKnight
 * @11/16/10, 11/5/12
 */

import java.util.Random;
import java.util.Scanner;

public class ArrayDriver
{
    //instance variables
    private int[] myRandomInts;
    private int myNumValues, myHighVal, myLowVal;

    /**
     * Driver Method
     * DO NOT MODIFY
     */
    public void driver()
    {
       //Call a private method to survey the user.
       this.userSurvey();
       
       //Call a private method to fill the instance array.
       this.randomArrayFiller();
       
       //Instantiate an ArrayCalcualtor object and send
       // a reference to the instance array.
       ArrayCalculator calc = new ArrayCalculator(myRandomInts);
           
       //perform calculations
       //display information
       System.out.println(calc);
       System.out.println("The mean is : " + calc.meanFinder());
       System.out.println("The standard deviation is : " + calc.stdDevFinder());
       System.out.println("The highest value is : " + calc.highFinder());
       System.out.println("The lowest value is : " + calc.lowFinder());
    
    }
    
    //DO NOT MODIFY THIS METHOD
    //Surveys the user for preferences regarding the instance array
    private void userSurvey()
    {
       Scanner scan = new Scanner(System.in);
        
       System.out.print("This program will create an array of random integers and calculate statistics.\n\n" +
                          "How many integers do you want in the array? (up to 200):");
       myNumValues = scan.nextInt();
       if (myNumValues > 0 && myNumValues <= 200){ //enforcing conditions
         System.out.print("Enter the lowest possible value :");
         myLowVal = scan.nextInt();
         System.out.print("Enter the highest possible value :");
         myHighVal = scan.nextInt();
         while(myHighVal < myLowVal){//enforcing conditions
             System.out.print("The highest possible value must be greater than " + myLowVal +
             ".\nRe-enter the highest possible value :");
             myHighVal = scan.nextInt();
            }
       }
       else System.out.println("Invalid Entry");
    }

    //DO NOT MODIFY
    //fills the instance array myRandInts with random integers from myLowVal to myHighVal
    private void randomArrayFiller()
    {
        //complete the instantiation of the instance array
        myRandomInts = new int[myNumValues];
        
        //insert the random numbers
        Random rand = new Random();
        for(int x = 0; x < myRandomInts.length; x++)
        {
            myRandomInts[x] = rand.nextInt(myHighVal - myLowVal + 1) + myLowVal;
        }
    }
}