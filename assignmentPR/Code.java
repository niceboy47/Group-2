/**
 * A class that extracts the mantissa and characteristic from a char[] that is
 * acting to simulate a floating point number
 */
class Code {

    /**
     * Method for extracting the 'characteristic' of an inputted pseudo-floating
     * point char array
     * 
     * @param numString input number as a char array
     * @param c length of numString array
     * @return True if function success, else False
     */
    boolean characteristic(char numString[], int c) {
        // Declaring/Initializing variables
        int strIndex;
        String num = ""

        // Adding each char from list into a string
        for ( strIndex = 0; strIndex < c; strIndex++ ) {
          num += numString[strIndex];
        }

        // Removes whitespace from string
        num = num.replaceAll("\\s", "");

        try {
          double d = Double.parseDouble(num);
        } 
        catch (NumberFormatException nfe) {
          return false;
        }

        return true;
    }

    /**
     * Method for extracting the mantissa of an inputted pseudo-floating point char
     * array
     * 
     * @param numString   input number as char array
     * @param numerator
     * @param denominator
     * @return True if success, else False
     */
    boolean mantissa(char numString[], int numerator, int denominator) {

    }

    public static void main(String[] args) {

        char number[] = "123.456";
        int c, n, d;

        // if the conversion from C string to integers can take place
        if (characteristic(number, c) && mantissa(number, n, d)) {
            // do some math with c, n, and d
        } else {
            // handle the error on input
        }
    }

}
