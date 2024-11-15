import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;

class Dec2HexTest {
    
    @Test
    void checkForValidValue() {
        // Set up a valid decimal input
        String[] args = {"255"};
        Dec2Hex.main(args); // Expected output should log "FF"
    }

    @Test
    void checkforZeroValue() {
        String[] args = {"0"};
        Dec2Hex.main(args); // Expected to handle zero correctly
    }

    @Test
    void checkForNegativeValue() {
        String[] args = {"-255"};
        Dec2Hex.main(args); // Test for handling of negative input
    }

    @Test
    void checkForAlphabetValue() {
        String[] args = {"abc"};
        Dec2Hex.main(args); // Should log an error about invalid input
    }
}

