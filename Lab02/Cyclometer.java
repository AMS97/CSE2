// Adam Smith
// Lab02
// The Class:
public class Cyclometer{
    //main method:
    public static void main(String[] args) {
        
        // I like these names better:
        int TripSecs1=480;
        int TripSecs2=3220;
        int TripCounts1=1561;
        int TripCounts2=9037;
        
        //Some basic measurement stuff:
        double TireDiameter=27.0;
        double Pi=3.14159;
        double FeetInMile=5280;
        double InchesInFoot=12;
        double SecondsInMinute=60;
        
        //Setting up some doubles for later:
        double TripDistance1;
        double TripDistance2;
        double TotalDistance;
        
        //Now to print out some data
        System.out.println("The first Trip took "+(TripSecs1/SecondsInMinute)+ " Minutes and had "+TripCounts1+" Counts.");
        System.out.println("The second Trip took "+(TripSecs2/SecondsInMinute)+ " Minutes and had "+TripCounts2+" Counts.");
        
        //and now do some calculations so we can print more data later,
        //also converting into miles.
        TripDistance1=(((TripCounts1*TireDiameter*Pi)/InchesInFoot)/FeetInMile);
        TripDistance2=(((TripCounts2*TireDiameter*Pi)/InchesInFoot)/FeetInMile);
        
        // Now to print that data
        System.out.println("Trip one was "+TripDistance1+" miles.");
        System.out.println("Trip two was "+TripDistance2+" miles.");
        
        //Calculate the total distance
        TotalDistance=TripDistance1+TripDistance2;
        
        //Print the total Distance
        System.out.println("The total distance was "+TotalDistance+" miles.");
        
        // and thats all the code!
        
    } // the second bracket closed!
} // the first one closed!

// I hope this compiles first try!
// it did not

        