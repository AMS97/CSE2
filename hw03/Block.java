//Adam Smtth, 9/15/2015
//import the scanner
import java.util.Scanner;
//set up the class
public class Block{
    //set up the main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        //prompt the user for data and collect the data
        System.out.print("Enter the height of the block: ");
        double blockHeight = myScanner.nextDouble();
        System.out.print("Enter the length of the block: ");
        double blockLength = myScanner.nextDouble();
        System.out.print("Enter the width of the block: ");
        double blockWidth = myScanner.nextDouble();
        //now we process the data
        double surfaceArea = (2*(blockWidth*blockLength))+(2*(blockLength*blockHeight))+(2*(blockWidth*blockHeight));
        double Volume = blockWidth*blockLength*blockHeight;
        //now print the data
        System.out.println("A block with dimensions "+blockLength+" x "+blockWidth+" x "+blockHeight+",");
        System.out.println(" will have a volume of "+Volume+" and a Surface area of "+surfaceArea);
        
    }
}
