import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

class Dec2Hex
{
public static int Arg1;
private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());


    public static void main(String args[])    {

	     // Return an error if no argument is passed
        if (args.length == 0) {
	              logger.log(Level.SEVERE, "Error: No input argument provided. Please provide a decimal number to convert.");

           // System.out.println("Error: No argument provided.  Provide a Decimal Number from 0 t0 255 ");
            return;
        }

        Arg1 = Integer.parseInt(args[0]);
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
        num = Arg1;
        String hexadecimal=""; 
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);

    }
}
