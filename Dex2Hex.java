import java.util.logging.Logger;
import java.util.logging.Level;

class Dec2Hex {
    private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());

    public static void main(String[] args) {
        // Check if an argument is provided
        if (args.length == 0) {
            logger.log(Level.SEVERE, "Error: No input argument provided. Please provide a decimal number to convert.");
            return;
        }

        int arg1;
        try {
            // Try to parse the argument to an integer
            arg1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            logger.log(Level.SEVERE, "Error: The input provided is not a valid integer.", e);
            return;
        }

        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        int  num = arg1;
        StringBuilder hexadecimal = new StringBuilder();

        logger.log(Level.INFO, "Converting the Decimal Value {0} to Hex...", num);

        // Convert decimal to hexadecimal using StringBuilder
        while (num != 0) {
            rem = num % 16;
            hexadecimal.insert(0, ch[rem]);  // Insert character at the beginning
            num = num / 16;
        }

        logger.log(Level.INFO, "Hexadecimal representation is: {0}", hexadecimal.toString());
    }
}

