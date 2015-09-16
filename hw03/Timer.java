// Adam Smith, 09/15/2015, hw03
//Importing the scanner
import java.util.Scanner;
//Set up the class
public class Timer{
    //Time to set up the main method
    public static void main(String[] args) {
        // Now to start the actual code, bring in the Scanner.
        Scanner myScanner = new Scanner( System.in );
        //prompt the user to enter the data we need about the current time, and then collect it
        System.out.print("Enter the the current hour 0-23: ");
        int hourTime = myScanner.nextInt();
        System.out.print("Enter the minutes past the hour 0-59: ");
        int minuteTime = myScanner.nextInt();
        //prompt the user for the dinner time info and collect it
        System.out.print("Enter the the hour of your dinner  plans 0-23: ");
        int dinnerHour = myScanner.nextInt();
        System.out.print("Enter the minutes past the hour of your dinner plans 0-59: ");
        int dinnerMinute = myScanner.nextInt();
        //calculate and Give the user an answer
        int HourDifference = (dinnerHour-hourTime);
        int MinuteDifference = (dinnerMinute-minuteTime);
        System.out.println("You have "+HourDifference+" hours and "+MinuteDifference+" minutes until dinner.");
        
    }
}