package string2;

public class DoubleChar {
    /*
     * Given a string, return a string where
     * for every char in the original, there are two chars.
     *
     * doubleChar("The") → "TThhee"
     * doubleChar("AAbb") → "AAAAbbbb"
     * doubleChar("Hi-There") → "HHii--TThheerree"
     */

    public static void main(String[] args) {
        String str = "i s h a n i";
        System.out.println(doubleChar(str));


    }

    public static String doubleChar(String str) {

        //create new string to be returned
        String newStr = "";

        for(int i=0; i<str.length(); i++){

            //duplicate the character for each index in the original string
            newStr += str.charAt(i);
            newStr += str.charAt(i);
        }
        return newStr;
    }
}
