/**
 * A class that extracts the mantissa and characteristic from a char[] that is
 * acting to simulate a floating point number
 */
class Code {

    /**
     * Method for determining if the 'characteristic' of an inputted pseudo-floating
     * point char array
     * 
     * @param numString input number as a char array
     * @return The value that represents the component. If fail, return -0
     */
    int characteristic(char numString[]) {
        // Declaring/Initializing variables
        int strIndex;
        String num = "";
        int d;

        // Adding each char from list into a string
        for ( strIndex = 0; strIndex < numString.length; strIndex++ ) {
          num += numString[strIndex];
        }

        // Removes whitespace from string
        num = num.replaceAll("\\s", "");

        try {
          d = (int) Double.parseDouble(num);
        } 
        catch (NumberFormatException nfe) {
          return -0;
        }
        
        return d;
    }

    /**
     * Method for extracting the mantissa of an inputted pseudo-floating point char
     * array
     * 
     * @param numString   input number as char array
     * @param numerator
     * @param denominator
     * @return the value that represents the mantissa
     */
    int mantissa(char numString[], int numerator, int denominator) {

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
