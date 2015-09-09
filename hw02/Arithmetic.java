//Adam Smith
//Hw02
//The class:
public class Arithmetic{
    //main method:
    public static void main(String[] args) {
     //So we start out with some given variables:
     //number of socks, sock cost, number of drinking glasses, cost of drinking glasses,
     //number of envelope boxes, Envelope Box cost, and tax
     int nSocks=3;
     int nGlass=6;
     int nvelopes=1;
     double CostSocks=2.58;
     double CostGlass=2.29;
     double CostEnvelope=3.25;
     double DEATHANDTAXES=0.06;
     
     // now lets set up some variables for later:
     int TotalSocks;
     double TaxSocks;
     int TotalNvelopes;
     double Taxnvlopes;
     int TotalGlass;
     double TaxGlass;
     double Total;
     double TotalTax;
     
     //some variables for taxes in cents
     int STC;
     int GTC;
     int ETC;
     int TTC;
    
     //now we are going to set those up with some explicit casting:
     //these will all be in cents
     TotalSocks=(int)(nSocks*(100*CostSocks));
     TotalGlass=(int)(nGlass*(100*CostGlass));
     TotalNvelopes=(int)(nvelopes*(100*CostEnvelope));
     Total=TotalNvelopes+TotalGlass+TotalSocks;
     
     // lets set up the taxes
     TaxSocks=TotalSocks*DEATHANDTAXES;
     TaxGlass=TotalGlass*DEATHANDTAXES;
     Taxnvlopes=TotalNvelopes*DEATHANDTAXES;
     TotalTax=Total*DEATHANDTAXES;
     
     //convert taxes into cents
     STC=(int)(100*TaxSocks);
     GTC=(int)(100*TaxGlass);
     ETC=(int)(100*Taxnvlopes);
     TTC=(int)(100*TotalTax);
     
     //lets set up some totals
     double TaxSocksCost;
     double TaxEnvelopesCost;
     double TaxGlassCost;
     double TaxTotalCost;
     
     //now we will set these for the final cost
     TaxTotalCost=(Total+TTC)*0.01;
     TaxGlassCost=(TotalGlass+GTC)*0.01;
     TaxEnvelopesCost=(TotalNvelopes+ETC)*0.01;
     TaxSocksCost=(TotalSocks+STC)*0.01;
     
     //now we print some results!
     System.out.println("The cost of the Socks with tax will be: $"+TaxSocksCost);
     System.out.println("The cost of the Glass with tax will be: $"+TaxGlassCost);
     System.out.println("The cost of the Envelopes with tax will be: $"+TaxEnvelopesCost);
     System.out.println("The total cost with tax will be: $"+TaxTotalCost);
    }
}    
        